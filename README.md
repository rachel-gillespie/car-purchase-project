# 🚗 Car Helper Program

A Java-based interactive tool designed to help users make informed decisions when choosing their next car. Get useful information and personalized advice through guided calculations and analyses.

## 📋 Description

The Car Helper Program is a menu-driven application that provides various car-related calculations and information to assist users in their vehicle purchasing decisions. Whether you're calculating monthly payments, fuel costs, or evaluating different car options, this program walks you through the process step-by-step.

## ✨ Features

- **Interactive Menu Interface** - Easy-to-navigate menu system for selecting different calculations
- **Step-by-Step Guidance** - Answer questions one by one to receive personalized results
- **Formatted Output** - All monetary values are formatted to 2 decimal places for clarity
- **User-Friendly Navigation** - Choose to return to the menu or exit after each calculation
- **Improved Readability** - Visual dividers separate sections for better user experience

## 🛠️ How to Use

1. **Start the Program** - Run the application
2. **Welcome Message** - Review the welcome message and menu options
3. **Select a Calculation** - Input the number corresponding to your desired option
4. **Answer Questions** - Follow the prompts and provide answers one by one
5. **View Results** - The program displays your calculation results
6. **Continue or Exit** - Choose to return to the menu or exit the program
7. **Repeat as Needed** - Select additional options or exit from the main menu
8. **Goodbye** - The program prints a farewell message and closes

## 💻 Technical Details

### Technology Stack
- **Language:** Java 100%
- **Type:** Console Application

### Key Implementations

- **Dividers** - Visual separators between sections for enhanced readability
- **String Formatting** - Uses `format()` method to convert decimal values (hpMonthly, pcpMonthly, fuelWeekly, costMonthly) to formatted strings with 2 decimal places
- **Return to Menu Method** - Custom method that prompts users for navigation choices and validates input

## 📚 Resources & References

This project was developed using resources from:
1. [GeeksforGeeks - Loops in Java](https://www.geeksforgeeks.org/java/loops-in-java/)
2. [GeeksforGeeks - Methods in Java](https://www.geeksforgeeks.org/java/methods-in-java/)
3. [W3Schools - Java Booleans](https://www.w3schools.com/java/java_booleans.asp)
4. [ASCII Art](https://www.asciiart.eu/text-to-ascii-art)
5. [W3Schools - Java String Format](https://www.w3schools.com/java/ref_string_format.asp)

## 🐛 Known Issues

- Previous buffer-related issues have been resolved; program runs smoothly

## 🎯 Future Improvements

- Add additional car evaluation metrics
- Implement data persistence to save calculation history
- Expand calculations to include insurance estimates and depreciation