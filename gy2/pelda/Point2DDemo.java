// Kétdimenziós pontok ábrázolása
class Point2D {
    // Koordináták mint mezők
    double x;
    double y;

    // Pont eltolása egy vektorral
    void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    // Pont középpontos nagyítása egy skalárral
    void scale(double c) {
        x *= c;
        y *= c;
    }

    // Pont forgatása adott szöggel
    void rotate(double phi) {
        double nx = x * Math.cos(phi) - y * Math.sin(phi);
        double ny = x * Math.sin(phi) + y * Math.cos(phi);
        x = nx;
        y = ny;
    }

    // Pont átalakítása szöveggé
    String show() {
        return String.format("{ x = %.3f, y = %.3f }", x, y);
    }

    // Két pont távolsága
    static double distance(Point2D p0, Point2D p1) {
        double xd = p0.x - p1.x;
        double yd = p0.y - p1.y;
        return (Math.sqrt((xd * xd) + (yd * yd)));
    }

    // A második pont tükrözése az elsőre
    static Point2D mirror(Point2D c, Point2D p) {
        Point2D result = new Point2D();
        result.x = (2 * c.x) - p.x;
        result.y = (2 * c.y) - p.y;
        return result;
    }
}

// Szögekkel kapcsolatos segédműveletek
class Angle {
    // Fok -> radián
    static double degreeToRadian(double x) {
        return x * Math.PI / 180;
    }

    // Radián -> fok
    static double radianToDegree(double x) {
        return x * 180 / Math.PI;
    }
}

// "Főprogram"
public class Point2DDemo {
    public static void main(String[] args) {
        Point2D p0 = new Point2D();
        p0.x = Math.E;
        p0.y = Math.PI;
        p0.translate(0.1, 12.34);
        p0.scale(0.78);
        p0.rotate(Angle.degreeToRadian(90));
        System.out.println("p0 = " + p0.show());

        Point2D p1 = new Point2D();
        p1.x = 2 * Math.PI;
        p1.y = Math.E / 2;
        p1.scale(1.445);
        p1.rotate(Angle.degreeToRadian(-33));
        System.out.println("p1 = " + p1.show());

        System.out.println("distance(p0, p1) = " + Point2D.distance(p0, p1));

        Point2D p2 = Point2D.mirror(p1, p0);
        System.out.println("mirror(p1, p0) = " + p2.show());
    }
}