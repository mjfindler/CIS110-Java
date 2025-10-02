import java.util.Scanner;

public class ConditionalsIfs {
    public static String getGrade(int grade) {
        /**
         * Notice that this does not use {} and is still readable!
         */
        if (grade < 59)         return "You got an F.";
        else if (grade < 69)    return "You got a D.";
        else if (grade < 79)    return "You got a C.";
        else if (grade < 89)    return "You got a B.";
        else                    return "You got an A.";
    }

    public static void main(String[] args) {
        System.out.print("Please enter your grade round to the nearest whole number: ");
        Scanner keyboard = new Scanner(System.in);
        int grade = keyboard.nextInt();
        System.out.println(getGrade(grade));
    }
}