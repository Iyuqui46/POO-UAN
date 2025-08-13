import java.util.Scanner;
public class AdivinaNumero
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Adivina el numero");
		//Generar numero random
		int numero_random = (int) (Math.random() * 100) + 1;
		int intentos = 1;
		int numero_solicitado = 0;
		do{
    		//Soliciatr el numero al usuario
    		System.out.println("\nIngrese un numero entre 0 y 100");
    		numero_solicitado = sc.nextInt();
    		if((numero_solicitado <= 0) || (numero_solicitado >= 100)){
    		    System.out.println("Numero fuera del rango");
    		}
    		//Pistas para el usuario
    		if (numero_solicitado == numero_random){
    		    break;
    		}
    		if (numero_solicitado < numero_random){
    		    System.out.println("Tu numero es menor al que buscas");
    		}else{
    		    System.out.println("Tu numero es mayor al que buscas");
    		}
    		//mejores Pistas
    		int diferencia = Math.abs(numero_random - numero_solicitado);
    		if (diferencia >= 50){
    		    System.out.println("Estas muy lejos del numero buscado");
    		} else if (diferencia >= 25){
    		    System.out.println("Estas lejos del numero buscado");
    		} else if (diferencia >= 10){
    		    System.out.println("Estas cerca del numero buscado");
    		} else {
    		    System.out.println("Estas muy cerca del numero buscado");
    		}
    		intentos += 1;
		}while(numero_random != numero_solicitado);
		
		System.out.println("CORECCTO! Tu numero era " + numero_random + " y solo te tomo " + intentos + " intentos");
	}
}
