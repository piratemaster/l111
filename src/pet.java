import java.util.Scanner;

public class pet {
    protected float weight;
    protected String name;
    protected String sex;
    protected pet(){
        Scanner in = new Scanner(System.in);
        System.out.print("Кличка:\t");
        name=in.nextLine();
        System.out.print("Вес:\t");
        weight=in.nextFloat();
        System.out.print("Пол:\t");
        in.nextLine();
        sex=in.nextLine();
    }
}

class dog extends pet{
    public void infodog(){
        System.out.print("Собака\nКличка:\t"+name+"\nВес:\t"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}

class cat extends pet{
    public void infocat(){
        System.out.print("Кошка\nКличка:\t"+name+"\nВес:\t"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}