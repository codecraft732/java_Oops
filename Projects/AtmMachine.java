import java.util.Scanner;
//classes and objects comp concept 
class Atm {
    float balance = 0;
    int pin = 2374;

    // Method to display the menu and handle user input
    public void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("____Menu____");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Deposit Balance");
            System.out.println("3. Withdraw Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int opt = sc.nextInt();

            if(opt==1) {checkBalance();}
            else if(opt==2){depositBalance();}
            else if(opt==3){  withdrawBalance();}       
            else if(opt==4){ System.out.println("Exiting... Thank you for using our ATM.");return;}
            else{  System.out.println("Invalid choice. Please try again.");}
           
            }
          
        }
    
    // Method to verify the pin
    public void checkPin() {
        System.out.print("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid pin.");
        }
        
    }

    // Method to check the balance
    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    // Method to deposit balance
    public void depositBalance() {
        System.out.print("Enter the amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
       
    }

    // Method to withdraw balance
    public void withdrawBalance() {
        System.out.print("Enter the amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount. Please try again.");
        }
        
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.checkPin();  // Start the ATM process by checking the pin
    }
  
    
}
