import java.util.Scanner;

public class circle {
    public static void lab51(int xc, int yc){
        Scanner in = new Scanner(System.in);
        System.out.print("r:\t");
        int r=in.nextInt();
        double square=2*Math.PI*r;
        System.out.print("Длинна окружности:\t");
        System.out.println(square);
    }
    public static int[] lab52(){
        int xc=(int)Math.random()*198-99;
        int yc=(int)Math.random()*198-99;
        return new int[] {xc,yc};
    }
    public static void lab53(){
        Scanner in = new Scanner(System.in);
        System.out.print("r:\t");
        int r=in.nextInt();
        System.out.print("x:\t");
        int xc=in.nextInt();
        System.out.print("y:\t");
        int yc=in.nextInt();
    }
    public static void lab54(){
        int circle1[]= lab52();
        int circle2[]= lab52();
        double g=Math.sqrt(Math.pow((circle1[0]-circle2[0]),2)+Math.pow((circle1[1]-circle2[1]),2));
        System.out.println("Центр 1:\t("+Integer.toString(circle1[0])+";"+Integer.toString(circle1[1])+")");
        System.out.println("Центр 2:\t("+Integer.toString(circle2[0])+";"+Integer.toString(circle2[1])+")");
        System.out.println("Расстояние от центров:\t"+Double.toString(g));
    }
}