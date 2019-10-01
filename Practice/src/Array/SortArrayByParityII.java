package Array;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A){
        int j = 1;
        for(int i = 0; i < A.length; i += 2){
            if(A[i] % 2 == 1){
                while(A[j] % 2 == 1)
                    j += 2;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        SortArrayByParityII sort = new SortArrayByParityII();
        int[] A = {4,2,5,7};
        int[] result = sort.sortArrayByParityII(A);
        for(int n : result)
            System.out.println(n);
    }
}
