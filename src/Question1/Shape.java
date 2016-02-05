package Question1;

/**
 * Created by dg1613 on 05/02/16.
 */
public interface Shape {

    void accept(AreaVisitor visitor);

    double getArea();


}
