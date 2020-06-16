public class Ex1 {

    public static void main(String[] args) {
        Circle c = new Circle();
        Circle d = new Circle();

        d.radius = 25.0;

        System.out.println(c.getArea());

        d.setLocation(5, 5);

        System.out.println(c.isEqual(d));
    }
}
