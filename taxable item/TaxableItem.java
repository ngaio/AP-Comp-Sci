public abstract class TaxableItem implements Item
{
  private double taxRate;

  public TaxableItem(double rate)  {  
      taxRate = rate;  
  }

  public abstract double getListPrice();

  /*** 
   * <<< Complete for Part 1 >>> 
   * Implement the method purchasePrice. The method calculates 
   * and returns the price of the item including the tax.
   */ 
  public double purchasePrice(){
      return getListPrice() * (1+taxRate);
  }
}