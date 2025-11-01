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

        double monthlyPayment; // declares a variable called monthlyPayment of type double.

        if (monthlyInterestRate == 0) { // Conditional statement. If monthlyInterestRate is 0.
            monthlyPayment = amountToFinance / totalMonths; // Variable monthlyPayment is assigned amountToFinance divided by totalMonths if condition gave a true result.
        } else { // Do these statements if condition gave a false result.
            // Calculate (1 + r)^n using a loop
            double factor = 1; // declares a variable called factor of type double and assigns it the value of 1. It represents (1 + r)^n which is the compund interest growth factor over the loan period.
            for (int i = 0; i < totalMonths; i++) { // for loop. Initialize int i the value of 0. Set boolean condition, if i is less than totalMonths. Post-body action, increment i.
                factor *= (1 + monthlyInterestRate); // factor is factor multiplied by 1 added to monthlyInterestRate.
            }

            monthlyPayment = amountToFinance * monthlyInterestRate * factor / (factor - 1); // Variable monthlyPayment is assigned the value of amountToFinance multiplied by monthlyInterestRate, multiplied by factor and then divided by factor minus 1.
        }

        return monthlyPayment; // returns monthlyPayment
    }

    // ToDO: explain it in the reflection
    public double pcpResultMonth(double carPrice, double deposit, double annualInterest, int termYears, double gmfvPercent) { // pcpResultMonth method, returns a double, has 5 parameters.
        double gmfv = carPrice * (gmfvPercent / 100); // declares a variable called gmfv of type double and assigns it the value of gmfvPercent divided by 100, then multiplied by carPrice.
        double amountToFinance = carPrice - deposit - gmfv; // declares a variable called amountToFinance of type double and assigns it the value of carPrice minus deposit minus gmfv.

        double monthlyInterestRate = (annualInterest / 100) / 12; // declares a variable called monthlyInterestRate of type double and assigns it the value of annualInterest divided by 100, then divided by 12.
        int totalMonths = termYears * 12; // declares a variable called totalMonths of type int and assigns it the value of termYears multiplied by 12.

        double monthlyPayment; // declares a variable called monthlyPayment of type double.

        if (monthlyInterestRate == 0) { // Conditional Statement. If monthlyInterestRate is 0.
            monthlyPayment = amountToFinance / totalMonths; // Variable monthlyPayment is assigned amountToFinance divided by totalMonths if condition gave a true result.
        } else { // Do these statements if condition gave a false result.
            // Calculate (1 + r)^n using a loop
            double factor = 1; // declares a variable called factor of type double and assign it the value of 1. It represents (1 + r)^n which is the compund interest growth factor over the loan period.
            for (int i = 0; i < totalMonths; i++) { //  for loop. Initialize int i the value of 0. Set boolean condition, if i is less than totalMonths. Post-body action, i increment.
                factor *= (1 + monthlyInterestRate); // factor is factor multiplied by 1 added to monthlyInterestRate.
            }

            monthlyPayment = amountToFinance * monthlyInterestRate * factor / (factor - 1); // Variable monthlyPayment is assigned amountToFinance multiplied by monthlyInterestRate, multiplied by factor and then divided by factor minus 1.
        }

        return monthlyPayment; // returns monthlyPayment
    }

    public double fuelCostEstimator(double weeklyKilometers, double fuelCost) { // fuelCostEstimator method, returns a double, has 2 parameters.

        double weeklyFuelCost; // declares a variable weeklyFuelCost of type double.

        weeklyFuelCost = (weeklyKilometers / 100) * 6 * fuelCost; // assume 6 l per 100 km. Variable weeklyFuelCost is assigned the value of weekly kilometers divided by 100, then multiplied by 6, then multiplied by fuelCost.

        return weeklyFuelCost; // returns weeklyFuelCost
    }

    public double calculateMonthlyCost(double carPrice, int termMonths) { // calculateMonthlyCost method, returns a double, has 2 parameters.

        double monthlyPayment; // declares a variable monthlyPayment of type double.

        monthlyPayment = carPrice / termMonths; // Variable monthlyPayment is assigned the value of carPrice divided by termMonths.

        return monthlyPayment; // returns monthlyPayment
    }

    public String recommendCarType(String carRequirement) { // recommendCarType method, returns a string, has 1 parameter.

        if (carRequirement.equalsIgnoreCase("family")) { // checking if the string inputted is equal to family, ignoring letter case.
            return "Skoda Octavia Estate"; // if the above statement is true, return this string.
        } else if (carRequirement.equalsIgnoreCase("commuter")) { // checking if the string inputted is equal to commuter, ignoring letter case.
            return "Toyota Corolla Hybrid"; // if the above statement is true, return this string.
        } else if (carRequirement.equalsIgnoreCase("adventure")) { // checking if the string inputted is equal to adventure, ignoring letter case.
            return "Jeep Wrangler Rubicon"; // if the above statement is true, return this string.
        } else { // if the above statements are false
            return "You did not input a valid requirement!"; // if the above statements are false, return this string.
        }
    }

    public boolean returnToMenu(String reply) { // returnToMenu method, returns a boolean(true/false), has 1 parameter.
        return reply.equalsIgnoreCase("yes"); // checking if the string inputted is equal to yes, ignoring letter case.
    }

    public String printGoodbyeMessage() { // printGoodbyeMessage method, returns a string, has no parameters.
        return "We hope you had a successful experience! Goodbye!"; // Returns String
    }

}

