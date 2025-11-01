// Rachel Gillespie, 20118715, Car Helper Program to give users useful information and advice when choosing their next car.

import java.util.Scanner; // Import Scanner

public class Driver {
    public static void main(String[] args) {// contains main method and runs the program.

        new Driver();
    }
    Driver() {

        Scanner input = new Scanner(System.in); // Created a Scanner Object called input and set input as keyboard.

        CarPurchaseHelper carPurchaserHelper = new CarPurchaseHelper(); // Created a CarPurchaseHelper Object called carPurchaserHelper

        System.out.println(carPurchaserHelper.printWelcomeMessage()); // Calls Welcome message

        int choice = 0;
        while (choice != 6) {// for loop repeats while 'i' is less than or equal to 6.

            System.out.println("");
            System.out.println("MAIN MENU");
            System.out.println("1. Calculate HP");
            System.out.println("2. Calculate PCP");
            System.out.println("3. Calculate Fuel Cost");
            System.out.println("4. Calculate Monthly Cost");
            System.out.println("5. Recommend Car Type");
            System.out.println("6. Exit Program");
            System.out.println(">>> Choose an option (1-6): ");
            choice = input.nextInt();

            System.out.println("_______________________________________________________________________");

            if (choice == 1) { // if user chooses 1. Calculate HP

                // --- HP Calculation ---
                System.out.println("--- Main Menu > Calculate HP ---");
                System.out.print("Enter car price: ");
                double hpPrice = input.nextDouble();
                System.out.print("Enter deposit: ");
                double hpDeposit = input.nextDouble();
                System.out.print("Enter annual interest rate (%): ");
                double hpInterest = input.nextDouble();
                System.out.print("Enter term in years: ");
                int hpTerm = input.nextInt();

                double hpMonthly = carPurchaserHelper.calculateHP(hpPrice, hpDeposit, hpInterest, hpTerm);
                System.out.println("Monthly HP payment: €" + hpMonthly);

                System.out.println("Return to menu");
                input.nextLine();
                String reply = input.nextLine();
                if (carPurchaserHelper.returnToMenu(reply)) {
                    choice = 0;
                } else {

                    System.out.println("_______________________________________________________________________");
                }

            } else if (choice == 2) { // if user chooses 2. Calculate PCP

                // --- PCP Calculation ---
                System.out.println("--- Main Menu > Calculate PCP ---");
                System.out.print("Enter car price: ");
                double pcpPrice = input.nextDouble();
                System.out.print("Enter deposit: ");
                double pcpDeposit = input.nextDouble();
                System.out.print("Enter annual interest rate (%): ");
                double pcpInterest = input.nextDouble();
                System.out.print("Enter term in years: ");
                int pcpTerm = input.nextInt();
                System.out.print("Enter Guaranteed Minimum Future Value (%): ");
                double gmfvPercent = input.nextDouble();

                double pcpMonthly = carPurchaserHelper.pcpResultMonth(pcpPrice, pcpDeposit, pcpInterest, pcpTerm, gmfvPercent);
                System.out.println("Monthly PCP payment: €" + pcpMonthly);

                System.out.println("_______________________________________________________________________");

            } else if (choice == 3) { // if user chooses 3. Calculate Fuel Cost

                // --- Fuel Cost Calculation ---
                System.out.println("--- Main Menu > Calculate Fuel Cost ---");
                System.out.print("Enter weekly kilometres: ");
                double fuelDistance = input.nextDouble();
                System.out.print("Enter fuel cost: ");
                double fuelCost = input.nextDouble();

                double fuelWeekly = carPurchaserHelper.fuelCostEstimator(fuelDistance, fuelCost);
                System.out.println("Weekly Fuel Cost: €" + fuelWeekly);

                System.out.println("_______________________________________________________________________");

            } else if (choice == 4) { // if user chooses 4. Calculate Monthly Cost

                // --- Monthly Cost Calculation ---
                System.out.println("--- Main Menu > Calculate Monthly Cost ---");
                System.out.print("Enter Car Price: €");
                double carPrice = input.nextDouble();
                System.out.print("Enter term in months: ");
                int monthTerm = input.nextInt();

                double costMonthly = carPurchaserHelper.calculateMonthlyCost(carPrice, monthTerm);
                System.out.println("Monthly Cost: €" + costMonthly);

                System.out.println("_______________________________________________________________________");

            } else if (choice == 5) { // if user chooses 5. Recommend Car Type

                input.nextLine();

                // --- Car Type Recommendation ---
                System.out.println("--- Main Menu > Recommend Car Type ---");
                System.out.println("Enter car requirement, (e.g. family, commute, adventure): ");
                String carRequirement = input.nextLine();

                String RecommendCar = carPurchaserHelper.recommendCarType(carRequirement);
                System.out.println("Recommended Car: " + RecommendCar);

                System.out.println("_______________________________________________________________________");

            } else if (choice == 6) {

                // --- Exit ---
                System.out.println(carPurchaserHelper.printGoodbyeMessage()); // Calls Goodbye message

                System.out.println("_______________________________________________________________________");

            } else {
                System.out.println("Error: Invalid choice. Please enter a number between 1 & 6.");

                System.out.println("_______________________________________________________________________");
            }
        }
    }

}


