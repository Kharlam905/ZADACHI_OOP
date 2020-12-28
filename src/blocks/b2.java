package blocks;
import java.util.*;

public class b2 {
    public static void main(String[] args) {

        System.out.println("1) repeat('aaa',3): "+repeat("aaa",3));
        System.out.println("   repeat('abc',3): "+repeat("abc",3));
        System.out.println("   repeat('2',6): "+repeat("2",6));
        System.out.println();

        System.out.println("2) differenceMaxMin({}): "+differenceMaxMin(new int[] {}));
        System.out.println("   differenceMaxMin({2,3,4}): "+differenceMaxMin(new int[] {2,3,4}));
        System.out.println("   differenceMaxMin({-50,50,9}): "+differenceMaxMin(new int[] {-50,50,9}));
        System.out.println();

        System.out.println("3) isAvgWhole({}): "+isAvgWhole(new int[] {}));
        System.out.println("   isAvgWhole({2,3,4}): "+isAvgWhole(new int[] {2,3,4}));
        System.out.println("   isAvgWhole({-50,50,9}): "+isAvgWhole(new int[] {-50,50,9}));
        System.out.println();

        System.out.println("4) cumulativeSum({}): "+Arrays.toString(cumulativeSum(new int[] {})));
        System.out.println("   cumulativeSum({2,3,4}): "+Arrays.toString(cumulativeSum(new int[] {2,3,4})));
        System.out.println("   cumulativeSum({-50,50,9}): "+Arrays.toString(cumulativeSum(new int[] {-50,50,9})));
        System.out.println();

        System.out.println("5) getDecimalPlaces('aaa',3): "+getDecimalPlaces("123"));
        System.out.println("   getDecimalPlaces('abc',3): "+getDecimalPlaces("123.23"));
        System.out.println("   getDecimalPlaces('2',6): "+getDecimalPlaces("432.234"));
        System.out.println();

        System.out.println("6) Fibonacci(3): "+Fibonacci(3));
        System.out.println("   Fibonacci(7): "+Fibonacci(7));
        System.out.println("   Fibonacci(20): "+Fibonacci(20));
        System.out.println();

        System.out.println("7) isValid('12345'): "+isValid("12345"));
        System.out.println("   isValid('12 45'): "+isValid("12 45"));
        System.out.println("   isValid('123456'): "+isValid("123456"));
        System.out.println();

        System.out.println("8) isStrangePair('aaa','aaa'): "+isStrangePair("aaa","aaa"));
        System.out.println("   isStrangePair('abc','vvv'): "+isStrangePair("abc","vvv"));
        System.out.println("   isStrangePair('32','23'): "+isStrangePair("32","23"));
        System.out.println();

        System.out.println("9) isPrefix('aaa','a-'): "+isPrefix("aaa","a-"));
        System.out.println("   isPrefix('abc','b-'): "+isPrefix("abc","b-"));
        System.out.println("   isSuffix('233','-33'): "+isSuffix("233","-33"));
        System.out.println("   isSuffix('abc','-n'): "+isSuffix("abc","-n"));
        System.out.println();

        System.out.println("10)boxSeq(1): "+boxSeq(1));
        System.out.println("   boxSeq(2): "+boxSeq(2));
        System.out.println("   boxSeq(101): "+boxSeq(101));

    }
//1
    static String repeat(String str, int n) {
        String res = "";
        char[] s = str.toCharArray();
        for(int j = 0; j < s.length; j++)
            for(int i = 0; i < n; i++)
                res+=s[j];
        return res;
    }
//2
    static int differenceMaxMin(int[] a) {
        if (a.length==0) return 0;
        int min = a[0],
                max = a[0];

        for(int i = 1; i < a.length; i++) {
            if(a[i] < min) min = a[i];
            if(a[i] > max) max = a[i];
        }

        return max-min;

    }
//3
    static boolean isAvgWhole(int[] a) {
        if (a.length==0) return false;

        float avrg = 0;
        for(int i = 0; i < a.length; i++) {
            avrg += a[i];
        }
        avrg /= (float)a.length;

        return Math.floor(avrg) == avrg;
    }
//4
    //согласно заданию каждый элемент массива должен быть суммой себя и всех предыдущих
    static int[] cumulativeSum(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            int d = a[i];
            a[i] += sum + d;
            sum += d;
        }
        return a;
    }
//5
    //узначть коичество знаков после точки
    static int getDecimalPlaces(String s) {
        int index = s.indexOf('.');
        if(index!=-1) {
        return s.length()-1-index;
        }
        return 0;
    }
//6
    //классический алгоритм для последовательности фибоначчи
    static int Fibonacci(int n) {
        int a = 1,
                b = 1;
        for(int i = 1; i < n; i++) {
            int c = b;
            b += a;
            a = c;
        }
        return b;
    }
//7
    //проверка валидности почтового индекса
    //каждый символ должен быть цифрой
    static boolean isValid(String s) {
        if(s.length() <= 5) return false;
        for(int i = 0; i < s.length(); i++)
            if(!Character.isDigit(s.toCharArray()[i])) return false;
        return true;
    }
//8
    //проверка условий согласно заданию
    static boolean isStrangePair(String s1, String s2) {
        return s1.toCharArray()[0] == s2.toCharArray()[s2.length()-1] &&
                s2.toCharArray()[0] == s1.toCharArray()[s1.length()-1];
    }

//9
    static boolean isSuffix(String s1, String s2) {

        String s = s2.substring(1);
        //оканчивается ли на выбранное окончание
        return s1.endsWith(s);
    }
    static boolean isPrefix(String s1, String s2) {

        String s = s2.substring(0, s2.length()-1);
        //начинается ли с выбранной преставки
        return s1.startsWith(s);
    }
//10

    static int boxSeq(int n) {
        if (n%2 == 0) return n;
        else return n*2+1;
    }

}
