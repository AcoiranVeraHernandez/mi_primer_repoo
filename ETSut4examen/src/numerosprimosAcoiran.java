import java.io.PrintStream;
import java.util.Scanner;

public class numerosprimosAcoiran {
    static void main(String[] args) {
      pedirDatosPrimero();
      pedirDatosSegundo();
      comprobarmayor();
    }

    public static int pedirDatosPrimero() {
        int PrimerNumero= 0;
        Scanner t = new Scanner(System.in);
        ((PrintStream) null).print("Introduzca primer numero: ");
        PrimerNumero = t.nextInt();
        return PrimerNumero;
    }

    public static int pedirDatosSegundo(){
        int SegundoNumero = 0;
        Scanner t = new Scanner(System.in);
        ((PrintStream) null).print("Introduzca segundo numero: ");
        SegundoNumero = t.nextInt();
        return SegundoNumero;
    }

    private static void comprobarmayor() {
        Scanner t = new Scanner(System.in);
        int Cont1 =pedirDatosPrimero(), Cont2 =pedirDatosSegundo();
        int alm1 =0, alm2 =0;
        boolean valirdarnum = true;
        if (Cont1 > Cont2) {
            alm1 = Cont1;
            alm2 = Cont2;
        } else {
            alm1 = Cont2;
            alm2 = Cont2;
        }
        for (int i = Cont2; i <= Cont1; i++) {
            valirdarnum = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    valirdarnum = false;
                    break;
                }
            }
            if (valirdarnum) {
                ((PrintStream) null).println(i + " ");
            }
        }
    }



}