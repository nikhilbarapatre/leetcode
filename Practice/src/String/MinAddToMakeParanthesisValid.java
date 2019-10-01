package String;

public class MinAddToMakeParanthesisValid {
    public int minAddToMake(String s){
        int ans = 0, bal = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                bal += 1;
            else
                bal += -1;
            if(bal == -1){
                ans++;
                bal++;
            }
        }
        return ans + bal;
    }

    public static void main(String[] args) {
        MinAddToMakeParanthesisValid min = new MinAddToMakeParanthesisValid();
        int result = min.minAddToMake("())");
        System.out.println(result);
    }
}
