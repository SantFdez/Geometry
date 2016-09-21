
package ec.edu.espe.math.geometry.shapes.quadrilaterals;

/**
 *
 * @author Cazaesclavas
 */
public class Rhombus extends Quadrilateral{

    private Float small_diagonal;
    private Float big_diagonal;
    
    @Override
    public Float perimeter() {
        return (float)Math.sqrt((Math.pow(small_diagonal/2, 2) + Math.pow(big_diagonal/2, 2) )*4);
    }

    @Override
    public Float area() {
        return (small_diagonal * big_diagonal);
    }

    public Float getSmall_diagonal() {
        return small_diagonal;
    }

    public void setSmall_diagonal(Float small_diagonal) {
        this.small_diagonal = small_diagonal;
    }

    public Float getBig_diagonal() {
        return big_diagonal;
    }

    public void setBig_diagonal(Float big_diagonal) {
        this.big_diagonal = big_diagonal;
    }
    
}
