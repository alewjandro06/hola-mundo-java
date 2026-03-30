package condicionales;
import java.util.Scanner;
public class SistemaBecas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su promedio");
        double promedio = sc.nextDouble();
        System.out.println("Ingrese sus ingresos");
        int ingresos = sc.nextInt();
        if(promedio >= 9 && ingresos <300){
            System.out.println("FELICIDADES, BECA COMPLETA");
        }else if(promedio >= 8 && ingresos <500){
            System.out.println("USTED CUENTA CON MEDIA BECA");
        }else{
            System.out.println("USTED NO CUENTA CON BECA ASIGNADA");
        }

    }
}
