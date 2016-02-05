package Question1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        AreaVisitor areaVisitor = new AreaVisitor();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(5,10));
        shapes.add(new Rectangle(5,10));
        shapes.add(new Circle(3));
        for (Shape s : shapes) {
            System.out.println(areaVisitor.visit(s));
        }
    }
}
