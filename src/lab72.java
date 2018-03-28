import java.util.Scanner;

public class lab72 {
}

abstract class Pet{
    protected int age;
    protected String name;
    protected boolean hungry;
    Pet(){
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

class Snake extends Pet{
    public void voice(){
        System.out.println("Шшшшшшшшш");
    }
}

class Dogg extends Pet{
    public void voice(){
        System.out.println("Гав");
    }
}

class PatrolDog extends Pet{
    public void voice() {
        System.out.println("Гав!Гав!");
    }
}

class Catt extends Pet{
    public void voice() {
        System.out.println("Мяу");
    }
}

class Fish extends Pet{
    public void voice() {
        System.out.println("???");
    }
}