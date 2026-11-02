package Strings;

public class Strings3 {
    public static float shortestPath(String path){
        int x = 0, y =0;
        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);
            switch(dir){
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }

        }
        float X2 = x*x;
        float Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        System.out.println(shortestPath("NS"));
    }
}
