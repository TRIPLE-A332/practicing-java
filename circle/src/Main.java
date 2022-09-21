public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.radius);
        System.out.println(c1.Perimeter());
        System.out.println(c1.Area());

    }
}
class Circle {
    public double radius = 2.111;

    public double Area()
        {
            return Math.PI*radius*radius;
        }
    public double Perimeter()
        {
            return 2*Math.PI*radius;
        }
}