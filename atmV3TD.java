import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.ArrayList;

/**
 * Write a description of class atmV1TD here.
 *
 * Tarek Alakkad
 * Jan 10th, 2020
 */
public class atmV3TD {

    /**
     * 
     * Prompts the user to enter their name and returns it as a String.
     * 
     * @param input a Scanner object used to read input from the console
     * 
     * @return a String representing the user's name
     */
    public static String get_name(Scanner input) {
        System.out.println("Welcome to Banque du Liban et D’Outre Mer, more commonly refferred to has BLOM.");
        System.out.println("What is your name?");
        String name = input.nextLine();

        return name;
    }

    /**
     * Prompts the user to enter the number of bank accounts they would like to set
     * up and returns it as an integer.
     * 
     * @param input a Scanner object used to read input from the console
     * @return an integer representing the number of bank accounts to be set up
     */
    public static int get_num_accounts(Scanner input) {
        System.out.println("Would you like to set up 1 or 2 accounts?");
        int num_acc = input.nextInt();
        while (num_acc <= 0) {
            System.out.println(
                    "The number of accounts you entered appears to be negative or equal to zero. Please try again");
            num_acc = input.nextInt();
        }
        return num_acc;
    }

    /**
     * 
     * Prompts the user to enter the type(s) of bank accounts they want to create
     * and returns an array of strings containing the account type(s).
     * 
     * @param num_accs an integer representing the number of accounts the user wants
     *                 to set up
     * 
     * @return an array of strings representing the account type(s) to be created
     * 
     */
    public static String[] get_account_types(int num_accs) {
        String first_account_type = "";
        String second_account_type = "";
        String[] result = new String[2];
        Scanner acc_type = new Scanner(System.in);

        if (num_accs == 1) {
            System.out.println("Thank you. We will be opening a checking account");
            result[0] = "Checking";
            return result;
        } else if (num_accs == 2) {
            System.out.println("What type of account would you like your first account to be? (Checking or Savings)");
            first_account_type = acc_type.next();
            while (!(first_account_type.equalsIgnoreCase("Checking"))
                    && !(first_account_type.equalsIgnoreCase("Savings"))) {
                System.out.println("this isn't an option");
                first_account_type = acc_type.next();
            }
            if (first_account_type.equalsIgnoreCase("Checking")) {
                System.out.println("Thank you. We will be opening a 2nd savings account.");
                second_account_type = "Savings";
            } else if (first_account_type.equalsIgnoreCase("Savings")) {
                System.out.println("Thank you. We will be opening a 2nd checking account.");
                second_account_type = "Checking";
            }
            result[0] = first_account_type;
            result[1] = second_account_type;
        }
        return result;
    }

    /**
     * 
     * Prompts the user to enter the amount of money they want to deposit in their
     * savings account,
     * followed by a four-digit password that they wish to use for the account. It
     * then generates
     * a random 4-digit account number for the savings account and creates a new
     * atmV3 object
     * with the specified savings account details. The function returns the created
     * atmV3 object.
     * 
     * @param user_input   a Scanner object used to read input from the console
     * 
     * @param name         a String representing the user's name
     * 
     * @param account_type a String representing the type of the account to be
     *                     opened
     * 
     * @param rank         an int representing the rank of the account holder
     * 
     * @param main         a boolean indicating if the account is the user's main
     *                     account
     * 
     * @return an atmV3 object representing the user's savings account
     * 
     */
    public static atmV3 savings_account_info(Scanner user_input, String name, String account_type, int rank,
            boolean main) {
        System.out.println("\nSavings account information:\n");

        System.out.println("How much money would you like to place in your savings account?");

        int savings_balance = user_input.nextInt();

        System.out.println("Please enter a four digit password that you'd wish to use for this savings account.");
        int savings_acc_pass = user_input.nextInt();

        int savings_account_num = (int) (Math.random() * 9999 + 1000);

        atmV3 savings_account = new atmV3(savings_balance, savings_account_num, name, account_type, savings_acc_pass,
                true, rank, main);

        savings_account.setOwnerName(name, 2404);
        savings_account.setAccountType(account_type, 3114);
        savings_account.setBalance(savings_balance, 1766);
        savings_account.setPassword(savings_acc_pass, 6789);
        savings_account.setAccountNum(savings_account_num, 1766);
        savings_account.setAccountRank(rank, 4420);
        savings_account.setAccountTitle(main, 9023);
        savings_account.setAccessGranted(false, 9999);

        return savings_account;
    }

