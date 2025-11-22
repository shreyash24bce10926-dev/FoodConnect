import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DonationManager manager = new DonationManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to FoodConnect - Zero Waste Initiative");

        while (true) {
            System.out.println("\n1. Log Leftover Food");
            System.out.println("2. View Available Food");
            System.out.println("3. Claim Food (Volunteer)");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            String choice = sc.nextLine();

            try {
                if (choice.equals("1")) {
                    manager.addDonation();
                } else if (choice.equals("2")) {
                    manager.viewDonations();
                } else if (choice.equals("3")) {
                    manager.claimDonation();
                } else if (choice.equals("4")) {
                    System.out.println("Saving data and exiting...");
                    break;
                } else {
                    throw new DonationException("Invalid option selected.");
                }
            } catch (DonationException e) {
                System.out.println("Input Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }
        }
    }
}