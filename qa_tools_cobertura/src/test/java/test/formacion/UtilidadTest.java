package test.formacion;
import static org.junit.Assert.assertEquals;

import org.formacion.Utilidad;
import org.junit.Test;

public class UtilidadTest {
    @Test 
    public void test_round() {
    	Utilidad utilidad = new Utilidad();
    	
    	assertEquals(5,  utilidad.round(5.3));
    }
}
