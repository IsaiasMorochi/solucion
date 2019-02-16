
public class SumaParalela extends Thread{

    private final int [] arreglo;
    private final int pos;

    public SumaParalela( int[] arreglo, int pos)
    {
        this.arreglo = arreglo;
        this.pos = pos;
    }

    @Override
    public void run()
    {
        int sumatoria = 0;
        for (int i =0; i <= arreglo[pos]; i++){
            sumatoria += i;
        }

        sumatoria += arreglo[pos];  // sumando el valor ya existente, a la sumatoria

        arreglo[pos] = sumatoria;  // registro en la misma posicion donde se obtuvo
    }


    public static String pintar(int arr[]){
        String pintar = "";
        for (int i = 0; i < arr.length; i++) {
            pintar += "" + arr[i] + " | ";
        }
        return pintar + "\n";
    }

}
