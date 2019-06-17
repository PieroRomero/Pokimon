
package interfaces.historia2;

import entidades.*;
import interfaces.historia1.*;
import interfaces.historia3.Batalla;

public class PresentacionDelRival extends javax.swing.JFrame {
    
    Entrenador tu = new Entrenador();
    String sexo = null;
    String nombre;
    String nombreRival = "Garu";
        
    Entrenador rival = new Entrenador();
    
    public PresentacionDelRival() {
        initComponents();
        ImagenEntrenador();
        
        nombre = DisenoDePersonaje.jTextField1.getText();
        sexo = tu.getSexo();
        jNombreEntrenador.setText(nombre);
        System.out.println(nombre);

        jNombreRival.setText(nombreRival);
    }


    
    public void ImagenEntrenador()
    {
        sexo = tu.getSexo();
        if (sexo == "man")
        {
            tu.setImagen("/imagenes/historia1/entrenador.png");
        }
        else if (sexo == "woman")
        {
            tu.setImagen("/imagenes/historia1/entrenadora.png");

        }
        jLabelEntrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource(tu.getImagen())));
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabelEntrenador = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jNombreRival = new javax.swing.JLabel();
        jNombreEntrenador = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historia2/ProfesorOak_1.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 270, 190));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historia2/Rival_1.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 200));

        jTextField2.setEditable(false);
        jTextField2.setText("Hola yo soy Garu ,espero que sepas jugar bien ¡NOVATO!");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 290, 30));
        getContentPane().add(jLabelEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 250, 210));

        jTextField3.setEditable(false);
        jTextField3.setText("JAAAA¡ lo mismo digo Garu , yo vengo a demostrar que soy imparable");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 350, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Bien ahora que tienes todo listo , te presentare a tu primer rival\nGaru , ¡Que gane el mejor!");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 620, 160));

        jLabel3.setText("Profesor Ouk");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, -1, -1));

        jNombreRival.setText("jLabel4");
        getContentPane().add(jNombreRival, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        jNombreEntrenador.setText("NombreEntrenador");
        getContentPane().add(jNombreEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("CONTINUAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
   
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Batalla next = new Batalla();
        next.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresentacionDelRival().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEntrenador;
    private javax.swing.JLabel jNombreEntrenador;
    private javax.swing.JLabel jNombreRival;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
