# Problem-Statement-2
Problem Statement: Vaibhav has just completed his first year of Job. He is really happy about it but at the same time he needs to pay taxes to government on what he has earned in his last one year.
Vaibhav found that all of his friends were facing thesame difficulty in calculating the tax.He felt the need of a program where he can enter all of his friend’s name along with
their income one by one and the program will calculate the tax and print the liabletaxes of all of his friends.
Let’s help Vaibhav write the program for the same.


Approach: Follow the steps and complete the assignment
1. Within the static main() method, write the print statements to get the following output
Tax Calculator App
----- WELCOME -----
2. Write code for user input
• Initialise class Scanner
• Ask for total number of person count whose tax needs to be calculated and store
it in integer variable. For example:
Enter total person count:
2
User Input
Print Statement
Print Statements
3. Once you get the total person count
• Create an array of String to store names. The size of the array should be the
person count.
• Create an array of long to store incomes. The size of the array should be the
person count.
4. Next, let’s write code to get all the person names along with their income. So we
need to use a for loop that will ask the user to enter name and income one by one
in each iteration.
• When the user enters name, store it in String array of names.
• Similarly, store incomes in the long array of incomes.
• The output should look like this:
Enter name 1 :
Vaibhav
Enter Vaibhav's Annual Income:
478000
Enter name 2 :
Sudhakar
Enter Sudhakar's Annual Income:
91000
5. Once you have got all user inputs and stored it in the respective arrays, it’s time to
create a static method named calculateTax() that accepts two parameters
1. String name
2. long income
6. Within calculateTax() method, write code using IF-ELSE-IF conditional statements
to calculate the tax keeping in mind the following aspects
1. If the income is greater than or equal to 3 lacs per annum then the person is
liable to pay 20% of his income as tax
2. If the income is greater than or equal to 1 lac per annum but smaller than 3 lacs
per annum then the person is liable to pay 10% of his income as tax
3. If the income is smaller than 1 lac per annum then the person is exempted from
paying tax
7. Within calculateTax() method, finally when the tax has been calculated, write a
print statement to print the name of the person along with the liable tax in the
following format:
Vaibhav : 􀅨 95600
Name Tax Amount
Using
For Loop
8. At last, from the main() method define another for loop and call calculateTax()
method for each of the person.
Hints:
• There are two for loops used in the program
• First for loop will be used to take user input for each of the person
• Second will be used to call calculateTax() method to calculate tax for each of the
person.
• To draw dashed lines use hyphen in the print statement
FINAL OUTPUT

Tax Calculator App
----- WELCOME ------

Enter total person count:
3
Enter name 1 :

Vaibhav
Enter Vaibhav's Annual Income:

478000

Enter name 2 :

Sudhakar

Enter Sudhakar's Annual Income:
91000

Enter name 3 :

Anapurna

Enter Anapurna's Annual Income:

300000

Names with liable taxes
—————————————

Vaibhav : Rs. 95600

Sudhakar : Rs. 0

Anapurna : Rs. 60000


