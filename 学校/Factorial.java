package 学校;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int First=sc.nextInt();
        int Last=sc.nextInt();
        for (int i=First;i<=Last;i++){
            System.out.println(getFactorical(i));
        }
    }
    public static int getFactorical(int a){
        int res=a;
        if (a>1){
            res=res*getFactorical(a-1);
        }
        if (a<=1){
            return 1;
        }
        return res;
    }
}
