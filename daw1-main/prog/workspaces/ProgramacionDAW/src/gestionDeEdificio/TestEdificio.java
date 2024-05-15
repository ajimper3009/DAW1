package gestionDeEdificio;

import java.util.Date;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;
// CREAR LA CLASE COMO NEW > JUNIT TEST CASE
public class TestEdificio {

	@Test
	public void testCreacionEdificio() {
		System.out.println("test1");
		Edificio ed = null;
		Assert.assertNull(ed);
		ed = new Edificio();
		Assert.assertNotNull(ed);
	}
	
	@Test
	public void testRegistrarVip() {
		System.out.println("test2");
		Edificio ed = new Edificio();
		boolean encontrado= false;
		Persona personaVip = new Persona("John", "Doe", "00000000T");
		Iterator<Persona> itPersona = ed.getListaZonaPrivada().iterator();
		while (itPersona.hasNext() && !encontrado) {
			if (personaVip.equals(itPersona.next())) {
				encontrado= true;
			}
		}
		Assert.assertFalse(encontrado);
		Assert.assertEquals(ed.getListaZonaPrivada().size(), 0);
		ed.altaVIP(personaVip);
		itPersona = ed.getListaZonaPrivada().iterator();
		while (itPersona.hasNext() && !encontrado) {
			if (personaVip.equals(itPersona.next())) {
				encontrado= true;
			}
		}
		Assert.assertTrue(encontrado);
		Assert.assertEquals(ed.getListaZonaPrivada().size(), 1);
	}
	@Test
	public void testRegistrarVipRepetido() {
		System.out.println("test3");
		Edificio ed = new Edificio();
		Persona personaVip = new Persona("John", "Doe", "00000000T");
		ed.altaVIP(personaVip);
		Assert.assertEquals(ed.getListaZonaPrivada().size(), 1);
		ed.altaVIP(personaVip);
		Assert.assertEquals(ed.getListaZonaPrivada().size(), 1);
	}
	
	@Test
	public void testPersonaEnEdificioRepetida() {
		System.out.println("test4");
		Edificio ed = new Edificio();
		Persona persona = new Persona("John", "Doe", "00000001T");
		Registro registro1 = new Registro (persona, new Date(), true);
		try {
			ed.nuevaEntrada(registro1);
		} catch (EdificioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals(ed.getListaVisitantes().size(), 1);
		try {
			ed.nuevaEntrada(registro1);
		} catch (EdificioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(ed.getListaVisitantes().size(), 1);
		
	}
	

	

}
