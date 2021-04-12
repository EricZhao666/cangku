package 学校.next;

import java.util.Scanner;

public class WhichExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        Check(x);
    }
    public static void Check(String s){
        if (s.matches("a(a|b)b")){
            System.out.println("1");
        }
         if (s.matches("(ab)*b")){
            System.out.println("2");
        }
         if (s.matches("a(b|a)*")){
            System.out.println("3");
        }
         if (s.matches("((a|b)a)*")){
            System.out.println("4");
        }
        if (s.matches("[^ab]*(ab)*[^ab]")){
            System.out.println("Not in the language");
        }

    }
}
