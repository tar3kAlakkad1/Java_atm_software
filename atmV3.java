import java.util.ArrayList;

/**
 * Write a description of class atmV1 here.
 *
 * Tarek Alakkad
 * January 2nd, 2020
 * 
 * Description: atmV2 class is identical to atmV1 class, with the exception of
 * adding the ability to track successful withdraws and deposits.
 * Skip to line 206 to view the tracking method
 * 
 */
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
    public int getAccountRank(int gPswd) {
        if (gPswd == 4420) {
            return this.accountRank;
        }
        return -1;
    }

    public boolean getAccountTitle(int gPswd) {
        if (gPswd == 9023) {
            return this.primary;
        }
        return false;
    }

    public double getBalance(int gPswd) {
        if (gPswd == 3202) {
            return this.balance;
        }
        return -1.00;
    }

    public int getAccountNum(int gPswd) {
        if (gPswd == 1766) {
            return this.accountNum;
        }
        return -1;
    }

    public String getOwnerName(int gPswd) {
        if (gPswd == 2404) {
            return this.ownerName;
        }
        return "wrong password. try again later";
    }

    public String getAccountType(int gPswd) {
        if (gPswd == 3114) {
            return this.accountType;
        }
        return "null";
    }

    public int getPassword(int gPswd) {
        if (gPswd == 6789) {
            return this.password;
        }
        return -1;
    }

    public boolean getAccessGranted(int gPswd) {
        if (gPswd == 9999) {
            return this.accessGranted;
        }
        return false;
    }
    // setter methods

    public void setAccountRank(int gRank, int gPswd) {
        if (gPswd == 4420) {
            this.accountRank = gRank;
        }
    }

    public void setAccountTitle(boolean gStatus, int gPswd) {
        if (gPswd == 9023) {
            this.primary = gStatus;
        }
    }

    public void setBalance(double gBalance, int gPswd) {
        if (gPswd == 3202) {
            this.balance = gBalance;
        }
    }

    public void setOwnerName(String gOwnerName, int gPswd) {
        if (gPswd == 2404) {
            this.ownerName = gOwnerName;
        }
    }

    public void setAccountType(String gAccountType, int gPswd) {
        if (gPswd == 3114) {
            this.accountType = gAccountType;
        }
    }

    public void setPassword(int givenPassword, int gPswd) {
        if (gPswd == 6789) {
            this.password = givenPassword;
        }
    }

    public void setAccountNum(int gAccountNum, int gPswd) {
        if (gPswd == 1766) {
            this.accountNum = gAccountNum;
        }
    }

    public void setAccessGranted(boolean gAccess, int gPswd) {
        if (gPswd == 9999) {
            this.accessGranted = gAccess;
        }
    }

    // Password Check method
    public boolean passwordCheck(int gPswd) {
        if (gPswd == this.password) {
            this.accessGranted = true;
            return true;
        }
        return false;
    }

    // Below is the transaction methods. Those are the only changes made that
    // seperate v1 than v2
    // Private instance variables are intialized too.

    //
    public void addToBalanceTracker(int gPswd, double gAmmount) {
        if (gPswd == 2234) {
            this.balanceTracker.add(gAmmount);
        }
    }

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

    ArrayList<Double> setDoubleTransaction() {
        return doubleTransaction;
    }

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

    // deposit method
    // parameter: given amount to be deposited
    public double deposit(double gAmmDeposited) {
        if (this.accessGranted = true) {
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