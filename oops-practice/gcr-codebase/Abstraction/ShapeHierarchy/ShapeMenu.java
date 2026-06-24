import java.util.Scanner;

public class ShapeMenu extends ShapeMenuAbs {

    @Override
    public void showMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Circle  2.Rectangle  3.Triangle");
        int choice = sc.nextInt();

        Shape s;

        switch (choice) {
            case 1:
                System.out.print("Radius: ");
                s = new Circle(sc.nextDouble());
                break;

            case 2:
                System.out.print("Length Width: ");
                s = new Rectangle(sc.nextDouble(), sc.nextDouble());
                break;

            case 3:
                System.out.print("Three Sides: ");
                s = new Triangle(sc.nextDouble(),
                                 sc.nextDouble(),
                                 sc.nextDouble());
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        System.out.println("Area = " + s.area());
        System.out.println("Perimeter = " + s.perimeter());
    }
}