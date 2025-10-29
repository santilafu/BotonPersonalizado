package main;

// Clase principal para probar el botón personalizado
// Aquí podríamos crear una ventana de prueba que utilice el BotonPersonalizado
// Importar las librerías necesarias
import javax.swing.*;
import Componentes.BotonPersonalizado;
import java.awt.*;
public class main {
    public static void main(String[] args) {

        //Creamos la ventana principal
        JFrame ventana = new JFrame("Botón Personalizado");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar la aplicación al cerrar la ventana
        ventana.setSize(400, 300);//Tamaño de la ventana
        ventana.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 100));//Distribución de los componentes en la ventana
        ventana.getContentPane().setBackground(new Color(166, 160, 166, 234)); // Color de fondo de la ventana

        // Añadimos el boton personalizado a la ventana
        BotonPersonalizado boton = new BotonPersonalizado("Gana tu premio pulsando aquí");
        ventana.add(boton);

        // Mostramos la ventana
        ventana.setVisible(true);//Hacer visible la ventana
        ventana.setLocationRelativeTo(null);//Centrar la ventana en la pantalla
    }
}
