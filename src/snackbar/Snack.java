package snackbar;

// import org.w3c.dom.NameList;

public class Snack
{
    private static int maxId;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name,int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }
    //Getters
    public int getId()
    {
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }
    public int getQuantity()
    {
        return quantity;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }  
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public int addQuantity(int newQuantity)
    {
        return newQuantity + quantity;
    }
    public int buySnack(int newQuantity)
    {
        return  quantity - newQuantity;
    }
    public double totalCost(int newQuantity)
    {
        return cost * newQuantity;
    }
}