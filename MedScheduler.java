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

        schedulerFunc(numMed, gapDays, localDate);

        // System.out.println("Todays date: " + localDate);
        // System.out.println("Number of medicines to be taken: " + numMed);
        // System.out.println("Gap between each medicines: " + gapDays);
    }

    public static void schedulerFunc(int numMed, int gapDays, LocalDate todayDate) {
        int todayDay = todayDate.getDayOfMonth();
        int todayMonth = todayDate.getMonthValue();

    }
}
