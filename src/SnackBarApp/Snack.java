package SnackBarApp;

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
  //getters
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public int getQuantity(){
    return quantity;
  }
  public double getCost(){
    return cost;
  }
  public int getVendingMachineId(){
    return vendingMachineId;
  }
  //setters
  public void setName(String name) {
    this.name = name;
  }
  public void setCost(double cost) {
    this.cost = cost;
  }
  public void getVendingMachineId(int vendingMachineId) {
    this.vendingMachineId = vendingMachineId;
  }
  //methods
  //Adding # to quantity
  public void addItems (int toAdd)
  	{
          quantity+=toAdd;
  	}
      //Removes item, gives back remainder
  	public double buy(int quantity)
  	{
          // If quantity is more then available print Amount Unavailable
          if (this.quantity < quantity)
  		{
              System.out.println("Amount Unavailable");
              return(0);
  		}
  		this.quantity-=quantity;
          return getTotalCost(quantity);
      }
      // Returns total cost
      public double getTotalCost(int amount)
      {
          return amount*cost;
      }
      @Override
      public String toString()
      {
          return "Quantity of "+name+" is "+quantity;
      }
}
