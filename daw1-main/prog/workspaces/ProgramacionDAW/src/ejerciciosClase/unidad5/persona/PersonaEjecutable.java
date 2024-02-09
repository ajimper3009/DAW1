package ejerciciosClase.unidad5.persona;

public class PersonaEjecutable {

	public static void main(String[] args) {
		Persona personaSinParam = new Persona();
		personaSinParam.setNombre("María");
		personaSinParam.setSexo('M');
		personaSinParam.setEdad(19);
		personaSinParam.setPeso(55f);
		personaSinParam.setAltura(166);
		System.out.println(personaSinParam.toString());
		mayorEdad(personaSinParam);
		mostrarEstadoPeso(personaSinParam);
		
		Persona personaCon3Param = new Persona("María", 19, 'M');
		personaCon3Param.setPeso(55f);
		personaCon3Param.setAltura(166);
		System.out.println(personaCon3Param.toString());
		mayorEdad(personaCon3Param);
		mostrarEstadoPeso(personaCon3Param);
		
		Persona personaConTodosParam = new Persona("María", 19, 'M', 55f, 166);
		System.out.println(personaConTodosParam.toString());
		mayorEdad(personaConTodosParam);
		mostrarEstadoPeso(personaConTodosParam);
	}
	
	private static void mostrarEstadoPeso(Persona persona) {
		Integer estado = persona.calcularImc();
		estado = null == estado? -2: estado;
		/* alternativa al operador ternario
		if (null == estado) {
			estado = -2;
		}
		*/
		switch (estado) {
		case -1:
			System.out.println("Su peso está dentro del rango de bajo peso");
			break;
		case 0:
			System.out.println("Su peso está dentro del rango de peso ideal");
			break;
		case 1:
			System.out.println("Su peso está dentro del rango de sobrepeso");
			break;
		default:
			System.out.println("Su peso no ha podido calcularse, compruebe los datos");
			break;
		}
		System.out.println("\n");
	}
	private static void mayorEdad(Persona persona) {
		if (persona.esMayorDeEdad()) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");			
		}
	}

}
