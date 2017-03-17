package marvinestrada_lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        cont = 0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_hadas = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombre_lamia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_altura_lamia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_edad_lamia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_salud_lamia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_poder_lamia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_aleta_lamia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_branquias_lamia = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_altura_hama = new javax.swing.JTextField();
        tf_edad_hama = new javax.swing.JTextField();
        tf_nombre_hama = new javax.swing.JTextField();
        tf_salud_hama = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_poder_hama = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_salarbol_hama = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        tf_nombre_silf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tf_edad_silf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf_altura_silf = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        tf_salud_silf = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf_poder_silf = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf_alas_silf = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        tf_altura_sala = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tf_nombre_sala = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tf_edad_sala = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tf_salud_sala = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tf_poder_sala = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tf_alas_sala = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_modHadas = new javax.swing.JList();
        cb_hadas = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        tf_nombre_mod = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tf_altura_mod = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tf_edad_mod = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        tf_aleta_mod = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        tf_branquias_mod = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        tf_alas_mod = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_eliminar = new javax.swing.JList();
        cb_elimhadas = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        jd_pelea = new javax.swing.JDialog();
        cb_player1 = new javax.swing.JComboBox<>();
        cb_player2 = new javax.swing.JComboBox<>();
        pb_player1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pb_player2 = new javax.swing.JProgressBar();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jLabel3.setText("Nombre");

        jLabel4.setText("Altura");

        jLabel6.setText("Edad");

        jLabel7.setText("Salud");

        tf_salud_lamia.setEditable(false);
        tf_salud_lamia.setText("475");

        jLabel8.setText("Poder");

        tf_poder_lamia.setEditable(false);
        tf_poder_lamia.setText("57");

        jLabel9.setText("Aleta");

        jLabel10.setText("Branquias");

        jButton3.setText("Guardar");
        jButton3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton3StateChanged(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tf_salud_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_poder_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_nombre_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_edad_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(tf_aleta_lamia)
                                        .addGap(19, 19, 19)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_altura_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_branquias_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombre_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tf_altura_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_edad_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_poder_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tf_salud_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_aleta_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tf_branquias_lamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane2.addTab("Lamias", jPanel4);

        jLabel11.setText("Nombre");

        jLabel12.setText("Edad");

        jLabel13.setText("Altura");

        tf_salud_hama.setEditable(false);
        tf_salud_hama.setText("373");

        jLabel15.setText("Salud");

        jLabel16.setText("Poder");

        tf_poder_hama.setEditable(false);
        tf_poder_hama.setText("78");

        jLabel17.setText("Salud Arbol");

        tf_salarbol_hama.setEditable(false);
        tf_salarbol_hama.setText("173");

        jButton4.setText("Guardar");
        jButton4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton4StateChanged(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nombre_hama, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_edad_hama, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_altura_hama, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(tf_salud_hama, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_poder_hama, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_salarbol_hama, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_nombre_hama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(tf_altura_hama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_edad_hama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_poder_hama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(tf_salud_hama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_salarbol_hama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane2.addTab("Hamadriades", jPanel5);

        jLabel18.setText("Nombre");

        jLabel19.setText("Edad");

        jLabel20.setText("Altura");

        jButton5.setText("Guardar");
        jButton5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton5StateChanged(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel22.setText("Salud");

        tf_salud_silf.setEditable(false);
        tf_salud_silf.setText("563");

        jLabel23.setText("Poder");

        tf_poder_silf.setEditable(false);
        tf_poder_silf.setText("67");

        jLabel24.setText("Alas");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel22)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(tf_salud_silf, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_poder_silf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_nombre_silf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_edad_silf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_altura_silf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tf_alas_silf, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_nombre_silf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(tf_altura_silf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_edad_silf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_poder_silf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(tf_salud_silf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(tf_alas_silf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jTabbedPane2.addTab("Silfides", jPanel6);

        jLabel26.setText("Altura");

        jLabel27.setText("Nombre");

        jLabel28.setText("Edad");

        jLabel29.setText("Salud");

        tf_salud_sala.setEditable(false);
        tf_salud_sala.setText("683");

        jLabel30.setText("Poder");

        tf_poder_sala.setEditable(false);
        tf_poder_sala.setText("71");

        jLabel31.setText("Alas");

        jButton6.setText("Guardar");
        jButton6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton6StateChanged(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nombre_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_edad_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_altura_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(tf_salud_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel30)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_poder_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_alas_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_nombre_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(tf_altura_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_edad_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tf_poder_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(tf_salud_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_alas_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane2.addTab("Salamandras", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        jl_modHadas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jl_modHadasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jl_modHadas);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        cb_hadas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lamias", "Hamadriades", "Silfides", "Salamandras" }));
        cb_hadas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_hadasItemStateChanged(evt);
            }
        });

        jLabel32.setText("Nombre:");

        jLabel33.setText("Altura:");

        jLabel34.setText("Edad:");

        jLabel37.setText("Aleta:");

        jLabel38.setText("Branquias:");

        jLabel35.setText("Alas:");

        jButton7.setText("Modificar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel35))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel37)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel32)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel38))))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_aleta_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_branquias_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_alas_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tf_nombre_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_altura_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_edad_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cb_hadas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_hadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(tf_nombre_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(tf_altura_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_edad_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(tf_aleta_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_branquias_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(tf_alas_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jButton7))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel2);

        jScrollPane2.setViewportView(jl_eliminar);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        cb_elimhadas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lamias", "Hamadriades", "Silfides", "Ssalamadras" }));

        jButton8.setText("Eliminar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(cb_elimhadas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(jButton8)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cb_elimhadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Eliminar", jPanel3);

        javax.swing.GroupLayout jd_hadasLayout = new javax.swing.GroupLayout(jd_hadas.getContentPane());
        jd_hadas.getContentPane().setLayout(jd_hadasLayout);
        jd_hadasLayout.setHorizontalGroup(
            jd_hadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jd_hadasLayout.setVerticalGroup(
            jd_hadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pb_player1.setForeground(new java.awt.Color(51, 255, 0));
        pb_player1.setValue(100);
        pb_player1.setString("100%");
        pb_player1.setStringPainted(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Player 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Player 2");

        pb_player2.setForeground(new java.awt.Color(51, 255, 0));
        pb_player2.setValue(100);
        pb_player2.setString("100%");
        pb_player2.setStringPainted(true);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("FIGHT!!!");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_peleaLayout = new javax.swing.GroupLayout(jd_pelea.getContentPane());
        jd_pelea.getContentPane().setLayout(jd_peleaLayout);
        jd_peleaLayout.setHorizontalGroup(
            jd_peleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_peleaLayout.createSequentialGroup()
                .addGroup(jd_peleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_peleaLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jd_peleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(pb_player1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                            .addGroup(jd_peleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cb_player1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_player2, 0, 158, Short.MAX_VALUE))
                            .addComponent(pb_player2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jd_peleaLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jButton9)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jd_peleaLayout.setVerticalGroup(
            jd_peleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_peleaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cb_player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pb_player1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cb_player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pb_player2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Discotechia Expanded", 0, 18)); // NOI18N
        jButton1.setText("HADAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Discotechia Expanded", 0, 18)); // NOI18N
        jButton2.setText("PELEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Guardar Como");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("About");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jd_hadas.setModal(true);
        this.jd_hadas.pack();
        this.jd_hadas.setLocationRelativeTo(this);
        this.jd_hadas.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.jd_pelea.setModal(true);
        this.jd_pelea.pack();
        this.jd_pelea.setLocationRelativeTo(this);
        this.jd_pelea.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int salud = 475, poder = 57; 
        lamia.add(new Lamias(tf_nombre_lamia.getText(), Double.parseDouble(
                tf_altura_lamia.getText()), Integer.parseInt(tf_edad_lamia.getText()), 
                salud, poder, Integer.parseInt(tf_aleta_lamia.getText()), 
                Integer.parseInt(tf_branquias_lamia.getText())));
        tf_nombre_lamia.setText("");
        tf_altura_lamia.setText("");
        tf_edad_lamia.setText("");
        tf_aleta_lamia.setText("");
        tf_branquias_lamia.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int salud = 373, poder = 78, salArbol = 173; 
        hamadriade.add(new Hamadriades(tf_nombre_hama.getText(), Double.parseDouble(
                tf_altura_hama.getText()), Integer.parseInt(tf_edad_hama.getText()), 
                salud, poder, salArbol));
        tf_nombre_hama.setText("");
        tf_altura_hama.setText("");
        tf_edad_hama.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int salud = 563, poder = 67; 
        silfide.add(new Silfides(tf_nombre_silf.getText(), Double.parseDouble(
                tf_altura_silf.getText()), Integer.parseInt(tf_edad_silf.getText()), 
                salud, poder, Integer.parseInt(tf_alas_silf.getText())));
        tf_nombre_silf.setText("");
        tf_altura_silf.setText("");
        tf_edad_silf.setText("");
        tf_alas_silf.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int salud = 683, poder = 71; 
        salamandra.add(new Salamandras(tf_nombre_sala.getText(), Double.parseDouble(
                tf_altura_sala.getText()), Integer.parseInt(tf_edad_sala.getText()), 
                salud, poder, Integer.parseInt(tf_alas_sala.getText())));
        tf_nombre_sala.setText("");
        tf_altura_sala.setText("");
        tf_edad_sala.setText("");
        tf_alas_sala.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jl_modHadasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jl_modHadasValueChanged
        if (cb_hadas.getSelectedIndex() == 0) {
            int postn = cb_hadas.getSelectedIndex();
            if (postn != -1) {
                tf_nombre_mod.setText(lamia.get(postn).getNombre());
                tf_altura_mod.setText(lamia.get(postn).getAltura() + "");
                tf_edad_mod.setText(lamia.get(postn).getEdad() + "");
                tf_aleta_mod.setText(lamia.get(postn).getAleta() + "");
                tf_branquias_mod.setText(lamia.get(postn).getBranquias() + "");
                tf_alas_mod.setText("-NULL-");
                tf_alas_mod.setEnabled(false);
                tf_aleta_mod.setEnabled(true);
                tf_branquias_mod.setEnabled(true);
            } else {
            }
        } else if (cb_hadas.getSelectedIndex() == 1) {
            int postn = cb_hadas.getSelectedIndex();
            if (postn != -1) {
                tf_nombre_mod.setText(hamadriade.get(postn).getNombre());
                tf_altura_mod.setText(hamadriade.get(postn).getAltura() + "");
                tf_edad_mod.setText(hamadriade.get(postn).getEdad() + "");
                tf_alas_mod.setText("-NULL-");
                tf_alas_mod.setEnabled(false);
                tf_aleta_mod.setText("-NULL-");
                tf_aleta_mod.setEnabled(false);
                tf_branquias_mod.setText("-NULL-");
                tf_branquias_mod.setEnabled(false);
            } else {
            }
        } else if (cb_hadas.getSelectedIndex() == 2) {
            int postn = cb_hadas.getSelectedIndex();
            if (postn != -1) {
                tf_nombre_mod.setText(silfide.get(postn).getNombre());
                tf_altura_mod.setText(silfide.get(postn).getAltura() + "");
                tf_edad_mod.setText(silfide.get(postn).getEdad() + "");
                tf_alas_mod.setText(silfide.get(postn).getAlas() + "");
                tf_alas_mod.setEnabled(true);
                tf_aleta_mod.setText("-NULL-");
                tf_aleta_mod.setEnabled(false);
                tf_branquias_mod.setText("-NULL-");
                tf_branquias_mod.setEnabled(false);
            } else {
            }
        } else if (cb_hadas.getSelectedIndex() == 3) {
            int postn = cb_hadas.getSelectedIndex();
                tf_nombre_mod.setText(salamandra.get(postn).getNombre());
                tf_altura_mod.setText(salamandra.get(postn).getAltura() + "");
                tf_edad_mod.setText(salamandra.get(postn).getEdad() + "");
                tf_alas_mod.setText(salamandra.get(postn).getAlas() + "");
                tf_alas_mod.setEnabled(true);
                tf_aleta_mod.setText("-NULL-");
                tf_aleta_mod.setEnabled(false);
                tf_branquias_mod.setText("-NULL-");
                tf_branquias_mod.setEnabled(false);
        }
    }//GEN-LAST:event_jl_modHadasValueChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser jfc = new JFileChooser();
        int seleccion = jfc.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivo = jfc.getSelectedFile();
        }
        cont++;
        try {
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);

            lamia = (ArrayList<Lamias>) objeto.readObject();
            hamadriade = (ArrayList<Hamadriades>) objeto.readObject();
            silfide = (ArrayList<Silfides>) objeto.readObject();
            salamandra = (ArrayList<Salamandras>) objeto.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void cb_hadasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_hadasItemStateChanged
        if (cb_hadas.getSelectedIndex() == 0) {
            DefaultListModel modelo = new DefaultListModel();
            for (int i = 0; i < lamia.size(); i++) {
                modelo.addElement(lamia.get(i));
            }
            jl_modHadas.setModel(modelo);
        } else if (cb_hadas.getSelectedIndex() == 1) {
            DefaultListModel modelo = new DefaultListModel();
            for (int i = 0; i < hamadriade.size(); i++) {
                modelo.addElement(hamadriade.get(i));
            }
            jl_modHadas.setModel(modelo);
        } else if (cb_hadas.getSelectedIndex() == 2) {
            DefaultListModel modelo = new DefaultListModel();
            for (int i = 0; i < silfide.size(); i++) {
                modelo.addElement(silfide.get(i));
            }
            jl_modHadas.setModel(modelo);
        } else if (cb_hadas.getSelectedIndex() == 3) {
            DefaultListModel modelo = new DefaultListModel();
            for (int i = 0; i < salamandra.size(); i++) {
                modelo.addElement(salamandra.get(i));
            }
            jl_modHadas.setModel(modelo);
        }  else {
            JOptionPane.showMessageDialog(this,"NO SE PUDO");
        }
    }//GEN-LAST:event_cb_hadasItemStateChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int pos = jl_modHadas.getSelectedIndex();
        if (cb_hadas.getSelectedIndex() == 0) {
            lamia.get(pos).setNombre(tf_nombre_mod.getText());
            lamia.get(pos).setAltura(Double.parseDouble(tf_altura_mod.getText()));
            lamia.get(pos).setEdad(Integer.parseInt(tf_edad_mod.getText()));
            lamia.get(pos).setAleta(Double.parseDouble(tf_aleta_mod.getText()));
            lamia.get(pos).setBranquias(Integer.parseInt(tf_branquias_mod.getText()));
            tf_nombre_mod.setText("");
            tf_altura_mod.setText("");
            tf_edad_mod.setText("");
            tf_alas_mod.setText("");
            tf_alas_mod.setEnabled(false);
            tf_aleta_lamia.setText("");
            tf_aleta_lamia.setEnabled(true);
            tf_branquias_mod.setText("");
            tf_branquias_mod.setEnabled(true);
        } else if (cb_hadas.getSelectedIndex() == 1) {
            hamadriade.get(pos).setNombre(tf_nombre_mod.getText());
            hamadriade.get(pos).setAltura(Double.parseDouble(tf_altura_mod.getText()));
            hamadriade.get(pos).setEdad(Integer.parseInt(tf_edad_mod.getText()));
            tf_nombre_mod.setText("");
            tf_altura_mod.setText("");
            tf_edad_mod.setText("");
            tf_alas_mod.setText("");
            tf_alas_mod.setEnabled(false);
            tf_aleta_lamia.setText("");
            tf_aleta_lamia.setEnabled(false);
            tf_branquias_mod.setText("");
            tf_branquias_mod.setEnabled(false);
        } else if (cb_hadas.getSelectedIndex() == 2) {
            silfide.get(pos).setNombre(tf_nombre_mod.getText());
            silfide.get(pos).setAltura(Double.parseDouble(tf_altura_mod.getText()));
            silfide.get(pos).setEdad(Integer.parseInt(tf_edad_mod.getText()));
            silfide.get(pos).setAlas(Integer.parseInt(tf_alas_mod.getText()));
            tf_nombre_mod.setText("");
            tf_altura_mod.setText("");
            tf_edad_mod.setText("");
            tf_alas_mod.setText("");
            tf_alas_mod.setEnabled(true);
            tf_aleta_lamia.setText("");
            tf_aleta_lamia.setEnabled(false);
            tf_branquias_mod.setText("");
            tf_branquias_mod.setEnabled(false);
        } else if (cb_hadas.getSelectedIndex() == 3) {
            salamandra.get(pos).setNombre(tf_nombre_mod.getText());
            salamandra.get(pos).setAltura(Double.parseDouble(tf_altura_mod.getText()));
            salamandra.get(pos).setEdad(Integer.parseInt(tf_edad_mod.getText()));
            salamandra.get(pos).setAlas(Integer.parseInt(tf_alas_mod.getText()));
            tf_nombre_mod.setText("");
            tf_altura_mod.setText("");
            tf_edad_mod.setText("");
            tf_alas_mod.setText("");
            tf_alas_mod.setEnabled(true);
            tf_aleta_lamia.setText("");
            tf_aleta_lamia.setEnabled(false);
            tf_branquias_mod.setText("");
            tf_branquias_mod.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Ha Fallado");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (cont == 0) {
            JFileChooser jfc = new JFileChooser();
            int seleccion = jfc.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                archivo = jfc.getSelectedFile();
            }

            cont++;
        }
        try {
            FileOutputStream hadastxt = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(hadastxt);

            oos.writeObject(lamia);
            oos.writeObject(hamadriade);
            oos.writeObject(silfide);
            oos.writeObject(salamandra);

            oos.close();
            hadastxt.close();
            System.out.println("GREAT");
            JOptionPane.showMessageDialog(null, "Guardado exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JOptionPane.showMessageDialog(this, "BATALLA DE HADAS!!!\n"
                + "Simulación de un \"juego\" de batalla entre hadas\n"
                + "Creado por: Marvin Estrada");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton3StateChanged
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Lamias temp : lamia) {
                modelo.addElement(temp);
            }
        cb_player1.setModel(modelo);
        cb_player2.setModel(modelo);
    }//GEN-LAST:event_jButton3StateChanged

    private void jButton4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton4StateChanged
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Hamadriades temp : hamadriade) {
                modelo.addElement(temp);
            }
        cb_player1.setModel(modelo);
        cb_player2.setModel(modelo);
    }//GEN-LAST:event_jButton4StateChanged

    private void jButton5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton5StateChanged
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Silfides temp : silfide) {
                modelo.addElement(temp);
            }
        cb_player1.setModel(modelo);
        cb_player2.setModel(modelo);
    }//GEN-LAST:event_jButton5StateChanged

    private void jButton6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton6StateChanged
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Salamandras temp : salamandra) {
                modelo.addElement(temp);
            }
        cb_player1.setModel(modelo);
        cb_player2.setModel(modelo);
    }//GEN-LAST:event_jButton6StateChanged

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (ap1.getHada1() instanceof Lamias && ap2.getHada2() instanceof Silfides){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Lamias && ap2.getHada2() instanceof Salamandras){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Lamias && ap2.getHada2() instanceof Hamadriades){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Lamias && ap2.getHada2() instanceof Lamias){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Silfides && ap2.getHada2() instanceof Lamias){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Silfides && ap2.getHada2() instanceof Salamandras){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Silfides && ap2.getHada2() instanceof Hamadriades){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Silfides && ap2.getHada2() instanceof Silfides){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Salamandras && ap2.getHada2() instanceof Lamias){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Salamandras && ap2.getHada2() instanceof Silfides){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Salamandras && ap2.getHada2() instanceof Hamadriades){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Salamandras && ap2.getHada2() instanceof Salamandras){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Hamadriades && ap2.getHada2() instanceof Lamias){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Hamadriades && ap2.getHada2() instanceof Silfides){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Hamadriades && ap2.getHada2() instanceof Salamandras){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
        if (ap1.getHada1() instanceof Hamadriades && ap2.getHada2() instanceof Hamadriades){
            ap1 = new adminPelea(pb_player1, pb_player2, (Hadas)cb_player1.getSelectedItem(), (Hadas)cb_player2.getSelectedItem());
            ap1.start();
            ap2.start();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (cont == 0) {
            JFileChooser jfc = new JFileChooser();
            int seleccion = jfc.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                archivo = jfc.getSelectedFile();
            }

            cont++;
        }
        try {
            FileOutputStream hadastxt = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(hadastxt);

            oos.writeObject(lamia);
            oos.writeObject(hamadriade);
            oos.writeObject(silfide);
            oos.writeObject(salamandra);

            oos.close();
            hadastxt.close();
            System.out.println("GREAT");
            JOptionPane.showMessageDialog(null, "Guardado exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int pos = jl_eliminar.getSelectedIndex();
        DefaultListModel modelo = new DefaultListModel();
        if (jl_eliminar.getSelectedIndex() != -1) {
            lamia.remove(pos);
            for (int i = 0; i < lamia.size(); i++) {
                modelo.addElement(lamia.get(i));
            }
            jl_eliminar.setModel(modelo);
        } 
        if (jl_eliminar.getSelectedIndex() != -1) {
            hamadriade.remove(pos);
            for (int i = 0; i < hamadriade.size(); i++) {
                modelo.addElement(hamadriade.get(i));
            }
            jl_eliminar.setModel(modelo);
        }
        if (jl_eliminar.getSelectedIndex() != -1) {
            silfide.remove(pos);
            for (int i = 0; i < silfide.size(); i++) {
                modelo.addElement(silfide.get(i));
            }
            jl_eliminar.setModel(modelo);
        }
        if (jl_eliminar.getSelectedIndex() != -1) {
            salamandra.remove(pos);
            for (int i = 0; i < salamandra.size(); i++) {
                modelo.addElement(salamandra.get(i));
            }
            jl_eliminar.setModel(modelo);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_elimhadas;
    private javax.swing.JComboBox cb_hadas;
    private javax.swing.JComboBox<String> cb_player1;
    private javax.swing.JComboBox<String> cb_player2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JDialog jd_hadas;
    private javax.swing.JDialog jd_pelea;
    private javax.swing.JList jl_eliminar;
    private javax.swing.JList jl_modHadas;
    private javax.swing.JProgressBar pb_player1;
    private javax.swing.JProgressBar pb_player2;
    private javax.swing.JTextField tf_alas_mod;
    private javax.swing.JTextField tf_alas_sala;
    private javax.swing.JTextField tf_alas_silf;
    private javax.swing.JTextField tf_aleta_lamia;
    private javax.swing.JTextField tf_aleta_mod;
    private javax.swing.JTextField tf_altura_hama;
    private javax.swing.JTextField tf_altura_lamia;
    private javax.swing.JTextField tf_altura_mod;
    private javax.swing.JTextField tf_altura_sala;
    private javax.swing.JTextField tf_altura_silf;
    private javax.swing.JTextField tf_branquias_lamia;
    private javax.swing.JTextField tf_branquias_mod;
    private javax.swing.JTextField tf_edad_hama;
    private javax.swing.JTextField tf_edad_lamia;
    private javax.swing.JTextField tf_edad_mod;
    private javax.swing.JTextField tf_edad_sala;
    private javax.swing.JTextField tf_edad_silf;
    private javax.swing.JTextField tf_nombre_hama;
    private javax.swing.JTextField tf_nombre_lamia;
    private javax.swing.JTextField tf_nombre_mod;
    private javax.swing.JTextField tf_nombre_sala;
    private javax.swing.JTextField tf_nombre_silf;
    private javax.swing.JTextField tf_poder_hama;
    private javax.swing.JTextField tf_poder_lamia;
    private javax.swing.JTextField tf_poder_sala;
    private javax.swing.JTextField tf_poder_silf;
    private javax.swing.JTextField tf_salarbol_hama;
    private javax.swing.JTextField tf_salud_hama;
    private javax.swing.JTextField tf_salud_lamia;
    private javax.swing.JTextField tf_salud_sala;
    private javax.swing.JTextField tf_salud_silf;
    // End of variables declaration//GEN-END:variables
    ArrayList<Lamias> lamia = new ArrayList();
    ArrayList<Hamadriades> hamadriade = new ArrayList();
    ArrayList<Silfides> silfide = new ArrayList();
    ArrayList<Salamandras> salamandra = new ArrayList();
    File archivo;
    int cont;
    adminPelea ap1;
    adminPelea ap2;
}
