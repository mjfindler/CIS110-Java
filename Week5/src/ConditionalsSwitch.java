import java.util.Scanner;

public class ConditionalsSwitch {
    public static String getGrade(int grade) {
        /**
         * Note that there are no break statements!
         * Note that the case statements are ONE line each!
         */
        grade /= 10; // get the ten's digit
        String str = "";
        switch (grade) {
            case 9, 10:            return "You got an A.";
            case 8:                return "You got an B.";
            case 7:                return "You got an C.";
            case 6:                return "You got an D.";
            default:               return "You got an F.";
        }
    }

    public static void main(String[] args) {
        System.out.print("Please enter your grade round to the nearest whole number: ");
        Scanner keyboard = new Scanner(System.in);

        int grade = keyboard.nextInt();
        System.out.println(getGrade(grade)); // Does one thing! Returns the grade!
    }
}