    /**
     * Prompts the user for information to create a checking account.
     *
     * @param user_input   a Scanner object used to read input from the console
     * @param name         a String representing the account owner's name
     * @param account_type a String representing the type of account (checking or
     *                     savings)
     * @param rank         an integer representing the account's rank
     * @param main         a boolean value indicating whether this is the main
     *                     account for the user
     *
     * @return an atmV3 object representing the checking account created
     */
    public static atmV3 checking_account_info(Scanner user_input, String name, String account_type, int rank,
            boolean main) {
        // Checking account information
        System.out.println("\nChecking account information:\n");

        // Money deposited for checking.
        System.out.println("How much money would you like to place in your checking account?");
        int checking_balance = user_input.nextInt();
        // Setting up a password for checking.
        System.out.println("Please enter a four digit password that you'd wish to use for this checking account.");
        int checking_acc_pass = user_input.nextInt();

        int checking_account_num = (int) (Math.random() * 9999 + 1000);

        atmV3 checking_account = new atmV3(checking_balance, checking_account_num, name, account_type,
                checking_acc_pass, true, rank, main);

        checking_account.setOwnerName(name, 2404);
        checking_account.setAccountType(account_type, 3114);
        checking_account.setBalance(checking_balance, 1766);
        checking_account.setPassword(checking_acc_pass, 6789);
        checking_account.setAccountNum(checking_account_num, 1766);
        checking_account.setAccountRank(rank, 4420);
        checking_account.setAccountTitle(main, 9023);
        checking_account.setAccessGranted(false, 9999);

        return checking_account;
    }

    /**
     *
     * Displays information about a checking account.
     *
     * @param checking_acc an atmV3 object representing the checking account
     */
    public static void display_checking_info(atmV3 checking_acc) {
        String balance = String.format("%.2f", checking_acc.getBalance(3202));
        int account_rank = checking_acc.getAccountRank(4420);

        System.out.println("Account " + account_rank + ":");
        System.out.println("Type: " + checking_acc.getAccountType(3114));
        System.out.println("Opening Balance: $" + balance);
        System.out.println("Account Number: " + checking_acc.getAccountNum(1766));
    }

    /**
     * Displays information about a user's savings account, including the account
     * type, opening balance,
     * account number, and account rank. The information is retrieved from the
     * specified atmV3 object
     * representing the user's savings account and displayed to the console.
     * 
     * @param savings_account an atmV3 object representing the user's savings
     *                        account
     */
    public static void display_savings_info(atmV3 savings_account) {
        String balance = String.format("%.2f", savings_account.getBalance(3202));
        int account_rank = savings_account.getAccountRank(4420);

        System.out.println("Account " + account_rank + ":");
        System.out.println("Type: " + savings_account.getAccountType(3114));
        System.out.println("Opening Balance: $" + balance);
        System.out.println("Account Number: " + savings_account.getAccountNum(1766));
    }

    /**
     * This function takes an array of strings representing the user's account
     * types, checks if the first account
     * in the array is a checking account, and returns an int representing the rank
     * of the checking account. If the first
     * account is not a checking account, the function returns a rank of 2.
     * 
     * @param accounts an array of strings representing the user's account types
     * 
     * @return an int representing the rank of the checking account (1 if the first
     *         account is a checking account, 2 otherwise)
     */
    public static int checking_account_rank(String[] accounts) {
        int rank = 2;
        if (accounts[0].equalsIgnoreCase("Checking")) {
            rank = 1;
        }
        return rank;
    }

    /**
     * Determines the rank of the savings account for the given array of accounts.
     * The rank is set to 1 if the first account in the array is a savings account,
     * and 2 otherwise.
     * 
     * @param accounts an array of Strings representing the user's accounts
     * @return an integer representing the rank of the savings account
     */
    public static int savings_account_rank(String[] accounts) {
        int rank = 2;
        if (accounts[0].equalsIgnoreCase("Savings")) {
            rank = 1;
        }
        return rank;
    }

