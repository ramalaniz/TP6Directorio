/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtp6;

/**
 *
 * @author rataq
 */

public class Escritorio extends javax.swing.JFrame {
    
    private static Directorio agenda = new Directorio();
    /**
     * Creates new form Escritorio
     */
    public Escritorio() {
        initComponents();
    }
    
    public static Directorio getDirectorio(){
        return agenda;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmDirectorio = new javax.swing.JMenu();
        jmiAgregarCliente = new javax.swing.JMenuItem();
        jmiBuscarCliente = new javax.swing.JMenuItem();
        jmiBorrarCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdEscritorio.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jmDirectorio.setText("Directorio");
        jmDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmDirectorioActionPerformed(evt);
            }
        });

        jmiAgregarCliente.setText("Agregar Cliente");
        jmiAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarClienteActionPerformed(evt);
            }
        });
        jmDirectorio.add(jmiAgregarCliente);

        jmiBuscarCliente.setText("Buscar Cliente");
        jmiBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarClienteActionPerformed(evt);
            }
        });
        jmDirectorio.add(jmiBuscarCliente);

        jmiBorrarCliente.setText("Borrar Cliente");
        jmiBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBorrarClienteActionPerformed(evt);
            }
        });
        jmDirectorio.add(jmiBorrarCliente);

        jMenuBar1.add(jmDirectorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarClienteActionPerformed
        // TODO add your handling code here:
        jdEscritorio.removeAll();
        jdEscritorio.repaint();        
        AgregarCliente cli= new AgregarCliente();
        cli.setVisible(true);
        jdEscritorio.add(cli);
    }//GEN-LAST:event_jmiAgregarClienteActionPerformed

    private void jmDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmDirectorioActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jmDirectorioActionPerformed

    private void jmiBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBorrarClienteActionPerformed
        // TODO add your handling code here:
        jdEscritorio.removeAll();
        jdEscritorio.repaint();        
        BorrarClientes cli= new BorrarClientes();
        cli.setVisible(true);
        jdEscritorio.add(cli);
    }//GEN-LAST:event_jmiBorrarClienteActionPerformed

    private void jmiBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarClienteActionPerformed
        // TODO add your handling code here:
        jdEscritorio.removeAll();
        jdEscritorio.repaint();        
        BuscarCliente cli= new BuscarCliente();
        cli.setVisible(true);
        jdEscritorio.add(cli);
    }//GEN-LAST:event_jmiBuscarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JMenu jmDirectorio;
    private javax.swing.JMenuItem jmiAgregarCliente;
    private javax.swing.JMenuItem jmiBorrarCliente;
    private javax.swing.JMenuItem jmiBuscarCliente;
    // End of variables declaration//GEN-END:variables
}