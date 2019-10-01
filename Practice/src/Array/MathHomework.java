package Array;

public class MathHomework {
    public int homework(int threshold, int[] happy){
        int min = happy[0];
        if(happy.length == 1)
            return 1;
        int result = 1;
        for(int i = 1; i < happy.length; i++){
            if(happy[i] - min < threshold && i % 2 == 1){
                continue;
            }
            result += 1;

        }
        return result;
    }

    public static void main(String[] args) {
        MathHomework hw = new MathHomework();
        int result = hw.homework(4, new int[]{1,2,3,4, 5});
        System.out.println(result);
    }
}
