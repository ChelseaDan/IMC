package Question1;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void accept(AreaVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

}
