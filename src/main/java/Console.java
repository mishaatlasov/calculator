import java.util.Scanner;

public class Console {
    Scanner scanner;

    public Long askNumber() {
        Long result = 0L;
        boolean isNumber = false;
        do {
            System.out.println("Enter number:");
            scanner = new Scanner(System.in);
            if (scanner.hasNextLong()) {
                result = scanner.nextLong();
                System.out.println("Thank you! you entered number: " + result);
                isNumber = true;
            } else {
                System.out.println("Sorry, but it is not a number! Try again");
            }
        }
        while (isNumber == false);
        return result;
    }

    public boolean askContinue(){
        boolean result = false;
        boolean gotAnswer = false;
        do {
            String answer;
            System.out.println("Do you want to continue? (yes/y |||| no/n)");
            scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
                System.out.println("continue... Hooray! (;");
                gotAnswer =true;
                result=true;
            }
            else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                System.out.println("Thank you for using calculator!!");
            gotAnswer=true;
            result=false;

            } else {
                System.out.println("Sorry, I can't understand you! Try again!");
            }
        }
        while (gotAnswer == false);
        return result;
    }
}
