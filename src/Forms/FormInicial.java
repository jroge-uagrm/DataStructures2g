/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Negocio.Lista;
import Negocio.TagMultiGraph;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javafx.scene.layout.Pane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class FormInicial extends javax.swing.JFrame {

    /**
     * Creates new form FormInicial
     */
    private TagMultiGraph listaDeCiudades;
    private String accion;
    private String ciudadSeleccionadaEnComboOrigen, ciudadSeleccionadaEnComboDestino;

    public FormInicial() {
        initComponents();
        listaDeCiudades = new TagMultiGraph();
        deshabilitarHabilitar(false);
        ciudadOrigen.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String ciudadSeleccionadaAurita = e.getItem().toString();
                    ciudadSeleccionadaEnComboOrigen = ciudadSeleccionadaAurita;
                    if (ciudadSeleccionadaAurita.equals(ciudadSeleccionadaEnComboDestino)) {
                        accion = "ERROR";
                    } else {
                        accion = "confirmarRuta";
                    }
                }
            }
        });
        ciudadDestino.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String ciudadSeleccionadaAurita = e.getItem().toString();
                    ciudadSeleccionadaEnComboDestino = ciudadSeleccionadaAurita;
                    if (ciudadSeleccionadaAurita.equals(ciudadSeleccionadaEnComboOrigen)) {
                        accion = "ERROR";
                    } else {
                        accion = "confirmarRuta";
                    }
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAñadirCiudad = new javax.swing.JButton();
        areaDibujo = new javax.swing.JPanel();
        btnAñadirRuta = new javax.swing.JButton();
        ciudadOrigen = new javax.swing.JComboBox<>();
        ciudadDestino = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCrearRuta = new javax.swing.JButton();
        inputKmRuta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCaminoMasCorto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAñadirCiudad.setText("Añadir Ciudad");
        btnAñadirCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCiudadActionPerformed(evt);
            }
        });

        areaDibujo.setBackground(new java.awt.Color(255, 255, 255));
        areaDibujo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaDibujoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout areaDibujoLayout = new javax.swing.GroupLayout(areaDibujo);
        areaDibujo.setLayout(areaDibujoLayout);
        areaDibujoLayout.setHorizontalGroup(
            areaDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
        );
        areaDibujoLayout.setVerticalGroup(
            areaDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnAñadirRuta.setText("Añadir Ruta");
        btnAñadirRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirRutaActionPerformed(evt);
            }
        });

        ciudadOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ciudadOrigenItemStateChanged(evt);
            }
        });
        ciudadOrigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ciudadOrigenMouseClicked(evt);
            }
        });

        jLabel1.setText("Ciudad Origen");

        jLabel2.setText("Ciudad Destino");

        btnCrearRuta.setText("Crear Ruta");
        btnCrearRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRutaActionPerformed(evt);
            }
        });

        jLabel3.setText("Long. Ruta (Km)");

        btnCaminoMasCorto.setText("Camino mas corto");
        btnCaminoMasCorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaminoMasCortoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAñadirCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(btnAñadirRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ciudadOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ciudadDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnCrearRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputKmRuta)
                    .addComponent(jLabel3)
                    .addComponent(btnCaminoMasCorto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(areaDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAñadirCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAñadirRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ciudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ciudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputKmRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(btnCaminoMasCorto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCiudadActionPerformed
        // TODO add your handling code here:
        accion = "nuevaCiudad";
    }//GEN-LAST:event_btnAñadirCiudadActionPerformed

    private void areaDibujoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaDibujoMouseClicked
        //show("Clickeaste en: "+evt.getX()+","+evt.getY());
        if (accion.equals("nuevaCiudad")) {
            String nuevoNombreDeCiudad = input("Introducir nombre de Ciudad");
            if (!existeCiudadConEseNombre(nuevoNombreDeCiudad)) {
                if (nuevoNombreDeCiudad.length() > 0) {
                    int cantidadDeCiudadesEnLaLista = listaDeCiudades.cantVertice();
                    int posX = evt.getX(), posY = evt.getY();
                    listaDeCiudades.addVertice(nuevoNombreDeCiudad, posX, posY);
                    ciudadDestino.addItem(nuevoNombreDeCiudad);
                    ciudadOrigen.addItem(nuevoNombreDeCiudad);
                    actualizarVista();
                } else {
                    show("Debe insertar un nombre");
                }
            } else {
                show("Ciudad ya Existe!");
            }
        }
        accion = "nada";
    }//GEN-LAST:event_areaDibujoMouseClicked

    private void btnAñadirRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirRutaActionPerformed
        // TODO add your handling code here:
        if (listaDeCiudades.cantVertice() <= 1) {
            show("No hay suficientes ciudades");
        } else {
            deshabilitarHabilitar(true);
        }
    }//GEN-LAST:event_btnAñadirRutaActionPerformed

    private void ciudadOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ciudadOrigenItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadOrigenItemStateChanged

    private void ciudadOrigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciudadOrigenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadOrigenMouseClicked

    private void btnCrearRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRutaActionPerformed
        // TODO add your handling code here:
        if (accion.equals("confirmarRuta")) {
            int U = listaDeCiudades.getNumero(ciudadSeleccionadaEnComboOrigen);
            int V = listaDeCiudades.getNumero(ciudadSeleccionadaEnComboDestino);
            int kilometrosDeLaRuta = 0;
            try {
                kilometrosDeLaRuta = Integer.parseInt(inputKmRuta.getText());
                if (U == -1 || V == -1) {
                    show("Ups!");
                } else {
                    if (!existeMismaRutaConCostoDiferente(kilometrosDeLaRuta)) {
                        listaDeCiudades.addArista(U, V, kilometrosDeLaRuta);
                        deshabilitarHabilitar(false);
                        actualizarVista();
                    } else {
                        show("Ya existe una ruta con ese costo");
                    }
                    System.out.println(listaDeCiudades.toString());
                }
            } catch (Exception e) {
                show("Longitud Invalida! :o");
            }
        } else if (accion.equals("caminoCorto")) {
            int origen = listaDeCiudades.getNumero(ciudadSeleccionadaEnComboOrigen);
            int destino = listaDeCiudades.getNumero(ciudadSeleccionadaEnComboDestino);
            float f = listaDeCiudades.shortestPath(origen, destino);
            show("El camino mas corto es de: " + f + " Km.");
        } else {
            show("Las Ciudades deben ser diferentes! :(");
        }
        accion = "nada";
    }//GEN-LAST:event_btnCrearRutaActionPerformed

    private void btnCaminoMasCortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaminoMasCortoActionPerformed
        // TODO add your handling code here:
        if (listaDeCiudades.cantVertice() <= 1) {
            show("No hay suficientes ciudades");
        } else {
            btnCrearRuta.setText("VER");
            deshabilitarHabilitar(true);
            inputKmRuta.setEnabled(false);
            accion = "caminoCorto";
        }
    }//GEN-LAST:event_btnCaminoMasCortoActionPerformed

    private boolean existeMismaRutaConCostoDiferente(int kilometros) {
        int posicionDeCiudadOrigen = listaDeCiudades.getNumero(ciudadSeleccionadaEnComboOrigen);
        int posicionDeCiudadDestino = listaDeCiudades.getNumero(ciudadSeleccionadaEnComboDestino);
        if (listaDeCiudades.V[posicionDeCiudadOrigen].existe(posicionDeCiudadDestino)) {
            for (int i = 0; i < listaDeCiudades.V[posicionDeCiudadOrigen].length(); i++) {
                if (listaDeCiudades.V[posicionDeCiudadOrigen].getCosto(i) == kilometros) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    private void deshabilitarHabilitar(boolean b) {
        ciudadDestino.setEnabled(b);
        ciudadOrigen.setEnabled(b);
        btnCrearRuta.setEnabled(b);
        inputKmRuta.setEnabled(b);
    }

    private void show(String mensaje) {
        JOptionPane.showMessageDialog(rootPane, mensaje);
    }

    private String input(String mensaje) {
        return JOptionPane.showInputDialog(rootPane, mensaje, "");
    }

    private void actualizarVista() {
        Graphics grafico = areaDibujo.getGraphics();
        int ancho = 70;
        for (int i = 0; i < listaDeCiudades.cantVertice(); i++) {
            grafico.drawOval(listaDeCiudades.puntosX[i] - ancho / 2, listaDeCiudades.puntosY[i] - ancho / 2, ancho, ancho);
            grafico.drawString(
                    listaDeCiudades.nombres[i],
                    listaDeCiudades.puntosX[i] - ancho / 2 + 5 * ((12 - listaDeCiudades.nombres[i].length()) / 2),
                    listaDeCiudades.puntosY[i] + 5
            );
            int repetidos[] = new int[listaDeCiudades.cantVertice()];
            for (int k = 0; k < repetidos.length; k++) {
                repetidos[k] = 0;
            }
            for (int j = 0; j < listaDeCiudades.V[i].length(); j++) {
                int elemento = listaDeCiudades.V[i].get(j);
                repetidos[elemento] = repetidos[elemento] + 1;
                int p = (repetidos[elemento] - 1) * 20;
                grafico.drawLine(
                        listaDeCiudades.puntosX[i],
                        listaDeCiudades.puntosY[i],
                        (listaDeCiudades.puntosX[i] + (listaDeCiudades.puntosX[listaDeCiudades.V[i].get(j)] - listaDeCiudades.puntosX[i]) / 2) - p,
                        (listaDeCiudades.puntosY[i] + (listaDeCiudades.puntosY[listaDeCiudades.V[i].get(j)] - listaDeCiudades.puntosY[i]) / 2) + p
                );
                grafico.drawLine(
                        (listaDeCiudades.puntosX[i] + (listaDeCiudades.puntosX[listaDeCiudades.V[i].get(j)] - listaDeCiudades.puntosX[i]) / 2) - p,
                        (listaDeCiudades.puntosY[i] + (listaDeCiudades.puntosY[listaDeCiudades.V[i].get(j)] - listaDeCiudades.puntosY[i]) / 2) + p,
                        listaDeCiudades.puntosX[listaDeCiudades.V[i].get(j)],
                        listaDeCiudades.puntosY[listaDeCiudades.V[i].get(j)]
                );
                grafico.drawString(
                        Integer.toString(listaDeCiudades.V[i].getCosto(j)),
                        (listaDeCiudades.puntosX[i] + listaDeCiudades.puntosX[listaDeCiudades.V[i].get(j)]) / 2 - p,
                        (listaDeCiudades.puntosY[i] + listaDeCiudades.puntosY[listaDeCiudades.V[i].get(j)]) / 2 + p
                );
            }
        }
    }

    private boolean existeCiudadConEseNombre(String nombreAVerificar) {
        for (String nombre : listaDeCiudades.nombres) {
            if (nombre != null) {
                if (nombre.equals(nombreAVerificar)) {
                    return true;
                }
            }
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaDibujo;
    private javax.swing.JButton btnAñadirCiudad;
    private javax.swing.JButton btnAñadirRuta;
    private javax.swing.JButton btnCaminoMasCorto;
    private javax.swing.JButton btnCrearRuta;
    private javax.swing.JComboBox<String> ciudadDestino;
    private javax.swing.JComboBox<String> ciudadOrigen;
    private javax.swing.JTextField inputKmRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
