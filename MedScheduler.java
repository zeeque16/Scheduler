import java.util.Scanner;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MedScheduler {

	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static void main(String[] args) {

     	LocalDate localDate = LocalDate.now();
     	System.out.println(localDate);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of days medicine to be taken: ");

        int date = myObj.nextInt();

        myObj = new Scanner(System.in);
        System.out.println("Enter the gap between days medicine needs to be taken: ");
        myObj.close();

        date = dateFunction(date);
        System.out.println("Date: " + date);

    }

    public static int dateFunction(int date) {
        int temp = 0;

        temp = date + 7;

        return temp;
    }
}
