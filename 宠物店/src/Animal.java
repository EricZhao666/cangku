package 宠物店.src;

public class Animal {
    //基本属性

    public int number;
    public String name;
    public String sex;
    public int age;
    public int money;
    public Animal(String name,String sex,int age,int money){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.money=money;
    }
    //setting和getting
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){this.number=number;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getSex(){return sex;}
    public void setSex(String sex){this.sex=sex;}
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getMoney(){return money;}
    public void setMoney(int money){this.money=money;}
    public String toString(){
        return "名字"+name+"性别"+sex+"年龄"+age;
    }
    public void eat(){}
    public void talk(){}
}
