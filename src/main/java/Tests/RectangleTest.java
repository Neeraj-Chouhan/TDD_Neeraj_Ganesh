package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Rectangle;
import org.junit.Test;


public class RectangleTest {

    @Test
    public void ShouldReturnAreAs100() {

        final double len = 10;
        final double bre = 10;

        Rectangle rectangle = new Rectangle(len, bre);
        double result = rectangle.area();

        assertEquals(100, result);

    }

    @Test
    public void ShouldReturnPerimeterAs20() {

        final double len = 5;
        final double bre = 5;

        Rectangle rectangle = new Rectangle(len, bre);
        double result = rectangle.perimeter();

        assertEquals(20, result);

    }

}
