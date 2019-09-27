import java.util.Scanner;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MedScheduler {

	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static void main(String[] args) {

    	int numMed, gapDays;

     	LocalDate localDate = LocalDate.now();												// Entering todays date

        Scanner myObj = new Scanner(System.in);												// Prompts user to enter amount of days medicine to be taken
        System.out.print("Enter amount of medicine to be taken: ");
        numMed = myObj.nextInt();

        myObj = new Scanner(System.in);
        System.out.print("Enter number of days between each medicine: ");					// Prompts user to enter the gap between each medicine
        gapDays = myObj.nextInt();

        myObj.close();

        System.out.println("Todays date: " + localDate);
        System.out.println("Number of medicines to be taken: " + numMed);
        System.out.println("Gap between each medicines: " + gapDays);
    }

    public static int dateFunction(int date) {
        int temp = 0;

        temp = date + 7;

        return temp;
    }
}
