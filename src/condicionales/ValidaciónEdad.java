package condicionales;
import java.util.Scanner;
public class ValidaciónEdad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        if(edad < 18){
            System.out.println("Usted es menor de edad");
        }else if(edad >= 18 && edad <= 64){
            System.out.println("Usted es un adulto");
        }else{
            System.out.println("Usted es un adulto mayor");
        }
    }
}
