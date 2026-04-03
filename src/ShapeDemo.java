public class ShapeDemo {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle("Red", 5),
                new Rectangle("Blue", 4, 6),
                new Triangle("Green", 3, 4, 5),
                new Circle("Yellow", 2.5),
                new Rectangle("Orange", 3, 7),
                new Triangle("Purple", 6, 6, 6)
        };


        for (Shape s : shapes) {
            s.displayInfo();
        }
        Shape largest = findLargest(shapes);
        System.out.println("\nShape with largest area:");
        largest.displayInfo();


        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.getArea();
        }
        System.out.println("\nTotal combined area of all shapes: " + totalArea);
    }

    public static Shape findLargest(Shape[] shapes) {
        if (shapes.length == 0) return null;

        Shape largest = shapes[0];
        for (Shape s : shapes) {
            if (s.getArea() > largest.getArea()) {
                largest = s;
            }
        }
        return largest;
    }
}