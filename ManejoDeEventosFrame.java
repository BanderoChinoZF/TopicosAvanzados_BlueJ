import java.awt.*;
import java.awt.event.*;

class ManejoDeEventosFrame extends WindowAdapter
{
    Frame ventana;
    public void windowActivated( WindowEvent evento)
    {
        System.out.println("Ventana activada");
    }
    
    public void windowClosed( WindowEvent evento) {
        System.out.println("Ventana desactivada");
    }

    public void windowClosing(WindowEvent evento){
        System.out.println("Cerrando Ventana");
        
        if (evento.getSource() == ventana)
        {
            System.out.println("Cerrando ventana");
            ventana.setVisible(false);
            ventana.dispose();
        }
    }
    
    public void windowDeactivated( WindowEvent evento)
    {
        System.out.println("Ventana desactivada");
    }
    
    public void windowDeiconified (WindowEvent evento)
    {
        System.out.println("Ventana maximizada");
    }
    
    public void windowIconified( WindowEvent evento)
    {
        System.out.println("Ventana minimizada");
    }
    
    public void windowOpened( WindowEvent evento)
    {
        System.out.println("Ventana abierta por primera vez");
    }
}
