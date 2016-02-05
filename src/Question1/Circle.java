package Question1;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void accept(AreaVisitor visitor) {
        visitor.visit(this);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
