# Problem Statement & Project Scope

## 1. Problem Statement
In many university hostels and canteens, a significant amount of cooked food goes to waste simply because there is no quick coordination between the kitchen staff and the people who could use it.
Currently, if a Mess Manager has 50 extra packets of food, they rely on inefficient methods like word-of-mouth or random WhatsApp messages to find takers. By the time volunteers see the message, the food is often cold or spoiled. There is a clear need for a central, digital log where availability can be posted and claimed instantly.

## 2. Project Scope
This project, **FoodConnect**, act as a "proof of concept" prototype. It a console-based application designed to digitize this donation process.

**What is included:**
- A system for providers to log details (Food type, Quantity, Shelf-life).
- A viewing dashboard for voluteers to see what is currently available in real-time.
- A "Claim" function to reserve food so multiple volunteers do not show up for the same pickup.
- File storage to keep a permanent record all donations for auditing purposes.

**Limitations:**
- As this is a core Java project, it does not currently have a graphical user interface (GUI) or a mobile app frontend.
- It is designed as single-node application for demonstration purposes.

## 3. Target Users
The system designed for two specific groups on campus:
1.  **Canteen/Mess Managers (The Providers):** They need fastt way to clear stock without guilt.
2.  **Student Volunteers/NGOs (The Distributors):** They need a reliable source of information to plan their distribution drives efficiently.

## 4. High-Level Features
- **Donation Entry Module:** Allows users to input specific foodd details and assigns a unique tracking ID to each batch.
- **Status Tracking Engine:** Monitors the state of food packts, switching them from `AVAILABLE` to `CLAIMED` to ensure accurate data.
- **Persistent Storage Layer:** Uses Java File I/O to save all transaction records to `donations.txt`, ensuring no data is lost when the system shuts down.
