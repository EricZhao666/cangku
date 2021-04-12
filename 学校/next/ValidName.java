package 学校.next;

import java.util.Scanner;

public class ValidName {
    static boolean isTrue=false;
    public static void main(String[] args) {
        while (isTrue==false){
            Scanner sc=new Scanner(System.in);
            String x=sc.nextLine();
            Check(x);
        }
    }
    public static void Check(String s){
        if (s.matches("[A-Z][a-z]{1,24}")){
            System.out.println("Name is valid");
            isTrue=true;
        }
        else {
            System.out.println("Name is Not valid");
        }
    }
}

