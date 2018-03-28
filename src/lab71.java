public class lab71 {
}
class Cow
{
    public void printAll()
    {
        printColor();
        printName();
    }
    public void printColor()
    {
        System.out.println("Я – белый");
    }
    public void printName()
    {
        System.out.println("Я – корова");
    }
}

class Whale extends Cow
{
    public void printName()
    {
        System.out.print("Это неправда: ");
        System.out.println("Я – кит");
    }
}

//lab72

class Cat{
    public void getChild(){
        System.out.println("Котенок");
    }
}

class Dog extends Cat{
    public void getChild(){
        System.out.println("Щенок");
    }
}

class lab73{
    public int print(int a){
        return 10;
    }
    public int print(String a){
        return 123;
    }
    public int print(int a, long t){
        return 10;
    }
    public int print(String a, int e){
        return 123;
    }
    public int print(int a, int e){
        return 10;
    }
    public static int min(int a, int b){
        if(a<b) return a;
        else return b;
    }
    public static long min(long a, long b){
        if(a<b) return a;
        else return b;
    }
    public static double min(double a, double b){
        if(a<b) return a;
        else return b;
    }
    public static int max(int a, int b){
        if(a>b) return a;
        else return b;
    }
    public static long max(long a, long b){
        if(a>b) return a;
        else return b;
    }
    public static double max(double a, double b){
        if(a>b) return a;
        else return b;
    }
}

