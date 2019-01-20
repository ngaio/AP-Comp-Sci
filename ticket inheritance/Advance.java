/**
 * Complete the Advance class. Advance Tickets 
 * have a constructor and a method getPrice.
 */
public class Advance extends Ticket
{
    int days = 0;
    public Advance(){
        
    }
    public Advance(int d){
        days = d;
        getPrice();
    }
    public double getPrice(){
        double price = 0;
        if (days >= 10){
            price = 30.0;
        }
        if (days < 10){
            price = 40.0;
        }
        return price;
    }
}