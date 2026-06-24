public abstract class Shape {

    public abstract double area();

    public abstract double perimeter();

    public void displayReport() {
        System.out.println("Area = " + area());
        System.out.println("Perimeter = " + perimeter());
    }
}