package Template;

public class DemoKNN {
    public static void main(String[] args){

        AlgoritmoImagen algoritmoImagen = new AlgoritmoImagen();
        algoritmoImagen.templateMethod();

        System.out.println("---------------------------------------");

        AlgoritmoSpam algoritmoSpam = new AlgoritmoSpam();
        algoritmoSpam.templateMethod();
    }
}
