import java.util.ArrayList;

public class atmV3 {
    // instance variables - replace the example below with your own
    private double balance;
    private int accountNum;
    private String ownerName;
    private String accountType;
    private int password;
    private boolean accessGranted;
    private int accountRank;
    private boolean primary;
    private ArrayList<String> stringTransaction = new ArrayList<String>();
    private ArrayList<Double> doubleTransaction = new ArrayList<Double>();
    private ArrayList<Double> balanceTracker = new ArrayList<Double>();
    // Custom Constructor

    /**
     * Constructor for the ATM class. Initializes the instance variables of the
     * class.
     *
     * @param gBalance       the initial balance for the account
     * @param gAccountNum    the account number for the account
     * @param gOwnerName     the name of the account owner
     * @param gAccountType   the type of the account (e.g. savings, checking)
     * @param gPswd          the password for the account
     * @param gAccessGranted boolean flag indicating if account access is granted
     * @param gAccountRank   the rank of the account (1 for primary, 2 for
     *                       secondary)
     * @param gPrimary       boolean flag indicating if the account is the primary
     *                       account
     */
    public atmV3(double gBalance, int gAccountNum, String gOwnerName, String gAccountType, int gPswd,
            boolean gAccessGranted, int gAccountRank, boolean gPrimary) {
        balance = gBalance;
        accountNum = gAccountNum;
        ownerName = gOwnerName;
        accountType = gAccountType;
        password = gPswd;
        accessGranted = gAccessGranted;
        accountRank = gAccountRank;
        primary = gPrimary;
    }

    // getter or accessor methods

    /**
     * Returns the rank of the account if the given password matches the account
     * password.
     * If the password is incorrect, returns -1.
     *
     * @param gPswd the password provided to check if it matches the account
     *              password
     * @return the rank of the account (1 for primary, 2 for secondary) if password
     *         is correct, -1 otherwise
     */
    public int getAccountRank(int gPswd) {
        if (gPswd == 4420) {
            return this.accountRank;
        }
        return -1;
    }

    /**
     * Returns a boolean indicating if the account is the primary account, if the
     * given password
     * matches the account password. If the password is incorrect, returns false.
     *
     * @param gPswd the password provided to check if it matches the account
     *              password
     * @return true if the account is the primary account and password is correct,
     *         false otherwise
     */
    public boolean getAccountTitle(int gPswd) {
        if (gPswd == 9023) {
            return this.primary;
        }
        return false;
    }

    /**
     * Returns the current balance of the account if the given password matches the
     * account password.
     * If the password is incorrect, returns -1.00.
     *
     * @param gPswd the password provided to check if it matches the account
     *              password
     * @return the current balance of the account if password is correct, -1.00
     *         otherwise
     */
    public double getBalance(int gPswd) {
        if (gPswd == 3202) {
            return this.balance;
        }
        return -1.00;
    }

    /**
     * Returns the account number if the given password matches the account
     * password.
     * If the password is incorrect, returns -1.
     *
     * @param gPswd the password provided to check if it matches the account
     *              password
     * @return the account number if password is correct, -1 otherwise
     */
    public int getAccountNum(int gPswd) {
        if (gPswd == 1766) {
            return this.accountNum;
        }
        return -1;
    }

    /**
     * Returns the name of the account owner if the given password matches the
     * account password.
     * If the password is incorrect, returns a message to try again later.
     *
     * @param gPswd the password provided to check if it matches the account
     *              password
     * @return the name of the account owner if password is correct, a message to
     *         try again later otherwise
     */
    public String getOwnerName(int gPswd) {
        if (gPswd == 2404) {
            return this.ownerName;
        }
        return "wrong password. try again later";
    }

    /**
     * Returns the type of the account if the given password matches the account
     * password.
     * If the password is incorrect, returns "null".
     *
     * @param gPswd the password provided to check if it matches the account
     *              password
     * @return the type of the account if password is correct, "null" otherwise
     */
    public String getAccountType(int gPswd) {
        if (gPswd == 3114) {
            return this.accountType;
        }
        return "null";
    }

    /**
     * Returns the account password if the given password matches the account
     * password.
     * If the password is incorrect, returns -1.
     *
     * @param gPswd the password provided to check if it matches the account
     *              password
     * @return the account password if password is correct, -1 otherwise
     */
    public int getPassword(int gPswd) {
        if (gPswd == 6789) {
            return this.password;
        }
        return -1;
    }

    /**
     * Returns whether access to the account has been granted if the given password
     * matches the account password.
     * If the password is incorrect, returns false.
     *
     * @param gPswd the password provided to check if it matches the account
     *              password
     * @return true if access to the account has been granted and password is
     *         correct, false otherwise
     */
    public boolean getAccessGranted(int gPswd) {
        if (gPswd == 9999) {
            return this.accessGranted;
        }
        return false;
    }

    // setter methods

