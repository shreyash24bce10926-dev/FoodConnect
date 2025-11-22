import java.util.List;
import java.util.Scanner;

public class DonationManager {
    private List<FoodPacket> packets;
    private StorageHelper storage;
    private Scanner sc;

    public DonationManager() {
        storage = new StorageHelper();
        packets = storage.readFromFile();
        sc = new Scanner(System.in);
    }

    public void addDonation() {
        System.out.println("\n--- Log New Donation ---");
        System.out.print("Enter Food Item (e.g., Rice, Bread): ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity (e.g., 5kg, 10 packets): ");
        String qty = sc.nextLine();

        // Generate a simple ID based on list size
        String id = "F" + (packets.size() + 1);

        FoodPacket fp = new FoodPacket(id, name, qty);
        packets.add(fp);
        storage.saveToFile(packets);
        System.out.println("Success! Donation logged with ID: " + id);
    }

    public void viewDonations() {
        System.out.println("\n--- Current Food Listings ---");
        if (packets.isEmpty()) {
            System.out.println("No donations found.");
        } else {
            for (FoodPacket p : packets) {
                System.out.println(p);
            }
        }
    }

    public void claimDonation() {
        viewDonations();
        System.out.print("\nEnter ID to claim (e.g., F1): ");
        String targetId = sc.nextLine();

        boolean found = false;
        for (FoodPacket p : packets) {
            if (p.getId().equals(targetId)) {
                if (p.getStatus().equals("CLAIMED")) {
                    System.out.println("Error: This item is already claimed.");
                } else {
                    p.setStatus("CLAIMED");
                    storage.saveToFile(packets);
                    System.out.println("Success! You have claimed this donation.");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Error: ID not found.");
        }
    }
}