package solid;

import solid.lsp.Rectangle;
import solid.lsp.Shape;

public class ViewShape {
    private Shape shape;

    public ViewShape(Shape shape) {
        this.shape = shape;
    }

    public void showArea() {
        System.out.print("Площадь фигуры равна:");
        System.out.println(shape.getArea());
    }
}
