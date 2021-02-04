package 宠物店.src;

public class Dog extends Animal{
    public Dog(String name,String sex,int age,int money){
        super(name, sex, age,money);
    }
    public void eat(){
        System.out.println("狗吃狗粮");
    }
    public void talk(String language){
        System.out.println("狗的叫声"+language);
    }
    public String toString(){
        return "名字"+name+"性别"+sex+"年龄"+age;
    }

}
