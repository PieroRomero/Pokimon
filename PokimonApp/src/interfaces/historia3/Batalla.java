package interfaces.historia3;

import entidades.*;
import interfaces.historia1.*;
import interfaces.historia2.*;
import javax.swing.JOptionPane;

public class Batalla extends javax.swing.JFrame 
{
    String nuestroTipo = null;
    String rivalImagen = null;
    String nuestroEspecie = null;
    int vidaMaximaNuestra = 45;
    int vidaMaximaRival = 45;
    int vidaActualNuestra = 45;
    int vidaActualRival = 45;
    String miFoto = null;
    String rivalEspecie = null;
    String rivalTipo = null;
    
    Entrenador adversario = new Entrenador();
    
    PokemonBatalla nuestro = new PokemonBatalla(nuestroEspecie, nuestroTipo, vidaMaximaNuestra, vidaActualNuestra, 5);
    PokemonBatalla rival = new PokemonBatalla(rivalEspecie, rivalTipo, vidaMaximaRival, vidaActualRival, 5);
    
    public Batalla() 
    {
        initComponents();
        Cargando();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNuestroPokimonImagen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelRivalPokimonNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRivalHealth = new javax.swing.JProgressBar();
        jRivalVidaAct = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRivalVidaMax = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNuestroPokimonNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jOurHealth = new javax.swing.JProgressBar();
        jNuestroVidaAct = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jNuestroVidaMax = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabelRivalPokimonImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelEntrenador = new javax.swing.JLabel();
        jLabelRival = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabelNuestroPokimonImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 230));

        jLabelRivalPokimonNombre.setText("Pokimon enemigo");

        jLabel3.setText("Lv 5");

        jRivalHealth.setForeground(new java.awt.Color(102, 255, 102));
        jRivalHealth.setMaximum(45);

        jRivalVidaAct.setText("jLabel7");

        jLabel8.setText("/");

        jRivalVidaMax.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelRivalPokimonNombre)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17))
                            .addComponent(jRivalHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jRivalVidaAct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRivalVidaMax)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRivalPokimonNombre)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jRivalHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRivalVidaAct)
                    .addComponent(jLabel8)
                    .addComponent(jRivalVidaMax))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 280, 130));

        jLabelNuestroPokimonNombre.setText("NuestroPokimon");

        jLabel2.setText("Lv 5");

        jOurHealth.setForeground(new java.awt.Color(102, 255, 102));
        jOurHealth.setMaximum(45);
        jOurHealth.setToolTipText("");

        jNuestroVidaAct.setText("jLabel4");

        jLabel5.setText("/");

        jNuestroVidaMax.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNuestroPokimonNombre)
                            .addGap(42, 42, 42)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jOurHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jNuestroVidaAct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jNuestroVidaMax)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNuestroPokimonNombre)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jOurHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNuestroVidaAct)
                    .addComponent(jLabel5)
                    .addComponent(jNuestroVidaMax))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 290, 130));

        jButton1.setText("Atacar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 90, 30));

        jButton2.setText("Usar Posión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 100, 30));

        jButton3.setText("Rendirse");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 100, 30));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 110, 30));
        getContentPane().add(jLabelRivalPokimonImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 230, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historia3/CAMPODEBATALLA.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 480, 210));
        getContentPane().add(jLabelEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 230, 210));

        jLabelRival.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historia3/Rival.gif"))); // NOI18N
        getContentPane().add(jLabelRival, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 240, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (rival.getSalud() <= 0)
        {
            this.setEnabled(false);
        }
        else
        {
            LanzarAtaque();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UsarPosion();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Cargando()
    {
        jLabelNuestroPokimonImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(ElecciondePokimon.imagen)));
        nuestroTipo = ElecciondePokimon.tipoPokimon;
        System.out.println(nuestroTipo);
        nuestroEspecie = ElecciondePokimon.especie;
        
        Pokimon inicial = new Pokimon(nuestroEspecie, nuestroTipo);
        vidaMaximaNuestra = inicial.getVidaMax();
        jNuestroVidaMax.setText("" + vidaMaximaNuestra);
        vidaMaximaRival = inicial.getVidaMax();
        jRivalVidaMax.setText("" + vidaMaximaRival);
        vidaActualNuestra = vidaMaximaNuestra;
        vidaActualRival = vidaMaximaRival;
        jNuestroVidaAct.setText("" + vidaActualNuestra);
        jRivalVidaAct.setText("" + vidaActualRival);
        
        miFoto = Presentacion.imagenEntrenador;
        jLabelEntrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource(miFoto)));
 
        if (nuestroTipo == "Fuego")
        {
            rivalImagen = "/imagenes/historia2/AGUA.png";
            jLabelRivalPokimonNombre.setText("Zquirtle");
            rivalEspecie = "Zquirtle";
            rivalTipo = "Agua";
        }
        else if (nuestroTipo == "Hierba")
        {
            rivalImagen = "/imagenes/historia2/FUEGO.jpg";
            jLabelRivalPokimonNombre.setText("Sharmander");
            rivalEspecie = "Sharmander";
            rivalTipo = "Fuego";
        }
        else if (nuestroTipo == "Agua")
        {
            rivalImagen = "/imagenes/historia2/HIERBA.jpg";
            jLabelRivalPokimonNombre.setText("Bulbazaur");
            rivalEspecie = "Bulbazaur";
            rivalTipo = "Hierba";
        }
        System.out.println(rivalImagen);
        jLabelRivalPokimonImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(rivalImagen)));
        
        jLabelNuestroPokimonNombre.setText(PokimonCustom.pokimonName);
    }
    
        public void LanzarAtaque()
        {

            nuestro.Atacar(nuestro, rival);
            System.out.println(rival.getSalud());;
            jRivalHealth.setValue(rival.getSalud());

            if (rival.getSalud() < 0)
            {
                jRivalVidaAct.setText("" + 0);
                JOptionPane.showMessageDialog(null, "El oponente ya no puede continuar. \n Usted gana");
            }
            else
            {
                jRivalVidaAct.setText("" + rival.getSalud());
            }
            RespuestaEnemiga();
            System.out.println(nuestro.getSalud());;
            jNuestroVidaAct.setText("");
            jOurHealth.setValue(nuestro.getSalud());
        }
        
        public void UsarPosion()
        {
            nuestro.Curar();
            jNuestroVidaAct.setText("");
            jOurHealth.setValue(nuestro.getSalud());
            RespuestaEnemiga();
        }
        
        public int randomConRango(int min, int max)
        {
           int range = (max - min) + 1;     
           return (int)(Math.random() * range) + min;
        }    
        
        public void RespuestaEnemiga()
        {
            int ran = randomConRango(1, 4);
            switch(ran) 
            {
                case 1:
                    rival.Curar();
                    
                    break;
                case 2:
                    rival.Atacar(rival, nuestro);
                    break;
                case 3:
                    rival.Atacar(rival, nuestro);
                    break;    
                case 4:
                    rival.Atacar(rival, nuestro);
                    break;
                default: 
                    System.out.println("ERROR");
                    
            }
            
            jRivalVidaAct.setText("");
            jRivalHealth.setValue(rival.getSalud());          
        }
        
        
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Batalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelEntrenador;
    private javax.swing.JLabel jLabelNuestroPokimonImagen;
    private javax.swing.JLabel jLabelNuestroPokimonNombre;
    private javax.swing.JLabel jLabelRival;
    private javax.swing.JLabel jLabelRivalPokimonImagen;
    private javax.swing.JLabel jLabelRivalPokimonNombre;
    private javax.swing.JLabel jNuestroVidaAct;
    private javax.swing.JLabel jNuestroVidaMax;
    private javax.swing.JProgressBar jOurHealth;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jRivalHealth;
    private javax.swing.JLabel jRivalVidaAct;
    private javax.swing.JLabel jRivalVidaMax;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
