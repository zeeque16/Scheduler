import java.util.Scanner;

public class MedScheduler {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter date: ");

        int date = myObj.nextInt();

        date = dateFunction(date);
        System.out.println("Date: " + date);


        myObj.close();
    }

    public static int dateFunction(int date) {
        int temp = 0;

        temp = date + 7;

        return temp;
    }
}
