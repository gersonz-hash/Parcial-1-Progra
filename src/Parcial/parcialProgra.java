package Parcial;
import java.util.Scanner;
public class parcialProgra {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		
	
		try {
		    tablaMultiplicar();
			promedioCalificaciones();
			
			
			
			
		} catch(Exception e) {
			System.out.println("Ingrese un numero valido...");
		}
	}
		
	
	//PRIMER EJERCICIO (a)
	static void tablaMultiplicar(){
		System.out.println("=========Tabla de Multiplicar de 1 a 12=========T");
		System.out.println();
		
		System.out.println("Ingrese un número de 1 a 12: ");
		int n =sc.nextInt();
		
		int resultado;
		
		for(int i=1; n<=12; i++) {
			if(n==i) {
				resultado=n*i;
				System.out.println(resultado);
			}
			
		}
	}
	//SEGUNDO EJERCICIO (b)
	static void promedioCalificaciones() {
		System.out.println("=========PROMEDIO DE 5 CALIFCACIONES=========T");
		System.out.println();
		
		double suma=0;
		
		for(int i=1; i<=5; i++) {
			System.out.println("ingresa tus calificaciones :");
			double n =sc.nextDouble();
			suma=suma+n;
		}
		double prom=(double)suma/5;
		System.out.println("El promedio es: "+prom);
	}
	// CUARTO EJERCICIO (c)
	//static void 
}
