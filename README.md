Name : Rachel Gillespie
Student Number: 20118715

Brief description of piece:
===================================================
Car Helper Program to give users useful information and advice when choosing their next car. 

Instructions:
=============
1) Start the program.
2) Program prints welcome message and menu.
3) Input a number corresponding to the menu item you wish to choose.
4) You will be brought to the calculation you have chosen.
5) Answer the following questions, one by one.
6) Program prints answer to calculation.
7) You can choose whether to return to the menu or exit the program.
8) If you choose to do so, you are brought back to the menu where you can choose another option, or exit the program from there.
9) If you wish to choose another option, steps 3-7 are repeated.
10) If you wish to exit, choose menu option 6.
11) Program prints goodbye message.
12) Program ends.

Known bugs/problems:
====================
- It's running perfectly now but I've had some difficulty with the buffer.

Extra Functionality:
====================
- I decided to add a divder between each section to optimise readability and separate the sections. (line 42, 67, 94, 115, 136, 166, 174 & 182)
- I used the format() method which converts the double hpMonthly, double pcpMonthly, double fuelWeekly and double costMonthly into Strings and formats it to 2 decimal places. (line 58, 85, 106 & 127)
- returnToMenu method, asks the user if they want to return to the menu and waits for user input. Reads what the user types and stores it as the variable 'reply'. The answer is checked using the returnToMenu() method and it makes a decision. If the user doesn't input yes, the choice is set to 6 to exit the loop, the Goodbye message is printed and the program ends. (line 60 - 65, line 87 - 92, line 108 - 113, line 129 - 134 & line 159 - 164)

Sources:
====================
1) https://www.geeksforgeeks.org/java/loops-in-java/
2) https://www.geeksforgeeks.org/java/methods-in-java/
3) https://www.w3schools.com/java/java_booleans.asp
4) https://www.asciiart.eu/text-to-ascii-art
5) https://www.w3schools.com/java/ref_string_format.asp
