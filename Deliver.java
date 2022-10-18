import java.time.*;
import java.util.Scanner;

public class Deliver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate orderDate;

        int mo;
        int day;
        int year;
        final int WEEKS_FOR_DELIVERY = 2;

        System.out.print("Enter Order Month ");
        mo = input.nextInt();

        System.out.print("\nEnter Order Day ");
        day = input.nextInt();

        System.out.print("\nEnter Order Year ");
        year = input.nextInt();

        orderDate = LocalDate.of(year, mo, day);

        System.out.println("\nOrder Date is " + orderDate);
        System.out.println("\nDelivery Date is " + orderDate.plusWeeks(WEEKS_FOR_DELIVERY));
    }

}
