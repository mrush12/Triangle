public class Triangle extends GeometricObject{

    private double side1=1.0;
    
    private double side2=1.0;
    
    private double side3=1.0;
    
    /**Default construct*/
    
    public Triangle() {
    
    super();
    
    }
    
    /**Parametric constructor*/
    
    public Triangle(double side1, double side2, double side3) {
    
    super();
    
    this.side1 = side1;
    
    this.side2 = side2;
    
    this.side3 = side3;
    
    }
    
    /**Accessor methods*/
    
    public double getSide1() {
    
    return side1;
    
    }
    
    public double getSide2() {
    
    return side2;
    
    }
    
    public double getSide3() {
    
    return side3;
    
    }
    
    public double getArea() {
    
    double s=(side1+side2+side3)/2;
    
    double area2 = s *(s-side1) *(s-side2) *(s-side3);
    
    double area= Math.sqrt(area2);
    
    return area;
    
    }
    
    public double getPerimeter() {
    
    double perimeter = side1+side2+side3;
    
    return perimeter;
    
    }
    
    public String toString()
    
    {
    
    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    
    }
    
    }