public class Tester
{
  public static void main(String[] args)
  {
    Vehicle v1 = new Vehicle(20000, 2500, 0.1);
    System.out.println(" --- Vehicle v1 --- ");
    System.out.println("dealerCost $20000 \ndealerMarkup $2500 \ntax rate 0.1");
    System.out.print("purchase price = ");
    System.out.println(Math.round(v1.purchasePrice()) + " (should be 24750)");
    v1.changeMarkup(1000);
    System.out.println("Changed markup to 1000"); 
    System.out.println("purchase price = "+ Math.round(v1.purchasePrice())+ " (should be 23100)");
  }
}