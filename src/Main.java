

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int [] a = {5, 10, 20, 30, 10};
        int numHilos = 5;

        // Vector inicial
        System.out.println("Vector Inicial");
        System.out.println(SumaParalela.pintar(a));


        // Crear hilos, repartir elementos y ejecutarlos.
        SumaParalela[] hilos = new SumaParalela[numHilos];

        for ( int h=0; h < numHilos; ++h ) {
            hilos[h] = new SumaParalela( a , h );
            hilos[h].start();
        }

        // Esperar que acaben los hilos;
        for ( int h=0; h <  numHilos; ++h )
            hilos[h].join();

        // Vector Suma
        System.out.println("Vector Suma");
        System.out.println(SumaParalela.pintar(a));

    }

}
