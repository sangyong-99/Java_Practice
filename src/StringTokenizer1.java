import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("a b c");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
    }
}


