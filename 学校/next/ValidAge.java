package 学校.next;
import java.util.Scanner;
public class ValidAge {
    static boolean isTrue=false;
    public static void main(String[] args) {
        while (isTrue==false){
            Scanner sc=new Scanner(System.in);
            String x=sc.nextLine();
            Check(x);
        }
    }
    public static void Check(String s){
        if (s.matches("[0-9]|[1-9][0-9]|[1][0-4][0-9]|[1][5][0]")){
            System.out.println("Age is valid");
            isTrue=true;
        }
        else {
            System.out.println("Age is Not valid");
        }
    }
}
