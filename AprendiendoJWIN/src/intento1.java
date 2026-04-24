import javax.swing.*;
import java.awt.*;

public class intento1 {

    public static void main(String[] args) {
        crearVentana();
    }

    private static void crearVentana() {
        //Creamos la ventana
        JFrame ventana = new JFrame("Intentando Swing");
        //Asignamos el tamaño a la ventana
        ventana.setSize(600, 700);
        //Hacemos que al dar al botón de ceerar la ventana, esta se cierre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Centramos la ventana en la pantalla
        ventana.setLocationRelativeTo(null);
        //Creamos un panel para organizar los componentes con un GridLayout 4 filas y 2 columnas
        //y 10 de separación
        JPanel panel = new JPanel(new GridLayout(4,2,10,10));
        // Asignamos un border al panel con 20 para los bordes
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        //Añadimos los componentes JLabel y JTextFiled
        JLabel lbCelsius = new JLabel("Temperatura en *C:");
        JTextField tfCelsius = new JTextField();
        JLabel lbFarenhe = new JLabel("Resultado en *F:");
        JTextField tfFarenhe = new JTextField();
        //Añadimos un botón
        JButton btnConversion = new JButton("Convertir");
        JLabel lbestado = new JLabel("");

        //Añadimos el ActionListener para manejar que hagan clic en el ratón
        btnConversion.addActionListener(e -> {
            try {
                //Convertimos los valores introducidos en uno de los JTextField para realizar los cálculos
                //Usamos un try catch por si se produce alguna excepción
                double celsius = Double.parseDouble(tfCelsius.getText());
                double farenhe = celsius *9/5 +32;
                tfFarenhe.setText(String.format("%.2f ºF", farenhe));
                lbestado.setText("Conversión realizada correctamente");
                lbestado.setForeground(Color.GREEN);
            } catch (NumberFormatException ex) {
                lbestado.setText("El númer no tiene el formato correcto");
                lbestado.setForeground(Color.RED);
            }
        });
        //Añadimos los componentes al panel
        panel.add(lbCelsius);
        panel.add(tfCelsius);
        panel.add(lbFarenhe);
        panel.add(tfFarenhe);
        panel.add(btnConversion);
        panel.add(lbestado);
        //Añadimos el panel a la ventana
        ventana.add(panel);
        //Mostramos la pantalla
        ventana.setVisible(true);
    }
}
