
import Service.UtilisateurService;
import entities.Utilisateur;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UtilisateurManager extends javax.swing.JFrame {
 private boolean isUpdating = false; // Tracks whether we're updating a category
    private int selectedUtilisateurId = -1; 
    public UtilisateurManager() {
        initComponents();
         loadUtilisateurs(); 
   jTableUtilisateurs.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        int row = jTableUtilisateurs.getSelectedRow();
        if (row != -1) {
            int utilisateurId = (int) jTableUtilisateurs.getValueAt(row, 0);
            UtilisateurService utilsateurService = new UtilisateurService();
            Utilisateur selectedUtilisateur = utilsateurService.findById(utilisateurId);

            if (selectedUtilisateur != null) {
                onUtilisateurRowSelected(selectedUtilisateur);
            }
        }
    }
});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Reservation = new javax.swing.JButton();
        Client = new javax.swing.JButton();
        Chambre = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Dashboard = new javax.swing.JButton();
        Categorie = new javax.swing.JButton();
        Statistics = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ClientPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUtilisateurs = new javax.swing.JTable();
        Searchbyid = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldSearch = new javax.swing.JTextField();
        Retour = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        Reservation.setBackground(new java.awt.Color(153, 153, 255));
        Reservation.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Reservation.setForeground(new java.awt.Color(204, 204, 255));
        Reservation.setText("Resérvation");
        Reservation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationActionPerformed(evt);
            }
        });

        Client.setBackground(new java.awt.Color(153, 153, 255));
        Client.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Client.setForeground(new java.awt.Color(204, 204, 255));
        Client.setText("Client");
        Client.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientActionPerformed(evt);
            }
        });

        Chambre.setBackground(new java.awt.Color(153, 153, 255));
        Chambre.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Chambre.setForeground(new java.awt.Color(204, 204, 255));
        Chambre.setText("Chambre");
        Chambre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Chambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChambreActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 102, 255));
        jButton7.setText("Utilisateur");
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Dashboard.setBackground(new java.awt.Color(153, 153, 255));
        Dashboard.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setText("Dashboard");
        Dashboard.setBorder(null);
        Dashboard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DashboardActionPerformed(evt);
            }
        });

        Categorie.setBackground(new java.awt.Color(153, 153, 255));
        Categorie.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Categorie.setForeground(new java.awt.Color(204, 204, 255));
        Categorie.setText("Catégorie");
        Categorie.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Categorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategorieActionPerformed(evt);
            }
        });

        Statistics.setBackground(new java.awt.Color(153, 153, 255));
        Statistics.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Statistics.setForeground(new java.awt.Color(204, 204, 255));
        Statistics.setText("Statistiques");
        Statistics.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Statistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Statistics, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Categorie, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chambre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reservation, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(23, 23, 23)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(162, 162, 162)
                .addComponent(Chambre, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Categorie, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(Reservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(Statistics, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addComponent(Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(416, 416, 416)))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\info\\Desktop\\2.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome Admin !");

        Logout.setBackground(new java.awt.Color(204, 204, 255));
        Logout.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(102, 102, 255));
        Logout.setText("Log Out ");
        Logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 255), new java.awt.Color(153, 204, 255), null, new java.awt.Color(153, 153, 255)));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Logout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setText("© 2025 Kawtar Tanassa");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        ClientPanel.setPreferredSize(new java.awt.Dimension(1020, 467));

        jTableUtilisateurs.setFont(new java.awt.Font("Calibri", 0, 18));
        jTableUtilisateurs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUtilisateurs.setAlignmentX(1.0F);
        jTableUtilisateurs.setAlignmentY(2.0F);
        jTableUtilisateurs.setCellSelectionEnabled(true);
        jTableUtilisateurs.setRowHeight(25);
        jTableUtilisateurs.setShowGrid(true);
        jScrollPane1.setViewportView(jTableUtilisateurs);
        jTableUtilisateurs.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        Searchbyid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Searchbyid.setText("Chercher");
        Searchbyid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbyidActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 102, 255));
        jLabel10.setText("Username");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 102, 255));
        jLabel11.setText("Password");

        Add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Add.setForeground(new java.awt.Color(51, 0, 102));
        Add.setText("Ajouter");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cancel.setForeground(new java.awt.Color(102, 0, 0));
        Cancel.setText("Annuler");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setText("Gestion des utilisateurs");

        jTextFieldUsername.setBackground(new java.awt.Color(232, 255, 255));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jTextFieldPassword.setBackground(new java.awt.Color(227, 255, 255));
        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });

        Retour.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Retour.setText("Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        jLabel1.setText("Recherche par id:");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\info\\Desktop\\alert.png")); // NOI18N

        javax.swing.GroupLayout ClientPanelLayout = new javax.swing.GroupLayout(ClientPanel);
        ClientPanel.setLayout(ClientPanelLayout);
        ClientPanelLayout.setHorizontalGroup(
            ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Searchbyid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Retour)
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ClientPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Add)
                                .addGap(66, 66, 66)
                                .addComponent(Cancel)))
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        ClientPanelLayout.setVerticalGroup(
            ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Searchbyid)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Retour)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addGap(52, 52, 52))
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Cancel))
                        .addContainerGap(143, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(345, 345, 345))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
this.dispose(); // Dispose the current window
    LoginWindow loginWindow = new LoginWindow(); // Instantiate LoginWindow
    loginWindow.setVisible(true); // Show LoginWindow
    }//GEN-LAST:event_LogoutActionPerformed
private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
 
}
    private void ReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationActionPerformed
