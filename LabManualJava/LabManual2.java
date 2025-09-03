import java.util.*;

public class LabManual2 {
    public static void main(String[] args) {
        Banking bank = new Banking();
        bank.Select();
    }
}

class Banking {
    Scanner s = new Scanner(System.in);
    float balance;
    int deposit, withdraw, amount, choice;

    void Deposit() {
        System.out.println("Enter the amount for Deposit :");
        deposit = s.nextInt();
        balance = balance + deposit;
        System.out.println("Current total balance is : " + balance);
    }

    void Withdraw() {
        System.out.println("Enter the amount you want to withdraw");
        withdraw = s.nextInt();
        if (balance < withdraw) {
            System.out.println(
                    "You do not have sufficient balance to withdrawl, please keep sufficient balance in your account ");
        } else {
            balance -= withdraw;
        }
        System.out.println("Current total balance is : " + balance);
    }

    void BalanceCheck() {
        System.out.println("Your current balance is : " + balance);
        if (balance < 1000) {
            System.out.println("You do not have sufficient balance, please keep sufficient balance in your account ");
        }

    }

    void Select() {
        do{
        System.out.println("Select a choice : ");
        System.out.println("1 : Deposit");
        System.out.println("2 : Withdraw");
        System.out.println("3 : Balance Check");
        System.out.println(" 4 : Exit");
        choice = s.nextInt();

        switch (choice) {
            case 1:
                Deposit();
                break;

            case 2:
                Withdraw();
                break;

            case 3:
                BalanceCheck();

            case 4:
            System.out.println("Exiting ..................");
                break;

            default:
                System.out.println("You entered wrong choice. please try again ");
                break;
        }
    }
     while (choice != 4); 
     s.close();
    }


}
