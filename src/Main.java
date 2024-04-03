import java.sql.SQLOutput;
public class Main {
    static int a1;
    static long b2;
    static float c3;
    static double d4;
    static char charac;
    static String chara;
    static boolean bool;

    public static void main(String[] args){
        System.out.println("bài tập");
        System.out.println("bài 1");
        System.out.println("trả bài");
        int number = 3;
        number = 100;
        final double PI = 3.4515;
        double area = 5 * 5 * 3.4515;
        double area2 = 7 * 7 * 3.4515;
        byte numberByte = 127;
        char chaacter = '2';
        String characterString = "1234abcd";
        int sum = 5;
        sum++;
        sum--;
        boolean istrue = true ;
        boolean isfalse = !istrue;
        System.out.println(sum);
        System.out.println(a1);
        System.out.println(b2);
        System.out.println(c3);
        System.out.println(d4);
        System.out.println(charac);
        System.out.println(chara);
        System.out.println(bool);
        System.out.println(istrue);

        int a = 10;
        int b = a++;
        int j = --b;
        System.out.println(j);
        int a1 = 10;
        int b2 = ++a1;
        int j1 = b2++;
        System.out.println(j1);

        int h = 100;
        int f = 5;
        int g = 100;
        System.out.println(h <= g);
        System.out.println(h != g);
        System.out.println(h == g);

        boolean q = true;
        boolean w = false;
        System.out.println(q & w);
        System.out.println(q || w);
        System.out.println(!q);
        System.out.println(!w);
    }
}