    /**
     * Sets the account rank to the given rank if the given password matches the
     * account password.
     *
     * @param gRank the new account rank
     * @param gPswd the password provided to check if it matches the account
     *              password
     */
    public void setAccountRank(int gRank, int gPswd) {
        if (gPswd == 4420) {
            this.accountRank = gRank;
        }
    }

    /**
     * Sets the account title status to the given status if the given password
     * matches the account password.
     *
     * @param gStatus the new account title status
     * @param gPswd   the password provided to check if it matches the account
     *                password
     */
    public void setAccountTitle(boolean gStatus, int gPswd) {
        if (gPswd == 9023) {
            this.primary = gStatus;
        }
    }

    /**
     * Sets the account balance to the given amount if the given password matches
     * the account password.
     *
     * @param gBalance the new account balance
     * @param gPswd    the password provided to check if it matches the account
     *                 password
     */
    public void setBalance(double gBalance, int gPswd) {
        if (gPswd == 3202) {
            this.balance = gBalance;
        }
    }

    /**
     * Sets the account owner's name to the given name if the given password matches
     * the account password.
     *
     * @param gOwnerName the new account owner's name
     * @param gPswd      the password provided to check if it matches the account
     *                   password
     */
    public void setOwnerName(String gOwnerName, int gPswd) {
        if (gPswd == 2404) {
            this.ownerName = gOwnerName;
        }
    }

    /**
     * Sets the account type of the user to the specified type.
     *
     * @param gAccountType the new account type to set for the user
     * @param gPswd        the password to authorize the change
     */
    public void setAccountType(String gAccountType, int gPswd) {
        if (gPswd == 3114) {
            this.accountType = gAccountType;
        }
    }

    /**
     * 
     * Sets a new password for the account if the correct current password is
     * provided.
     * 
     * @param givenPassword The new password to set for the account.
     * @param gPswd         The current password used for authentication.
     * 
     * @remarks It is important to ensure that the current password provided for
     *          authentication is valid to prevent unauthorized password changes. It
     *          is recommended to use a strong and secure password for both the
     *          current and new password to protect the account from unauthorized
     *          access.
     */
    public void setPassword(int givenPassword, int gPswd) {
        if (gPswd == 6789) {
            this.password = givenPassword;
        }
    }

    /**
     * 
     * Sets the account number for the account.
     * 
     * @param gAccountNum the new account number to set for the account
     * @param gPswd       the password to verify the user is authorized to make
     *                    changes
     * @remark This method should only be called by authorized personnel with the
     *         correct password.
     */
    public void setAccountNum(int gAccountNum, int gPswd) {
        if (gPswd == 1766) {
            this.accountNum = gAccountNum;
        }
    }

    /**
     * 
     * Sets the accessGranted field to the given value if the given password matches
     * the access password.
     * 
     * @param gAccess the value to set the accessGranted field to (true or false)
     * @param gPswd   the password to use for authentication
     */
    public void setAccessGranted(boolean gAccess, int gPswd) {
        if (gPswd == 9999) {
            this.accessGranted = gAccess;
        }
    }

    // Password Check method
    /**
     *
     * Checks if the given password matches the password for the account.
     * If the password is correct, the account access is granted and method
     * returns true, otherwise returns false.
     *
     * @param gPswd the password to be checked
     * @return true if the password matches, false otherwise
     */
    public boolean passwordCheck(int gPswd) {
        if (gPswd == this.password) {
            this.accessGranted = true;
            return true;
        }
        return false;
    }

    /**
     * 
     * Adds an amount to the balanceTracker list, which tracks changes to the
     * account balance.
     * 
     * @param gPswd   the password required to authorize the balance change
     * @param gAmount the amount to add to the balanceTracker list
     */
    public void addToBalanceTracker(int gPswd, double gAmmount) {
        if (gPswd == 2234) {
            this.balanceTracker.add(gAmmount);
        }
    }

    /**
     * Displays the transaction history for the account in a human-readable format.
     * Each transaction is displayed on a separate line, showing the transaction
     * description,
     * the transaction amount, and the current account balance after the
     * transaction.
     *
     * @param gPswd the password needed to access the transaction history
     * @return None
     *
     * @remark The password is needed to restrict access to the transaction history.
     *         The method will not return anything, only print the transaction
     *         history.
     */
    public void getStringTransaction(int gPswd) {
        if (gPswd == 6789) {
            for (int i = 0; i < this.stringTransaction.size(); i++) {
                String transactionAmount = String.format("%.2f", doubleTransaction.get(i));
                String balance = String.format("%.2f", balanceTracker.get(i));

                System.out.print(stringTransaction.get(i) + ": $" + transactionAmount + ":");
                System.out.println(" Balance: $" + balance);
            }
            // System.out.println(this.stringTransaction);
            // return stringTransaction;
        } else {
            return;
        }
    }

    /**
     * 
     * Returns an ArrayList of doubles that represents the transaction amounts
     * for the account.
     * 
     * @return ArrayList of doubles representing the transaction amounts for the
     *         account.
     */
    ArrayList<Double> setDoubleTransaction() {
        return doubleTransaction;
    }

