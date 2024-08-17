import java.util.*;

class ATM {

     float balance;
     int pin = 54321;

     Scanner sc = new Scanner(System.in);

     public void checkup() {
        System.out.println("* Enter The Pin *");
        int Entered_pin = sc.nextInt();
        if(Entered_pin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid Pin");
          
        }
     }

     public void menu() {
        System.out.println("Enter Your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Check withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        int Opt = sc.nextInt();
        if(Opt == 1) {
            Checkbalance();
        } else if(Opt == 2) {
            Withdraw();
        } else if(Opt == 3) {
            Depositemoney();
        } else if(Opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid Choice");
        }

     }

     public void Checkbalance() {
        System.out.println("Balance: " + balance);
        menu();
     }

     public void Withdraw() {
        System.out.println("Enter amount to withdraw");
        float amount = sc.nextFloat();
        if(amount>balance) {
            System.out.println("Insufficient money");
        } else {
            balance = balance - amount;
            System.out.println("Money withdrawal successful");

        }
        menu();
     }

     public void Depositemoney() {
        System.out.println("Enter amount to deposit");
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("deposited amount successfully");
        menu();
     }
    

}
public class ATMmachine {
    public static void main(String args[]) { 
        ATM obj = new ATM();
        obj.checkup();       

    }
}
