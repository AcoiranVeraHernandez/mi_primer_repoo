import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClindrosAcoiran {

    public static void main(String[] args) {
        pedirDatos();
    }

    public static void pedirDatos() {
        ArrayList<CallCilindro> datosCilindro = new ArrayList<>();
        String base = "", altura = "0", lateral ="0";
        Scanner input = new Scanner(System.in);
        try {
            base = JOptionPane.showInputDialog(null,"Introduzca la base");
            altura = JOptionPane.showInputDialog(null,"Introduzca la altura");
            lateral = JOptionPane.showInputDialog(null,"Introduzca la lateral");
        } catch (InputMismatchException e) {
            System.err.println("Error al intentar ingresar los datos");
        }
        CallCilindro awd = new CallCilindro(base, altura, lateral);
        CallCilindro.add(awd);
    }



    public static double calcularArea(int base, int altura, int lateral) {
        double area = base*altura*lateral;
        return area;
    }


}
