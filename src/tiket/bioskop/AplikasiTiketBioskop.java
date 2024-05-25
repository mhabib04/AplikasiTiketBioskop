package tiket.bioskop;

/**
 *
 * @author H A B I B
 */

import javax.swing.JOptionPane;

public class AplikasiTiketBioskop extends javax.swing.JFrame {
    String hari,iniHarga,jam,judulFilm;
    int nomor,harga,bayar,kembalian;
    
    public AplikasiTiketBioskop() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulFilmRadioButton = new javax.swing.ButtonGroup();
        kursiRadioButton = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputTransaksiTxt = new javax.swing.JTextField();
        hariComboBox = new javax.swing.JComboBox<>();
        jamComboBox = new javax.swing.JComboBox<>();
        A1 = new javax.swing.JRadioButton();
        B1 = new javax.swing.JRadioButton();
        B4 = new javax.swing.JRadioButton();
        B3 = new javax.swing.JRadioButton();
        B2 = new javax.swing.JRadioButton();
        A5 = new javax.swing.JRadioButton();
        A4 = new javax.swing.JRadioButton();
        A3 = new javax.swing.JRadioButton();
        A2 = new javax.swing.JRadioButton();
        B5 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LaskarPelangiButton = new javax.swing.JRadioButton();
        AvatarButton = new javax.swing.JRadioButton();
        BlackPantherButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nomorTransaksiTxt = new javax.swing.JTextField();
        judulFilmTxt = new javax.swing.JTextField();
        hariTxt = new javax.swing.JTextField();
        jamTxt = new javax.swing.JTextField();
        kursiTxt = new javax.swing.JTextField();
        hargaTxt = new javax.swing.JTextField();
        pembayaranTxt = new javax.swing.JTextField();
        BayarButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ProsesButton = new javax.swing.JButton();
        KeluarButton = new javax.swing.JButton();
        C1 = new javax.swing.JRadioButton();
        C5 = new javax.swing.JRadioButton();
        D2 = new javax.swing.JRadioButton();
        E3 = new javax.swing.JRadioButton();
        E4 = new javax.swing.JRadioButton();
        E5 = new javax.swing.JRadioButton();
        D3 = new javax.swing.JRadioButton();
        D4 = new javax.swing.JRadioButton();
        D5 = new javax.swing.JRadioButton();
        C4 = new javax.swing.JRadioButton();
        D1 = new javax.swing.JRadioButton();
        C2 = new javax.swing.JRadioButton();
        C3 = new javax.swing.JRadioButton();
        E2 = new javax.swing.JRadioButton();
        E1 = new javax.swing.JRadioButton();
        A6 = new javax.swing.JRadioButton();
        A7 = new javax.swing.JRadioButton();
        A8 = new javax.swing.JRadioButton();
        B6 = new javax.swing.JRadioButton();
        B7 = new javax.swing.JRadioButton();
        B8 = new javax.swing.JRadioButton();
        C6 = new javax.swing.JRadioButton();
        E7 = new javax.swing.JRadioButton();
        D8 = new javax.swing.JRadioButton();
        D7 = new javax.swing.JRadioButton();
        C8 = new javax.swing.JRadioButton();
        C7 = new javax.swing.JRadioButton();
        D6 = new javax.swing.JRadioButton();
        E8 = new javax.swing.JRadioButton();
        E6 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        WhoAmIButton = new javax.swing.JRadioButton();
        HapusButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Nomor Transaksi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Judul Film");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Hari");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Jam");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Kursi");

        inputTransaksiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTransaksiTxtActionPerformed(evt);
            }
        });

        hariComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hariComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Hari", "Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu" }));
        hariComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hariComboBoxActionPerformed(evt);
            }
        });

        jamComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jamComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jam Tayang", "13.00", "15.00", "19.00", "20.00" }));
        jamComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamComboBoxActionPerformed(evt);
            }
        });

        kursiRadioButton.add(A1);
        A1.setText("A1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(B1);
        B1.setText("B1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(B4);
        B4.setText("B4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(B3);
        B3.setText("B3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(B2);
        B2.setText("B2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(A5);
        A5.setText("A5");
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(A4);
        A4.setText("A4");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(A3);
        A3.setText("A3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(A2);
        A2.setText("A2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(B5);
        B5.setText("B5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiket/bioskop/Avatar_2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiket/bioskop/Black_Panther.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiket/bioskop/Laskar_Pelangi.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");

        judulFilmRadioButton.add(LaskarPelangiButton);
        LaskarPelangiButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LaskarPelangiButton.setText("Laskar Pelangi");
        LaskarPelangiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaskarPelangiButtonActionPerformed(evt);
            }
        });

        judulFilmRadioButton.add(AvatarButton);
        AvatarButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AvatarButton.setText("Avatar 2");
        AvatarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvatarButtonActionPerformed(evt);
            }
        });

        judulFilmRadioButton.add(BlackPantherButton);
        BlackPantherButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BlackPantherButton.setText("Black Panther");
        BlackPantherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackPantherButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("            Aplikasi Tiket Bioskop            ");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setText("Nomor Transaksi");

        jLabel12.setText("Judul Film");

        jLabel13.setText("Hari");

        jLabel14.setText("Jam");

        jLabel15.setText("Kursi");

        jLabel16.setText("Harga Tiket");

        jLabel17.setText("Pembayaran");

        nomorTransaksiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorTransaksiTxtActionPerformed(evt);
            }
        });

        BayarButton.setText("Bayar");
        BayarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setText("Konfirmasi Pembayaran");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BayarButton)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pembayaranTxt)
                        .addComponent(jamTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hargaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addComponent(hariTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(judulFilmTxt)
                        .addComponent(nomorTransaksiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kursiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomorTransaksiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulFilmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(hariTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jamTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(kursiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(hargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pembayaranTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addGap(18, 18, 18)
                .addComponent(BayarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProsesButton.setText("Proses");
        ProsesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesButtonActionPerformed(evt);
            }
        });

        KeluarButton.setText("Keluar");
        KeluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarButtonActionPerformed(evt);
            }
        });

        kursiRadioButton.add(C1);
        C1.setText("C1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(C5);
        C5.setText("C5");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(D2);
        D2.setText("D2");
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(E3);
        E3.setText("E3");
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(E4);
        E4.setText("E4");
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(E5);
        E5.setText("E5");
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(D3);
        D3.setText("D3");
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(D4);
        D4.setText("D4");
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(D5);
        D5.setText("D5");
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(C4);
        C4.setText("C4");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(D1);
        D1.setText("D1");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(C2);
        C2.setText("C2");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(C3);
        C3.setText("C3");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(E2);
        E2.setText("E2");
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(E1);
        E1.setText("E1");
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(A6);
        A6.setText("A6");
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(A7);
        A7.setText("A7");
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(A8);
        A8.setText("A8");
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(B6);
        B6.setText("B6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(B7);
        B7.setText("B7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(B8);
        B8.setText("B8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(C6);
        C6.setText("C6");
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(E7);
        E7.setText("E7");
        E7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E7ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(D8);
        D8.setText("D8");
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(D7);
        D7.setText("D7");
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(C8);
        C8.setText("C8");
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(C7);
        C7.setText("C7");
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(D6);
        D6.setText("D6");
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(E8);
        E8.setText("E8");
        E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E8ActionPerformed(evt);
            }
        });

        kursiRadioButton.add(E6);
        E6.setText("E6");
        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("LAYAR ");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiket/bioskop/Who_am_I_movie.jpg"))); // NOI18N
        jLabel18.setText("jLabel18");

        judulFilmRadioButton.add(WhoAmIButton);
        WhoAmIButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WhoAmIButton.setText("Who Am I");
        WhoAmIButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhoAmIButtonActionPerformed(evt);
            }
        });

        HapusButton.setText("Hapus");
        HapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(KeluarButton)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(ProsesButton)
                                .addGap(305, 305, 305)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputTransaksiTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(HapusButton)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AvatarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(BlackPantherButton)
                                        .addGap(100, 100, 100)
                                        .addComponent(LaskarPelangiButton))))
                            .addComponent(hariComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WhoAmIButton)
                        .addGap(82, 82, 82))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTransaksiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(234, 234, 234)
                        .addComponent(AvatarButton)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(hariComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(A1)
                                    .addComponent(A2)
                                    .addComponent(A3)
                                    .addComponent(A4)
                                    .addComponent(A5)
                                    .addComponent(A6)
                                    .addComponent(A7)
                                    .addComponent(A8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B1)
                            .addComponent(B2)
                            .addComponent(B3)
                            .addComponent(B4)
                            .addComponent(B5)
                            .addComponent(B6)
                            .addComponent(B7)
                            .addComponent(B8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C1)
                            .addComponent(C2)
                            .addComponent(C3)
                            .addComponent(C4)
                            .addComponent(C5)
                            .addComponent(C6)
                            .addComponent(C7)
                            .addComponent(C8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(D1)
                            .addComponent(D2)
                            .addComponent(D3)
                            .addComponent(D4)
                            .addComponent(D5)
                            .addComponent(D6)
                            .addComponent(D7)
                            .addComponent(D8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(E1)
                            .addComponent(E2)
                            .addComponent(E3)
                            .addComponent(E4)
                            .addComponent(E5)
                            .addComponent(E6)
                            .addComponent(E7)
                            .addComponent(E8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProsesButton)
                            .addComponent(HapusButton)
                            .addComponent(KeluarButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LaskarPelangiButton)
                            .addComponent(WhoAmIButton)
                            .addComponent(BlackPantherButton))
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTransaksiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTransaksiTxtActionPerformed
        
    }//GEN-LAST:event_inputTransaksiTxtActionPerformed

    private void hariComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hariComboBoxActionPerformed
       switch (hariComboBox.getSelectedIndex()){
           case 0 :
               hari = "";
               harga = 0;
               break;
               
           case 1 :
               hari = "Senin";
               harga = 35000;
               break;
               
           case 2 :
               hari = "Selasa";
               harga = 35000;
               break;
               
           case 3 :
               hari = "Rabu";
               harga = 35000;
               break;
               
           case 4 :
               hari = "Kamis";
               harga = 35000;
               break;
               
           case 5 :
               hari = "Jumat";
               harga = 35000;
               break;
               
           case 6 :
               hari = "Sabtu";
               harga = 50000;
               break;
               
           default :
               hari = "Minggu";
               harga = 50000;
               break;
       } iniHarga = Integer.toString(harga);
    }//GEN-LAST:event_hariComboBoxActionPerformed

    private void jamComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamComboBoxActionPerformed
        switch (jamComboBox.getSelectedIndex()){
           case 0 :
               jam = "";
               break;
               
           case 1 :
               jam = "13.00";
               break;
               
           case 2 :
               jam = "15.00";
               break;
               
           case 3 :
               jam = "19.00";
               break;
               
           default :
               jam = "20.00";
               break;
       }
    }//GEN-LAST:event_jamComboBoxActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        
    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        
    }//GEN-LAST:event_A4ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        
    }//GEN-LAST:event_B5ActionPerformed

    private void LaskarPelangiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaskarPelangiButtonActionPerformed
        
    }//GEN-LAST:event_LaskarPelangiButtonActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        
    }//GEN-LAST:event_A2ActionPerformed

    private void AvatarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvatarButtonActionPerformed

    }//GEN-LAST:event_AvatarButtonActionPerformed

    private void BlackPantherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackPantherButtonActionPerformed
        
    }//GEN-LAST:event_BlackPantherButtonActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        
    }//GEN-LAST:event_B1ActionPerformed

    private void nomorTransaksiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorTransaksiTxtActionPerformed
        
    }//GEN-LAST:event_nomorTransaksiTxtActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        
    }//GEN-LAST:event_A1ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        
    }//GEN-LAST:event_A5ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
      
    }//GEN-LAST:event_B3ActionPerformed

    private void ProsesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesButtonActionPerformed
      try {
        nomor = Integer.valueOf(inputTransaksiTxt.getText());
        nomorTransaksiTxt.setText(String.valueOf(nomor));
        if (BlackPantherButton.isSelected()){judulFilmTxt.setText("Black Panther");}
        if (AvatarButton.isSelected()){judulFilmTxt.setText("Avatar 2");}
        if (LaskarPelangiButton.isSelected()){judulFilmTxt.setText("Laskar Pelangi");}
        if (WhoAmIButton.isSelected()){judulFilmTxt.setText("Who Am I");}
        if (A1.isSelected()){kursiTxt.setText("A1");}
        if (A2.isSelected()){kursiTxt.setText("A2");}
        if (A3.isSelected()){kursiTxt.setText("A3");}
        if (A4.isSelected()){kursiTxt.setText("A4");}
        if (A5.isSelected()){kursiTxt.setText("A5");}
        if (A6.isSelected()){kursiTxt.setText("A6");}
        if (A7.isSelected()){kursiTxt.setText("A7");}
        if (A8.isSelected()){kursiTxt.setText("A8");}
        if (B1.isSelected()){kursiTxt.setText("B1");}
        if (B2.isSelected()){kursiTxt.setText("B2");}
        if (B3.isSelected()){kursiTxt.setText("B3");}
        if (B4.isSelected()){kursiTxt.setText("B4");}
        if (B5.isSelected()){kursiTxt.setText("B5");}
        if (B6.isSelected()){kursiTxt.setText("B6");}
        if (B7.isSelected()){kursiTxt.setText("B7");}
        if (B8.isSelected()){kursiTxt.setText("B8");}
        if (C1.isSelected()){kursiTxt.setText("C1");}
        if (C2.isSelected()){kursiTxt.setText("C2");}
        if (C3.isSelected()){kursiTxt.setText("C3");}
        if (C4.isSelected()){kursiTxt.setText("C4");}
        if (C5.isSelected()){kursiTxt.setText("C5");}
        if (C6.isSelected()){kursiTxt.setText("C6");}
        if (C7.isSelected()){kursiTxt.setText("C7");}
        if (C8.isSelected()){kursiTxt.setText("C8");}
        if (D1.isSelected()){kursiTxt.setText("D1");}
        if (D2.isSelected()){kursiTxt.setText("D2");}
        if (D3.isSelected()){kursiTxt.setText("D3");}
        if (D4.isSelected()){kursiTxt.setText("D4");}
        if (D5.isSelected()){kursiTxt.setText("D5");}
        if (D6.isSelected()){kursiTxt.setText("D6");}
        if (D7.isSelected()){kursiTxt.setText("D7");}
        if (D8.isSelected()){kursiTxt.setText("D8");}
        if (E1.isSelected()){kursiTxt.setText("E1");}
        if (E2.isSelected()){kursiTxt.setText("E2");}
        if (E3.isSelected()){kursiTxt.setText("E3");}
        if (E4.isSelected()){kursiTxt.setText("E4");}
        if (E5.isSelected()){kursiTxt.setText("E5");}
        if (E6.isSelected()){kursiTxt.setText("E6");}
        if (E7.isSelected()){kursiTxt.setText("E7");}
        if (E8.isSelected()){kursiTxt.setText("E8");}
        
        hariTxt.setText(hari);
        jamTxt.setText(jam);
        hargaTxt.setText(String.valueOf(iniHarga));}
        
      catch(Exception e){
            JOptionPane.showMessageDialog(null,"Masukkan Angka","Transaksi Gagal!",JOptionPane.ERROR_MESSAGE);
            inputTransaksiTxt.setText("");
            judulFilmRadioButton.clearSelection();
            hariComboBox.setSelectedIndex(0);
            jamComboBox.setSelectedIndex(0);
            kursiRadioButton.clearSelection();
        }
        
        
    }//GEN-LAST:event_ProsesButtonActionPerformed
       
    private void BayarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarButtonActionPerformed
      
        bayar = Integer.valueOf(pembayaranTxt.getText());
        kembalian = bayar - harga;
        
        if (bayar > harga){
        String pilihan[]={"Konfirmasi","Kembali"};
        int jawab = JOptionPane.showOptionDialog(this,
                "Nomor Transaksi : " + nomorTransaksiTxt.getText()+"\n"+
                "Judul Film            : " + judulFilmTxt.getText() + "\n" +
                "Hari                      : " + hariTxt.getText() + "\n" + 
                "Jam                     : " + jamTxt.getText() + "\n" +
                "Kursi                    : " + kursiTxt.getText() + "\n" +
                "Harga Tiket          : " + "Rp" + iniHarga + "\n" +        
                "Pembayaran        : " +"Rp"+ pembayaranTxt.getText() + "\n" + 
                "Kembalian            : " +"Rp"+ kembalian + "\n" + "\n",
                "Rincian Transaksi",
                JOptionPane.YES_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,pilihan,pilihan[0]);
            if (jawab == 0){
                JOptionPane.showMessageDialog(this,
                "Transaksi Berhasil" + "\n"+
                "**********************************************" + "\n"+
                "Nomor Transaksi : " + nomorTransaksiTxt.getText()  +"\n"+
                "Judul Film            : " + judulFilmTxt.getText()  + "\n" +
                "Hari                      : " + hariTxt.getText()  + "\n" + 
                "Jam                     : " + jamTxt.getText() + "\n" +
                "Kursi                    : " + kursiTxt.getText()  + "\n" +
                "Harga Tiket          : " + "Rp" + iniHarga + "\n"  +
                "**********************************************");
                inputTransaksiTxt.setText("");
                judulFilmRadioButton.clearSelection();
                hariComboBox.setSelectedIndex(0);
                jamComboBox.setSelectedIndex(0);
                kursiRadioButton.clearSelection();
                nomorTransaksiTxt.setText("");
                judulFilmTxt.setText("");
                hariTxt.setText("");
                jamTxt.setText("");
                kursiTxt.setText("");
                hargaTxt.setText("");
                pembayaranTxt.setText("");
                }   
        }
        else{
            JOptionPane.showMessageDialog(null,"Uang tidak cukup!","Transaksi Gagal!",JOptionPane.ERROR_MESSAGE);
            pembayaranTxt.setText("");
        }
           
        
    }//GEN-LAST:event_BayarButtonActionPerformed

    private void KeluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarButtonActionPerformed
        String pilihan[]={"Keluar","Batal"};
        int jawab = JOptionPane.showOptionDialog(this,
                "Apakah Anda Ingin Keluar?",
                "",
                JOptionPane.YES_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,pilihan,pilihan[0]);
        
        if (jawab == 0){
            System.exit(0);
           
        }
        
    }//GEN-LAST:event_KeluarButtonActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C5ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D2ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E3ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E4ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E5ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D4ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D5ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C4ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E2ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E1ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A8ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C6ActionPerformed

    private void E7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E7ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D8ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C8ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C7ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D6ActionPerformed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E8ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E6ActionPerformed

    private void WhoAmIButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhoAmIButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WhoAmIButtonActionPerformed

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusButtonActionPerformed
        inputTransaksiTxt.setText("");
        judulFilmRadioButton.clearSelection();
        hariComboBox.setSelectedIndex(0);
        jamComboBox.setSelectedIndex(0);
        kursiRadioButton.clearSelection();
        nomorTransaksiTxt.setText("");
        judulFilmTxt.setText("");
        hariTxt.setText("");
        jamTxt.setText("");
        kursiTxt.setText("");
        hargaTxt.setText("");
        pembayaranTxt.setText("");
    }//GEN-LAST:event_HapusButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiTiketBioskop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A1;
    private javax.swing.JRadioButton A2;
    private javax.swing.JRadioButton A3;
    private javax.swing.JRadioButton A4;
    private javax.swing.JRadioButton A5;
    private javax.swing.JRadioButton A6;
    private javax.swing.JRadioButton A7;
    private javax.swing.JRadioButton A8;
    private javax.swing.JRadioButton AvatarButton;
    private javax.swing.JRadioButton B1;
    private javax.swing.JRadioButton B2;
    private javax.swing.JRadioButton B3;
    private javax.swing.JRadioButton B4;
    private javax.swing.JRadioButton B5;
    private javax.swing.JRadioButton B6;
    private javax.swing.JRadioButton B7;
    private javax.swing.JRadioButton B8;
    private javax.swing.JButton BayarButton;
    private javax.swing.JRadioButton BlackPantherButton;
    private javax.swing.JRadioButton C1;
    private javax.swing.JRadioButton C2;
    private javax.swing.JRadioButton C3;
    private javax.swing.JRadioButton C4;
    private javax.swing.JRadioButton C5;
    private javax.swing.JRadioButton C6;
    private javax.swing.JRadioButton C7;
    private javax.swing.JRadioButton C8;
    private javax.swing.JRadioButton D1;
    private javax.swing.JRadioButton D2;
    private javax.swing.JRadioButton D3;
    private javax.swing.JRadioButton D4;
    private javax.swing.JRadioButton D5;
    private javax.swing.JRadioButton D6;
    private javax.swing.JRadioButton D7;
    private javax.swing.JRadioButton D8;
    private javax.swing.JRadioButton E1;
    private javax.swing.JRadioButton E2;
    private javax.swing.JRadioButton E3;
    private javax.swing.JRadioButton E4;
    private javax.swing.JRadioButton E5;
    private javax.swing.JRadioButton E6;
    private javax.swing.JRadioButton E7;
    private javax.swing.JRadioButton E8;
    private javax.swing.JButton HapusButton;
    private javax.swing.JButton KeluarButton;
    private javax.swing.JRadioButton LaskarPelangiButton;
    private javax.swing.JButton ProsesButton;
    private javax.swing.JRadioButton WhoAmIButton;
    private javax.swing.JTextField hargaTxt;
    private javax.swing.JComboBox<String> hariComboBox;
    private javax.swing.JTextField hariTxt;
    private javax.swing.JTextField inputTransaksiTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jamComboBox;
    private javax.swing.JTextField jamTxt;
    private javax.swing.ButtonGroup judulFilmRadioButton;
    private javax.swing.JTextField judulFilmTxt;
    private javax.swing.ButtonGroup kursiRadioButton;
    private javax.swing.JTextField kursiTxt;
    private javax.swing.JTextField nomorTransaksiTxt;
    private javax.swing.JTextField pembayaranTxt;
    // End of variables declaration//GEN-END:variables
}
