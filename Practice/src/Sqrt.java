public class Sqrt {
    public int mySqrt(int x){
        long result = x;
        while(result * result > x){
            result = (result + x / result) / 2;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        Sqrt sq = new Sqrt();
        System.out.println(sq.mySqrt(8));
    }
}
