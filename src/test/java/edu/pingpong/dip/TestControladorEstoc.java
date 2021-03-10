package edu.pingpong.dip;

import edu.pingpong.dip.bbdd.InventarioBBDD;
import edu.pingpong.dip.negocio.ControladorEstoc;
import edu.pingpong.dip.negocio.Inventario;
import org.junit.Assert;
import org.junit.Test;

public class TestControladorEstoc {

	@Test
	public void test_control_estoc() {

		Inventario inventario = new InventarioBBDD();
		ControladorEstoc controlador = new ControladorEstoc(inventario);
		
		Assert.assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
		Assert.assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));

	}

}
