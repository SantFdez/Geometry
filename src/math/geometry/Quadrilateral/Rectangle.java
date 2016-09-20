
package math.geometry.Quadrilateral;

/**
 *
 * @author Cazaesclavas
 */
public class Rectangle extends Quadrilateral{

    Float side_a;
    Float side_b;
    @Override
    public Float perimeter() {
        return (side_a*2 + side_b*2);
    }

    @Override
    public Float area() {
        return (side_a*side_b);
    }
    
}
