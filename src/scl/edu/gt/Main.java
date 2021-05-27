package scl.edu.gt;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		/*MENSAJE INICIAL DEL PROGRAMA*/
		Img textMensaje = new Img();
		textMensaje.Mensaje();
		
		/*ESTADO DEL PLOGRAMA*/
		boolean on = true;
		
		/*INCIO DEL PROGRMA*/
		do {
		
		Scanner inputCommand = new Scanner(System.in);
		System.out.println("");
		System.out.print("~$ ");
		String output = inputCommand.nextLine();

		CommandList dateCommand = new CommandList();
		ArithmeticFunctions fa = new ArithmeticFunctions();
		Help help = new Help();

		if(output.equals(dateCommand.command[0])) {
				fa.sumar();
			}
		else if(output.equals(dateCommand.command[1])) {
				fa.restar();
			}
		else if(output.equals(dateCommand.command[2])) {
				fa.dividir();
			
      	}else if(output.equals(dateCommand.command[3])) {
				fa.multiplicar();
			
	    }else if(output.equals(dateCommand.command[4])) {
				fa.residuo();
		}else if(output.equals(dateCommand.command[5])) {
				help.listaComando();	
		}else if(output.equals(dateCommand.command[6])) {
				on = false;	

		}else {
		System.out.println("comando no encontrado");
		System.out.println("Ingresa a help para encontrar los comandos disponibles");
		}
		}while(on);
		}
		}