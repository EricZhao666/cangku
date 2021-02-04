package 宠物店.src;

import java.util.Scanner;

public class brid extends Animal{
    public brid(String name,String sex,int age,int money){
        super(name,sex,age,money);
    }
    public void eat(){
        System.out.println("鸟吃虫子");
    }
    public void talk(String language){
        System.out.println("鸟的叫声是"+language);
    }
    public String toString(){
        return "名字"+name+"性别"+sex+"年龄"+age;
    }
}
