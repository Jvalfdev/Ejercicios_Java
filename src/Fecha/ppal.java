package Fecha;
import java.util.Scanner;

public class ppal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int d, m, a;
        System.out.println("Introduce el día");
        d = input.nextInt();
        System.out.println("Introduce el mes");
        m = input.nextInt();
        System.out.println("Introduce el año");
        a = input.nextInt();

        fecha mostrar = new fecha(d, m, a);

        if(mostrar.fechaBien()){
            System.out.println("La fecha es: " + mostrar);
        }
        else
        System.out.println("Fecha invalida");
        input.close();


    }
    
}

