public class MinimumAddtoMakeParenthesesValid {
    public int minAddtoMakeValid(String S){
        int ans = 0, bal = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '(')
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
        MinimumAddtoMakeParenthesesValid min = new MinimumAddtoMakeParenthesesValid();
        int result = min.minAddtoMakeValid("(((");
        System.out.println(result);
    }
}
