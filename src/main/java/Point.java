/**
 * Created by dgaievskiy on 27/10/15.
 */
public class Point {

    int x;
    int y;
    int z;

    void addToAbscissa(int units) {
        x += units;
    }

    void addToOrdinate(int units) {
        y += units;
    }

    void addToApplicate(int units) {
        z += units;
    }

    void moveTo(int newX, int newY, int newZ) {
        x = newX;
        y = newY;
        z = newZ;
    }

    void moveTo(Point point) {
        x = point.x;
        y = point.y;
        z = point.z;
    }
    //smth1

}
