package 学校;
import java.util.*;
public class ChessGame {
    static int[][] x = new int[3][3]; //存储X用户的值
    static int[][] o = new int[3][3]; //存储O用户的值
    static int X;
    static int Y;
    //static boolean pin=false;
    public static void main(String[] args) {
        printBoard();
        input();
    }
    //打印棋盘
    public static void printBoard() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if (x[i][j] == 1) {
                    System.out.print("[x]");
                } else if (o[i][j] == 1) {
                    System.out.print("[0]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
    //判断棋盘的值
    public static void draw(int[][] xo, String role) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (flag == false) {
            System.out.println(role + "用户输入坐标位置(0,0)：");
            X = sc.nextInt();
            Y = sc.nextInt();
            if (x[X][Y] != 0 || o[X][Y] != 0) {
                System.out.println("该位置已经有棋子了！");
                flag = false;
            } else {
                xo[X][Y] = 1;
                flag = true;
            }
            printBoard();
        }
    }
    //输出是否获胜
    public static void input() {
        boolean flag = false; //标记某个用户是否赢
        String roleX = "X";
        String roleO = "O";
        while (flag == false) {
            draw(x, roleX); //1.默认先从X用户先画X
            flag = isWin(x, X, Y, roleX); //2.判断X用户是否已经赢了
            if (flag == true) {
                System.out.println(roleX + "用户获胜！");
                return;
            }
            draw(o, roleO); //3.接着O用户画O
            flag = isWin(o, X, Y, roleO); //4.判断O用户是否已经赢了
            if (flag == true) {
                System.out.println(roleO + "用户获胜!");
                return;
            }
        }
    }
//判断是否获胜
    public static boolean isWin(int[][] xo, int row, int col, String role) {
        int num0 = 0; //行
        int num1 = 0; //列
        int num2 = 0; //对角线1
        int num3 = 0; //对角线2
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(row == i) {
                    num0+=xo[row][j];
                }
                if(col == j) {
                    num1+=xo[i][col];
                }
                if(row==col && i==j) {
                    num2+=xo[i][j];
                }
                if(row==(2-col) && i==(2-j)) {
                    num3+=xo[i][j];
                }
            }
        }
        if(num0==3 || num1==3 || num2==3 || num3==3) {
            return true;
        }
        return false;
    }

}
