import java.util.Scanner;

public class horse {
    public String name;
    public horse(){
        Scanner in = new Scanner(System.in);
        System.out.print("Кличка:\t");
        name=in.nextLine();
    }
}

class pegas extends horse{
    public pegas(){
        super();
    }
    public void fly(){
        System.out.println(name+" Полет");
    }
}