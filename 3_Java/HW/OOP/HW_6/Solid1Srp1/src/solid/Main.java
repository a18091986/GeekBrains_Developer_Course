package solid;

import solid.srp.Point;
import solid.srp.Square;
import solid.srp.Paint;


public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        Paint paint = new Paint(5 * 2);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        paint.draw();
    }
}
