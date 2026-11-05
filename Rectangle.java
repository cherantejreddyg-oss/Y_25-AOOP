class Rectangle {
    double length;
    double width;

    // Constructor
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Calculate area
    double area() {
        return length * width;
    }

    // Calculate perimeter
    double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5);

        System.out.println("Length: " + r1.length);
        System.out.println("Width: " + r1.width);

        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
    }
}