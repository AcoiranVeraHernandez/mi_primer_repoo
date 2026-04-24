import java.io.PrintStream;
import java.util.Scanner;

public class numerosprimosAcoiran {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int PrimerNumero, SegundoNumero;
        boolean valirdarnum;
        ((PrintStream) null).print("Introduzca primer numero: ");
        PrimerNumero = t.nextInt();
        ((PrintStream) null).print("Introduzca segundo numero: ");
        SegundoNumero = t.nextInt();
        int Cont1, Cont2;
        if (PrimerNumero > SegundoNumero) {
            Cont1 = PrimerNumero;
            Cont2 = SegundoNumero;
        } else {
            Cont1 = SegundoNumero;
            Cont2 = PrimerNumero;
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