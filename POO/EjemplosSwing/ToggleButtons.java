/**
*
* @author  Aguilar Bernal Luis Raul
* @version 1.0
* @since   2019/15/9
* 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase principal ToggleButtons
public class ToggleButtons extends JFrame {

    JLabel etiPrecioBase = new JLabel( "Precio Base" );
    JTextField txtPrecioBase = new JTextField();
    JButton btnCalcular = new JButton( "Calcular" );
    JLabel etiTotal = new JLabel();
    JToggleButton tbtnInstalacion = new JToggleButton( "Instalacion" );
    JToggleButton tbtnFormacion = new JToggleButton( "Formacion" );
    JToggleButton tbtnAlimentacionBD = new JToggleButton( "Alimentacion BD" );
    JLabel etiPrecioInstalacion = new JLabel( "40" );
    JLabel etiPrecioFormacion = new JLabel( "200" );
    JLabel etiPrecioAlimentacionBD = new JLabel( "200" );

    public ToggleButtons() {

        super( "Toggle Buttons" );
        ventana();

    } // fin-constructor

    public void ventana() {

        this.getContentPane().setLayout( null );

        etiPrecioBase.setBounds( 20, 10, 100, 20 );
        this.getContentPane().add( etiPrecioBase );

        txtPrecioBase.setBounds( 20, 35, 150, 25 );
        this.getContentPane().add( txtPrecioBase );

        btnCalcular.addActionListener(new ActionListener() {

            public void actionPerformed( ActionEvent evt ) {

                double precio_base = 0.0;
                double precio_instal = 0.0;
                double precio_for = 0.0;
                double precio_ali = 0.0;
                
                double precio_total = 0.0;
                
                precio_base = Double.parseDouble( txtPrecioBase.getText() );
                precio_instal = Double.parseDouble( etiPrecioInstalacion.getText() );
                precio_for = Double.parseDouble( etiPrecioFormacion.getText() );
                precio_ali = Double.parseDouble( etiPrecioAlimentacionBD.getText() );
                
                precio_total = precio_base;
                
                if ( tbtnInstalacion.isSelected() )   precio_total = precio_total + precio_instal;
                if ( tbtnFormacion.isSelected() )     precio_total = precio_total + precio_for;
                if ( tbtnAlimentacionBD.isSelected() )   precio_total = precio_total + precio_ali;
                    
                etiTotal.setText( " $" + precio_total );

            } // fin-actionPerformed

        });
        btnCalcular.setBounds( 20, 255, 150, 25 );
        this.getContentPane().add( btnCalcular );

        tbtnInstalacion.setBounds( 20, 85, 150, 25 );
        tbtnInstalacion.setSelected( true );
        this.getContentPane().add( tbtnInstalacion );
        
        tbtnFormacion.setBounds( 20, 125, 150, 25 );
        this.getContentPane().add( tbtnFormacion );

        tbtnAlimentacionBD.setBounds( 20, 170, 150, 25 );
        this.getContentPane().add( tbtnAlimentacionBD );

        etiPrecioInstalacion.setBounds( 180, 85, 50, 25 );
        this.getContentPane().add( etiPrecioInstalacion );

        etiPrecioFormacion.setBounds( 180, 125, 50, 25 );
        this.getContentPane().add( etiPrecioFormacion );

        etiPrecioAlimentacionBD.setBounds( 180, 170, 50, 25 );
        this.getContentPane().add( etiPrecioAlimentacionBD );

        etiTotal.setFont( new Font( "Arial", 0, 18 ) );
        etiTotal.setBorder( BorderFactory.createLineBorder( new Color(0, 0, 0) ) );
        etiTotal.setBounds( 20, 290, 150, 50 );
        this.getContentPane().add( etiTotal );

    } // fin-ventana

    public static void main(String[] args) {
        
        ToggleButtons ventana = new ToggleButtons();
        ventana.setSize( 240, 400 );
        ventana.setDefaultCloseOperation( EXIT_ON_CLOSE );
        ventana.setVisible( true );

    } // fin-main
} // fin-class

