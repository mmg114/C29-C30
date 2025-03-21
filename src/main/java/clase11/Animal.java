package clase11;

public interface Animal {

    void haceSonido();
    default void dormir(){
        System.out.println("ZzZ...");
    }
}
