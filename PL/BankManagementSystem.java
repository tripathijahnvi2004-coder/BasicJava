import java.util.Scanner;

public class BankManagementSystem {
    String name;
    long Ph_number;
    long AC_number;
    String IFSC_code;
    String Address;
    short pin;
    double balance;
    public void Bank_details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name :"); 
        name = sc.nextLine();
        System.out.println("Enter the Phone Number :"); 
        Ph_number = sc.nextLong();
        System.out.println("Enter the Account Number :"); 
        AC_number = sc.nextLong();
        System.out.println("Enter the IFSC Number :"); 
        IFSC_code = sc.next();
        System.out.println("Enter your Address :");
        sc.nextLine();
        Address = sc.nextLine();
        System.out.println("Enter your PIN :");
        pin = sc.nextShort();
    }
    
    public void _Deposit(double dp)
    {
        System.out.println("You are depositing :" + dp + " Amount");
        balance = balance + dp;
        System.out.println("Your Account balance is :" + balance);
    }
    
    public void _Withdrawl(int wt)
    {
        System.out.println("You are Withdrawing :" + wt + " Amount");
        balance = balance - wt;
        System.out.println("Your Account balance is :" + balance);
    }
    public void pin_change()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your new PIN :");
        pin = sc.nextShort(); 
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int Withrdrawl;
        double Deposit; 
        byte ac;
        short pin_check;
        BankManagementSystem obj = new BankManagementSystem();
        obj.Bank_details();
        System.out.println("Enter your PIN :");
        pin_check = sc.nextShort();
        if(pin_check == obj.pin)
            {
                System.out.println("Enter 1 if you want to Deposit money");
                System.out.println("Enter 2 if you want to Withdraw money");
                System.out.println("Enter 3 if you want to change PIN");
                System.out.println("Enter 4 if you want to check Balance:");
                ac = sc.nextByte();
                if(ac == 1)
                    {
                        System.out.println("Enter Deposit Amount :");
                        Deposit = sc.nextDouble();
                        obj._Deposit(Deposit);
                    }
                else if(ac == 2)
                    {
                        System.out.println("Enter Withdrawl Amount :");
                        Withrdrawl = sc.nextInt();
                        obj._Withdrawl(Withrdrawl);
                    }
                else if(ac == 3)
                    {
                        obj.pin_change();
                    }
                else if(ac == 4)
                    {
                        System.out.println("Your current balance is :" + obj.balance);
                    }
                else System.out.println("Enter a Valid Action!!!");
            }
        else System.out.println("You Entered wrong PIN!!!");
            sc.close();
    }
}