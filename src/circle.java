import java.util.Scanner;

public class circle {
    private int xc;
    private int yc;
    private int r;
    public circle() {
        Scanner in = new Scanner(System.in);
        System.out.print("r:\t");
        r=in.nextInt();
        System.out.print("xc:\t");
        xc=in.nextInt();
        System.out.print("yc:\t");
        yc=in.nextInt();
    }
    public void lab51(){
        double square=2*Math.PI*r;
        System.out.print("Длинна окружности:\t");
        System.out.println(square);
    }
    public int[] lab52(){
        xc=(int)Math.random()*198-99;
        yc=(int)Math.random()*198-99;
        return new int[] {xc,yc};
    }
    public void lab54(){
        int circle1[]= lab52();
        int circle2[]= lab52();
        double g=Math.sqrt(Math.pow((circle1[0]-circle2[0]),2)+Math.pow((circle1[1]-circle2[1]),2));
        System.out.println("Центр 1:\t("+Integer.toString(circle1[0])+";"+Integer.toString(circle1[1])+")");
        System.out.println("Центр 2:\t("+Integer.toString(circle2[0])+";"+Integer.toString(circle2[1])+")");
        System.out.println("Расстояние от центров:\t"+Double.toString(g));
        if(g<=2*r) System.out.println("Соприкасаются");
        else System.out.println("Не соприкасаются");
    }
}