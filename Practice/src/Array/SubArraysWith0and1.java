package Array;

public class SubArraysWith0and1 {
    public int subArrays(int[] arr){
        int sum = 0, max = -1, count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == 0)
                sum = -1;
            else
                sum = 1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] == 0)
                    sum += -1;
                else
                    sum += 1;
                if(sum == 0 && max < j - i + 1){
                    max = j - i + 1;
                }
            }
            if(max == -1)
                return 0;
            else count++;
        }
        return count;
    }

    public static void main(String[] args) {
        SubArraysWith0and1 sub = new SubArraysWith0and1();
        int[] arr = {1, 0, 0, 1};
    }
}
