package BFS;

import java.util.*;

/*
* Here, we are given a 2D matrix containing 0s and 1s where 1 represents that there is a tower and 0 represents no tower.
* The presence of the tower means that it can update its neighbors(except the diagonal) in one day.
* We have to find out the minimum number of days to update all the towers.
* */

public class TowerUpdate {
    public int towerUpdate(int rows, int columns, List<List<Integer>> grid){
        Queue<int[]> queue = new LinkedList<>();
        int target = rows * columns;
        int numOfTowers = 0, numDays = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(grid.get(i).get(j) == 1) {
                    queue.offer(new int[]{i, j});
                    numOfTowers++;
                }
            }
        }
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        while(!queue.isEmpty()){
            int size = queue.size();
            if(numOfTowers == target)
                return numDays;
            for(int i = 0; i < size; i++) {
                int[] current = queue.poll();
                for(int[] dir : dirs){
                    int ni = current[0] + dir[0];
                    int nj = current[1] + dir[1];
                    if(ni >= 0 && ni < rows && nj >= 0 && nj < columns && grid.get(ni).get(nj) == 0){
                        numOfTowers++;
                        queue.offer(new int[]{ni, nj});
                        grid.get(ni).set(nj, 1);
                    }
                }
            }
            numDays++;
        }
        return -1;
    }

    public static void main(String[] args) {
        TowerUpdate update = new TowerUpdate();
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(1);
        list1.add(0);
        list1.add(1);
        grid.add(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(1);
        list2.add(0);
        list2.add(1);
        list2.add(0);
        grid.add(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(0);
        list3.add(0);
        list3.add(0);
        list3.add(0);
        list3.add(1);
        grid.add(list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(0);
        list4.add(1);
        list4.add(0);
        list4.add(0);
        list4.add(0);
        grid.add(list4);
        System.out.println(update.towerUpdate(4, 5, grid));
    }
}
