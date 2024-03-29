package ejerciciosClase.unidad5.tienda;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class LanzadorTienda {

	private static final String NOMBRE_TIENDA = "Deportes Trafalgar";
	private static final int NUM_ARTICULOS = 100;
	private static ArticuloDeportivo[] articulos = new ArticuloDeportivo[NUM_ARTICULOS];
	static Scanner scanner = new Scanner(System.in);

		public static void main(String[] args) throws TiendaDeportesException {
			ArticuloDeportivoTextil textil1 = new ArticuloDeportivoTextil("Camiseta verde", "02000000000103", 10, "M");
	        ArticuloDeportivoTextil textil2 = new ArticuloDeportivoTextil("Camiseta azul", "01000000000102", 15, "L");
	        ArticuloDeportivoTextil textil3 = new ArticuloDeportivoTextil("Calcetines", "00000000000000", 20, "S");
	        ArticuloDeportivoZapateria zapato1 = new ArticuloDeportivoZapateria("Zapatillas", "00000000000000", 10, null, 42, "REGULAR");
	        ArticuloDeportivoZapateria zapato2 = new ArticuloDeportivoZapateria("Botas", "00000000000000", 15, null, 38, "ANCHA");
	        ArticuloDeportivoZapateria zapato3 = new ArticuloDeportivoZapateria("Sandalias", "00000000000000", 20, null, 36, "ESTRECHA");
	        ArticuloDeportivoComplemento complemento1 = new ArticuloDeportivoComplemento("Gorra", "00000000000000", 10, "ACCESORIO");
	        ArticuloDeportivoComplemento complemento2 = new ArticuloDeportivoComplemento("Bufanda", "00000000000000", 15, "ROPA");
	        ArticuloDeportivoComplemento complemento3 = new ArticuloDeportivoComplemento("Muñequeras", "00000000000000", 20, "ACCESORIO");

	        
	        articulos[0] = textil1;
	        articulos[1] = textil2;
	        articulos[2] = textil3;
	        articulos[3] = zapato1;
	        articulos[4] = zapato2;
	        articulos[5] = zapato3;
	        articulos[6] = complemento1;
	        articulos[7] = complemento2;
	        articulos[8] = complemento3;
			System.out.println("Bienvenido a la tienda " + NOMBRE_TIENDA);
			int option = 0;

			while (option != 10) {
				try {
					// Muestra el menu
					mostrarMenu();
					option = leerOpcion();

					switch (option) {
					case 1:
						System.out.println(
						        "El código completo del artículo es: " + getArticuloPorDescripcion().toString());
						break;
					case 2:
						System.out.println("La descripción del artículo es: " + getArticuloPorCodigo().getDescripcion());
						break;
					case 3:
						System.out
						        .println("El código de ciudad del artículo es: " + getArticuloPorDescripcion().getCiudad());
						break;
					case 4:
						System.out.println(
						        "El código de la tienda del artículo es: " + getArticuloPorDescripcion().getTienda());
						break;
					case 5:
						System.out.println("El código del artículo es: " + getArticuloPorDescripcion().getCodArticulo());
						break;
					case 6:
						System.out.println("El código del tipo del artículo es: " + getArticuloPorDescripcion().getTipo());
						break;
					case 7:
						crearArticulo();
						break;
					case 8:
						decrementarUnidades();
						break;
					case 9:
						System.out.println("Las unidades del artículo son: " + getArticuloPorDescripcion().getUnidades());
						break;
					case 10:
						System.out.println("Hasta luego! Gracias por usar la aplicación");
						break;
					default:
						throw new InputMismatchException();

					}
				} catch (InputMismatchException e) {
					System.out.println("Insertar solo numeros entre el 1 y el 10");
				} catch (TiendaDeportesException e) {
					System.out.println(e.getMessage());
				}
			}

		}

		private static void decrementarUnidades() throws TiendaDeportesException {
			ArticuloDeportivo ad = getArticuloPorDescripcion();
			System.out.println("Introduce las unidades que deseas decrementar");
			int unidades = Integer.parseInt(leerTeclado());
			if (unidades <= ad.getUnidades()) {
				// Quedará stock disponible del artículo
				ad.setUnidades(ad.getUnidades() - unidades);
			} else {
				throw new TiendaDeportesException("No se pueden decrementar más unidades de las que existen");
			}
			
		}

		private static void crearArticulo() throws TiendaDeportesException {
			System.out.println("Introduce la descripción del artículo");
			String desc = leerTeclado();
			System.out.println("Introduce el código completo del artículo");
			String codCompleto = leerTeclado();
			System.out.println("Introduce las unidades del artículo");
			int unidades = Integer.parseInt(leerTeclado());
			switch (comprobarTipoArticulo(codCompleto)) {
			case 1:
				System.out.println("Introduce la talla del artículo textil");
				String talla = leerTeclado();
				ArticuloDeportivo articuloT = getArticuloPorCodigo(codCompleto);
				if (null == articuloT) {
					// Creo un nuevo articulo y lo añado al array
					int hueco = hayEspacioEnTienda();
					if (-1 != hueco) {
						articuloT = new ArticuloDeportivoTextil(desc, codCompleto, unidades, talla);
						articulos[hueco] = articuloT;
					}
				} else {
					// Si ya existe aumento sus unidades
					articuloT.setUnidades(articuloT.getUnidades() + unidades);
				}
				break;
			case 2:
				System.out.println("Introduce el número del artículo de zapatería");
				int numero = Integer.parseInt(leerTeclado());
				System.out.println("Introduce la horma del artículo de zapatería");
				String horma = leerTeclado();
				ArticuloDeportivo articuloZ = getArticuloPorCodigo(codCompleto);
				if (null == articuloZ) {
					// Creo un nuevo articulo y lo añado al array
					int hueco = hayEspacioEnTienda();
					if (-1 != hueco) {
						articuloZ = new ArticuloDeportivoZapateria(desc, codCompleto, unidades, null, numero, horma);
						articulos[hueco] = articuloZ;
					}
				} else {
					// Si ya existe aumento sus unidades
					articuloZ.setUnidades(articuloZ.getUnidades() + unidades);
				}
				break;
			case 3:
				System.out.println("Introduce el tipo de complemento del artículo");
				String tipoComplemento = leerTeclado();
				ArticuloDeportivo articuloC = getArticuloPorCodigo(codCompleto);
				if (null == articuloC) {
					// Creo un nuevo articulo y lo añado al array
					int hueco = hayEspacioEnTienda();
					if (-1 != hueco) {
						articuloC = new ArticuloDeportivoComplemento(desc, codCompleto, unidades, tipoComplemento);
						articulos[hueco] = articuloC;
					}
				} else {
					// Si ya existe aumento sus unidades
					articuloC.setUnidades(articuloC.getUnidades() + unidades);
				}
				break;
			default:
				throw new TiendaDeportesException("El tipo de artículo no es correcto");
			}

		}

		private static int comprobarTipoArticulo(String codCompleto) throws TiendaDeportesException {
			int tipo = 0;
			String tipoStr = StringUtils.substring(codCompleto, 4, 6);
			if ("01".equals(tipoStr)) {
				tipo = 1;
			} else if ("02".equals(tipoStr)) {
				tipo = 2;
			} else if ("03".equals(tipoStr)) {
				tipo = 3;
			} else {
				throw new TiendaDeportesException("El tipo de artículo no es correcto");
			}
			return tipo;

		}

		private static int hayEspacioEnTienda() {
			int index = -1;
			int i = 0;
			boolean hayHueco = false;
			while (!hayHueco && index < articulos.length) {
				if (null == articulos[i++]) {
					hayHueco = true;
					index = i - 1;
				}
			}
			return index;
		}

		/**
		 * Muestra el menu
		 */
		public static void mostrarMenu() {
			System.out.println("1. Ver el código completo del artículo");
			System.out.println("2. Ver la descripción del artículo");
			System.out.println("3. Ver el código de la ciudad");
			System.out.println("4. Ver el código de la tienda");
			System.out.println("5. Ver el código del artículo");
			System.out.println("6. Ver el tipo de artículo");
			System.out.println("7. Crear artículo");
			System.out.println("8. Decrementar unidades");
			System.out.println("9. Consultar unidades");
			System.out.println("10. Salir");
		}

		/**
		 * Devuelve un dato por teclado
		 * 
		 * @return
		 */
		public static String leerTeclado() {
			Scanner scanner = new Scanner(System.in);
			return scanner.nextLine();
		}

		/**
		 * Devuelve un artículo según su código leído por teclado
		 * 
		 * @return
		 * @throws TiendaDeportesException
		 */
		public static ArticuloDeportivo getArticuloPorCodigo() throws TiendaDeportesException {
			System.out.println("Introduce el código del artículo");
			String input = leerTeclado();
			boolean encontrado = false;
			int i = 0;
			ArticuloDeportivo articulo = null;
			while (!encontrado && i < articulos.length) {
				articulo = articulos[i];
				if(null != articulo) {
					String codigo = articulos[i].getCodArticulo();
					if (!StringUtils.isBlank(codigo) && codigo.equals(input)) {
						encontrado = true;
						articulo = articulos[i];
					}
				}
				i++;
			}
			if (!encontrado) {
				throw new TiendaDeportesException("No se ha encontrado ningún artículo con el código dado");
			}
			return articulo;
		}

		/**
		 * Devuelve un artículo según su código leído por teclado
		 * 
		 * @return
		 * @throws TiendaDeportesException
		 */
		public static ArticuloDeportivo getArticuloPorCodigo(String codCompleto) throws TiendaDeportesException {
			boolean encontrado = false;
			int i = 0;
			ArticuloDeportivo articulo = null;
			while (!encontrado && i < articulos.length) {
				articulo=articulos[i];
				if (null != articulo) {				
					String codigo = articulos[i].getCodArticulo();
					if (!StringUtils.isBlank(codigo) && codigo.equals(codCompleto)) {
						encontrado = true;
						articulo = articulos[i];
					}
				}
				i++;
			}
			return articulo;
		}

		/**
		 * Devuelve un artículo según su descripción leído por teclado
		 * 
		 * @return
		 * @throws TiendaDeportesException
		 */
		public static ArticuloDeportivo getArticuloPorDescripcion() throws TiendaDeportesException {
			System.out.println("Introduce la descripción del artículo");
			String input = leerTeclado();
			boolean encontrado = false;
			int i = 0;
			ArticuloDeportivo articulo = null;
			// Guardaremos en busqueda los artículos que cumplan la descripción dada
			Map<Integer, ArticuloDeportivo> busqueda = new HashMap<Integer, ArticuloDeportivo>();
			int clave = 1;
			while (i < articulos.length) {
				articulo=articulos[i];
				if (null != articulo) {
					String desc = articulo.getDescripcion();
					if (StringUtils.containsIgnoreCase(desc, input)) {
						busqueda.put(clave++, articulo);
						encontrado = true;
					}
				}
				i++;
			}
			if (!encontrado) {
				throw new TiendaDeportesArticuloNoEncotradoException(
				        "No se ha encontrado ningún artículo con el código dado");
			} else {
				if (busqueda.keySet().size() == 1) {
					articulo = busqueda.get(1);
				} else {
					mostrarBusqueda(busqueda);
					Integer seleccionado = Integer.parseInt(leerTeclado());
					if (busqueda.keySet().contains(seleccionado)) {					
						articulo = busqueda.get(seleccionado);
					} else {
						throw new TiendaDeportesArticuloNoEncotradoException(
						        "No has seleccionado un artículo correcto de la búsqueda");
					}
				}
			}
			return articulo;
		}

		private static void mostrarBusqueda(Map<Integer, ArticuloDeportivo> busqueda) {
			System.out.println("Selecciona un artículo");
			for (Integer indice : busqueda.keySet()) {
				System.out.println(indice);
				System.out.println("-------");
				System.out.println(busqueda.get(indice).toString());
			}
			
		}

		/**
		 * Devuelve un dato por teclado de tipo numero
		 * 
		 * @return
		 * @throws InputMismatchException
		 */
		public static int leerOpcion() throws InputMismatchException {
			System.out.println("--------------------------------");
			System.out.println("Seleccione la opción deseada");
			System.out.println("--------------------------------");
			Scanner scanner = new Scanner(System.in);
			return scanner.nextInt();
		}

	}