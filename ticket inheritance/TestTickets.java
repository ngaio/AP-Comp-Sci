/**
 * THIS CLASS IS COMPLETE 
 * BELOW IS THE EXPECTED OUTPUT
 * 
 * WalkUp Tickets
 * 0 days in advance: Number: 0
 * Price: 50.0
 * 
 * Advance Tickets
 * 5 days in advance: Number: 1
 * Price: 40.0
 * 9 days in advance: Number: 2
 * Price: 40.0
 * 10 days in advance: Number: 3
 * Price: 30.0
 * 20 days in advance: Number: 4
 * Price: 30.0
 * 
 * Student Advance Tickets
 * 5 days in advance: Number: 5
 * Price: 20.0 "student ID required"
 * 9 days in advance: Number: 6
 * Price: 20.0 "student ID required"
 * 10 days in advance: Number: 7
 * Price: 15.0 "student ID required"
 * 20 days in advance: Number: 8
 * Price: 15.0 "student ID required"
 */
public class TestTickets
{   
  public static void main(String[] args)
  {
    System.out.println("WalkUp Tickets");  
    System.out.println("0 days in advance: " + new WalkUp());
    System.out.println();
    System.out.println("Advance Tickets");  
    System.out.println("5 days in advance: " + new Advance(5));
    System.out.println("9 days in advance: " + new Advance(9));
    System.out.println("10 days in advance: " + new Advance(10));
    System.out.println("20 days in advance: " + new Advance(20));
    System.out.println();
    System.out.println("Student Advance Tickets");  
    System.out.println("5 days in advance: " + new StudentAdvance(5));
    System.out.println("9 days in advance: " + new StudentAdvance(9));
    System.out.println("10 days in advance: " + new StudentAdvance(10));
    System.out.println("20 days in advance: " + new StudentAdvance(20));
    System.out.println();
  }  
}