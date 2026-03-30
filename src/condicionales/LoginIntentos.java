package condicionales;
import java.util.Scanner;
public class LoginIntentos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        while(intentos > 0){
            System.out.println("Ingrese su usuario");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña");
            String contraseña = sc.nextLine();
            if(usuario.equals("ADMIN2006") && contraseña.equals("BEJUCO1234")){
                System.out.println("SUS CREDENCIALES SON CORRECTAS");
            break;
            }else{
                System.out.println("Intento fallido, intentelo de nuevo" + intentos);
            }
        }
        if(intentos == 0){
            System.out. println("ACCESO DENEGADO");
        }
    }


}
