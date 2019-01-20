/**  <<< This code is complete >>>
 * Below is a tester for the shapes
 * 
 * It creates 1 example of each type of shape and prints its 
 * the dimensions, volume, and surface area
 * 
 * BELOW IS THE OUTPUT >> Your rounding might be different!
 * 
 * length=3 width=4 height=5 volume=60.0 surface area=94.0
 * radius=10 volume=4188.79 surface area=1256.64
 * radius=5 height=3 volume=235.62 surface area=251.33
 */
public class ShapesTester 
{  
  public static void main(String[] args)
  {
    Sizeable s1 = new Sphere(10);
    Sizeable c1 = new Cylinder(5,3);
    Sizeable p1 = new RectangularPrism(3,4,5);
 
    System.out.println(p1);
    System.out.println(s1);
    System.out.println(c1);
  }
}