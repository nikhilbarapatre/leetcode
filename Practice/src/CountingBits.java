public class CountingBits {
    public int[] countingBits(int num){
        int[] result = new int[num + 1];
        for(int i = 1; i <= num; i++){
            result[i] = result[i / 2];
            if(i % 2 == 1)
                result[i]++;
        }
        return result;
    }

    public static void main(String[] args) {
        CountingBits count = new CountingBits();
        int[] result = count.countingBits(5);
        System.out.print("[");
        for(int n : result)
            System.out.print(n + ",");
        System.out.println("]");
    }
}
