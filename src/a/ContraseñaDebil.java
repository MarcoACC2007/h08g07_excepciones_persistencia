package a;

public class ContraseñaDebil extends Exception { //Esta será la excepcion que usaremos cuando la contraseña no sea segura
    public ContraseñaDebil(String message) {
        super(message);
    }

}