    /**
     * 
     * Returns the list of transaction amounts in double format. Access to this
     * method requires a correct password.
     * 
     * @param gPswd the password required to access the method
     * @return the list of transaction amounts in double format, or null if the
     *         password is incorrect
     */
    ArrayList<Double> getDoubleTransaction(int gPswd) {
        if (gPswd == password) {
            System.out.println(this.doubleTransaction);
            return doubleTransaction;
        } else {
            return null;
        }
    }

    // withdraw method
    // parameter: the amount of money to be withdrawn

    /**
     * 
     * Withdraws a specified amount from the account, if it is available, and
     * updates the balance accordingly.
     * Adds a record of the transaction to the transaction list if the password is
     * correct.
     * 
     * @param requestedAmount the amount to be withdrawn from the account
     * @return the new account balance after the withdrawal is completed or a
     *         specific error code:
     *         -1.0 if access is not granted due to incorrect password
     *         -2.0 if the requested amount is greater than the account balance
     *         -3.0 if the requested amount is negative
     * 
     */
    public double withdraw(double requestedAmmount) {
        if (requestedAmmount > this.balance) {
            System.out.println(
                    "Sorry, but you don't have the requested money in your account at the moment. Please try again.");
            return -2.0;
        } else if (requestedAmmount < 0) {
            System.out.println(
                    "Sorry, but the amount that you requested cannot be withdrawn. Please try again and enter a positive amount desired.");
            return -3.0;
        } else if (this.accessGranted = false) {
            System.out.println("Sorry, but the password you entered is false. Please try again.");
            return -1.0;
        } else {
            this.balance = this.balance - requestedAmmount;
            String balance = String.format("%.2f", this.balance);
            System.out.println("Transaction completed successfully.");
            System.out.println("Your new balance is $" + balance);
            this.stringTransaction.add("Withdraw");
            this.doubleTransaction.add(requestedAmmount);
            this.balanceTracker.add(this.balance);
            return this.balance;
        }
    }

    /**
     * Deposits a given amount of money into the account, if the access is granted.
     *
     * @param gAmmDeposited the amount of money to deposit
     * @return the new balance of the account, or -1.0 if access is not granted or
     *         the amount deposited is negative
     * @remark This method should be used with caution, as it does not include any
     *         input validation and is susceptible
     *         to being used with negative values, which would be stored in the
     *         transaction log. It is recommended to
     *         perform input validation prior to calling this method.
     */
    public double deposit(double gAmmDeposited) {
        if (this.accessGranted == true) {
            if (gAmmDeposited < 0) {
                System.out.println("You cannot deposit negative money! Please try again.");
                return -1.0;
            } else {
                this.balance = this.balance + gAmmDeposited;
                System.out.println("Operation completed successfully.");
                String balance = String.format("%.2f", this.balance);
                System.out.println("Your current balance is $" + balance);
                this.stringTransaction.add("Deposit");
                this.doubleTransaction.add(gAmmDeposited);
                this.balanceTracker.add(this.balance);
                return Double.parseDouble(balance);
            }
        }
        System.out.println("The password you have entered is incorrect. Please try again.");
        return -1.0;
    }

    /**
     * Transfers a specified amount of money from this account to another account.
     * If this account does not have
     * enough funds to make the transfer, an error message will be displayed and the
     * transfer will not be completed.
     *
     * @param account2 the account that will receive the transferred amount
     * @param gAmmount the amount of money to be transferred
     * @return void
     *
     * @remarks There may be security concerns if this method is not properly
     *          protected. Make sure that the two accounts
     *          involved in the transfer are owned by the same user, and ensure that
     *          only authorized users are allowed to initiate
     *          transfers. It may also be necessary to add additional security
     *          measures, such as two-factor authentication or
     *          transaction limits, depending on the level of risk associated with
     *          the transfer.
     */
    public void transfer(atmV3 account2, double gAmmount) {

        if (this.balance >= gAmmount) {
            double account1_new_balance = this.getBalance(3202) - gAmmount;
            double account2_new_balance = account2.getBalance(3202) + gAmmount;

            this.setBalance(account1_new_balance, 3202);
            account2.setBalance(account2_new_balance, 3202);
        } else {
            System.out.println("Not enough funds in your " + this.accountType + " account.");
            return;
        }

        this.stringTransaction.add("Transferred to " + account2.getAccountType(3114));
        this.doubleTransaction.add(gAmmount);

        account2.stringTransaction.add("Received from " + this.getAccountType(3114));
        account2.doubleTransaction.add(gAmmount);

        String money_transferred = String.format("%.2f", gAmmount);
        System.out.println(
                "Transaction completed successfully.\n" + "$" + money_transferred + " has been transferred from "
                        + this.getAccountType(3114) + " to " + account2.getAccountType(3114));
        this.balanceTracker.add(this.balance);
        account2.addToBalanceTracker(2234, account2.getBalance(3202));

    }
}
