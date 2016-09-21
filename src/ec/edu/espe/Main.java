
package ec.edu.espe;

import ec.edu.espe.util.GeometricConstants;
import ec.edu.espe.util.PrinterUtil;
import ec.edu.espe.math.geometry.shapes.quadrilaterals.Rectangle;
import ec.edu.espe.math.geometry.shapes.quadrilaterals.Square;
import ec.edu.espe.math.geometry.solids.circunferences.Sphere;
import ec.edu.espe.math.geometry.solids.cones.Cone;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Labs-DECC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Square square=new Square(11f);
       
     PrinterUtil.printShape(square.getClass().getSimpleName(), GeometricConstants.AREA, square.area());
     PrinterUtil.printShape(square.getClass().getSimpleName(), GeometricConstants.PERIMETER, square.perimeter());
       
     
     Rectangle rectangle=new Rectangle(12f,10f);
        PrinterUtil.printShape(rectangle.getClass().getSimpleName(), GeometricConstants.AREA, rectangle.area());
     PrinterUtil.printShape(rectangle.getClass().getSimpleName(), GeometricConstants.PERIMETER, rectangle.perimeter());
       
     Sphere sphere = new Sphere(11f);
     PrinterUtil.printShape(sphere.getClass().getSimpleName(), GeometricConstants.VOLUME, sphere.volume());
     
     Cone cone=new Cone(10f,10.44f,3f);
     PrinterUtil.printShape(cone.getClass().getSimpleName(), GeometricConstants.VOLUME, cone.volume());
        
        
    }
    
}
