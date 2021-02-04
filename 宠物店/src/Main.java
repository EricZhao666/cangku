package 宠物店.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PetShop p1=new PetShop();
        p1.purchasePetBird(new brid("麻雀","公",3,200));
        p1.outPet("鹦鹉");
        p1.showPets();
        p1.ShowMoney();
        p1.TempFeed("tom",2);
        p1.UseVaccine("tom",1);
    }
}
