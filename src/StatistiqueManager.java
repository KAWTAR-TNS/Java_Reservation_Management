
import entities.Reservation;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



public class StatistiqueManager extends javax.swing.JFrame {
    public StatistiqueManager() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Reservation = new javax.swing.JButton();
        Client = new javax.swing.JButton();
        Chambre = new javax.swing.JButton();
        Statistiques = new javax.swing.JButton();
        Dashboard = new javax.swing.JButton();
        Categorie = new javax.swing.JButton();
        Statistics = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ClientPanel = new javax.swing.JPanel();
        ChambrePerCategorie = new javax.swing.JButton();
        ChambrePerCategorie1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        Statistiques.setBackground(new java.awt.Color(204, 255, 255));
        Statistiques.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Statistiques.setForeground(new java.awt.Color(102, 102, 255));
        Statistiques.setText("Statistiques");
        Statistiques.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Statistiques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatistiquesActionPerformed(evt);
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
        Statistics.setText("Utilisateur");
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
                    .addComponent(Statistiques, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(162, 162, 162)
                .addComponent(Chambre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(Categorie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Reservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(Statistiques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(Statistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(98, 98, 98))
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        ClientPanel.setPreferredSize(new java.awt.Dimension(1020, 467));

        ChambrePerCategorie.setBackground(new java.awt.Color(153, 204, 255));
        ChambrePerCategorie.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        ChambrePerCategorie.setText("Nombre de Chambres par Catégorie");
        ChambrePerCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChambrePerCategorieActionPerformed(evt);
            }
        });

        ChambrePerCategorie1.setBackground(new java.awt.Color(153, 204, 255));
        ChambrePerCategorie1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        ChambrePerCategorie1.setText("Nombre de Réservations d'un Client par année");
        ChambrePerCategorie1.setActionCommand("Nombre de Réservations d'un client par année");
        ChambrePerCategorie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChambrePerCategorie1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setText("Les Statistiques");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\info\\Desktop\\pie-chart.png")); // NOI18N

        javax.swing.GroupLayout ClientPanelLayout = new javax.swing.GroupLayout(ClientPanel);
        ClientPanel.setLayout(ClientPanelLayout);
        ClientPanelLayout.setHorizontalGroup(
            ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(ChambrePerCategorie)
                .addGap(50, 50, 50)
                .addComponent(ChambrePerCategorie1)
                .addGap(24, 24, 24))
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(jLabel5)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClientPanelLayout.setVerticalGroup(
            ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(105, 105, 105)
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChambrePerCategorie1)
                    .addComponent(ChambrePerCategorie))
                .addContainerGap(247, Short.MAX_VALUE))
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

    private void DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardActionPerformed

    }//GEN-LAST:event_DashboardActionPerformed

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

    private void StatistiquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatistiquesActionPerformed
 ClientPanel.removeAll(); 
    
    // Add the chart panel
    Chart1 chart1Panel = new Chart1();
    ClientPanel.setLayout(new java.awt.BorderLayout()); // Ensure correct layout
    ClientPanel.add(chart1Panel);
    
    // Revalidate and repaint the ClientPanel
    ClientPanel.revalidate();
    ClientPanel.repaint();
    }//GEN-LAST:event_StatistiquesActionPerformed

    private void ReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationActionPerformed
        ReservationManager reservationManager = new ReservationManager();
        reservationManager.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReservationActionPerformed

    private void ChambrePerCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChambrePerCategorieActionPerformed
    JFrame frame = new JFrame("Chambre par Catégorie");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close this frame when done
   Chart1 chart1Panel = new Chart1();
   frame.getContentPane().add(chart1Panel);
   frame.setSize(800, 600);  // Adjust the size as needed
    frame.setLocationRelativeTo(null);  // Center the window
    frame.setVisible(true);
    }//GEN-LAST:event_ChambrePerCategorieActionPerformed

    private void ChambrePerCategorie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChambrePerCategorie1ActionPerformed
SwingUtilities.invokeLater(new Runnable() {
    @Override
    public void run() {
        // Your code for adding the Chart2 to the frame
        JFrame frame = new JFrame("Chart2 ");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Chart2 chart2Panel = new Chart2();
        frame.getContentPane().add(chart2Panel);

        List<Reservation> reservations = chart2Panel.fetchReservations();
        chart2Panel.loadClients(reservations);

        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
});
    }//GEN-LAST:event_ChambrePerCategorie1ActionPerformed

    private void StatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsActionPerformed
        UtilisateurManager utilisateurManager = new UtilisateurManager();
        utilisateurManager.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StatisticsActionPerformed

   

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Categorie;
    private javax.swing.JButton Chambre;
    private javax.swing.JButton ChambrePerCategorie;
    private javax.swing.JButton ChambrePerCategorie1;
    private javax.swing.JButton Client;
    private javax.swing.JPanel ClientPanel;
    private javax.swing.JButton Dashboard;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Reservation;
    private javax.swing.JButton Statistics;
    private javax.swing.JButton Statistiques;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}