Task 1: 
here I set up my workspace, i created a git repository, connected my github to my repository and set up README and .gitignore

Task 2.1:
here I created a basic user information system that has a constructor, getter and setter methods for for all parameters as well as a displayinfo method

task 2.2:
here i created a more advanced employee payroll system, I used switch case to determine employee type and add in the restrictions for number of hours worked, then i used another switch case with an if function to determine weekly pay, for full time employees i first checked if they worked over 40 hours, if they have I multiplied 40 by their hourly rate and created a new float value called overtime which is hoursWorked - 40, then i added the weekly pay for 40 hours with 1.5 * hourlyrate * overtime.
negative values are checked at the beginning of the code.
for tax deduction, I created a series of if-else statements, then i checked if hasHealthInsurance is true and subtracted 50$ if thats the case
to process multiple employees i created an array of payrollCalculator called payrolls, then i created a loop based on the length of employeeTypes array then added i number of each array to payrolls. 

task 3.2:
for countWords, I created a string[] called seperated, then i checked if sentence.trim().length() == 0, trim will remove whitespaces and length will see length of string, if its 0 it will output an appropriate message. then i assigned seperated to sentence.trim()split() to seperate the string into an array where the delimiter is " ", the + is there to ensure that if there are multiple white spaces it will count all of them

to replace word i took a similar approach to seperate and split the string into an array, but i created a for loop where it checks each entry in the array, if the entry matchrd oldWord it will replace it with newWord. then I used .join(" ") to join the string with a whitespace between each entry.