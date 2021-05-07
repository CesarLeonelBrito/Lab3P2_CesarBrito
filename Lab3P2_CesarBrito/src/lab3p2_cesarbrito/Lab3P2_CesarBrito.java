package lab3p2_cesarbrito;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_CesarBrito {

    public static void main(String[] args) {

        ArrayList<Tienda> tiendas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String usernameAdmin = "admin";
        String passwordAdmin = "1234";
        System.out.print("Ingrese su usuario: ");
        String usernameInput = sc.next();
        System.out.print("Ingrese su contraseña: ");
        String passwordInput = sc.next();
        while (!usernameInput.equals(usernameAdmin) && !passwordInput.equals(passwordAdmin)) {
            System.out.println("***USUARIO INCORRECTO***");
            System.out.print("Ingrese su usuario: ");
            usernameInput = sc.next();
            System.out.print("Ingrese su contraseña: ");
            passwordInput = sc.next();
        }
        if (usernameInput.equals(usernameAdmin) && passwordInput.equals(passwordAdmin)) {
            System.out.println("***USUARIO CORRECTO***");
        }
    }

}
