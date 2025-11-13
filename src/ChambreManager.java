
import Service.CategorieService;
import Service.ChambreService;
import Service.ClientService;
import entities.Chambre;
import entities.Client;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;
import javax.swing.BorderFactory;

public class ChambreManager extends javax.swing.JFrame {

    public ChambreManager() {
        initComponents();
        loadCategoriesIntoComboBox();
         loadChambres(); 
  jTableChambres.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int row = jTableChambres.getSelectedRow(); // Get the selected row index
            if (row != -1) {
                // Retrieve the chambre ID from the first column (index 0)
                int chambreId = (int) jTableChambres.getValueAt(row, 0);

                // Fetch the Chambre object based on the retrieved ID
                ChambreService chambreService = new ChambreService();
                Chambre selectedChambre = chambreService.findById(chambreId);

                // If the chambre was found, pass it to onChambreRowSelected for further processing
                if (selectedChambre != null) {
                    onChambreRowSelected(selectedChambre);
                } else {
                    // Optionally, show a message if the chambre wasn't found
                    JOptionPane.showMessageDialog(ChambreManager.this, "Chambre non trouvée !");
                }
            } else {
                // Optionally, show a message if no row is selected
                JOptionPane.showMessageDialog(ChambreManager.this, "Veuillez sélectionner une chambre !");
            }
        }
    });
}
private void loadCategoriesIntoComboBox() {
    CategorieService categorieService = new CategorieService();
    List<String> categories = categorieService.findAllLibelles();
    jComboBoxCategorie.removeAllItems(); // Clear existing items
    for (String libelle : categories) {
        jComboBoxCategorie.addItem(libelle); // Add each libelle
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Reservation = new javax.swing.JButton();
        Client = new javax.swing.JButton();
        Chambre = new javax.swing.JButton();
        Statistics = new javax.swing.JButton();
        Dashboard = new javax.swing.JButton();
        Categorie = new javax.swing.JButton();
        Statistics1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ClientPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableChambres = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldTelephone = new javax.swing.JTextField();
        jTextFieldSearch = new javax.swing.JTextField();
        Retour = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxCategorie = new javax.swing.JComboBox<>();

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

        Chambre.setBackground(new java.awt.Color(204, 255, 255));
        Chambre.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Chambre.setForeground(new java.awt.Color(102, 102, 255));
        Chambre.setText("Chambre");
        Chambre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        Statistics1.setBackground(new java.awt.Color(153, 153, 255));
        Statistics1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Statistics1.setForeground(new java.awt.Color(204, 204, 255));
        Statistics1.setText("Utilisateur");
        Statistics1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Statistics1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Statistics1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Statistics1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Categorie, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Statistics, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(154, 154, 154)
                .addComponent(Chambre, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Categorie, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(Reservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(Statistics, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Statistics1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(108, 108, 108))
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

        jTableChambres.setFont(new java.awt.Font("Calibri", 0, 18));
        jTableChambres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Numéro", "Téléphone", "Catégorie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableChambres.setAlignmentX(1.0F);
        jTableChambres.setAlignmentY(2.0F);
        jTableChambres.setCellSelectionEnabled(true);
        jTableChambres.setRowHeight(25);
        jTableChambres.setShowGrid(true);
        jScrollPane1.setViewportView(jTableChambres);
        jTableChambres.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Search.setText("Chercher");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 102, 255));
        jLabel10.setText("Numéro");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 102, 255));
        jLabel11.setText("Téléphone");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 102, 255));
        jLabel12.setText("Catégorie");

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
        jLabel5.setText("Gestion des chambres");

        jTextFieldNumero.setBackground(new java.awt.Color(232, 255, 255));
        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });

        jTextFieldTelephone.setBackground(new java.awt.Color(227, 255, 255));
        jTextFieldTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelephoneActionPerformed(evt);
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

        jLabel1.setText("Recherche par numéro :");

        jComboBoxCategorie.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategorieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClientPanelLayout = new javax.swing.GroupLayout(ClientPanel);
        ClientPanel.setLayout(ClientPanelLayout);
        ClientPanelLayout.setHorizontalGroup(
            ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(Cancel)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(jComboBoxCategorie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Retour)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ClientPanelLayout.setVerticalGroup(
            ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Retour)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Cancel)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addGap(52, 52, 52))
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
        this.dispose();
    LoginWindow loginWindow = new LoginWindow();
    loginWindow.setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed
private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
 
}
    private void ReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationActionPerformed
