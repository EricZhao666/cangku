package 学校;
import java.util.*;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double[] arr = new double[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextDouble();
        }
        double b = sc.nextDouble();
        findElement(arr, b);
    }
    public static void findElement(double[] arr, double a) {
        boolean isContains=Arrays.asList(arr).contains(a);
        if (isContains==false){
            System.out.println(a+"was found in the array");
        }
        else{
            System.out.println(a+" was NOT found in the array");
        }
    }
}
