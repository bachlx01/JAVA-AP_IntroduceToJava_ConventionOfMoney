import java.util.Scanner;

public class ConventionOfMoney {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount by USD unit: ");
        long USD = scanner.nextLong();
        long VND = USD * 23000;

        System.out.print("Amount in VND: " + VND);
    }
}
