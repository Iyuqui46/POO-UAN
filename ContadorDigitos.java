import java.util.Scanner;
public class ContadorDigitos
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Contador de digitos");
		int numero; //numero ingresado por el usuario
		int copia_numero; //crear una copia para no perder el numero inicial
		do{
		    System.out.println("Ingrese un numero entero positivo");
		    numero = sc.nextInt();  //solicitud del numero
		    
		    if (numero <= 0){   //validar que sea positivo
		        System.out.println("El numero debe ser mayor a 0");
		    }
		}while(numero <= 0);
		//copiar el numero ya validado
		copia_numero = numero;
		//Contar digitos
		int contador = 0;       //guardar la cantidad de digitos
		while(numero != 0){
		    numero /= 10;
		    contador += 1;
		}
		System.out.printf("El numero %d tiene %d digitos", copia_numero , contador);
	}
}