ReservationManager reservationManager = new ReservationManager();
    reservationManager.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_ReservationActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
  UtilisateurManager statisticsManager = new UtilisateurManager();
    statisticsManager.setVisible(true);
    this.dispose();   
    }//GEN-LAST:event_jButton7ActionPerformed




private void deleteUtilisateur(Utilisateur utilisateur) {
    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Êtes-vous sûr de vouloir supprimer cet utilisateur ?",
        "Supprimer Utilisateur",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
    );

    if (confirm == JOptionPane.YES_OPTION) {
        UtilisateurService utilisateurService = new UtilisateurService();
        if (utilisateurService.delete(utilisateur)) {
            JOptionPane.showMessageDialog(this, "Utilisateur supprimé avec succès !");
            loadUtilisateurs(); // Refresh the table
        } else {
            JOptionPane.showMessageDialog(this, "Échec de la suppression.");
        }
    }
}
    private void SearchbyidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbyidActionPerformed
   String idText = jTextFieldSearch.getText(); // Get ID from the text field

    if (!idText.isEmpty()) {
        try {
            int id = Integer.parseInt(idText); // Parse ID to an integer
            UtilisateurService utilisateurService = new UtilisateurService();
            List<Utilisateur> utilisateurs = utilisateurService.findById2(id); // Fetch users by ID

            if (!utilisateurs.isEmpty()) {
                updateTable(utilisateurs); // Populate table with results
            } else {
                JOptionPane.showMessageDialog(this, "Aucun utilisateur trouvé.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Veuillez saisir un ID valide.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Veuillez saisir un ID à rechercher.");
    }
    }//GEN-LAST:event_SearchbyidActionPerformed
// MouseListener for row click
private void onUtilisateurRowSelected(Utilisateur selectedUtilisateur) {
    jTextFieldUsername.setText(selectedUtilisateur.getUsername());
    jTextFieldPassword.setText(selectedUtilisateur.getPassword()); // Assuming "Password" is displayed for simplicity

    isUpdating = true;
    selectedUtilisateurId = selectedUtilisateur.getId();
    Add.setText("Modifier");

    String[] options = {"Modifier", "Supprimer", "Annuler"};
    int choice = JOptionPane.showOptionDialog(
        this,
        "Que souhaitez-vous faire avec l'utilisateur sélectionné ?",
        "Options Utilisateur",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[0]
    );

    if (choice == 0) { // Update
        JOptionPane.showMessageDialog(this, "Modifiez les champs et cliquez sur 'Modifier' pour enregistrer.");
    } else if (choice == 1) { // Delete
        deleteUtilisateur(selectedUtilisateur);
    } else { // Cancel
        resetForm();
    }
}


// Add/Update action
private void AddActionPerformed(java.awt.event.ActionEvent evt) {
    String username = jTextFieldUsername.getText();
    String password = jTextFieldPassword.getText();

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.");
        return;
    }

    UtilisateurService utilisateurService = new UtilisateurService();

    if (isUpdating) {
        Utilisateur updatedUtilisateur = new Utilisateur(selectedUtilisateurId, username, password);
        if (utilisateurService.update(updatedUtilisateur)) {
            JOptionPane.showMessageDialog(this, "Utilisateur modifié avec succès !");
        } else {
            JOptionPane.showMessageDialog(this, "Échec de la modification.");
        }
    } else {
        Utilisateur newUtilisateur = new Utilisateur(username, password);
        if (utilisateurService.create(newUtilisateur)) {
            JOptionPane.showMessageDialog(this, "Utilisateur ajouté avec succès !");
        } else {
            JOptionPane.showMessageDialog(this, "Échec de l'ajout.");
        }
    }

    resetForm();
    loadUtilisateurs(); // Refresh the table
}

private void updateTable(List<Utilisateur> utilisateurs) {
   DefaultTableModel model = (DefaultTableModel) jTableUtilisateurs.getModel();
    model.setRowCount(0); // Clear existing rows
    for (Utilisateur utilisateur : utilisateurs) {
        model.addRow(new Object[] { utilisateur.getId(), utilisateur.getUsername(), utilisateur.getPassword() });
    }
}

private void loadUtilisateurs() {
    UtilisateurService utilisateurService = new UtilisateurService();
    List<Utilisateur> utilisateurs = utilisateurService.findAll();
    updateTable(utilisateurs);
}/*
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

    }//GEN-LAST:event_AddActionPerformed
*/
private void resetForm() {
    jTextFieldUsername.setText("");
    jTextFieldPassword.setText("");
    Add.setText("Ajouter");
    isUpdating = false;
    selectedUtilisateurId = -1;
}
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
    resetForm();
    }//GEN-LAST:event_CancelActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DashboardActionPerformed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        loadUtilisateurs();
    }//GEN-LAST:event_RetourActionPerformed

    private void CategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategorieActionPerformed
        CategorieManager categorieManager = new CategorieManager();
        categorieManager.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategorieActionPerformed

    private void ChambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChambreActionPerformed
        ChambreManager chambreManager = new ChambreManager();
        chambreManager.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChambreActionPerformed

    private void ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientActionPerformed
       ClientManager clientManager = new ClientManager();
        clientManager.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ClientActionPerformed

    private void StatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsActionPerformed
        StatistiqueManager statisticsManager = new StatistiqueManager();
        statisticsManager.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StatisticsActionPerformed

   

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
            java.util.logging.Logger.getLogger(ClientManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UtilisateurManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Categorie;
    private javax.swing.JButton Chambre;
    private javax.swing.JButton Client;
    private javax.swing.JPanel ClientPanel;
    private javax.swing.JButton Dashboard;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Reservation;
    private javax.swing.JButton Retour;
    private javax.swing.JButton Searchbyid;
    private javax.swing.JButton Statistics;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUtilisateurs;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}