/**
 * Complete the StudentAdvance class. StudentAdvance Tickets 
 * have a constructor and a method getPrice. 
 * Also the toString method for StudentAdvance tickets 
 * must include the words: "student ID required". 
 */
public class StudentAdvance extends Advance
{   
    public StudentAdvance(int d){
        super.days = d;
        getPrice();
    }

    public double getPrice(){
        double price = super.getPrice()/2;
        return price;
    }
}