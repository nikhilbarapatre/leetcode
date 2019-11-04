package String;

import java.util.*;

public class ZigZagConversion {
    public String zigZagConversion(String s, int numRows){
        if(numRows == 0)
            return s;
        List<StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());
        int curRow = 0;
        boolean goingDown = false;
        for(char c : s.toCharArray()){
            rows.get(curRow).append(c);
            if(curRow == 0 || curRow == numRows - 1)
                goingDown = !goingDown;
            if(goingDown)
                curRow += 1;
            else
                curRow -= 1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows)
            result.append(row);
        return result.toString();
    }

    public static void main(String[] args) {
        ZigZagConversion zig = new ZigZagConversion();
        System.out.println(zig.zigZagConversion("PAYPALISHIRING", 4));
    }
}
