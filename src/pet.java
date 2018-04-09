import java.util.Scanner;

public abstract class pet {
    protected float weight;
    protected String name;
    protected String sex;
    public pet(){
        Scanner in = new Scanner(System.in);
        System.out.print("Кличка:\t");
        name=in.nextLine();
        System.out.print("Вес:\t");
        if(in.hasNextFloat()) weight=in.nextFloat();
        else System.out.println("Введены неверные значения");
        System.out.print("Пол:\t");
        in.nextLine();
        sex=in.nextLine();
    }
}

class doog extends pet{
    public doog(){
        super();
    }
    public void infodog(){
        System.out.print("Собака\nКличка:\t"+name+"\nВес:\t"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}

class caat extends pet{
    public caat(){
        super();
    }
    public void infocat(){
        System.out.print("Кошка\nКличка:\t"+name+"\nВес:\t"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}