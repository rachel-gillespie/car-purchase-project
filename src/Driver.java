// Rachel Gillespie, 20118715, Car Helper Program to give users useful information and advice when choosing their next car.

import java.util.Scanner; // Import Scanner.

public class Driver {
    public static void main(String[] args) {// contains main method and runs the program.

        new Driver(); // creates an instance of driver.
    }

    Driver() {

        Scanner input = new Scanner(System.in); // Created a Scanner Object called input and set input as keyboard.

        CarPurchaseHelper carPurchaserHelper = new CarPurchaseHelper(); // Created a CarPurchaseHelper Object called carPurchaserHelper.

        System.out.println(carPurchaserHelper.printWelcomeMessage()); // Calls Welcome message.

        int choice = 0;
        while (choice != 6) { // while loop repeats while choice does not equal 6.

            System.out.println("  ____             _   _      _                 \n" +
                    " / ___|__ _ _ __  | | | | ___| |_ __   ___ _ __ \n" +
                    "| |   / _` | '__| | |_| |/ _ \\ | '_ \\ / _ \\ '__|\n" +
                    "| |__| (_| | |    |  _  |  __/ | |_) |  __/ |   \n" +
                    " \\____\\__,_|_|    |_| |_|\\___|_| .__/ \\___|_|   \n" +
                    "|  _ \\ _ __ ___   __ _ _ __ __ |_| __ ___       \n" +
                    "| |_) | '__/ _ \\ / _` | '__/ _` | '_ ` _ \\      \n" +
                    "|  __/| | | (_) | (_| | | | (_| | | | | | |     \n" +
                    "|_|   |_|  \\___/ \\__, |_|  \\__,_|_| |_| |_|     \n" +
                    "                 |___/                          ");
            System.out.println("MAIN MENU");
            System.out.println("1. Calculate HP");
            System.out.println("2. Calculate PCP");
            System.out.println("3. Calculate Fuel Cost");
            System.out.println("4. Calculate Monthly Cost");
            System.out.println("5. Recommend Car Type");
            System.out.println("6. Exit Program");
            System.out.println(">>> Choose an option (1-6): ");
            choice = input.nextInt(); // user inputs choice.

            System.out.println("_______________________________________________________________________");

            if (choice == 1) { // if user chooses 1. Calculate HP.

                // --- HP Calculation ---
                System.out.println("--- Main Menu > Calculate HP ---");
                System.out.print("Enter car price: €");
                double hpPrice = input.nextDouble();
                System.out.print("Enter deposit: €");
                double hpDeposit = input.nextDouble();
                System.out.print("Enter annual interest rate (%): ");
                double hpInterest = input.nextDouble();
                System.out.print("Enter term in years: ");
                int hpTerm = input.nextInt();

                double hpMonthly = carPurchaserHelper.calculateHP(hpPrice, hpDeposit, hpInterest, hpTerm);
                System.out.println("Monthly HP payment: €" + String.format("%.2f", hpMonthly)); //formats hpMonthly to 2 decimal places.

                System.out.println("Return to menu(yes/no): ");
                String reply = input.nextLine();
                if (!carPurchaserHelper.returnToMenu(reply)) {
                    choice = 6; // if user doesn't input yes, the program prints the goodbye message and ends.
                }

                System.out.println("_______________________________________________________________________");

            } else if (choice == 2) { // if user chooses 2. Calculate PCP.

                // --- PCP Calculation ---
                System.out.println("--- Main Menu > Calculate PCP ---");
                System.out.print("Enter car price: €");
                double pcpPrice = input.nextDouble();
                System.out.print("Enter deposit: €");
                double pcpDeposit = input.nextDouble();
                System.out.print("Enter annual interest rate (%): ");
                double pcpInterest = input.nextDouble();
                System.out.print("Enter term in years: ");
                int pcpTerm = input.nextInt();
                System.out.print("Enter Guaranteed Minimum Future Value (%): ");
                double gmfvPercent = input.nextDouble();

                double pcpMonthly = carPurchaserHelper.pcpResultMonth(pcpPrice, pcpDeposit, pcpInterest, pcpTerm, gmfvPercent);
                System.out.println("Monthly PCP payment: €" + String.format("%.2f", pcpMonthly));

                System.out.println("Return to menu(yes/no): ");
                String reply = input.nextLine();
                if (!carPurchaserHelper.returnToMenu(reply)) {
                    choice = 6; // if user doesn't input yes, the program prints the goodbye message and ends.
                }

                System.out.println("_______________________________________________________________________");

            } else if (choice == 3) { // if user chooses 3. Calculate Fuel Cost.

                // --- Fuel Cost Calculation ---
                System.out.println("--- Main Menu > Calculate Fuel Cost ---");
                System.out.print("Enter weekly kilometres: ");
                double fuelDistance = input.nextDouble();
                System.out.print("Enter fuel cost (per litre): €");
                double fuelCost = input.nextDouble();

                double fuelWeekly = carPurchaserHelper.fuelCostEstimator(fuelDistance, fuelCost);
                System.out.println("Weekly Fuel Cost: €" + String.format("%.2f", fuelWeekly));

                System.out.println("Return to menu(yes/no): ");
                String reply = input.nextLine();
                if (!carPurchaserHelper.returnToMenu(reply)) {
                    choice = 6; // if user doesn't input yes, the program prints the goodbye message and ends.
                }

                System.out.println("_______________________________________________________________________");

            } else if (choice == 4) { // if user chooses 4. Calculate Monthly Cost.

                // --- Monthly Cost Calculation ---
                System.out.println("--- Main Menu > Calculate Monthly Cost ---");
                System.out.print("Enter Car Price: €");
                double carPrice = input.nextDouble();
                System.out.print("Enter term in months: ");
                int monthTerm = input.nextInt();

                double costMonthly = carPurchaserHelper.calculateMonthlyCost(carPrice, monthTerm);
                System.out.println("Monthly Cost: €" + String.format("%.2f", costMonthly));

                System.out.println("Return to menu(yes/no): ");
                String reply = input.nextLine();
                if (!carPurchaserHelper.returnToMenu(reply)) {
                    choice = 6; // if user doesn't input yes, the program prints the goodbye message and ends.
                }

                System.out.println("_______________________________________________________________________");

            } else if (choice == 5) { // if user chooses 5. Recommend Car Type.

                input.nextLine();

                // --- Car Type Recommendation ---
                System.out.println("--- Main Menu > Recommend Car Type ---");
                System.out.println("Enter car requirement, (e.g. family, commute, adventure): ");
                String carRequirement = input.nextLine();

                while (!(carRequirement.equalsIgnoreCase("family")) && !(carRequirement.equalsIgnoreCase("commute")) && !(carRequirement.equalsIgnoreCase("adventure"))) { // Checking if input is not equal to these 3.

                    System.out.println("Invalid input!");

                    System.out.println("Enter car requirement, (e.g. family, commute, adventure): ");
                    carRequirement = input.nextLine();

                }

                String RecommendCar = carPurchaserHelper.recommendCarType(carRequirement);
                System.out.println("Recommended Car: " + RecommendCar);

                System.out.println("Return to menu(yes/no): ");
                String reply = input.nextLine();
                if (!carPurchaserHelper.returnToMenu(reply)) {
                    choice = 6; // if user doesn't input yes, the program prints the goodbye message and ends.
                }

                System.out.println("_______________________________________________________________________");

            } else if (choice == 6) { // Doesn't print Error message if choice is 6.

            } else {
                
                System.out.println("Error: Invalid choice. Please enter a number between 1 & 6.");

                System.out.println("_______________________________________________________________________");
            }

        }

        // --- Exit ---
        System.out.println(carPurchaserHelper.printGoodbyeMessage()); // Calls Goodbye message.

        System.out.println("_______________________________________________________________________");

    }

}