    /*
     * This function takes in the checking and savings accounts, along with other
     * parameters needed for account setup, and creates new accounts or updates
     * existing ones as needed. It then returns an array of atmV3 objects
     * representing the user's accounts. If only one account is to be set up, only
     * the checking_account parameter is used. If two accounts are to be set up, the
     * checking_rank and savings_rank parameters are used to determine which account
     * is the primary account. The display_checking_info and display_savings_info
     * functions are called to display information about the accounts that have been
     * set up. Finally, an array containing the two atmV3 objects representing the
     * user's accounts is returned.
     * 
     * @param checking_account an atmV3 object representing the user's checking
     * account
     * 
     * @param savings_account an atmV3 object representing the user's savings
     * account
     * 
     * @param num_accounts an int representing the number of accounts to be set up
     * (1 or 2)
     * 
     * @param checking_rank an int representing the rank of the checking account (1
     * for primary, 2 for secondary)
     * 
     * @param savings_rank an int representing the rank of the savings account (1
     * for primary, 2 for secondary)
     * 
     * @param user_input a Scanner object used to read input from the console
     * 
     * @param accs_owner a String representing the name of the account owner
     * 
     * @param first a String representing the name of the first account to be set up
     * 
     * @param second a String representing the name of the second account to be set
     * up (if applicable)
     * 
     * @return an array of atmV3 objects representing the user's checking and
     * savings accounts
     */

    public static atmV3[] set_accounts(atmV3 checking_account, atmV3 savings_account, int num_accounts,
            int checking_rank, int savings_rank, Scanner user_input, String accs_owner, String first, String second) {
        boolean primary = true;
        atmV3[] result = new atmV3[2];
        if (num_accounts == 1) {
            checking_account = checking_account_info(user_input, accs_owner, first, checking_rank, primary);
            System.out.print("\nThank you for choosing BLOM, " + checking_account.getOwnerName(2404) + ". ");
            System.out.println("Your accounts have been setup. Below is a summary\n");
            display_checking_info(checking_account);
        } else {
            if (checking_rank == 1) {
                checking_account = checking_account_info(user_input, accs_owner, first, checking_rank, primary);
                // display_checking_info(checking_account);
                savings_account = savings_account_info(user_input, accs_owner, second, savings_rank, !primary);
                System.out.print("\nThank you for choosing BLOM, " + checking_account.getOwnerName(2404) + ". ");
                System.out.println("Your accounts have been setup. Below is a summary\n");
                display_checking_info(checking_account);
                System.out.println();
                display_savings_info(savings_account);
            } else {
                savings_account = savings_account_info(user_input, accs_owner, second, savings_rank, primary);
                // display_savings_info(savings_account);
                checking_account = checking_account_info(user_input, accs_owner, first, checking_rank, !primary);
                System.out.print("\nThank you for choosing BLOM, " + savings_account.getOwnerName(2404) + ". ");
                System.out.println("Your accounts have been setup. Below is a summary\n");
                display_savings_info(savings_account);
                System.out.println();
                display_checking_info(checking_account);
            }
        }
        result[0] = savings_account;
        result[1] = checking_account;
        System.out.println("\n\nOK - Let's begin:");
        return result;
    }

    /**
     * 
     * Asks the user to select an account and returns the selected account number.
     * If the user has both a checking and a savings account, the method will
     * display
     * both options and ask the user to select one.
     * 
     * @param user_input        the Scanner object used to read user input
     * @param checking_acc_rank the rank of the checking account (1 or 2)
     * @param savings_acc_rank  the rank of the savings account (1 or 2)
     * 
     * @return the selected account number (1 for checking, 2 for savings)
     */
    public static int select_account(Scanner user_input, int checking_acc_rank, int savings_acc_rank) {
        System.out.println("\nPlease select an account:\n");
        if (checking_acc_rank == 1) {
            System.out.println(checking_acc_rank + ". Checking account");
            System.out.println(savings_acc_rank + ". Savings account\n");
        } else {
            System.out.println(savings_acc_rank + ". Savings account\n");
            System.out.println(checking_acc_rank + ". Checking account");
        }
        int account = user_input.nextInt();
        return account;
    }

