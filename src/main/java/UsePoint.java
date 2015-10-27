/**
 * Created by dgaievskiy on 27/10/15.
 */
public class UsePoint {

    public static void main(String args[]) {

        Point point = new Point();

        point.x = 1;
        point.y = 2;
        point.z = 3;

        System.out.println(point.x + " " + point.y + " " + point.z);

        point.moveTo(4, 5, 6);

        System.out.println(point.x + " " + point.y + " " + point.z);

        Point point1 = new Point();

        point1.x = 7;
        point1.y = 8;
        point1.z = 9;

        point.moveTo(point1);

        System.out.println(point.x + " " + point.y + " " + point.z);
    }
}
