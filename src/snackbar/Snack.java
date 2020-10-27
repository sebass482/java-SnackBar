package snackbar;
public class Snack {
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;
  public Snack(String name, int quantity, double cost, int vendingMachineId)
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }
  public int getId()
  {
    return id;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return name;
  }
  public void setCost(double cost)
  {
    this.cost = cost;
  }
  public double getCost()
  {
    return cost;
  }
  public void setVendingMachineId(int vendingMachineId)
  {
    this.vendingMachineId = vendingMachineId;
  }
  public int getVendingMachineId()
  {
    return vendingMachineId;
  }
  public int getQuantity()
  {
    return quantity;
  }
  public int addQuantity(int itemQuantity)
  {
    return quantity += itemQuantity;
  }
  public int buySnack(int itemQuantity)
  {
    return quantity -= itemQuantity;
  }
  public double getTotalCost(double itemQuantity)
  {
    return cost * itemQuantity;
  }
}