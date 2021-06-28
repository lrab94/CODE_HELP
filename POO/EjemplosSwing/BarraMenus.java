/**
*
* @author  Aguilar Bernal Luis Raul
* @version 1.0
* @since   2019/15/9
* 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Contenido de la barra
public class BarraMenus extends JFrame {

   JMenuBar barraMenus = new JMenuBar();

   JMenu menuArchivo = new JMenu( "Archivo" );
   JMenuItem menuItemAbrir = new JMenuItem( "Abrir" );
   JMenuItem menuItemGuardar = new JMenuItem( "Guardar" );
   JSeparator separador = new JSeparator();
   JMenuItem menuItemSalir = new JMenuItem( "Salir" );

   JMenu menuEdicion = new JMenu( "Edicion" );
   JMenu menuColores = new JMenu( "Colores" );
   JMenuItem menuItemRojo = new JMenuItem( "Rojo" );
   JMenuItem menuItemVerde = new JMenuItem( "Verde" );
   JMenuItem menuItemAzul = new JMenuItem( "Azul" );

   JMenu menuInsertar = new JMenu( "Insertar" );
    
   public BarraMenus() {
      super( "Barra de Menus" );
      ventana();
   } // fin-constructor

   // Contenido de la ventana
   public void ventana() {

      menuArchivo.add( menuItemAbrir );
      menuArchivo.add( menuItemGuardar );
      menuArchivo.add( separador );
      menuArchivo.add( menuItemSalir );
      menuItemRojo.addActionListener( new ActionListener() {
         public void actionPerformed( ActionEvent evt ) {
            colorea( Color.RED );
         }// fin-actionPerformed
      } );// fin-addActionListener

      menuItemVerde.addActionListener( new ActionListener() {
         public void actionPerformed( ActionEvent evt ) {
            colorea( Color.GREEN );
         }// fin-actionPerformed
      } );// fin-addActionListener

      menuItemAzul.addActionListener( new ActionListener() {
         public void actionPerformed( ActionEvent evt ) {
            colorea( Color.BLUE );
         }// fin-actionPerformed
      } );// fin-addActionListener
      
      menuColores.add( menuItemRojo );
      menuColores.add( menuItemVerde );
      menuColores.add( menuItemAzul );
      menuEdicion.add( menuColores );
      barraMenus.add( menuArchivo );
      barraMenus.add( menuEdicion );
      barraMenus.add( menuInsertar );
      this.setJMenuBar( barraMenus );

   } // fin-ventana

   // Colorea el fondo de la venta dependidendo de la eleccion
   private void colorea( Color colorFondo ) {

      this.getContentPane().setBackground( colorFondo );

   } // fin-colorea

   // Metodo main
   public static void main(String[] args) {
        
      BarraMenus ventana = new BarraMenus();
      ventana.setSize(450, 350);
      ventana.setDefaultCloseOperation( EXIT_ON_CLOSE );
      ventana.setVisible( true );

   } // fin-main
} // fin-clase