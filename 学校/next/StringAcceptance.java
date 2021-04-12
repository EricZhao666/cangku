package 学校.next;

import java.util.Scanner;

public class StringAcceptance {
    static boolean isTure;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        Check(x);
        System.out.println(isTure);
    }
    public static void Check(String s){

        if (s.matches("[0-1]*")==false){
            isTure=false;
        }
        else {
            isTure=true;
        }

    }
}

