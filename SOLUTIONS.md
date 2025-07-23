Task 1: 
here I set up my workspace, i created a git repository, connected my github to my repository and set up README and .gitignore

Task 2.1:
here I created a basic user information system that has a constructor, getter and setter methods for for all parameters as well as a displayinfo method

task 2.2:
here i created a more advanced employee payroll system, I used switch case to determine employee type and add in the restrictions for number of hours worked, then i used another switch case with an if function to determine weekly pay, for full time employees i first checked if they worked over 40 hours, if they have I multiplied 40 by their hourly rate and created a new float value called overtime which is hoursWorked - 40, then i added the weekly pay for 40 hours with 1.5 * hourlyrate * overtime.
negative values are checked at the beginning of the code.
for tax deduction, I created a series of if-else statements, then i checked if hasHealthInsurance is true and subtracted 50$ if thats the case
to process multiple employees i created an array of payrollCalculator called payrolls, then i created a loop based on the length of employeeTypes array then added i number of each array to payrolls. UPDATE 23/07: i added the statistics to me this was the most challenging part but after getting more comfortable with java through finishing the rest of the tasks I went back and finished the entire task.

Task 3.1:
to reverse the string, I first seperated the string into characters then put them in a reverse order through a for loop.
calculating letter grade was a simple if-else statements
for failing students I had two options, either import java.util.arraylist and create a list instead of an array or first find the number of failing students then used that as the size of my new array, then added the names of failing students to that array, i went for the second option as I didnt want to import another library or change the data structure used. 

task 3.2:
for countWords, I created a string[] called seperated, then i checked if sentence.trim().length() == 0, trim will remove whitespaces and length will see length of string, if its 0 it will output an appropriate message. then i assigned seperated to sentence.trim()split() to seperate the string into an array where the delimiter is " ", the + is there to ensure that if there are multiple white spaces it will count all of them

to replace word i took a similar approach to seperate and split the string into an array, but i created a for loop where it checks each entry in the array, if the entry matchrd oldWord it will replace it with newWord. then I used .join(" ") to join the string with a whitespace between each entry.

task 4.1:
I found this to be the easiest task as all the codes were basically given but it did help me understand OOP and child classes more.

task 4.2: 
I didnt struggle with this task either as again all the codes were basically given.

task 5.1:
first to calculate total I created a variable then a loop that will cycle through prices and add each one to my variable, then used switch case to determine the final total and returned it. 
to find the most expensive item I created a variable and assigned it to the first price, then i compared each price to that variable, if its higher i assign it. 
to count items above a certain price i created a count variable and compared each price to the threshold through a for loop, if its higher I increment count.

5.2:
I struggled with this one, my initial idea was to create a variable ascii = 49 (ascii value for 1) and in a for loop I will change to a character, output then increment for each row but that didnt work as it wouldnt reset. I had to use chatgpt to identify that I needed to use a nested loop to control the number of characters printed in each row. 
no issue with the multiplication table as its a simple for loop.

