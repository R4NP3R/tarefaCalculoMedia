// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main (String args[]) {
        CalculaNota();
    }

    public static void CalculaNota(){
        int Nota1Bim = 8;
        int Nota2Bim = 7;
        int Nota3Bim = 4;
        int Nota4Bim = 10;

        double MediaGeral = (double) (Nota1Bim + Nota2Bim + Nota3Bim + Nota4Bim) / 4;

        System.out.println("Sua Média desse ano foi de " +  MediaGeral);

    }



}
