// Rachel Gillespie, 20118715, Car Helper Program to give users useful information and advice when choosing their next car.

public class CarPurchaseHelper { // contains logic, tasks and reusable functionality.

    public String printWelcomeMessage() { // printWelcomeMessage method, returns a string, has no parameters.
        return "Welcome to the Car Purchase Helper Program! Let's find the perfect car for you!"; // Returns String
    }

    // ToDO: explain it in the reflection
    public double calculateHP(double carPrice, double deposit, double annualInterest, int termYears) { // calculateHP method, returns a double, has 4 parameters.
        double amountToFinance = carPrice - deposit; // declares a variable called amountToFinance of type double and assigns it the value of carPrice minus deposit.

        double monthlyInterestRate = (annualInterest / 100) / 12; // declares a variable called monthlyInterestRate of type double and assigns it the value of annualInterest divided by 100, then divided by 12.
        int totalMonths = termYears * 12; // declares a variable called totalMonths of type int and assigns it the value of termYears multiplied by 12.

        if (monthlyInterestRate == 0) { // Conditional statement. If monthlyInterestRate is 0.
            return amountToFinance / totalMonths; // return amountToFinance divided by totalMonths if condition1 gave a true result.
        } else { // Do these statements if condition1 gave a false result.
            // Calculate (1 + r)^n using a loop
            double factor = 1; // declares a variable called factor of type double and assigns it the value of 1.
            for (int i = 0; i < totalMonths; i++) { // for loop. Initialize int i the value of 0. Set boolean condition, if i is less than totalMonths. Post-body action, i increment.
                factor *= (1 + monthlyInterestRate); // factor is factor multiplied by 1 added to monthlyInterestRate.
            }

            double monthlyPayment = amountToFinance * monthlyInterestRate * factor / (factor - 1); // declares a variable called monthlyPayment of type double and assigns it the value of amountToFinance multiplied by monthlyInterestRate, multiplied by factor and then divided by factor minus 1.
            return monthlyPayment; // returns monthlyPayment if condition1 gave a false result.
        }
    }

    // ToDO: explain it in the reflection
    public double pcpResultMonth(double carPrice, double deposit, double annualInterest, int termYears, double gmfvPercent) { // pcpResultMonth method, returns a double, has 5 parameters.
        double gmfv = carPrice * (gmfvPercent / 100);
        double amountToFinance = carPrice - deposit - gmfv;

        double monthlyInterestRate = (annualInterest / 100) / 12;
        int totalMonths = termYears * 12;

        double monthlyPayment;

        if (monthlyInterestRate == 0) {
            monthlyPayment = amountToFinance / totalMonths;
        } else {
            // Calculate (1 + r)^n using a loop
            double factor = 1;
            for (int i = 0; i < totalMonths; i++) {
                factor *= (1 + monthlyInterestRate);
            }

            monthlyPayment = amountToFinance * monthlyInterestRate * factor / (factor - 1);
        }

        return monthlyPayment;
    }

    public double fuelCostEstimator(double weeklyKilometers, double fuelCost) { // fuelCostEstimator method, returns a double, has 2 parameters.

        double weeklyFuelCost;

        weeklyFuelCost = (weeklyKilometers / 100) * 6 * fuelCost; // assume 6 l per 100 km.

        return weeklyFuelCost;
    }

    public double calculateMonthlyCost(double carPrice, int termMonths) { // calculateMonthlyCost method, returns a double, has 2 parameters.

        double monthlyPayment;

        monthlyPayment = carPrice / termMonths;

        return monthlyPayment;
    }

    public String recommendCarType(String carRequirement) { // recommendCarType method, returns a string, has 1 requirement

        if (carRequirement.equalsIgnoreCase("family")) {
            return "Skoda Octavia Estate";
        } else if (carRequirement.equalsIgnoreCase("commuter")) {
            return "Toyota Corolla Hybrid";
        } else if (carRequirement.equalsIgnoreCase("adventure")) {
            return "Jeep Wrangler Rubicon";
        } else {
            return "You did not input a valid requirement!";
        }
    }

    public boolean returnToMenu(String reply) {
        if (reply.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public String printGoodbyeMessage() { // printGoodbyeMessage method, returns a string, has no parameters.

        return "We hope you had a successful experience! Goodbye!"; // Returns String
    }
}

