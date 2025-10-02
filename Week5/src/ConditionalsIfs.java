import java.util.Scanner;

public class ConditionalsIfs {
    public static void main(String[] args) {
        System.out.print("Please enter your grade round to the nearest whole number: ");
        Scanner keyboard = new Scanner(System.in);
        int grade = keyboard.nextInt();
        if (grade < 59){
            System.out.print("You got an F.");}
        else if (grade < 69){
            System.out.print("You got a D.");}
        else if (grade < 79){
            System.out.print("You got a C.");}
        else if (grade < 89){
            System.out.print("You got a B.");}
        else{
            System.out.print("You got an A.");
        }
    }
}