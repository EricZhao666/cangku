package 学校.next;
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Programming3 {
    static int n=8;
    static int pan=0;
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        /*
            This line will use the methods provided below to get all
            the words from the dictionary.txt file that is >= 8 Characters long.
            It will then return a word from that List to wordToGuess as your
            word for the game.
        */
        String wordToGuess = getRandomWord();
        System.out.println(wordToGuess);
        int x=wordToGuess.length();
        String[] arr=new String[x];
        Arrays.fill(arr,"*");
        System.out.println("You still have 8 lives left");
        System.out.println("Please input you guess(word or letter):");
        while (sc.hasNext()){
            String s=sc.nextLine();
            //单输入的情况
            if (wordToGuess.indexOf(s)!=-1&&s.matches("[a-z]")){
                for (int i = 0; i <wordToGuess.length(); i++) {
                    char get=wordToGuess.charAt(i);
                    String b=String.valueOf(get);
                    if (b.equals(s)){
                        arr[i]=s;
                        pan++;
                        //System.out.println(pan);
                    }
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
            else {
                n--;
                for (int i = 0; i <wordToGuess.length(); i++) {
                    System.out.print(arr[i]);
                }
            }
            if (n>=1){
                System.out.println("you still have"+n+"live left!");
               // System.out.println(Arrays.toString(arr));
            }
            else {
                System.out.println("you don't have any chance!Game over");
                break;
            }
            if (pan>8){
                String duan=null;
                for (int i = 0; i < wordToGuess.length(); i++) {

                    duan+=arr[i];
                    //System.out.println(duan+" ");
                }
                if (duan.equals(null+wordToGuess)) {
                    System.out.println("you win the game");
                    break;
                }
                else {
                    continue;
                }
            }
            //多输入的情况
            if(wordToGuess.equals(s)&&s.matches("[a-z]{2,100}")) {
                System.out.println("you win");
                break;
            }
            else if(!wordToGuess.equals(s)&&s.matches("[a-z]{2,100}")) {
                System.out.println("you lose");
            }

        }

    }
    /** --------------------------------------- **/
    /** DO NOT CHANGE ANYTHING IN THESE METHODS **/
    /** --------------------------------------- **/
    public static String [] wordsReader(){
        //Path to file to read in
        String myfile = "E:\\学习\\IntelliJ IDEA 2020.3.1\\src\\学校\\next\\dictionary.txt";
        //Create an ArrayList (a dynamic type of Array)
        ArrayList <String> lines = new ArrayList <String>();
        try{
            // try to read in the File
            BufferedReader abc = new BufferedReader(new FileReader(myfile));

            String line;
            while((line = abc.readLine()) != null) {
                //If words length greater than 8 keep it otherwise discard it
                if(line.length() > 8){
                    lines.add(line);
                }
            }
            abc.close();
        }
        catch(FileNotFoundException ex) {
            //If the File is not found print to screen
            System.out.println(
                    "Unable to open file '" +
                            myfile + "'");
        }
        catch(IOException ex) {
            //If file is corrupted print to screen
            System.out.println(
                    "Error reading file '"
                            + myfile + "'");
        }
        //Convert from ArrayList to Array
        return lines.toArray(new String[]{});
    }

    public static String getRandomWord(){
        // Return a random word from the list
        String [] words = wordsReader();
        int len = words.length;
        Random rand = new Random();
        int x = rand.nextInt(len);
        return words[x];
    }
    /** ------------------------------------------ **/
    /** DO NOT CHANGE ANYTHING IN THE METHODS ABOVE **/
    /** ------------------------------------------ **/
}
