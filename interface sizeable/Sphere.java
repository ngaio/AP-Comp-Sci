/**
 * <<< Complete the class Sphere below: >>> 
 *   Sphere has a 1 parameter constructor which initializes radius
 *   Write all other methods as needed
 */
public class Sphere implements Sizeable
{
    private int radius;
    public Sphere(){
        
    }
    public Sphere(int r){
        radius = r;
        volume();
        surfaceArea();
    }
    public double volume(){
        double e = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        return e;
    }
    public double surfaceArea(){
        double u = 4.0 * Math.PI * Math.pow(radius,2);
        return u;
    }
    public String toString(){
        return "radius: " + radius + " volume: " + volume() + " surface area: "
        + surfaceArea();
    }
}
