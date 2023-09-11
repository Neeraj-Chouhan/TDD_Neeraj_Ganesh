package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Rectangle;
import org.junit.Test;


public class RectangleTest {

    @Test
    public void ShouldReturnAreAs100WhenLengthIs10andBreadthIs10() {

        final double length = 10;
        final double breadth = 10;

        Rectangle rectangle = new Rectangle(length,breadth);
        double result = rectangle.area();

        assertEquals(100, result);

    }

    @Test
    public void ShouldReturnPerimeterAs20WhenLengthIs5andBreadthIs5() {

        final double length = 5;
        final double breadth = 5;

        Rectangle rectangle = new Rectangle(length, breadth);
        double result = rectangle.perimeter();

        assertEquals(20, result);

    }

}