ReservationManager reservationManager = new ReservationManager();
    reservationManager.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_ReservationActionPerformed

    private void StatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsActionPerformed
  StatistiqueManager statisticsManager = new StatistiqueManager();
    statisticsManager.setVisible(true);
    this.dispose();   
    }//GEN-LAST:event_StatisticsActionPerformed

    private void searchChambreByNumero(int numero) {
    ChambreService chambreService = new ChambreService();  // Create an instance of ClientService
    List<Chambre> chambres = chambreService.findByNumero(numero);  // Call the instance method
    updateTable(chambres);
}
private void updateTable(List<Chambre> chambres) {
    DefaultTableModel model = (DefaultTableModel) jTableChambres.getModel();
    model.setRowCount(0);  // Clear existing data
    for (Chambre chambre : chambres) {
        model.addRow(new Object[] {
            chambre.getId(),
            chambre.getNumero(),
            chambre.getTelephone(),
            chambre.getCategorie()
        });
    }
}

private void loadChambres() {
    ChambreService chambreService = new ChambreService();
    List<Chambre> chambres = chambreService.findAll();
    updateTable(chambres);
}

// Method to show options for update or delete
private void showOptionDialog(Chambre chambre) {
    String[] options = {"Modifier", "Suprrimer"};
    int choice = JOptionPane.showOptionDialog(
        this,
        "Que désiez vous faire ?",
        "Chambre Options",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        options,
        options[0]  // Default option
    );

    if (choice == 0) {
        openUpdateChambretForm(chambre);
    } else if (choice == 1) {
        deleteChambre(chambre);
    }
}
// Declare a global variable to track if you're updating or adding
private boolean isUpdating = false;
private int selectedChambreId = -1;  // This will store the client ID if you're updating
private void onChambreRowSelected(Chambre selectedChambre) {
    // Vérifier si l'objet sélectionné est null
    if (selectedChambre == null) {
        System.out.println("Aucune chambre sélectionnée.");
        JOptionPane.showMessageDialog(this, "Aucune chambre sélectionnée !");
        return;  // Retourner si aucune chambre n'est sélectionnée
    }

    // Vérifier si l'ID de la chambre est valide (par exemple > 0)
    if (selectedChambre.getId() <= 0) {
        System.out.println("ID de la chambre invalide: " + selectedChambre.getId());
        JOptionPane.showMessageDialog(this, "Chambre non sélectionnée correctement !");
        return;  // Retourner si l'ID est invalide
    }

    // Afficher l'ID pour le test
    System.out.println("ID de la chambre sélectionnée: " + selectedChambre.getId());

    // Mettre à jour les champs de texte avec les informations de la chambre sélectionnée
    jTextFieldNumero.setText(String.valueOf(selectedChambre.getNumero()));  // Convertir l'int en String
    jTextFieldTelephone.setText(selectedChambre.getTelephone());

    // Remplir le champ catégorie
    jComboBoxCategorie.setSelectedItem(selectedChambre.getCategorie());

    // Mettre à jour les variables globales pour le mode mise à jour
    isUpdating = true;
    selectedChambreId = selectedChambre.getId();

    // Changer le texte du bouton pour "Modifier"
    Add.setText("Modifier");

    // Afficher le dialogue de choix
    String[] options = {"Modifier", "Supprimer", "Annuler"};
    int choice = JOptionPane.showOptionDialog(
        this,
        "Que souhaitez-vous faire avec la chambre sélectionnée ?",
        "Options Chambre",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[0] // Option par défaut est "Modifier"
    );

    // Traiter les choix de l'utilisateur
    if (choice == 0) {  // Modifier
        JOptionPane.showMessageDialog(this, "Modifiez les champs et cliquez sur 'Modifier' pour enregistrer.");
    } else if (choice == 1) {  // Supprimer
        // Confirmer la suppression
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Êtes-vous sûr de vouloir supprimer cette chambre ?",
            "Confirmation de suppression",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        if (confirm == JOptionPane.YES_OPTION) {
            // Effectuer la suppression
            ChambreService chambreService = new ChambreService();
            if (chambreService.delete(selectedChambre)) {
                JOptionPane.showMessageDialog(this, "Chambre supprimée avec succès !");
                loadChambres();  // Rafraîchir le tableau
                resetForm();  // Réinitialiser le formulaire après suppression
            } else {
                JOptionPane.showMessageDialog(this, "Échec de la suppression de la chambre.");
            }
        }
    } else {  // Annuler
        resetForm();
    }
}