    /**
     * 
     * Displays the options for an ATM session, including the account type and
     * number,
     * and a list of actions the user can take.
     * 
     * @param atm an instance of the atmV3 class representing the current ATM
     *            session
     */
    public static void display_options(atmV3 atm) {
        if (atm.getAccountType(3114).equalsIgnoreCase("Checking")) {
            System.out.println("\nChecking account #" + atm.getAccountNum(1766));
        } else {
            System.out.println("\nSavings account #" + atm.getAccountNum(1766));
        }
        System.out.println("\nOptions:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Get Account Number");
        System.out.println("5. Change Password");
        System.out.println("6. View recent transactions");
        System.out.println("7. Transfer Money");
        System.out.println("8. Switch Accounts");
        System.out.println("9. Quit\n");
    }

    /**
     * 
     * Prompts the user to enter their password and checks if the password is
     * correct.
     * 
     * If the password is incorrect, the user will be asked to enter the password
     * again, up to 3 attempts.
     * 
     * If the user enters the incorrect password 3 times, the method will exit
     * without granting access.
     * 
     * If the user enters the correct password, the access to the ATM will be
     * granted.
     * 
     * @param atm the atmV3 object that manages the access to the ATM.
     */
    public static void grant_access(atmV3 atm) {
        System.out.println("\nPlease enter your password.");
        Scanner user_input = new Scanner(System.in);
        int password_input = (int) user_input.nextInt();
        boolean access_granted = atm.passwordCheck(password_input);
        int attempts = 3;

        while ((access_granted == false) && attempts > 0) {
            System.out.println("Incorrect password, please try again.\nYou have " + attempts + " attempts left.");
            password_input = user_input.nextInt();
            access_granted = atm.passwordCheck(password_input);
            attempts--;
        }

        if (attempts == 0) {
            return;
        }
        atm.setAccessGranted(true, 9999);

    }

    /**
     * Prompts the user to input an amount of money to withdraw, and then
     * calls the withdraw method of the given atmV3 object to subtract the
     * specified amount from the user's account balance.
     *
     * @param user_input the Scanner object used to read user input
     * @param account    the atmV3 object representing the user's account
     */
    public static void withdraw_money(Scanner user_input, atmV3 account) {
        System.out.println("How much money would you like to withdraw?");
        double money = user_input.nextDouble();
        account.withdraw(money);
    }

    /**
     * Prompts the user to enter the amount of money they want to deposit and adds
     * that amount to the specified account.
     *
     * @param user_input the Scanner object used to read user input
     * @param account    the account object to which the deposit will be added
     */
    public static void deposit_money(Scanner user_input, atmV3 account) {
        System.out.println("How much would you like to deposit?");
        double money = user_input.nextDouble();
        account.deposit(money);
    }

    /**
     * Prints the account balance of a specified account.
     *
     * @param account an instance of atmV3 class representing the account to print
     *                balance for
     */
    public static void print_balance(atmV3 account) {
        double account_balance = account.getBalance(3202);
        String balance = String.format("%.2f", account_balance);
        System.out.println("Your account balance is $" + balance);
    }

    /**
     *
     * Allows the user to change the password associated with their account. The
     * method first prompts
     * the user to enter their current password. If the current password entered is
     * incorrect, the
     * user is prompted to re-enter it until the correct password is provided. The
     * method then prompts
     * the user to enter their new password, which is then saved to their account.
     *
     * @param user_input the Scanner object used to read user input
     * @param account    the atmV3 object representing the user's account
     */
    public static void change_pass(Scanner user_input, atmV3 account) {
        System.out.println("Please enter your old password.");

        int old_pswd = user_input.nextInt();
        while (old_pswd != account.getPassword(6789)) {
            System.out.println("Incorrect old password. Please re-enter.");
            old_pswd = user_input.nextInt();
        }
        System.out.println("Please enter your new password.");
        int new_pswd = user_input.nextInt();
        account.setPassword(new_pswd, 6789);
        System.out.println("Password has been changed successfully.");
    }

    /**
     * Prints the account number associated with the given ATM account.
     *
     * @param account the ATM account to retrieve the account number from
     */
    public static void print_account_num(atmV3 account) {
        System.out.println("Your account number is " + account.getAccountNum(1766));
    }

