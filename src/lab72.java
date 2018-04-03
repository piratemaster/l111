import java.util.Scanner;

public class lab72 {
}

abstract class Pets{
    protected int age;
    protected String name;
    protected boolean hungry;
    public Pets(){
        Scanner in = new Scanner(System.in);
        System.out.print("Age:\t");
        age=in.nextInt();
        System.out.print("Name:\t");
        name=in.nextLine();
        System.out.print("Hungry:\t");
        hungry=in.nextBoolean();
    }
    public abstract void voice();
}

class Snake extends Pets{
    public Snake(){
        super();
    }
    public void voice(){
        System.out.println("Шшшшшшшшш");
    }
}

class Dogg extends Pets{
    public Dogg(){
        super();
    }
    public void voice(){
        System.out.println("Гав");
    }
}

class PatrolDog extends Pets{
    public PatrolDog(){
        super();
    }
    public void voice() {
        System.out.println("Гав!Гав!");
    }
}

class Catt extends Pets{
    public Catt(){
        super();
    }
    public void voice() {
        System.out.println("Мяу");
    }
}

class Fish extends Pets{
    public Fish(){
        super();
    }
    public void voice() {
        System.out.println("???");
    }
}

interface PassangersAuto{
    void passtravel();
}

interface CargoAuto{
    void cargotravel();
}

class Truck implements CargoAuto, PassangersAuto{
    public void passtravel(){

    }
    public void cargotravel(){

    }
}

class Sedan implements CargoAuto, PassangersAuto{
    public void passtravel(){

    }
    public void cargotravel(){

    }
}

class Pickup implements CargoAuto, PassangersAuto{
    public void passtravel(){

    }
    public void cargotravel(){

    }
}