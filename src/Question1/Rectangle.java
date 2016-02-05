package Question1;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Rectangle implements Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void accept(AreaVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getArea() {
        return height * width;
    }


}
