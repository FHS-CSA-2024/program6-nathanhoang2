//import stuff here!
import java.util.Scanner;
//Your code here
public class program6{
    public static void main(String[]args){
        final double pi = 3.14159;
        double radius = 0.0;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = myScanner.nextDouble();

        double area = (pi)*radius*radius;
        double circumference = 2*pi*radius;
        double diameter = 2*radius;
        
        radius = radius*1000;
        radius = radius+0.5;
        radius = (int)radius;
        radius = radius/1000;
        System.out.println();
        System.out.println("The Radius of the circle = "+radius);
        
        diameter = diameter*1000;
        diameter = diameter+0.5;
        diameter = (int)diameter;
        diameter = diameter/1000;
        System.out.println();
        System.out.println("The Diameter of the circle = "+diameter);
        
        area = area*1000;
        area = area+0.5;
        area = (int)area;
        area = area/1000;
        System.out.println();
        System.out.println("The Area of the circle = "+area);
        
        circumference = circumference*1000;
        circumference = circumference+0.5;
        circumference = (int)circumference;
        circumference = circumference/1000;
        System.out.println();
        System.out.println("The Circumference of the circle = "+circumference);
    }
}
//Paste console output below:
/*
Enter the radius: 
3.712

The Radius of the circle = 3.712

The Diameter of the circle = 7.424

The Area of the circle = 43.288

The Circumference of the circle = 23.323

*/
