package scl.edu.gt;

public class CommandList {

String command     [] = new String [12];
String information [] = new String [12];
    CommandList() {
	
         command[0]= "suma";
         command[1]= "resta";
         command[2]= "división";
         command[3]= "multiplicación";
         command[4]= "residuo";
         command[5]= "help";
         command[6]= "exit";
         
         command[7]= "Accesorios";
         command[8]= "Hardware";
         command[9]= "Software";
         command[10]= "Procesador";
         command[11]= "Tarjeta madre";
        
         information[0]= " El comando puede realizar la suma de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
         information[1]= " El coamdo puede realizar la resta de dos o mas numeros siempre \n y cuando el que reste se mayor al otro numero. ";
         information[2]= " El comando puede dividir dos o mas \n numeros ya sean enteros o decimales, el valor \n a retonar es double.  ";
         information[3]= " El comando puede multiplicar dos o tres numeros \n y esto nos ayudara a que a la hora de hacer una multiplicación nos sea mas facil.";
         information[4]= " El comando puede darte el residuo de toda operacion realizada \n ya sea si tiene numero enteros o decimales.";
         information[5]= " El coamndo help te puede ayudar a saber que tipos \n de comandos y operaciones puedes encontrar en este programa.";
         information[6]= " El omando exit realiza la finalización del programa \n y sirve tambien para cerrar el programa en ese momento.";
        
         information[7]= "El comando accesorios sireve para que te diga \n que accesorios trae tu celular a la hora de comprarlo nuevo.";
         information[8]= "El comando Hardware es la parte fisica de un o de un sistema informatico.";
         information[9]= "El comando Software es la parte logica al sistema formal de un sistema informatico, \n que comprende el conjunto de los componentes lógicos.";
         information[10]= "El comando procesador es la parte primordial \n de tu computadora ya que es el cerebro de toda nuestra computadora.";
         information[11]= "El comando Tarjeta madre es un circuito impreso \n a la que se conectan los componentes que constituyen la computadora.";

         
    }





}
