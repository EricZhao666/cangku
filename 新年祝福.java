package 西二;
import java.util.Random;
public class 新年祝福 extends Thread   {
    public static void main(String[] args) {
        word w1=new word("新年快乐，孤寡孤寡");
        w1.start();
        word w2=new word("新年新对象，年年不一样");
        w2.start();

        }
    }
class word extends Thread{
    int x;
    String s1;
    public word(String s1) {
        this.s1=s1;
    }
    public void run(){
        for (int i=0;i<99999999;i++){
            Random r=new Random();
            x=r.nextInt(1000);
        System.out.println(s1);
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
