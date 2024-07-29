/*Izabel da Rosa Kieckofel da Cruz*/

import java.util.Scanner;

public class home {
    public static void main(String[] args){
        String name = "Ariana Grande" ;
        String accountType = "Current";
        double balance = 1599.99 ;
        int option = 0;


        System.out.println("************");
        System.out.println("\n Client name: " + name);
        System.out.println("Account type: " + accountType);
        System.out.println("Current balance"+ balance);
        System.out.println("\n ************************");

        String menu = """
                **Type your option**
                1 - Show balance
                2 - Transfer funds
                3 - Receive funds
                4 - End options
                
                """;
        Scanner reading = new Scanner(System.in);

        while(option !=4){
            System.out.println(menu);
            option = reading.nextInt();

            if(option == 1){
                System.out.println("The most recent balance is "+balance);
            } else if(option ==2){
                System.out.println("Which is the amount you wish transfer? ");
                double quantity = reading.nextDouble();
                if (quantity > balance){
                    System.out.println("You cannot make the money transfer. ");
                } else{
                    balance -= quantity;
                    System.out.println("New balance: "+balance);
                }
                
            } else if (option == 3) {
                System.out.println("Received amount: ");
                double quantity = reading.nextDouble();
                balance += quantity;
                System.out.println("New balance: " + balance);
                
            } else if (option != 4) {

                System.out.println("Invalid option.");
            }
        }
    }
}