    /**
     * Prints all the transaction history of the specified account type.
     *
     * @param account the atmV3 object representing the user's account
     */
    public static void get_transaction_log(atmV3 account) {
        System.out.println(
                "\nPrinting all of your " + account.getAccountType(3114) + " account's transaction history:\n");
        account.getStringTransaction(6789);
    }

    /**
     * 
     * Transfers money from one ATM account to another.
     * 
     * @param account1   the ATM account to transfer money from
     * @param account2   the ATM account to transfer money to
     * @param user_input the Scanner object used to read user input
     */
    public static void transfer_money(atmV3 account1, atmV3 account2, Scanner user_input) {
        System.out.println("Please enter desired amount to transer from " + account1.getAccountType(3114) + " to "
                + account2.getAccountType(3114));
        double amount = user_input.nextDouble();
        account1.transfer(account2, amount);
    }

    /**
     * Displays the options available to the user for their selected account and
     * performs the corresponding operation based on the user's input.
     * If access to the account has not been granted, the method will call
     * grant_access() to request the user's pin.
     * This method loops through the available options until the user chooses to
     * exit.
     * The options are:
     * 1. Withdraw money
     * 2. Deposit money
     * 3. Print account balance
     * 4. Print account number
     * 5. Change password
     * 6. Print transaction log
     * 7. Transfer money to another account
     * 8. Switch to a different account (prompts for access granted pin)
     * 9. Exit the ATM
     *
     * @param user_input the Scanner object used to read user input
     * @param account1   the atmV3 object representing the user's current account
     * @param account2   the atmV3 object representing the user's alternate account,
     *                   used for transfers and switching accounts
     */
    public static void options_and_operations(Scanner user_input, atmV3 account1, atmV3 account2) {
        display_options(account1);
        int option = user_input.nextInt();
        Scanner cash = new Scanner(System.in);
        if (account1.getAccessGranted(9999) == false) {
            grant_access(account1);
        }
        while (option != 9) {
            if (option == 1) {
                withdraw_money(cash, account1);
            } else if (option == 2) {
                deposit_money(user_input, account1);
            } else if (option == 3) {
                print_balance(account1);
            } else if (option == 4) {
                print_account_num(account1);
            } else if (option == 5) {
                Scanner change_pass_input = new Scanner(System.in);
                change_pass(change_pass_input, account1);
            } else if (option == 6) {
                get_transaction_log(account1);
            } else if (option == 7) {
                transfer_money(account1, account2, cash);
            } else if (option == 8) {
                break;
            } else if (option == 9) {
                break;
            } else {
                System.out.println("Sorry, this is not a valid option. Please select a different option");
                option = user_input.nextInt();
            }
            display_options(account1);
            option = user_input.nextInt();
        }
        if (option == 8) {
            System.out.println("\nChange successful. You are now viewing options for your "
                    + account2.getAccountType(3114) + " account");
            options_and_operations(user_input, account2, account1);
        } else if (option == 9) {
            System.out.println("Have a wonderful rest of the day, and thank you for choosing BLOM.");
            double balance = account1.getBalance(3202);
            String closing_balance = String.format("%.2f", balance);
            System.out.println("Your closing balance is $" + closing_balance);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String name = get_name(userInput);

        int num_accounts = get_num_accounts(userInput);
        String[] result = new String[2];
        result = get_account_types(num_accounts);

        String first_account_type = result[0];
        String second_account_type = result[1];

        int checking_rank = checking_account_rank(result);
        int savings_rank = savings_account_rank(result);

        atmV3 checking_acc = new atmV3(0, 0, "", "", 0, false, 0, false);
        atmV3 savings_acc = new atmV3(0, 0, "", "", 0, false, 0, false);

        atmV3[] atms = new atmV3[2];
        atms = set_accounts(checking_acc, savings_acc, num_accounts, checking_rank, savings_rank, userInput, name,
                first_account_type, second_account_type);

        savings_acc = atms[0];
        checking_acc = atms[1];

        Scanner user_input = new Scanner(System.in);
        int account_selected = select_account(user_input, checking_rank, savings_rank);

        if (account_selected == checking_rank) {
            options_and_operations(user_input, checking_acc, savings_acc);
            grant_access(checking_acc);
        } else {
            options_and_operations(user_input, savings_acc, checking_acc);
            grant_access(savings_acc);
        }
    }
}
