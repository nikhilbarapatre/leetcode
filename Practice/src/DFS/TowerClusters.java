package DFS;

import java.util.*;

/*
* Here, we have been given a 2D matrix of positions of towers where 1 represents that there is a tower and 0 represents
* the absence of a tower. We have to calculate the number of clusters that we can create where there are adjacent 1s in
* the cluster. We do not consider diagonals tower in the same cluster.
* */

public class TowerClusters {
    public int towerClusters(int rows, int columns, List<List<Integer>> grid){
        int count = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(grid.get(i).get(j) == 1){
                    count++;
                    dfsHelper(rows, columns,i, j, grid);
                }
            }
        }
        return count;
    }
    private void dfsHelper(int rows, int columns, int i, int j, List<List<Integer>> grid){
        if(i < 0 || i >= rows || j < 0 || j >= columns || grid.get(i).get(j) == 0)
            return;
        else
            grid.get(i).set(j, 0);
        dfsHelper(rows, columns, i + 1, j, grid);
        dfsHelper(rows, columns, i - 1, j, grid);
        dfsHelper(rows, columns, i, j + 1, grid);
        dfsHelper(rows, columns, i, j - 1, grid);
    }

    public static void main(String[] args) {
        TowerClusters tower = new TowerClusters();
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(0);
        list1.add(0);
        grid.add(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(0);
        list2.add(1);
        list2.add(0);
        grid.add(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(0);
        list3.add(0);
        list3.add(0);
        list3.add(0);
        grid.add(list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(0);
        list4.add(1);
        list4.add(1);
        grid.add(list4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(1);
        list5.add(1);
        list5.add(1);
        grid.add(list5);

        System.out.println(tower.towerClusters(5, 4, grid));
    }
}
