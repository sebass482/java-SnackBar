package snackbar;

public class Main {
    public static void printCashOnHand(Customer obj) {
        System.out.println(obj.getName() + " cash on hand " + obj.getCashOnHand());
    }

    public static void printQuantityOfSnack(Snack obj) {
        System.out.println("Quantity of " + obj.getName() + " is " + obj.getQuantity() + "\n");
    }

    public static void doStuff(Customer customerObj, Snack snackObj, int amount) {
        customerObj.buySnack(snackObj.getTotalCost(amount));
        snackObj.buySnack(amount);
        printCashOnHand(customerObj);
        printQuantityOfSnack(snackObj);
    }
    //STRETCH 
    public static void doMoreStuff(Snack snackObj, VendingMachine vendingObj)
    {
        System.out.println("Snack : " + snackObj.getName());
        System.out.println("Vending Machine : " + vendingObj.getName());
        System.out.println("Quantity : " + snackObj.getQuantity());
        System.out.println("Total Cost : $" + snackObj.getTotalCost(snackObj.getQuantity())+0+ "\n");
    }
    public static void main(String[] args) {
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        // VendingMachine office = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 36, 1.75, food.getId());
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack snack3 = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack snack4 = new Snack("Soda", 24, 2.50, drink.getId());
        Snack snack5 = new Snack("Water", 20, 2.75, drink.getId());
        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);

        // First operation, Jane buys 3 Sodas
        // customer1.buySnack(snack4.getTotalCost(3));
        // printCashOnHand(customer1);
        // snack4.buySnack(3);
        // printQuantityOfSnack(snack4);
        doStuff(customer1, snack4, 3);

        // customer1.buySnack(snack3.getTotalCost(1));
        // snack3.buySnack(1);
        // printCashOnHand(customer1);
        // printQuantityOfSnack(snack3);
        doStuff(customer1, snack3, 1);

        // customer2.buySnack(snack4.getTotalCost(2));
        // snack4.buySnack(2);
        // printCashOnHand(customer2);
        // printQuantityOfSnack(snack4);
        doStuff(customer2, snack4, 2);

        customer1.addToCashOnHand(10);
        printCashOnHand(customer1);
        System.out.println("");

        // customer1.buySnack(snack2.getTotalCost(1));
        // snack4.buySnack(1);
        // printCashOnHand(customer1);
        // printQuantityOfSnack(snack2);
        doStuff(customer1, snack2, 1);

        snack3.addQuantity(12);
        printQuantityOfSnack(snack3);

        doStuff(customer2, snack3, 3);

        //STRETCH
        doMoreStuff(snack1,food);
        doMoreStuff(snack2,food);
        doMoreStuff(snack3,food);
        doMoreStuff(snack4,drink);
        doMoreStuff(snack5,drink);
    }
}