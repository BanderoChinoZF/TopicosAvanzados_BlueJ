import java.awt.*;
import java.awt.event.*;

public class java1332 extends Frame {
    Panel panel;

    public java1332() {
        // Estos son los botones que se van a marear
        Button botAceptar,botCancelar;

        // Este es el panel que contiene a todos los componentes
        panel = new Panel();
        panel.setBackground( Color.white );
        add( panel );

        // Se crean los objetos del GridBag y se le asigna este
        // layout al panel
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout gridbag = new GridBagLayout();
        panel.setLayout( gridbag );

        // Se indica que los componentes pueden rellenar la zona 
        // visible en cualquiera de las dos direcciones, vertical
        // u horizontal
        gbc.fill = GridBagConstraints.BOTH;
        // Se redimensionan las columnas y se mantiene su relación
        // de aspecto isgual en todo el proceso
        gbc.weightx = 1.0;
 
        // Se crea la etiqueta que va a servir de título al
        // panel
        Label labTitulo = new Label( "GridBag Layout" );
        labTitulo.setAlignment( Label.CENTER );
        // Se hace que el componente Label sea el único que se
        // sitúe en la línea que lo contiene
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        // Se pasan al layout tanto el componente Label, como
        // el objeto GridBagConstraints que modifica su
        // posicionamiento
        gridbag.setConstraints( labTitulo,gbc );
        // Finalmente se añade la etiqueta al panel. El objeto
        // GridBagConstraints de este contenedor pone la etiqueta
        // en una línea, la redimensiona para que ocupe toda la
        // fila de la tabla, tanto horizontal como verticalmente,
        // y hace que las columnas se redimensionen de la misma
        // forma cuando la ventana cambie de tamaño
        panel.add( labTitulo );

        // Ahora se crea uno de los campos de texto, en este
        // caso para recoger un supuesto nombre
        TextField txtNombre = new TextField( "Nombre:",25 );
        // Se hace que el campo de texto sea el siguiente objeto
        // después del último que haya en la fila. Esto significa 
        // que todavía se puede añadir uno o más componentes a
        // la fila, a continuación del campo de texto
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        // Se pasan al layout tanto el campo de texto, como
        // el objeto GridBagConstraints que modifica su
        // posicionamiento
        gridbag.setConstraints( txtNombre,gbc );
        // Se añade el campo de texto al panel
        panel.add( txtNombre );
 
        // Se crea otro campo de texto, en este caso para recoger
        // la direccion del propietario del nombre anterior
        TextField txtDireccion = new TextField( "Direccion:",25 );
        // Se hace que este campo de texto sea el último
        // componente que se sitúe en la fila en que se 
        // encuentre
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        // Se pasan al layout tanto el campo de texto, como
        // el objeto GridBagConstraints que modifica su
        // posicionamiento
        gridbag.setConstraints( txtDireccion,gbc );
        // Se añade el campo de texto al panel
        panel.add( txtDireccion );
 
        // Se crea un área de texto para introducir las cosas
        // que quiera el que esté utilizando el programa
        TextArea txtComent = new TextArea( 3,25 );
        txtComent.setEditable( true );
        txtComent.setText( "Comentarios:" );
        // Se pasan al layout tanto el área de texto, como
        // el objeto GridBagConstraints que modifica su
        // posicionamiento
        gridbag.setConstraints( txtComent,gbc );
        // Se añade el área de texto al panel
        panel.add( txtComent );
 
        // Estos son los dos botones de la parte inferior del
        // panel, sobre los que vamos a modificar las
        // propiedades del objeto GridBagConstraints que 
        // controla su posicionamiento dentro del panel, para
        // ir mostrando el comportamiento del conjunto ante
        // esos cambios
        botAceptar = new Button( "Aceptar" );
        botCancelar = new Button( "Cancelar" );
  
        // Hacemos que el botón "Aceptar" no sea el último
        // de la fila y que no pueda expandirse en ninguna
        // dirección
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        // Se pasan al layout el botón y el objeto 
        // GridBagConstraints
        gridbag.setConstraints( botAceptar,gbc );
        // Se añade el botón al panel
        panel.add( botAceptar );

        // Se hace que el botón "Cancelar" sea el último de
        // la fila en que se encuentre
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        // Se hace que su altura no se reescale
        gbc.gridheight = 1;
        // Se pasan al layout el botón y el objeto 
        // GridBagConstraints
        gridbag.setConstraints( botCancelar,gbc );
        // Se añade el botón al panel
        panel.add( botCancelar );
  
        // Se añade el receptor de eventos de la ventana
        // para acabar la ejecución
        addWindowListener( new WindowAdapter() {
            public void windowClosing( WindowEvent evt ) {
                System.exit( 0 );
                }
            } );
        }

    public static void main( String args[] ) {
        java1332 miFrame = new java1332();
        
        // Fijamos el título de la ventana y la hacemos 
        // visible, con los componentes en su interior
        miFrame.setTitle( "Tutorial de Java, AWT" );
        miFrame.pack();
        miFrame.setVisible( true );
        }
    }