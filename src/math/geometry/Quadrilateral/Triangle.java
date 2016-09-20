
package math.geometry.Quadrilateral;

/**
 *
 * @author Cazaesclavas
 */
public class Triangle extends Quadrilateral{

    Float side_a;
    Float side_b;
    
    @Override
    public Float perimeter() {
        return (side_a*side_b/2);
    }

    @Override
    public Float area() {
        return (side_a*side_b/2);
    }
    
}
