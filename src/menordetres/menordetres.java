//Programa que al darle tres números te dice cual de ellos es el menor.
package menordetres;
import java.util.*; 

public class menordetres {
    public static void main(String[] args){
        

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int a = input.nextInt();
        System.out.println("Introduce el segundo número");
        int b = input.nextInt();
        System.out.println("Introduce el tercer número");
        int c = input.nextInt();

        if (a < b){
            if (a < c){
                System.out.println("El número más pequeño es: " + a);
            }
            else{
                System.out.println("El número más pequeño es: " + c);
            }
        }
        else{
            System.out.println("El número más pequeño es: " + b);
        }
        input.close();

        

    }
}