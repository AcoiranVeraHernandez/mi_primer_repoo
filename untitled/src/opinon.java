import javax.swing.*;

public class opinon {

    public class Piramide {

        public static boolean esentero(String altura) {
            String al = "";
            for (int i=0; i<al.length(); i++) {
                if (Character.isDigit(al.charAt(i))==false)
                    return false;
            }
            return true;
        }
        public static void main(String[] args) {
            int h=0, b=0;
            String altura, base;
            double volumen;
            do {
                altura = JOptionPane.showInputDialog(null, "Inserta el valor de la altura");
                base = JOptionPane.showInputDialog(null,"Inserta el valor de la base: ");
            } while ((!esentero(altura) && (!esentero(base))));
            h = Integer.parseInt(altura);
            b = Integer.parseInt(base);
            volumen=(double)((h/3+b));
            String vol = ""+volumen;
            JOptionPane.showMessageDialog(null, "El volumen es: "+altura);
        }
    }
}
