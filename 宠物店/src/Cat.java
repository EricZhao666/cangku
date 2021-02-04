package 宠物店.src;

public class Cat extends Animal{
    public Cat(String name,String sex,int age,int money){
        super(name, sex, age,money);
    }
    public void eat(){
        System.out.println("猫吃猫粮");
    }
    public void talk(String language){
        System.out.println("猫的叫声"+language);
    }
    public String toString(){
        return "名字"+name+"性别"+sex+"年龄"+age;
    }
}
