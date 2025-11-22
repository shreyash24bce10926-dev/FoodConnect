FoodConnect - Zero Waste Campus Initiative

1. Project Overview

FoodConnect is a Java-based console application designed to address the critical issue of food waste on university campuses. In many hostels and canteens, edible food is discarded daily while local communities face food insecurity.

This application bridges that gap by allowing Canteen Managers to log available surplus food and Volunteers to track and claim it for distribution. The system replaces inefficient manual communication (like WhatsApp groups) with a structured, digital logging system.

2. Features

Functional Features

Log Donations: Managers can input details of leftover food (Item Name, Quantity).

View Listings: Real-time display of all logged donations with their status (AVAILABLE or CLAIMED).

Claim System: Volunteers can mark specific food packets as 'Claimed' to prevent double-booking.

Data Persistence: All records are automatically saved to a local file (donations.txt) so data persists between sessions.

Technical Highlights

OOP: I split the code into different classes like FoodPacket and DonationManager to keep it organized.

Error Handling: I added a custom error (DonationException) so the app doesn't crash if someone types the wrong thing.

Serialization: This is how I save the objects to the file.

3. Technologies Used

Language: Java (JDK 1.8+)

IDE: IntelliJ IDEA

Version Control: Git & GitHub

4. Project Structure

This is how I organized my files in the src folder:

Main.java -> The starting point (Menu).

DonationManager.java -> Handles all the logic (adding, viewing, claiming).

FoodPacket.java -> A simple class that defines what a "Food Packet" is.

StorageHelper.java -> Handles the saving and loading from the file.

DonationException.java -> Catches errors.

5. Installation & Run Instructions

Clone the Repository:

git clone [https://github.com/shreyash24bce10926-dev/FoodConnect.git](https://github.com/shreyash24bce10926-dev/FoodConnect.git)


Compile the Code:
Open your terminal/command prompt, navigate to the src folder, and run:

javac *.java


Run the Application:

java Main


6. How to Test (Testing Steps)

Here is how you can check if the project is working correctly:

Test 1: Add Food

Run the app.

Choose option 1.

Enter "Curry" and "2kg".

It should say "Success! Donation logged".

Test 2: Check the List

Choose option 2.

You should see the "Curry" you just added with status AVAILABLE.

Test 3: Claim Food

Choose option 3.

Enter the ID (like F1) shown in the list.

It should say "You have claimed this donation".

If you check the list again (Option 2), the status should change to CLAIMED.

Test 4: Check Saving

Exit the app (Option 4).

Run it again.

Check the list (Option 2). The data should still be there!
