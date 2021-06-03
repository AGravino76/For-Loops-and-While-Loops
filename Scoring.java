import java.util.Scanner;
public class Scoring{
    public static void main(String[] args){
        //Initialize values, counts HAVE to have a default value for some reason
        int highscore1, highscore2, highscore3, highscore4, highscore5;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        //Individual scanners
        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        Scanner keyboard3 = new Scanner(System.in);
        Scanner keyboard4 = new Scanner(System.in);
        Scanner keyboard5 = new Scanner(System.in);


        //Ask for inputs
        System.out.print("Enter user 1 highscore: ");
        highscore1 = keyboard1.nextInt();
        System.out.print("Enter user 2 highscore: ");
        highscore2 = keyboard2.nextInt();
        System.out.print("Enter user 3 highscore: ");
        highscore3 = keyboard3.nextInt();
        System.out.print("Enter user 4 highscore: ");
        highscore4 = keyboard4.nextInt();
        System.out.print("Enter user 5 highscore: ");
        highscore5 = keyboard5.nextInt();

        //Calculation for how many *
        for(int i = highscore1; i >= 1000; i-=1000){
            count1++;
        }
        for(int i = highscore2; i >= 1000; i-=1000){
            count2++;
        }
        for(int i = highscore3; i >= 1000; i-=1000){
            count3++;
        }
        for(int i = highscore4; i >= 1000; i-=1000){
            count4++;
        }
        for(int i = highscore5; i >= 1000; i-=1000){
            count5++;
        }

        //Print
        System.out.print("User 1: ");
        for(int i = 0; i < count1; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("User 2: ");
        for(int i = 0; i < count2; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("User 3: ");
        for(int i = 0; i < count3; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("User 4: ");
        for(int i = 0; i < count4; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("User 5: ");
        for(int i = 0; i < count5; i++){
            System.out.print("*");
        }
    }
}