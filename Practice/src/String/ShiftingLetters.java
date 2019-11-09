package String;

public class ShiftingLetters {
    public String shiftLetters(String s, int[] shifts){
        StringBuilder result = new StringBuilder();
        int shift = 0;
        for(int sh : shifts)
            shift = (shift + sh) % 26;
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            result.append((char)((index + shift) % 26 + 97));
            shift = Math.floorMod(shift - shifts[i], 26);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ShiftingLetters shift = new ShiftingLetters();
        int[] shifts = {3,5,9};
        System.out.println(shift.shiftLetters("abc", shifts));
    }
}
