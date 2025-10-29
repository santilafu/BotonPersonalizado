package Componentes;/* Vamos a crear un botón personalizado que pueda ser reutilizable
y se pueda añadir en cualquier ventana de Java Swing.
*/

// Importamos las librerías necesarias
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Creamos la clase Componentes.BotonPersonalizado que extiende JButton para personalizar su apariencia y comportamiento
public class BotonPersonalizado extends JButton {

    private Color colorBase = new Color(30, 144, 255); // Color azul personalizado
    private Color colorHover = new Color(65, 105, 225); // Color azul más oscuro para el hover
    private Color colorPresionado = new Color(25, 25, 112); // Color azul aún más oscuro para el estado presionado

    // Constructor del botón
    public BotonPersonalizado(String texto) {

        super(texto); // Llamamos al constructor de la clase padre JButton con el texto del botón
        setFont(new Font("Arial", Font.BOLD, 18));
        setForeground(Color.WHITE); // Color del texto
        setBackground(colorBase); // Color base del botón
        setFocusPainted(false); // Sin borde de enfoque al hacer clic
        setBorderPainted(false); // Sin borde visible
        setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cursor de mano al pasar por encima
        setOpaque(true); // Hace visible el color de fondo

        // Agregamos interactividad al botón con un MouseListener
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(colorHover); // Cambia el color al pasar el ratón
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(colorBase); // Vuelve al color original
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(colorPresionado); // Cambia al color de clic
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(colorHover); // Regresa al hover tras soltar
            }
        });
    }
}
