
package ec.edu.espe.math.geometry.shapes.quadrilaterals;

import java.util.Objects;

/**
 *
 * @author Cazaesclavas
 */
public class Romboide extends Quadrilateral{
    private Float small_side;
    private Float big_side;
    private Float height;

    @Override
    public Float perimeter() {
        return small_side + big_side + height;
    }

    @Override
    public Float area() {
        return ((big_side - small_side)*height/2);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.small_side);
        hash = 67 * hash + Objects.hashCode(this.big_side);
        hash = 67 * hash + Objects.hashCode(this.height);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Romboide other = (Romboide) obj;
        if (!Objects.equals(this.small_side, other.small_side)) {
            return false;
        }
        if (!Objects.equals(this.big_side, other.big_side)) {
            return false;
        }
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        return true;
    }
    
}
