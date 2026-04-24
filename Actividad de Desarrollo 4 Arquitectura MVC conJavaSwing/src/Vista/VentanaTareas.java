package Vista;
import modelo.Tarea;
import javax.swing.*;
import java.awt.*;

public class VentanaTareas extends JFrame {
    public JTextField txTarea = new JTextField(20);
    public JButton btnAgregar = new JButton("Agregar");
    public DefaultListModel<Tarea> modeloLista = new DefaultListModel<>();
    public JList<Tarea> listaTarea = new JList<>(modeloLista);

    public JButton btnCompletada = new JButton("Marcar como completada");

    public VentanaTareas() {

    }
}
