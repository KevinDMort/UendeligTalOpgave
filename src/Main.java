import java.util.Scanner;

public class Main {

    public static boolean processInput(String input) {
        int intValue;
        try {
            intValue = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        System.out.println("Hej med dig!");
        System.out.print("Indtast et tal: ");
        Scanner input = new Scanner(System.in);
        sum += Integer.parseInt(input.nextLine());
        counter++;
        while(true) {
            System.out.println("Indtast endnu et tal:");
            String temporary =  input.nextLine();
            if(processInput(temporary) == true) {
                sum += Integer.parseInt(temporary);
                counter++;
                double average = (double) sum / counter;
                System.out.printf("Gennemsnittet af de indtastede tal er: %.2f", average);
                System.out.println("");
            }
            else if(!temporary.equals("Q") && !temporary.equals("q")) {
                System.out.println("invalid input");
            }
            else
                break;


        }

    }
}
