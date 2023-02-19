# Java_atm_software
This project implements a bank machine class with a custom constructor that sets user inputted values, and a TestDriver class which acts as the main user interface for the BankMachine

## Project overview:

The atmV3 class has encapsulated instance variables which include balance, accountNum, ownerName, accountType, password and accessGranted. The atmV3 class has methods to access (get) and mutate (set) the instance variables. Some instance variables cannot be changed after they have been initiated in the custom constructor. All instances variables should be accessible via password. There is a password check in all getter and setter methods to ensure legal access.

The atmV3TD is a TestDriver file that simulates the functions of an ATM (Automated Teller Machine). It implements the mentioned atmV3 class with transaction logging and transfer capabilities, and acts as the main user interface by utilizing Java's built-in Scanner. It allows the user to create, access and modify multiple accounts while keeping track of all transactions.


## Functionality:
Some of the atmV3 methods include:

  - Check balance
  - Withdraw
  - Deposit
  - Transfer
  - View Transaction History

The project also allows the user to establish two accounts (two different BankMachine objects in the TestDriver). The user can then transfer money between accounts. The transaction log will record send or receive amounts

## How to Run:

1. Download the atmV3.java and atmV3TD.java file on your computer.
2. Open a command prompt or terminal window.
3. Navigate to the directory where you downloaded the files.
4. Compile the program by running ```javac atmV3TD.java```.
5. Run the program by running the command ```java atmV3TD```. 

When any menu option is selected for the first time, a password will need to be entered. The password will not need to be re-entered upon successful authentication.

## Example
Below is an example of how the program should flow. Please note that the current version looks slightly different than the examples shown below, as the program was consistently changing throughout development.

```
Welcome to the Royal Bank of Canada.
What is your name?
Tarek Alakkad

Would you like to open 1 or 2 accounts? 
2

What type is the first account? (checking or savings)
checking

Thank you. We will also open a second savings account.

Checking Account information:
How much money will you put into this checking account?
1500

What is the password for this account?
1234

Savings Account information:
How much money will you put into this checking account?
9000

What is the password for this account?
9876

Welcome Tarek, your accounts with the Royal Bank of Canada have been setup:
Type: checking Opening Balance: $1500.00
Account Number: 7650

Type: savings Opening Balance: $9000.00
Account Number: 2894

OK – Let’s begin:

Please select an account: 
1. Checking
2. Savings

1

Checking account #7650
Options: 
1. Withdraw
2. Deposit
3. Check Balance
4. Get Transactions
5. Transfer Money
6. Get Account Number
7. Change Password
8. Switch Accounts
9. Quit
1

Please enter your password for the checking account.
1234
Thank you.

How much would you like to withdraw?
100

Withdraw completed.
Your new balance is $1400.00
Checking Account #7650
Options: 
1. Withdraw
2. Deposit
3. Check Balance
4. Get Transactions
5. Transfer Money
6. Get Account Number
7. Change Password
8. Switch Accounts
9. Quit
5

How much money do you want to transfer to your savings account?
500

Transfer completed.
Your new balance is $900.00
Checking Account #7650
Options: 
1. Withdraw
2. Deposit
3. Check Balance
4. Get Transactions
5. Transfer Money
6. Get Account Number
7. Change Password
8. Switch Accounts
9. Quit
4

The following transactions have been processed:
WITHDRAW: $100.00: BALANCE: $1400.00
SEND: $500.00: BALANCE: $900.00

Checking Account #7650
Options: 
1. Withdraw
2. Deposit
3. Check Balance
4. Get Transactions
5. Transfer Money
6. Get Account Number
7. Change Password
8. Switch Accounts
9. Quit
8

Please enter your password for the checking account.
9876

Thank you.
Savings Account #2894
Options: 
1. Withdraw
2. Deposit
3. Check Balance
4. Get Transactions
5. Transfer Money
6. Get Account Number
7. Change Password
8. Switch Accounts
9. Quit
2

How much would you like to deposit?
200
Deposit completed.
Your new balance is $9700.00

Savings Account #2894
Options: 
1. Withdraw
2. Deposit
3. Check Balance
4. Get Transactions
5. Transfer Money
6. Get Account Number
7. Change Password
8. Switch Accounts
9. Quit
4

The following transactions have been processed:
RECEIVE: $500.00: BALANCE: $9500.00
DEPOSIT: $200.00: BALANCE: $9700.00

Savings Account #2894
Options: 
1. Withdraw
2. Deposit
3. Check Balance
4. Get Transactions
5. Transfer Money
6. Get Account Number
7. Change Password
8. Switch Accounts
9. Quit
9
Goodbye.
Your closing balance for savings is $9700.00
```

## Security:
This program uses a simple authentication system to prevent unauthorized access. The user must enter a password to access the functions of the program. Additionally, the program prevents users from depositing negative amounts of money.

## Contributors:
This program was written by myself, Tarek Alakkad. If you have any suggestions or feedback, please feel free to contact me at tarek.alakkad03@gmail.com.

## Future Development:
This program is a simple example of an ATM system. Future development could include the following:

1. Adding support for more than two accounts (checking and savings).
2. Adding support for different types of accounts (e.g. credit card, investment).
3. Adding support for multiple users.
4. Adding a GUI interface for a more user-friendly experience.

## Conclusion
This project implements a BankMachine class with transaction logging and transfer capabilities, and a TestDriver class which acts as the main user interface. It allows the user to create, access and modify multiple accounts while keeping track of all transactions.
