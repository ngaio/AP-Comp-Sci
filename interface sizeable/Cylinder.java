/**
 * <<< Complete the class Cylinder below: >>> 
 * Write a 2 parameter constructor which initializes radius and height
 * Write all other methods as needed
 */
public class Cylinder implements Sizeable
{
    private int radius;
    private int height;
    
    public Cylinder(int r,int h){
        radius = r;
        height = h;
    }
    public double volume(){
        return Math.PI * Math.pow(radius,2) * height;
    }
    public double surfaceArea(){
        return (2 * Math.PI * radius * height) + 2 * Math.PI * Math.pow(radius,2);
    }
    public String toString(){
        return "radius: " + radius + " height: " + height + " volume: " + volume() + " surface area: "
        + surfaceArea();
    }
}
