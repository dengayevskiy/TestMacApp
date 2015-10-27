
import javafx.geometry.Point3D;
import java.util.Scanner;

/**
 * Created by dgaievskiy on 22/10/15.
 */
public class PointApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates of the first point(x y z): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double z1 = scanner.nextDouble();

        System.out.println("Enter coordinates of the second point(x y z): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double z2 = scanner.nextDouble();

        Point3D p1 = new Point3D(x1, y1, z1);
        Point3D p2 = new Point3D(x2, y2, z2);

        int dist = distance(p1, p2);

        System.out.println("Distance = " + dist);
    }

    static int distance(int x1, int y1, int z1, int x2, int y2, int z2) {
        return (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    static int distance(Point3D first, Point3D second) {
        return (int) (Math.sqrt(Math.pow(second.getX() - first.getX(), 2) + Math.pow(second.getY() - first.getY(), 2))
                + Math.pow(second.getZ() - first.getZ(), 2));
    }

}
