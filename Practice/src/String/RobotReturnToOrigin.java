package String;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves){
        int x = 0;
        int y = 0;
        for(char c : moves.toCharArray()){
            if(c == 'U')
                y += 1;
            if(c == 'D')
                y -= 1;
            if(c == 'R')
                x += 1;
            if(c == 'L')
                x -= 1;
        }
        if(x == 0 && y == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        RobotReturnToOrigin robot = new RobotReturnToOrigin();
        boolean result = robot.judgeCircle("LL");
        System.out.println(result);
    }
}
