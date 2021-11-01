package Template;

public class AlgoritmoImagen extends KNN{

    @Override
    public void step1() {
        System.out.println("Procesando imagen...");
    }

    @Override
    public void step2() {
        System.out.println("Puntuando imagen...");
    }

    public boolean step5(){
        System.out.println("Validando es imagen...");
        return true;
    }
}
