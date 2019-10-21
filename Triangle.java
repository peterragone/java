import java.util.ArrayList;
import java.lang.Math;

public class Triangle extends Polygon {

    // Constructors from parent class don't get inherited, so add them here.
	public Triangle(int numOfSides) {
        super(numOfSides);
    }
    
    public Triangle(int numOfSides, ArrayList<Point> coors) {
        super(numOfSides, coors);
    }


    // The constructor the 2(a)(i) is the one needing number of sides and an array list of vertices.     
    // The constructor for 2(a)(ii) is the numOfSides one, inherited from Polygon.
    
    // This is for question 3(a)(i)
    public Triangle(ArrayList<Point> coors) {
        super(3, coors);
    }

    // This is for question 3(a)(ii) 
    public Triangle() {
        super(3);  // Call the Polygon constructor to create the object. 
    }

    public double area() {
        ArrayList<Point> c = coordinates;  // For readability below.
        double A;
        
        System.out.println("The c.get(0) is: " + Double.toString(coordinates.get(0).x));

        // Area knowing vertices is:
        // A = (x1y2 + x2y3 + x3y1 – x1y3 – x2y1 – x3y2)/2.
        A = (c.get(0).x * c.get(1).y 
              + c.get(1).x * c.get(2).y 
              + c.get(2).x * c.get(0).y 
              - c.get(0).x * c.get(2).y 
              - c.get(1).x * c.get(0).y 
              - c.get(2).x * c.get(1).y) 
              / 2;
        
        return A;
    }
    
    // Given 2 vertices, return the distance between them. 
    private double edgeLength(Point p1, Point p2) {
        double distance = 0;
        
        distance = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
        return distance;
    }

    public boolean isEquilateral() {
        double[] edge = new double[3];
        boolean test = false;
        
        edge[0] = edgeLength(coordinates.get(0), coordinates.get(1));
        edge[1] = edgeLength(coordinates.get(1), coordinates.get(2));
        edge[2] = edgeLength(coordinates.get(2), coordinates.get(0));
        
        // Round off the doubles by casting them to longs.
        test = (float) edge[0] == (float) edge[1] && (float) edge[0] == (float) edge[2];
                
        return test;        
    }
    
    public static void main(String[] args) {
        Point v1 = new Point(0.0, 0.0);
        Point v2 = new Point(1.0, 0.0);
        Point v3 = new Point(0.0, 1.0);
        
        ArrayList<Point> vertices = new ArrayList<Point>();
        
        vertices.add(v1);
        vertices.add(v2);
        vertices.add(v3);

        // Test 2(a)(i)
        Triangle testCreate1 = new Triangle(3, vertices);
        
        // Test 2(a)(ii)
        Triangle testCreate2 = new Triangle(3);
        testCreate2.addOneCoordinate(v1.x, v1.y);
        testCreate2.addOneCoordinate(v2.x, v2.y);
        testCreate2.addOneCoordinate(v3.x, v3.y);
        
        
        // Test 3(a)(i)
        Triangle testCreate3 = new Triangle(vertices);
        
        // Test 3(a)(ii)
        Triangle testCreate4 = new Triangle();
        testCreate4.addOneCoordinate(v1.x, v1.y);
        testCreate4.addOneCoordinate(v2.x, v2.y);
        testCreate4.addOneCoordinate(v3.x, v3.y);
        
        System.out.println("Area of triangle is: " + Double.toString(testCreate4.area()));
        System.out.println("Triangle is equilateral? " + Boolean.toString(testCreate4.isEquilateral()));
        
        // Make an equilateral triangle to test.
        double side = testCreate4.edgeLength(v1, v2);
        v3.x = side / 2.0;
        v3.y = side * Math.sqrt(3) / 2;
        Point oldVert = vertices.set(2, v3);
        Triangle testEquilateral = new Triangle(vertices);
        System.out.println("Triangle is equilateral? " + Boolean.toString(testEquilateral.isEquilateral()));

    }

}