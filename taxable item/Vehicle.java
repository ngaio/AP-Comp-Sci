public class Vehicle extends TaxableItem
{
    int dealerCost = 0;
    int dealerMarkup = 0;
    double taxRate = 0.0;

    public Vehicle(int c, int m, double t){
        super(t);
        dealerCost = c;
        dealerMarkup = m;
    }

    public double getListPrice(){
        return dealerCost + dealerMarkup; 
    }

    public double purchasePrice(){
        return super.purchasePrice();
    }

    public void changeMarkup(int markup){
        dealerMarkup = markup;
    }
}
