public class Circle {
    double radius = 10;
    double x = 100;
    double y = 100;

    double getArea()
    {
        return Math.PI * radius * radius;
    }

    void setLocation(double newX, double newY)
    {
        x = newX;
        y = newY;
    }

    boolean isEqual(Circle other)
    {
        return (x == other.x && y == other.y && radius == other.radius);
    }
}
