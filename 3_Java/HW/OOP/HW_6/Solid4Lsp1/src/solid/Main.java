package solid;

import solid.lsp.Rectangle;
import solid.lsp.Shape;
import solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Square shape = new Square(5);
        System.out.printf("В квадрате сторона = %d\n", shape.getSide());
        ViewShape view = new ViewShape(shape);
        view.showArea();
    }
}
