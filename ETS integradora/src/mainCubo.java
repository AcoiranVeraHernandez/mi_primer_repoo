import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainCubo {

    public static void main(String[] args) {
        pedircubos();
  //  calcularAreaBase();
  //  calcularVolumen();


    }

    public static void pedircubos(){
        Scanner sc = new Scanner(System.in);
        int ncubos = 3;
        ArrayList<cubo> cubos = new ArrayList<>();
        for (int i = 1; i <= ncubos; i++) {

            try {
              int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el lado del cubo número " +i));
              JOptionPane.showMessageDialog(null, "El área del cubo " +i +" es: " + lado*lado);
            } catch(InputMismatchException e){
                JOptionPane.showInputDialog("Introduzca un número correctamente");
            }

        }
    }

    public static int calcularAreaBase() {
        Scanner sc = new Scanner(System.in);
        int base = 0, areabase=0;
        JOptionPane.showInputDialog("Vamos a calcular el Area base");
        try {
            JOptionPane.showInputDialog("Introduzca el valor de la base", 0);
            base = sc.nextInt();
        } catch (InputMismatchException e) {
            JOptionPane.showInputDialog("Introduzca un valor numérico correcto para la base");
        }
       areabase = base * base;

        JOptionPane.showMessageDialog(null, "El Area base es: " + areabase);
        return areabase;
    }

    public static int calcularVolumen() {
    int volumencubo = 0;
    volumencubo = calcularAreaBase() * calcularAreaBase();
    return volumencubo;

    }
}
