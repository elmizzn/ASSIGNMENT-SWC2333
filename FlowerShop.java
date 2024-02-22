 import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declare array
        int numberOfFlower = 10;
        Flower[] flowerArray = new Flower[numberOfFlower];
        
        //welcoming message
        System.out.print("   WELCOME TO FLORIST BLOOM\n");

        // ask user to input 10 flower informations
        for (int i = 0; i < numberOfFlower; i++) {//for looping
            //ask user to input the flower name
            System.out.print("Enter flower " + (i + 1) + "'s name: ");
            String name = input.nextLine();
            
            //ask user to input the flower color
            System.out.print("Enter flower " + (i + 1) + "'s color: ");
            String color = input.nextLine();

            //ask user to input the flower current price
            System.out.print("Enter flower " + (i + 1) + "'s price(RM)/pc: ");
            double price = input.nextDouble();

            //ask user to input the flower quantity
            System.out.print("Enter flower " + (i + 1) + "'s quantity: ");
            int quantity = input.nextInt();
            System.out.print("\n");//new line for new flower

            // Consume the newline character
            input.nextLine(); 

            //assign every array with their details (name, color, price and quantity)
            flowerArray[i] = new Flower(name, color, price, quantity);
        }//end of for loop

        //output all the flower details
        System.out.println("\n\n=========Flower Details=========\n");
        for (int i = 0; i < numberOfFlower; i++) {//for looping
            System.out.println("\t    " + flowerArray[i].toString() + "\n");
            System.out.println("================================\n");

        }//end of loop

        //assign new variable to calculate total value (RM) of flowers by given formula
        double totalValue = 0.00;
        for (int i = 0; i < numberOfFlower; i++) {//for loop start
            double price = flowerArray[i].getPrice();
            int quantity = flowerArray[i].getQuantity();
            totalValue += (price * quantity);
        }//end of loop
        
        //output the value of flowers in RM
        System.out.println("\nThe total value of flowers is RM" + totalValue + "0");

        // ask user to search for a spesific flower
        System.out.print("\nPlease enter the flower's name you want to search: ");
        String searchName = input.nextLine();
        System.out.print("\n");
        
        int foundIndex = -1;
        for (int i = 0; i < numberOfFlower; i++) {
            if (flowerArray[i].getName().equalsIgnoreCase(searchName)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {//output if flower name exist in inventory
            System.out.println("\n-----Flower Details-----\n");
            System.out.println(flowerArray[foundIndex].toString());
            System.out.println("\n------------------------\n");
            System.out.print("\n");
        } else {//display an error message if user input invalid flower name
            System.out.println("\nThe flower you searched for is not in the inventory");
        }

        // ask user to restock specific flower
        System.out.print("\nPlease enter the flower's name you want to restock: ");
        String flowerName = input.nextLine();

        for (int i = 0; i < numberOfFlower; i++) {
            if (flowerArray[i].getName().equalsIgnoreCase(flowerName)) {
                //ask user to input the quantity they want to add
                System.out.print("Enter the additional quantity: ");
                int newQuantity = input.nextInt();
                input.nextLine();  // Consume the newline quantity

                int currentQuantity = flowerArray[i].getQuantity(); // Consume the newline quantity
                flowerArray[i].setQuantity(currentQuantity + newQuantity);

                //successful restocked message
                System.out.println("\nFlower inventory has been restocked!, THANK YOU\n");
                System.out.println("\n-----Flower Details-----\n");
                System.out.println(flowerArray[i].toString());
                System.out.println("\n------------------------\n");
                break;
            }
        
        }
         System.out.print("   THANK YOU FOR USING FLOIST BLOOM  \n");
        input.close();//system exits
    }
}