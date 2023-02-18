# Java_atm_software
This project implements a bank machine class with a custom constructor that sets user inputted values, and a TestDriver class which acts as the main user interface for the BankMachine

The atmV3 class has encapsulated instance variables which include balance, accountNum, ownerName, accountType, password and accessGranted. The atmV3 class has methods to access (get) and mutate (set) the instance variables. Some instance variables cannot be changed after they have been initiated in the custom constructor. All instances variables should be accessible via password. There is a password check in all getter and setter methods to ensure legal access.

Some of the atmV3 methods include:

  - custom constructor: creates a BankMachine object with inputted user values via the TestDriver.
  - passwordCheck(): method that verifies if the user has the correct password.
  - withdraw(): method that checks if access is granted before withdrawing money. It alters the balance, but will not alter the balance if there is not enough money for the given withdraw amount.
  - deposit(): method that checks if access if granted before depositing money. It alters the balance, but will not deposit negative amounts. 

The project also allows the user to establish two accounts (two different BankMachine objects in the TestDriver). The user can then transfer money between accounts. The transaction log will record send or receive amounts

## TestDriver class
The atmV3TD class is the main user interface for the BankMachine. It uses a Scanner to ask user’s questions to start their account. Some of the option it provides include:

Withdraw
Deposit
Check Balance
Get Account Number
Change Password
Quit

When any menu option is selected for the first time, a password will need to be entered. The password will not need to be re-entered upon successful authentication.

## Conclusion
This project implements a BankMachine class with transaction logging and transfer capabilities, and a TestDriver class which acts as the main user interface. It allows the user to create, access and modify multiple accounts while keeping track of all transactions.
