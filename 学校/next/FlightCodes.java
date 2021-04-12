package 学校.next;

import java.util.Scanner;

public class FlightCodes {
    static boolean isTure=false;
    public static void main(String[] args) {
        while (isTure==false){
            Scanner sc= new Scanner(System.in);
            String x=sc.nextLine();
            Check(x);
        }
    }
    public static void Check(String s){
        if (s.matches("[A-Z]{2,3}[0-9]{3,4}")){
            System.out.println("Flight code is valid");
            isTure=true;
        }
        else {
            System.out.println("Flight code is Not valid");
        }
    }
}
