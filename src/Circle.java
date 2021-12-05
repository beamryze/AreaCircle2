
/*
 *  Extra Credit
 *  Description: Print area of circle
 *  Name: Rick
 *  Semester: Fall 2021
 */

public class Circle {

    // Declaring vars and constructors 

    // Declaring static double for Pi
    static double pi = 3.14;

    // Adding constructors on it
    Circle() {
    }

    Circle(double radius, double pi){
    }

    // Method to return circle area
    double AreaofCircle(double radius, double piInt) {

        // Declaring integer
        double area;
        // Calculating area of circle
        area = radius * radius * piInt;
        // Returning result
        return area;
    }

    // main starting function
    public static void main(String[] args) {
        // Declaring variable for circle
        double AreaofCircleResult;

        // Assigning object
        Circle CircleCalc = new Circle();

        // Calling AreaofCircle to get result of radius
        AreaofCircleResult  = CircleCalc.AreaofCircle(25, pi);

        // Printing result of AreaofCircle
        System.out.println("Area of Circle : " + AreaofCircleResult);

    }
}