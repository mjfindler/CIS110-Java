import java.util.Scanner;

public class ConditionalsSwitch {
    public static void main(String[] args) {
        System.out.print("Please enter your grade round to the nearest whole number: ");
        Scanner keyboard = new Scanner(System.in);
        int grade = keyboard.nextInt();
        grade /= 10; // get the ten's digit
        switch (grade) {
            case 9, 10:
                System.out.print("You got an A.");
                break;
            case 8:
                System.out.print("You got an B.");
                break;
            case 7:
                System.out.print("You got an C.");
                break;
            case 6:
                System.out.print("You got an D.");
                break;
            default:
                System.out.print("You got an F.");
                break;
        }
    }
}
