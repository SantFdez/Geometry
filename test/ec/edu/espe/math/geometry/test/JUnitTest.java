/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.test;

import ec.edu.espe.math.geometry.shapes.circunferences.Circle;
import ec.edu.espe.math.geometry.shapes.quadrilaterals.Square;
import ec.edu.espe.math.geometry.solids.cones.Cone;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SONY
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testPerimeterCircle(){
        Circle circle=new Circle(32f);
        assertEquals((float)(Math.PI*32*2),circle.perimeter(),0);
       // assertEquals(1.49f,1.5f,0.01);
    }
    
    @Test
    public void square(){
        Square square=new Square(32f);
        assertEquals(32f*4,square.perimeter(),0.001f);
        
    }
    
    @Test
    public void coneVolume(){
        Cone cone=new Cone(10f,10.44f,3f);
        assertEquals(94.24f,cone.volume(),0.000001f);
        
    }
}
