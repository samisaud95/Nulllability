//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice
// dove si cattura l'eventuale eccezione.

public class Main {
    public static void main(String[] args) {
        Integer numeratore = 7;
        Integer denominatore =9;
        System.out.println(controllo(numeratore,denominatore));
    }

    public static int controllo(int numeratore, int denominatore) {
    int result= 0;
    try {
        result=numeratore/ denominatore;
    }catch (NullPointerException e) {
        System.out.println(e);
    }
    return result;
    }
}
