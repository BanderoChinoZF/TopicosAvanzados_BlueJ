import java.awt.*;
import java.awt.event.*;

public class EventosFrame
{
    Frame ventana;
    
    public void forma()
    {
        ventana = new Frame(); //Creamos una nueva ventana (JFrame)
        ventana.setTitle("Prueba de Eventos de Frame"); //Establecemos el nombre de la ventana
        ventana.setSize(200,400); //Asignamos el tamañano de la ventana en pixeles
        ventana.setBackground(new Color(100,200,1)); //Asignamos el color de fondo del JFrame
        ventana.setLayout(new FlowLayout()); //Alineamos los componentes en linea
        ventana.add(new Label("Hola")); //Agregamos una etiqueta al JFrame
        ventana.pack();
        ventana.setVisible(true);
        ManejoDeEventosFrame manejador = new ManejoDeEventosFrame();
        ventana.addWindowListener(manejador);
    }
}
