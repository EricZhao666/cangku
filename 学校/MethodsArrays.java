package 学校;
import java.util.Scanner;


public class MethodsArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
        int[] b=fillArray(x);
       System.out.println("sum = "+sumArray(b));
      System.out.println( "avg = "+avgArray(b));
        printArray(b);
    }
    public static int[] fillArray(int a){
        Scanner sc=new Scanner(System.in);
        int[] b=new int[a];
        for (int i = 0; i < a; i++) {
            b[i]=sc.nextInt();
        }
        return b;
    }
    public static int sumArray(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static double avgArray(int[] arr){
        double avg=0;
        int sum=0;
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            a++;
        }
        avg=sum/a;
        return avg;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
