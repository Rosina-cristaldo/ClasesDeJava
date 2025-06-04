package TalentLab.Clase2;

public class EstructurasDeControl {
    public static void main(String[] args) {
        String rol = "user1";

        if(rol == "admin"){
            System.out.println("Puedes ingresar a cualquier parte del sistema");
        }

        if(rol == "admin"){
            System.out.println("Puedes ingresar a cualquier parte del sistema");
        }
        else {
            System.out.printf("Tienes que esperar que te asignen un rol");
        }

        if(rol == "admin"){
            System.out.println("Puedes ingresar a cualquier parte del sistema");
        }
        else if(rol == "invitado") {
            System.out.println("Solo puedes acceder como visitante");
        }else {
            System.out.println("Tienes que esperar a que te asignen un rol");
        }
        System.out.println("Final del programa");
    }
}

