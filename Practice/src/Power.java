public class Power {
    public double myPower(double x, int n){
        if(n == 0)
            return 1;
        if(n < 0){
            x = 1 / x;
            if(n == Integer.MIN_VALUE){
                n = Integer.MAX_VALUE;
                x = x * x;
            }
            else
                n = -n;
        }
        return power(x, n);
    }
    private double power(double x, int n){
        if(n == 1)
            return x;
        if(n % 2 == 0){
            double val = power(x, n / 2);
            return val * val;
        }
        else{
            double val = power(x, n / 2);
            return val * val * x;
        }
    }

    public static void main(String[] args) {
        Power pow = new Power();
        System.out.println(pow.myPower(2.10000, 3));
    }
}
