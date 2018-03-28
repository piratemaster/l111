import java.util.Scanner;

public class Main  {
    private static void lab21()
    {
        System.out.println("Лаб 2.1");
        for(int i=2; i<=100; i+=2)
        {
            System.out.print(i);
            System.out.print(' ');
        }
    }
    private static void lab22()
    {
        System.out.println("\nЛаб 2.2");
        Scanner in = new Scanner(System.in);
        System.out.print("M:\t");
        int m=in.nextInt();
        System.out.print("N:\t");
        int n=in.nextInt();
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print("8");
            System.out.print("\n");
        }
    }
    private static void lab23()
    {
        System.out.println("\nЛаб 2.3");
        for(int i=0; i<=10; i++)
        {
            for(int j=0; j<i; j++)
                System.out.print("8");
            System.out.print("\n");
        }
    }
    private static int min(int a, int b)
    {
        if(a<b) return a;
        if(a>b) return b;
        return 0;
    }
    private static void min(int m, int n, int a, int b)
    {
        if(min(m,n)!=0) m=min(m,n);
        if(min(a,b)!=0) a=min(a,b);
        if (min(m,a)==0) System.out.println("Числа равны");
        else System.out.println(min(m,a));
    }
    private static void lab24()
    {
        System.out.println("\nЛаб 2.4");
        System.out.print("M:\t");
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        System.out.print("N:\t");
        int n=in.nextInt();
        if(min(m,n)!=0) System.out.println(min(m,n));
        else System.out.println("Числа равны");
    }
    private static void lab25()
    {
        System.out.println("\nЛаб 2.5");
        System.out.print("Имя 1:\t");
        Scanner in = new Scanner(System.in);
        String m=in.nextLine();
        System.out.print("Имя 2:\t");
        String n=in.nextLine();
        if(m.length()==n.length()) System.out.println("Длинны равны");
        else System.out.println("Длинны различны");
        if(m.compareToIgnoreCase(n)==m.length()) System.out.println("Имена идентичны");
        else System.out.println("Имена различны");
    }
    private static void lab26()
    {
        System.out.println("\nЛаб 2.6");
        System.out.print("M:\t");
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        System.out.print("N:\t");
        int n=in.nextInt();
        System.out.print("a:\t");
        int a=in.nextInt();
        System.out.print("b:\t");
        int b=in.nextInt();
        min(m,n,a,b);
    }
    private static void lab27()
    {
        System.out.println("\nЛаб 2.7");
        System.out.print("X:\t");
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        System.out.print("Y:\t");
        int y=in.nextInt();
        if(x>0) {
            if (y > 0) System.out.println("I четверть");
            if (y < 0) System.out.println("IV четверть");
        }
        if(x<0) {
            if (y > 0) System.out.println("II четверть");
            if (y < 0) System.out.println("III четверть");
        }
    }
    private static void lab31()
    {
        int a=10;
        int[] mass=new int[a];
        mass[0]=2;
        for(int i=1; i<a; i++)
        {
            mass[i]=mass[i-1]+2;
        }
        for(int i=0; i<a; i++)
        {
            System.out.print(mass[i]);
            System.out.print(' ');
        }
        System.out.println(' ');
        for(int i=0; i<a; i++)
        {
            System.out.println(mass[i]);
        }
    }
    private static void lab32()
    {
        int a=50;
        int[] mass=new int[a];
        mass[0]=1;
        for(int i=1; i<a; i++)
        {
            mass[i]=mass[i-1]+2;
        }
        for(int i=0; i<a; i++)
        {
            System.out.print(mass[i]);
            System.out.print(' ');
        }
        System.out.println(' ');
        for(int i=a-1; i>-1; i--)
        {
            System.out.print(mass[i]);
            System.out.print(' ');
        }
    }
    private static void lab33()
    {
        int a=15;
        int[] mass=new int[a];

        for(int i=0; i<a; i++)
        {
            mass[i]=(int)Math.ceil(Math.random()*10-1);
        }
        for(int i=0; i<a; i++)
        {
            System.out.print(mass[i]);
            System.out.print(' ');
        }
        System.out.println(' ');
        for(int i=0; i<a; i++)
        {
            if(mass[i]%2==0 && mass[i]!=0)    {
                System.out.print(mass[i]);
                System.out.print(' ');
            }
        }
    }
    private static void lab34()
    {
        int a=8;
        int b=5;
        int[][] mass=new int[a][b];

        for(int i=0; i<a; i++) {
            for (int j = 0; j < b; j++) {
                mass[i][j] = (int) Math.ceil(Math.random() * 90 + 9);
            }
        }
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++){
                System.out.print(mass[i][j]);
                System.out.print(' ');
            }
            System.out.println(' ');
        }
        System.out.println(' ');
    }
    private static void lab35()
    {
        int a=7;
        int b=4;
        int[][] mass=new int[a][b];

        for(int i=0; i<a; i++) {
            for (int j = 0; j < b; j++) {
                mass[i][j] = (int) Math.ceil(Math.random() * 5 - 5);
            }
        }
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++){
                System.out.print(mass[i][j]);
                System.out.print(' ');
            }
            System.out.println(' ');
        }
        System.out.println(' ');
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++){
                System.out.print(mass[i][j]);
                System.out.print(' ');
            }
            System.out.println(' ');
        }
    }
    private static int[] lab411 (int a, int b)
    {
        int[] mass=new int[20];
        for(int i=0;i<20;i++)
        {
            mass[i]=(int) Math.ceil(Math.random() * (b-a) +a);
        }
        return mass;
    }
    private static void lab41()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("a:\t");
        int a=in.nextInt();
        System.out.print("b:\t");
        int b=in.nextInt();
        for(int i=0; i<20; i++)
        {
            System.out.print(lab411(a,b)[i]);
            System.out.print(' ');
        }
        System.out.println(' ');
    }
    private static void lab42()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("a1:\t");
        int a1=in.nextInt();
        System.out.print("b1:\t");
        int b1=in.nextInt();
        System.out.print("a2:\t");
        int a2=in.nextInt();
        System.out.print("b2:\t");
        int b2=in.nextInt();
        System.out.print("a3:\t");
        int a3=in.nextInt();
        System.out.print("b3:\t");
        int b3=in.nextInt();
        System.out.print("a4:\t");
        int a4=in.nextInt();
        System.out.print("b4:\t");
        int b4=in.nextInt();
        System.out.print("a5:\t");
        int a5=in.nextInt();
        System.out.print("b5:\t");
        int b5=in.nextInt();
        System.out.println("1:\t");
        for(int i=0; i<20; i++)
        {
            System.out.print(lab411(a1,b1)[i]);
            System.out.print(' ');
        }
        System.out.println("\n2:\t");
        for(int i=0; i<20; i++)
        {
            System.out.print(lab411(a2,b2)[i]);
            System.out.print(' ');
        }
        System.out.println("\n3:\t");
        for(int i=0; i<20; i++)
        {
            System.out.print(lab411(a3,b3)[i]);
            System.out.print(' ');
        }
        System.out.println("4:\t");
        for(int i=0; i<20; i++)
        {
            System.out.print(lab411(a4,b4)[i]);
            System.out.print(' ');
        }
        System.out.println("\n5:\t");
        for(int i=0; i<20; i++)
        {
            System.out.print(lab411(a5,b5)[i]);
            System.out.print(' ');
        }
    }
    private static void lab43()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("a:\t");
        int a2=in.nextInt();
        System.out.print("b:\t");
        int b2=in.nextInt();
        int[] mass=lab411(a2,b2);
        for(int i=0; i<19; i++)
        {
            for(int j=0; j<19; j++)
            {
                if(mass[j]>mass[j+1])
                {
                    int tmp=mass[j];
                    mass[j]=mass[j+1];
                    mass[j+1]=tmp;
                }
            }
        }
        for(int i=0; i<20; i++) {
            System.out.print(mass[i]);
            System.out.print(' ');
        }
        System.out.println(' ');
    }
    private static long lab44(int n){
        if(n==1||n==2)
            return 1;
        if(n==0)
            return 0;
        return lab44(n-1)+lab44(n-2);
    }
    private static void lab441()
    {
        int i=1;
        while(true){
            System.out.print(i);
            System.out.print(":\t");
            System.out.println(lab44(i));
            i++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите номер лабораторной");
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        switch (x) {
            case 1:     System.out.println("Лаб1\nHello World!");
            case 2: {
                System.out.println("Введите номер задания");
                int z = in.nextInt();
                switch (z) {
                    case 1: lab21(); System.exit(0);
                    case 2: lab22(); System.exit(0);
                    case 3: lab23(); System.exit(0);
                    case 4: lab24(); System.exit(0);
                    case 5: lab25(); System.exit(0);
                    case 6: lab26(); System.exit(0);
                    case 7: lab27(); System.exit(0);
                }
            }
            case 3: {
                System.out.println("Введите номер задания");
                int z = in.nextInt();
                switch (z) {
                    case 1: lab31(); System.exit(0);
                    case 2: lab32(); System.exit(0);
                    case 3: lab33(); System.exit(0);
                    case 4: lab34(); System.exit(0);
                    case 5: lab35(); System.exit(0);
                }
            }
            case 4: {
                System.out.println("Введите номер задания");
                int z = in.nextInt();
                switch (z) {
                    case 1: lab41(); System.exit(0);
                    case 2: lab42(); System.exit(0);
                    case 3: lab43(); System.exit(0);
                    case 4: lab441(); System.exit(0);
                }
            }
            case 5: {
                circle a=new circle();
                int xc=0;
                int yc=0;
                System.out.println("Введите номер задания");
                int z = in.nextInt();
                switch (z) {
                    case 1: a.lab51(); System.exit(0);
                    case 2: a.lab52(); System.exit(0);
                }
            }
            case 6: {
                System.out.println("Введите номер задания");
                int z = in.nextInt();
                switch (z) {
                    case 1: pegas a=new pegas(); a.fly(); System.exit(0);
                    case 2: dog b=new dog(); b.infodog(); System.exit(0);
                    case 3: cat c=new cat(); c.infocat(); System.exit(0);
                }
            }
            case 7: {
                System.out.println("Введите номер задания");
                int z = in.nextInt();
                switch (z) {
                    case 1: Whale a=new Whale(); a.printAll(); System.exit(0);
                    case 2: Dog b=new Dog(); b.getChild(); System.exit(0);
                    case 3: Cat c=new Cat(); c.getChild(); System.exit(0);
                    case 4: lab73 d=new lab73(); String s=""; int i=0; d.print(s); d.print(i); System.exit(0);
                }
            }
        }
    }
}

