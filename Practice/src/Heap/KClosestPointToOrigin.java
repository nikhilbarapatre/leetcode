package Heap;

import java.util.Arrays;

public class KClosestPointToOrigin {
    public int[][] kClosest(int[][] points, int k){
        int[][] result = new int[k][2];
        int[] dist = new int[points.length];
        for(int i = 0; i < points.length; i++)
            dist[i] = distance(points[i]);
        Arrays.sort(dist);
        for(int i = 0; i < dist.length; i++)
            System.out.println(dist[i]);
        int distK = dist[k - 1];
        System.out.println(distK);
        int count = 0;
        for(int i = 0; i < points.length; i++) {
            if (distance(points[i]) <= distK)
                result[count++] = points[i];
        }
        return result;
    }
    private int distance(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }

    public static void main(String[] args) {
        KClosestPointToOrigin close = new KClosestPointToOrigin();
        int[][] points = {{1, 3}, {-2, 2}};
        int[][] result = close.kClosest(points, 1);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
