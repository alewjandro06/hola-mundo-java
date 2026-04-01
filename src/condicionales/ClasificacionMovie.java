package condicionales;
import java.util.Scanner;
public class ClasificacionMovie{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese la categoria de la pelicula (G,PG,R)");
        String categoriaPeli = sc.next().toUpperCase();
        double precio = 0;
        boolean puedeEntrar = false;
        if(categoriaPeli.equals("G")){
            puedeEntrar = true;
            precio = 5;
        }else if(categoriaPeli.equals("PG")){
            if(edad >= 12){
                puedeEntrar = true;
                precio = 7;
            }else{
                System.out.println("Requiere ingresar con un acompañante");
            }
        }else if(categoriaPeli.equals("R")){
            if(edad  >= 18){
                puedeEntrar = true;
                precio = 10;
            }else{
                System.out.println("Acceso prohibido");
            }
        }else {
            System.out.println("Categoria invalida");
        }

        if (puedeEntrar && edad >= 65) {
            precio = precio * 0.5;
        }
        if (puedeEntrar) {
            System.out.println("Acceso permitido. Precio final: $" + precio);
        }
    }
}






