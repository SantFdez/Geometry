
package math.geometry.Quadrilateral;

import java.util.Objects;

/**
 *
 * @author Cazaesclavas
 */
public class Square extends Quadrilateral{

    private Float side;

    
    @Override
    public Float perimeter() {
        return this.side*4;
    }

    @Override
    public Float area() {
        return this.side*this.side;
    }

    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.side);
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
        final Square other = (Square) obj;
        if (!Objects.equals(this.side, other.side)) {
            return false;
        }
        return true;
    }
    
    
    
}
