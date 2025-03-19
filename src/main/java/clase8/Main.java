package clase8;


import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("Iniciando la aplicación...");
        logger.warning("Esto es una advertencia.");
        logger.severe("¡Algo salió mal!");
    }
}