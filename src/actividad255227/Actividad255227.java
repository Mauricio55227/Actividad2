/*
Actividad 1.- Crear un horario de usted de cualquier día de la semana 
y leer un valor de 1  al 24 validar e imprimir la acción que realiza en su horario.

Actividad 2.- Crear un metodo que determine si es el día es habil (lunes a viernes),
 y emitir un mensaje o en su caso emitir un mensaje que es fin de semana.

Actividad 3.- Crear un metodo que lea un valor entero del 1 al 12 valide el valor y 
nos diga en que trimestre del año nos encontramos 
 */
package actividad255227;
import java.util.Scanner;
      
/**
 *
 * @author BLANQUET
 */
public class Actividad255227 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("ACTIVIDAD 1: HORARIO");
        
        Scanner hora= new Scanner(System.in);
        System.out.println("Dime un hora del 1 al 24 para saber que hacer:");
        int horario = hora.nextInt();
        
        switch (horario){
            case 8:
                System.out.println("Despertar y sacar a pasear a los perros");
                break;
            case 9:
                System.out.println("Entrar a clase de Calculo Integral");
                break;
            case 10:
                System.out.println("Desayunar");
                break;
            case 11, 12:
                System.out.println("Entrar a clase de Ingles");
                break;
            case 13,14,15:
                System.out.println("Entrar a clas de organizacion");
                break;
            case 16:
                System.out.println("Almorzar");
                break;
            case 17, 18, 19:
                System.out.println("Realizar tareas o cursos");
                break;
            case 20, 21:
                System.out.println("Mirar television");
                break;
            case 22:
                System.out.println("Cenar");
                break;                
            case 23:
                System.out.println("Mirar videos en Youtube");
            break;
            default:
                System.out.println("Dormir");      
        }
        
        System.out.println("\n" +"ACTIVIDAD 2: ¿DIA HABIL O FIN DE SEMANA?");
        
        System.out.println("Determina el día de la semana:");
        Scanner dato = new Scanner(System.in);     
        String dia;
        dia = dato.nextLine();
        
        switch (dia) {
            case "Lunes", "lunes":
                System.out.println( dia + " es un día habil");
                break;
            case "Martes", "martes":
                System.out.println( dia + " es un día habil");
                break;
            case "Miercoles", "miercoles":
                System.out.println( dia + " es un día habil");
                break;
            case "Jueves", "jueves":
                System.out.println( dia + " es un día habil");
                break;
            case "Viernes", "viernes":
                System.out.println( dia + " es un día habil");
                break;
            default:
                System.out.println( dia + " no es un día habil");
        }
    System.out.println("\n" +"ACTIVIDAD 3: ¿En que trimestre estamos?");
        
        System.out.println("Ingrese numero del mes:");
        Scanner numero = new Scanner(System.in);
        int numeroMes;
        numeroMes = numero.nextInt();
        switch (numeroMes) {
            case 1,2,3:
                System.out.println("Estamos en el primer trimestre del año");
                break;
            case 4,5,6:
                System.out.println("Estamos en el segundo trimestre del año");
                break;
            case 7,8,9:
                System.out.println("Estamos en el tercer trimestre del año");
                break;
            case 10,11,12:
                System.out.println("Estamos en el primer trimestre del año");
                break;
            default:
                System.out.println("El numero supera el limite");
                System.out.println("\n" + "Hecho por Mauricio Blanquet");
         }        
    }  
}
