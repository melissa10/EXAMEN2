import java.util.Scanner;

public class ejercicio1 {

	private static Scanner scanner;
	
	static boolean soniguales(int numero1, int numero2){
	if (numero1==numero2){	
		
	return true;
	
	}else
	return false;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo[]=new int[2];
		scanner = new Scanner(System.in);
		System.out.print("Ingrese numero 1: ");
		arreglo[0]=scanner.nextInt();
		System.out.print("Ingrese numero 2: ");
		arreglo[1]=scanner.nextInt();
		
	if (arreglo[0]==arreglo[1])
	System.out.print("Son Iguales");

	else
	{
	System.out.print("Son Diferentes");	
	}
	}
}


	


