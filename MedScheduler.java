import java.util.Scanner;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ArrayList;

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

        schedulerFunc(numMed, gapDays, localDate);

        // testFunc();
    }

    public static void schedulerFunc(int numMed, int gapDays, LocalDate todayDate) {
    	int todayDay = todayDate.getDayOfMonth();
    	int todayMonth = todayDate.getMonthValue();
    	int todayYear = todayDate.getYear();
    	ArrayList<Integer> medDates = new ArrayList<Integer>();

    	int tempDates = todayDay;
    	for  (int count = 0; count < numMed; ++count) {
    		tempDates = tempDates + gapDays;
    		if (tempDates > 31 && ((todayMonth % 2 != 0) ? ((todayMonth < 8) ? true : false) : ((todayMonth % 2 == 0) ? ((todayMonth > 7 && todayMonth < 13) ? true : false) : false))) {
    			tempDates -= 31;
    			todayMonth += 1;
    		} 
    		else if (tempDates > 30) {
    			tempDates -=30;
    			todayMonth += 1;
    		}
    		if (todayMonth > 12) 
    			todayMonth = 1;
    		medDates.add(tempDates);
    		System.out.println(count + ": todayMonth: " + todayMonth);
    	}

    	for (int count = 0; count < medDates.size(); ++count)
    		System.out.println(count + ": Dates on which medicine is to be taken: " + medDates.get(count));
    }

	// Test function
    public static void testFunc() {
    	for (int count = 1; count < 13; ++count) {
    		System.out.println("Count " + count + ": " + ((count % 2 != 0) ? ((count < 8) ? true : false) : false));
    	}
    	System.out.println("--------------------------------------");
    	for (int count = 1; count < 13; ++count) {
    		System.out.println("Count: " + count + ": " + ((count % 2 == 0) ? ((count > 7 && count < 13) ? true : false) : false));
    	}

    }
}
