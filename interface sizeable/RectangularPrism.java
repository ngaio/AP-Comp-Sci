/**
 * <<< Complete the class RectangularPrism below: >>>
 * Write a 3 parameter constructor which initializes length, width and height
 * Write all other methods as needed
 */
public class RectangularPrism implements Sizeable
{
    private int length;
    private int width;
    private int height;
    
    public RectangularPrism(int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }
    public double volume(){
        return length * width * height;
    }
    public double surfaceArea(){
        return 2 * (width * length + width * height + length * height); 
    }
    public String toString(){
        return "length: " + length + " width: " + width + " height: " + 
        height + " volume: " + volume() + " surface: " + surfaceArea();
    }
}
