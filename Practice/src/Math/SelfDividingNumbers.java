package Math;

import java.util.*;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> result = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isDividing(i))
                result.add(i);
        }
        return result;
    }

    private boolean isDividing(int n){
        for(int i = n; i > 0; i /= 10){
            if((i % 10 == 0) || (n % (i % 10) != 0))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SelfDividingNumbers sd = new SelfDividingNumbers();
        List<Integer> result = sd.selfDividingNumbers(1, 15);
        for(int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));
    }
}
