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
    public static String get_name(Scanner input) {
        System.out.println("Welcome to Banque du Liban et D’Outre Mer, more commonly refferred to has BLOM.");
        System.out.println("What is your name?");
        String name = input.nextLine();

        return name;
    }

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

    // make the function return an atmV3 object for checking account
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

    public static void display_checking_info(atmV3 checking_acc) {
        String balance = String.format("%.2f", checking_acc.getBalance(3202));
        int account_rank = checking_acc.getAccountRank(4420);

        System.out.println("Account " + account_rank + ":");
        System.out.println("Type: " + checking_acc.getAccountType(3114));
        System.out.println("Opening Balance: $" + balance);
        System.out.println("Account Number: " + checking_acc.getAccountNum(1766));
    }

    public static void display_savings_info(atmV3 savings_account) {
        String balance = String.format("%.2f", savings_account.getBalance(3202));
        int account_rank = savings_account.getAccountRank(4420);

        System.out.println("Account " + account_rank + ":");
        System.out.println("Type: " + savings_account.getAccountType(3114));
        System.out.println("Opening Balance: $" + balance);
        System.out.println("Account Number: " + savings_account.getAccountNum(1766));
    }

    public static int checking_account_rank(String[] accounts) {
        int rank = 2;
        if (accounts[0].equalsIgnoreCase("Checking")) {
            rank = 1;
        }
        return rank;
    }

    public static int savings_account_rank(String[] accounts) {
        int rank = 2;
        if (accounts[0].equalsIgnoreCase("Savings")) {
            rank = 1;
        }
        return rank;
    }

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

    public static void withdraw_money(Scanner user_input, atmV3 account) {
        System.out.println("How much money would you like to withdraw?");
        double money = user_input.nextDouble();
        account.withdraw(money);
    }

    public static void deposit_money(Scanner user_input, atmV3 account) {
        System.out.println("How much would you like to deposit?");
        double money = user_input.nextDouble();
        account.deposit(money);
    }

    public static void print_balance(atmV3 account) {
        double account_balance = account.getBalance(3202);
        String balance = String.format("%.2f", account_balance);
        System.out.println("Your account balance is $" + balance);
    }

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

    public static void print_account_num(atmV3 account) {
        System.out.println("Your account number is " + account.getAccountNum(1766));
    }

    public static void get_transaction_log(atmV3 account) {
        System.out.println(
                "\nPrinting all of your " + account.getAccountType(3114) + " account's transaction history:\n");
        account.getStringTransaction(6789);
    }

    public static void transfer_money(atmV3 account1, atmV3 account2, Scanner user_input) {
        System.out.println("Please enter desired amount to transer from " + account1.getAccountType(3114) + " to "
                + account2.getAccountType(3114));
        double amount = user_input.nextDouble();
        account1.transfer(account2, amount);
    }

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
