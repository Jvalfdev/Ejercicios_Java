//Programa que introduciendo peso y altura te dice el IMC y diagnóstico
package masacorporal;
import java.util.Locale;
import java.util.Scanner;


public class masacorporal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);//Se usa esta línea para poder usar punto '.' en lugar de comas ',' al introducir altura o peso

        System.out.println("Introduce tu altura");
        float alt = input.nextFloat();
        System.out.println("Introduce tu peso");
        float peso = input.nextFloat();
        float imc = peso/(alt*alt);
        System.out.println("IMC: "+imc);

        if (imc<16){
            System.out.println("Criterio de ingreso en hospital");

        }
        else if (imc<17){
            System.out.println("Infrapeso");
        }
        else if (imc<18){
            System.out.println("Bajo Peso");
        }
        else if (imc<25){
            System.out.println("Peso normal");
        }
        else if (imc<30){
            System.out.println("Obesidad grado 1");
        }
        else if (imc<35){
            System.out.println("Obesidad grado 2");
        }
        else if (imc<40){
            System.out.println("Obesidad grado 3");
        }
        else 
            System.out.println("Obesidad grado 5");       
        


        input.close();


    }
    
    
}
