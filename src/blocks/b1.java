package blocks;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        Scanner console = new Scanner (System.in);
        System.out.println("Введите первое число:");
        int a = console.nextInt ();
        System.out.println("Введите второе чило:");
        int b = console.nextInt ();
        System.out.println("Остаток от деления:");
        System.out.println (remainder (a, b));

        //Задача 2
        System.out.println("Задача 2");
        System.out.println("Основание треугольника:");
        double c = console.nextDouble ();
        System.out.println("Высота треугольника:");
        double d = console.nextDouble ();
        System.out.println("Площадь:");
        System.out.println (triArea (c, d));

        //Задача 3
        System.out.println("Задача 3");
        System.out.println("Курицы:");
        int chickens = console.nextInt ();
        System.out.println("Коровы:");
        int cows = console.nextInt ();
        System.out.println("Свиньи:");
        int pigs = console.nextInt ();
        System.out.println("Количество ног:");
        System.out.println (animals (chickens, cows, pigs));

        //Задача 4
        System.out.println("Задача 4");
        System.out.println("Введите первое число:");
        double e = console.nextDouble ();
        System.out.println("Введите второй число:");
        double f = console.nextDouble ();
        System.out.println("Введите третье число:");
        double g = console.nextDouble ();
        System.out.println("Результат:");
        System.out.println (profitableGamble (e, f, g));

        //Задача 5
        System.out.println("Задача 5");
        System.out.println("Введите первое число:");
        int h = console.nextInt ();
        System.out.println("Введите второе число:");
        int i = console.nextInt ();
        System.out.println("Введите третье число:");
        int j = console.nextInt ();
        System.out.println("Что нужно сделать:");
        operation(h, i, j);

        //Задача 6
        System.out.println("Задача 6");
        char sim = console.next().charAt(0);
        System.out.println(ctoa(sim));

        //Задача 7
        System.out.println("Задача 7");
        System.out.println("Введите число:");
        int k = console.nextInt ();
        System.out.println("Сумма чисел до него(включая его):");
        System.out.println (addUpTo (k));

        //Задача 8
        System.out.println("Задача 8");
        System.out.println("Длина первого ребра:");
        int l = console.nextInt ();
        System.out.println("Длина второго ребра:");
        int m = console.nextInt ();
        System.out.println (nextEdge (l, m));

        //Задача 9
        System.out.println("Задача 9");
        int size = console.nextInt();
        System.out.println("Введите длину массива:");
        int array[] = new int[size];
        int summa = 0;
        System.out.println("Введите элементы массива:");
        for (int ii = 0; ii < size; ii++) {
            array[ii] = console.nextInt();
            summa = summa + array[ii] * array[ii] * array[ii];
        }
        System.out.println("Сумма кубов:");
        System.out.println(summa);

        //Задача 10
        System.out.println("Задача 10");
        System.out.println("Введите А:");
        int n = console.nextInt ();
        System.out.println("Введите B:");
        int o = console.nextInt ();
        System.out.println("Введите C:");
        int p = console.nextInt ();
        System.out.println("Результат:");
        System.out.println (abcmath (n, o, p));

    }
    public static int remainder (int m, int n)
    {
        int c;
        c = m % n;
        return c;
    }
    public static double triArea (double m, double n)
    {
        double c;
        c = m * n * 0.5;
        return c;
    }
    public static int animals (int m, int n, int l)
    {
        int c = m * 2 + n * 4 + l * 4;
        return c;
    }
    public static boolean profitableGamble (double prob, double prize, double pay)
    {
        boolean c;
        if (prob * prize > pay)
        {
            c = true;
        }
        else
        {
            c = false;
        }
        return c;
    }
    public static void operation(int N, int a, int b)
    {
        if(a+b==N){
            System.out.println("added");
        } else if(a*b==N){
            System.out.println("multiplied");
        } else if(a/b==N || b/a==N){
            System.out.println("divided");
        } else if(a-b==N || b-a==N){
            System.out.println("subtracted");
        } else {
            System.out.println("none");
        }
    }
    public static int ctoa(char character){
        return (int)character;
    }
    public static int addUpTo (int m)
    {
        int c = 0;
        for (int i = m; i >= 0; i--)
        {

            c = c + i;
        }
        return c;
    }
    public static int nextEdge (int m, int n)
    {
        int c = 0;
        if(m > 0 && n > 0)
        {
            c = m + n - 1;
        } else{
            c = -1;
        }

        return c;
    }
    public static boolean abcmath (int m, int n, int l)
    {
        boolean res;
        int c = m;
        for(int i = 1; i <= n; i++){
            c = c + m*i;
        }
        if(c%l == 0){
            res = true;
        } else {
            res = false;
        }
        return res;
    }
}