private void resetForm() {
    jTextFieldNumero.setText("");
    jTextFieldTelephone.setText("");
    jComboBoxCategorie.setSelectedIndex(-1);
    Add.setText("Ajouter");
    isUpdating = false;
    selectedChambreId = -1;
}
private void openUpdateChambretForm(Chambre chambre) {
    jTextFieldNumero.setText(String.valueOf(chambre.getNumero()));
    jTextFieldTelephone.setText(chambre.getTelephone());

    // Populate the combo box with category options
    jComboBoxCategorie.removeAllItems();  // Clear existing items
    CategorieService categorieService = new CategorieService();
    List<String> categories = categorieService.findAllLibelles();  // Assuming this method fetches category names

    for (String categorie : categories) {
        jComboBoxCategorie.addItem(categorie);
    }

    // Set the selected category
    jComboBoxCategorie.setSelectedItem(chambre.getCategorie());  // Set the selected category
}

private void deleteChambre(Chambre chambre) {
    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Êtes-vous sûre de supprimer cette chambre?",
        "Supprimer Chambre",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
    );

    if (confirm == JOptionPane.YES_OPTION) {
        ChambreService chambreService = new ChambreService();
        if (chambreService.delete(chambre)) {
            JOptionPane.showMessageDialog(this, "Chambre supprimée avce succès !");
            loadChambres();  // Refresh table
        } else {
            JOptionPane.showMessageDialog(this, "Echec de suppression.");
        }
    }
}

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
   String numeroInput = jTextFieldSearch.getText().trim();

    if (numeroInput.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Veuillez entrer un numéro valide !");
        return;
    }

    int numero;
    try {
        numero = Integer.parseInt(numeroInput); // Convert to int
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Le numéro doit être un entier valide !");
        return;}
     ChambreService chambreService = new ChambreService();
    List<Chambre> chambres = chambreService.findByNumero(numero);

    if (chambres.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Aucune chambre trouvée avec ce numéro.");
    } else {
        updateTable(chambres);
    }
    }//GEN-LAST:event_SearchActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
 String numeroInput = jTextFieldNumero.getText().trim();
    String telephone = jTextFieldTelephone.getText().trim();
    String categorie = (String) jComboBoxCategorie.getSelectedItem(); // Get selected category

    // Validate inputs
    if (numeroInput.isEmpty() || telephone.isEmpty() || categorie == null) {
        JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs !");
        return;
    }

    int numero;
    try {
        numero = Integer.parseInt(numeroInput); // Convert numero to int
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Le numéro doit être un entier valide !");
        return;
    }

    ChambreService chambreService = new ChambreService();

    if (isUpdating) {
        Chambre updatedChambre = new Chambre(selectedChambreId, numero, telephone, categorie);
        if (chambreService.update(updatedChambre)) {
            JOptionPane.showMessageDialog(this, "Chambre modifiée avec succès !");
        } else {
            JOptionPane.showMessageDialog(this, "Échec de modification !");
        }
    } else {
        Chambre newChambre = new Chambre(numero, telephone, categorie);
        if (chambreService.create(newChambre)) {
            JOptionPane.showMessageDialog(this, "Chambre ajoutée avec succès !");
        } else {
            JOptionPane.showMessageDialog(this, "Échec d'ajout !");
        }
    }
    resetForm();
    loadChambres();
    }//GEN-LAST:event_AddActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
      jTextFieldNumero.setText("");
    jTextFieldTelephone.setText("");
    }//GEN-LAST:event_CancelActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jTextFieldTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelephoneActionPerformed

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DashboardActionPerformed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
 loadChambres();
    }//GEN-LAST:event_RetourActionPerformed

    private void CategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategorieActionPerformed
        CategorieManager categorieManager = new CategorieManager();
        categorieManager.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategorieActionPerformed

    private void jComboBoxCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategorieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategorieActionPerformed

    private void ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientActionPerformed
         ClientManager clientManager = new ClientManager();
        clientManager.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ClientActionPerformed

    private void Statistics1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Statistics1ActionPerformed
        UtilisateurManager utilisateurManager = new UtilisateurManager();
        utilisateurManager.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Statistics1ActionPerformed

   

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
                new ClientManager().setVisible(true);
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
    private javax.swing.JButton Search;
    private javax.swing.JButton Statistics;
    private javax.swing.JButton Statistics1;
    private javax.swing.JComboBox<String> jComboBoxCategorie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableChambres;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldTelephone;
    // End of variables declaration//GEN-END:variables
}