# 🚗 Car Purchase Helper

## Project Overview
Car Purchase Helper is a Java console application that helps users make informed decisions when buying a car. It provides a menu-driven interface for calculating monthly finance payments, estimating fuel costs, and getting car type recommendations based on the user's requirements. Built as part of a Higher Diploma in Computer Science, Object-Oriented Programming module.

## Features
- **HP (Hire Purchase) calculator** — calculates monthly payments based on car price, deposit, annual interest rate, and term length
- **PCP (Personal Contract Plan) calculator** — calculates monthly payments including a guaranteed minimum future value (GMFV) balloon payment option
- **Fuel cost estimator** — calculates weekly fuel cost based on kilometres driven and fuel price per litre (assumes 6L/100km)
- **Monthly cost calculator** — calculates a simple monthly payment over a given term
- **Car type recommender** — suggests a car type based on the user's stated requirements
- Menu loops after each calculation, allowing users to run multiple options in one session
- Monetary values formatted to 2 decimal places throughout

## Tech Stack
| Category | Technology |
|---|---|
| Language | Java |
| Type | Console Application |
| IDE | IntelliJ IDEA |

## Setup Instructions

### Prerequisites
- [Java JDK 17+](https://www.oracle.com/java/technologies/downloads/) installed
- A terminal or an IDE such as [IntelliJ IDEA](https://www.jetbrains.com/idea/)

### Installation
1. Clone the repository:
```bash
git clone https://github.com/rachel-gillespie/car-purchase-project
cd car-purchase-project
```

## How to Run

**From the terminal:**
```bash
javac src/CarPurchaseHelper.java src/Driver.java
java -cp src Driver
```

**From IntelliJ IDEA:**
Open the project, navigate to `src/Driver.java` and click the Run button.

## Reflection

### Architecture Choices
- The project is split into two classes: `CarPurchaseHelper`, which contains all calculation and utility methods, and `Driver`, which contains the `main` method and handles user interaction via the Scanner class. This separation keeps the logic and the interface independent of each other.
- A `while` loop in `Driver` keeps the menu running until the user chooses to exit, with a Loop Control Variable (LCV) updated after each interaction.
- A reusable `returnToMenu()` method handles navigation after each calculation, rather than repeating the same logic across every menu option.
- The `format()` method is used to convert `double` values to formatted strings with 2 decimal places, ensuring monetary output is always clean and consistent.
- Visual dividers are printed between sections to improve readability in the console.

### Trade-offs
- The fuel cost estimator assumes a fixed consumption rate of 6L/100km. This works as a general estimate but won't be accurate for all vehicle types.
- The PCP calculation uses a simplified model — real-world PCP agreements can include additional fees not accounted for here.

### Limitations
- No data persistence — calculations are not saved between sessions.
- Input validation is limited; entering non-numeric values where numbers are expected will cause an error.
- Car type recommendations are based on a fixed set of predefined requirements.

### Difficulties
- Getting the `returnToMenu()` method to work correctly after each set of questions required careful handling of the while loop's LCV.
- Scanner buffer issues were encountered and resolved during development.

## Reference List
- Loops in Java — [GeeksforGeeks](https://www.geeksforgeeks.org/java/loops-in-java/)
- Methods in Java — [GeeksforGeeks](https://www.geeksforgeeks.org/java/methods-in-java/)
- Java Booleans — [W3Schools](https://www.w3schools.com/java/java_booleans.asp)
- Java String Format — [W3Schools](https://www.w3schools.com/java/ref_string_format.asp)
- ASCII Art generator — [asciiart.eu](https://www.asciiart.eu/text-to-ascii-art)
