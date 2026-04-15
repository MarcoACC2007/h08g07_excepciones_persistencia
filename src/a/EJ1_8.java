package a;

public class EJ1_8 {
        public static void validarContraseña(String contraseña) throws ContraseñaDebil{ //Vamos a probar la excepcion con una clase que pida una contraseña, y si es demasiado corta detectará que es debil.
            if (contraseña.length() < 6) {
                throw new ContraseñaDebil("Contraseña demasiado corta");
            }
            System.out.println("Contraseña registrada");
        }

        public static void cargar(){
            try{
                System.out.println("Ejemplo 1.8");
                validarContraseña("Hola123"); //Constraseña válida.
                validarContraseña("S92f"); //Contraseña inválida.
            }
            catch (ContraseñaDebil ex){
                ex.printStackTrace();
            }

            finally {
                System.out.println("Fin ejemplo 1.8");
            }
        }
    }
