package 宠物店.src;

import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Logger;

public class PetShop extends Vaccine{
    Logger logger = Logger.getLogger(PetShop.class.getName());
    Animal pets[]=new Animal[100];
    int count=6;
    int money=1000;
    public PetShop(){
        pets[0]=new brid("鹦鹉","公",2,200);
        pets[1]=new brid("麻雀","母",3,200);
        pets[2]=new Dog("藏獒","公",3,500);
        pets[3]=new Dog("中华田园犬","公",2,500);
        pets[4]=new Cat("波斯猫","母",1,400);
        pets[5]=new Cat("汤姆猫","公",3,400);
    }
    //购买宠物鸟
    private boolean addPetBird(brid pet) {
        if (count >= pets.length) {
            return false;
        }
        pets[count] = pet;
        count++;
        money=money-200;
        return true;
    }
    public boolean purchasePetBird(brid pet) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        return this.addPetBird(pet);
    }
    //购买宠物狗
    private boolean addPetDog(Dog pet) {
        if (count >= pets.length) {
            return false;
        }
        pets[count] = pet;
        count++;
        money-=500;
        return true;
    }
    public boolean purchasePetDog(Dog pet) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        return this.addPetDog(pet);
    }
    //购买宠物猫
    private boolean addPetCat(Cat pet) {
        if (count >= pets.length) {
            return false;
        }
        pets[count] = pet;
        count++;
        money-=200;
        return true;
    }
    public boolean purchasePetCat(Cat pet) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        return this.addPetCat(pet);
    }
    //展示宠物
    public void showPets() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        for (int i = 0; i < count; i++) {
            System.out.println(pets[i].toString());
        }
    }
    //卖出宠物
    public void outPet(String pet){
        for (int i=0;i<pets.length;i++){
            if (pet.equals(pets[i].getName())){
                LocalDateTime dateTime = LocalDateTime.now();
                System.out.println(dateTime);
                System.out.println(pets[i]);
                money=money+pets[i].getMoney();
                pets[i]=new Animal("已卖出","已卖出",0,0);
                break;
            }
        }
    }
    public void ShowMoney(){
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("店内余额为");
        System.out.println(money);
    }
    public void TempFeed(String name,int day){
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        money+=day*100;
        System.out.println("你的宠物"+name+"已成功寄养"+day+"天");
    }
    public void UseVaccine(String name,int number){
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("你的宠物"+name+"已成功使用疫苗"+number+"号");
        money+=50;
    }















}
