import java.util.Scanner;
public class Ruedas
{
	public static String CalcVehiculos(int Ruedas, int Vehiculos)
	{
		int Autos;
		int Motos;
		String Mensaje;
		/*
		 * Utilizando la representación:
		 * A + M = Vehiculos
		 * 4A + 2M = Ruedas
		 * Resolviendo por sistema de ecuaciones lineales se obtiene:
		 */
		Autos = ((-2) * Vehiculos + Ruedas) / 2;
		Motos = (Vehiculos - Autos);
		Mensaje = ("\nAutos: " + Autos + "\nMotos: " + Motos);
		return Mensaje;
	}

	public static void main(String[] args)
	{
		int InRuedas;
		int InVehiculos;
		String Salida;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de ruedas: ");
		InRuedas = sc.nextInt();
		System.out.println("Ingrese la cantidad de vehículos: ");
		InVehiculos = sc.nextInt();
		Salida = CalcVehiculos(InRuedas, InVehiculos);
		System.out.println("Resultados obtenidos:\n" + Salida);
	}
}
