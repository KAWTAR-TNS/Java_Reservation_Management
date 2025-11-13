import Service.ChambreService;
import Service.ClientService;
import Service.ReservationService;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entities.Client;
import entities.Reservation;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import com.itextpdf.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;
import java.awt.Desktop;
import java.io.File;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;



public class ReservationRecep extends javax.swing.JFrame {

    public ReservationRecep() {
        initComponents();
         loadReservations(); 
         populateComboBoxes();
 jTableReservations.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        onReservationRowSelected(evt);
    }
});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        Dashboard = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ClientPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReservations = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Retour = new javax.swing.JButton();
        jComboBoxNumChambre = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxCINClient = new javax.swing.JComboBox<>();
        jDateFin = new com.toedter.calendar.JDateChooser();
        jDateDebut = new com.toedter.calendar.JDateChooser();
        PDFReservation = new javax.swing.JButton();
        jComboBoxSearcCL = new javax.swing.JComboBox<>();
        jDateSearchFin = new com.toedter.calendar.JDateChooser();
        jDateSearchDebut = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ff = new javax.swing.JLabel();
        ff1 = new javax.swing.JLabel();
        ff2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 255));
        jButton3.setText("Resérvation");
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(277, 277, 277)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(231, 231, 231))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\info\\Desktop\\2.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome ");

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
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Logout))
                .addContainerGap(9, Short.MAX_VALUE))
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

        jTableReservations.setFont(new java.awt.Font("Calibri", 0, 18));
        jTableReservations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date début", "Date Fin", "CIN client", "Num Chambre", "Status", "Prix"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableReservations.setAlignmentX(1.0F);
        jTableReservations.setAlignmentY(2.0F);
        jTableReservations.setCellSelectionEnabled(true);
        jTableReservations.setRowHeight(25);
        jTableReservations.setShowGrid(true);
        jScrollPane1.setViewportView(jTableReservations);
        jTableReservations.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Search.setText("Chercher");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 102, 255));
        jLabel10.setText("Date de Début");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 102, 255));
        jLabel11.setText("Date de Fin");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 102, 255));
        jLabel12.setText("CIN du client");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 102, 255));
        jLabel13.setText("Numéro de Chambre");

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
        jLabel5.setText("Gestion des réservations");

        Retour.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Retour.setText("Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        jComboBoxNumChambre.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxNumChambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNumChambreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Les réservations d'un client entre 2 dates :");

        jComboBoxCINClient.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxCINClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCINClientActionPerformed(evt);
            }
        });

        jDateFin.setBackground(new java.awt.Color(204, 255, 255));

        jDateDebut.setBackground(new java.awt.Color(204, 255, 255));

        PDFReservation.setBackground(new java.awt.Color(255, 255, 204));
        PDFReservation.setText("Afficher Lise des réservation PDF");
        PDFReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFReservationActionPerformed(evt);
            }
        });

        jComboBoxSearcCL.setBackground(new java.awt.Color(221, 255, 255));
        jComboBoxSearcCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearcCLActionPerformed(evt);
            }
        });

        jDateSearchFin.setBackground(new java.awt.Color(222, 255, 255));

        jDateSearchDebut.setBackground(new java.awt.Color(215, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        ff.setForeground(new java.awt.Color(0, 0, 153));
        ff.setText("CIN du client");

        ff1.setForeground(new java.awt.Color(0, 0, 153));
        ff1.setText("Date de début :");

        ff2.setForeground(new java.awt.Color(0, 0, 153));
        ff2.setText("Date de fin :");

        javax.swing.GroupLayout ClientPanelLayout = new javax.swing.GroupLayout(ClientPanel);
        ClientPanel.setLayout(ClientPanelLayout);
        ClientPanelLayout.setHorizontalGroup(
            ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addComponent(Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancel))
                    .addComponent(jComboBoxNumChambre, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBoxCINClient, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jDateDebut, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jSeparator2))))
                .addGap(24, 24, 24)
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientPanelLayout.createSequentialGroup()
                        .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PDFReservation)
                            .addComponent(jSeparator1))
                        .addGap(29, 29, 29))
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSearcCL, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ff))
                        .addGap(97, 97, 97)
                        .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateSearchDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ff1))
                        .addGap(101, 101, 101)
                        .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClientPanelLayout.createSequentialGroup()
                                .addComponent(ff2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(ClientPanelLayout.createSequentialGroup()
                                .addComponent(jDateSearchFin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Retour)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        ClientPanelLayout.setVerticalGroup(
            ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ff)
                    .addComponent(ff1)
                    .addComponent(ff2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(Search)
                    .addComponent(Retour)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxSearcCL, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jDateSearchFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateSearchDebut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClientPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateDebut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCINClient, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel13)
                                .addGap(3, 3, 3)
                                .addComponent(jComboBoxNumChambre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(ClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Add)
                                    .addComponent(Cancel)))
                            .addGroup(ClientPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PDFReservation))))
                    .addGroup(ClientPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
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
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed
private void onReservationRowSelected(java.awt.event.MouseEvent evt) {
    // Get the selected row
    int selectedRow = jTableReservations.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Séléctionner une réservation ! .");
        return;
    }

    // Get the reservation ID from the table
    int reservationId = (int) jTableReservations.getValueAt(selectedRow, 0);
String status = (String) jTableReservations.getValueAt(selectedRow,5); // Assuming status is in column 4

    // If the status is not "en cours", disable options to confirm or cancel
    if (!status.equals("en cours")) {
        JOptionPane.showMessageDialog(this, "Cette réservation est déjà Annulée ou Confirmée !.");
        return;
    }
    int option = JOptionPane.showOptionDialog(
        this,
        "Voulez vous CONFIRMER OU ANNULER ?",
        "Reservation Options",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        new String[]{"Confirmer", "Annuler", "Retour"},
        "Close"
    );

    // Handle the user's choice
    switch (option) {
        case 0: 
            handleConfirmReservation(reservationId);
            break;
        case 1: 
            handleCancelReservation(reservationId);
            break;
        default:
            break; 
    }
}
private void handleConfirmReservation(int reservationId) {
    ReservationService reservationService = new ReservationService();
    boolean success = reservationService.confirm(reservationId);

    if (success) {
        JOptionPane.showMessageDialog(this, "Reservation confirmed successfully!");
        loadReservations(); // Refresh the table
    } else {
        JOptionPane.showMessageDialog(this, "Failed to confirm reservation.");
    }
}
private void handleCancelReservation(int reservationId) {
    ReservationService reservationService = new ReservationService();
    boolean success = reservationService.cancel(reservationId);

    if (success) {
        JOptionPane.showMessageDialog(this, "Reservation canceled successfully!");
        loadReservations(); // Refresh the table
    } else {
        JOptionPane.showMessageDialog(this, "Failed to cancel reservation.");
    }
}

    private void searchChambretById(int id) {
    ReservationService reservationService = new ReservationService();  // Create an instance of ClientService
    List<Reservation> reservations = reservationService.findById2(id); 
    updateTable(reservations);
}

private void updateTable(List<Reservation> reservations) {
    DefaultTableModel model = (DefaultTableModel) jTableReservations.getModel();
    model.setRowCount(0);  // Clear existing data
    
    for (Reservation reservation : reservations) {
        model.addRow(new Object[] { 
            reservation.getId(), 
            reservation.getDatedebut(), 
            reservation.getDatefin(), 
            reservation.getCIN_client(), 
            reservation.getN_chambre(),
            reservation.getStatus(),
            reservation.getPrix()
        });
    }
}

private void loadReservations() {ReservationService reservationService = new ReservationService();
    List<Reservation> reservations = reservationService.findAll();
    updateTable(reservations);
}
private void showOptionDialog(Client client) {// if the user wanna confirme or cancel the reservation

}

private void onClientRowSelected(Client selectedClient) {
    // logic of chosingthe row and between confirm or cancel a reservation
        resetForm();
   
}
private void populateComboBoxes() {
    ClientService clientService = new ClientService();
    List<String> clientCINs = clientService.getAllClientCINs();  // Assuming this method returns a list of CINs
    for (String cin : clientCINs) {
        jComboBoxCINClient.addItem(cin);
        jComboBoxSearcCL.addItem(cin);
    }

    ChambreService chambreService = new ChambreService();
    List<Integer> chambreNumbers = chambreService.getAllChambreNumbers();  // Assuming this method returns a list of room numbers
    for (Integer chambreNumber : chambreNumbers) {
        jComboBoxNumChambre.addItem(chambreNumber.toString());
    }
}
private void AddActionPerformed(java.awt.event.ActionEvent evt) {                                      
    try {
        // Get the selected dates from the JDateChooser components
        Date datedebut = jDateDebut.getDate();  // Assuming jDateDebut is for 'datedebut'
        Date datefin = jDateFin.getDate();      // Assuming jDateFin is for 'datefin'

        // Check if both dates are selected
        if (datedebut == null || datefin == null) {
            JOptionPane.showMessageDialog(this, "Please select both dates.");
            return;
        }

        if (datefin.before(datedebut)) {
            JOptionPane.showMessageDialog(this, "The end date must be after the start date.");
            return;
        }

        String cinClient = jComboBoxCINClient.getSelectedItem().toString();
        int numChambre = Integer.parseInt(jComboBoxNumChambre.getSelectedItem().toString());

        Reservation reservation = new Reservation(datedebut, datefin, cinClient, numChambre, "en cours");
        ReservationService resService = new ReservationService(); // Replace with the actual class name
double price = resService.calculatePrice(reservation);

        if (price <= 0) {
            JOptionPane.showMessageDialog(this, "Failed to calculate price. Please check the room and category details.");
            return;
        }
        reservation.setPrix(price);

        // Add the reservation
        ReservationService reservationService = new ReservationService();
        boolean success = reservationService.create(reservation);

        if (success) {
            JOptionPane.showMessageDialog(this, "Reservation added successfully!");
            resetForm();  // Reset the form
            loadReservations();  // Refresh the table with updated reservations
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add reservation. The room might be unavailable for the selected dates.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}

private void resetForm() {
  jDateDebut.setDate(null);  // Reset the start date chooser
    jDateFin.setDate(null);    // Reset the end date chooser
    jComboBoxCINClient.setSelectedIndex(0);  // Reset the CIN combo box
    jComboBoxNumChambre.setSelectedIndex(0);

}


    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
try {
        // Step 1: Retrieve user inputs from the form
        String cinClient = jComboBoxSearcCL.getSelectedItem().toString();  // Get selected CIN from the combo box
        Date datedebut = jDateSearchDebut.getDate();  // Get the 'datedebut' from JDateChooser
        Date datefin = jDateSearchFin.getDate();  // Get the 'datefin' from JDateChooser
        
        // Check if dates are selected
        if (datedebut == null || datefin == null) {
            JOptionPane.showMessageDialog(this, "Please select both start and end dates.");
            return;
        }

        // Step 2: Call the method to get the list of reservations based on the criteria
        ReservationService reservationService = new ReservationService();
        List<Reservation> reservations = reservationService.findReservationsByCINAndDateRange(cinClient, datedebut, datefin);

        // Step 3: Display the search results in the JTable
        // Assuming your JTable model is set up with the necessary columns
        DefaultTableModel model = (DefaultTableModel) jTableReservations.getModel();
        model.setRowCount(0); // Clear the existing rows
        
        // Populate JTable with results
        for (Reservation reservation : reservations) {
            Object[] row = new Object[] {
                reservation.getId(),
                reservation.getDatedebut(),
                reservation.getDatefin(),
                reservation.getCIN_client(),
                reservation.getN_chambre(),
                reservation.getStatus(),
                reservation.getPrix()
            };
            model.addRow(row);  // Add the reservation data as a row in the JTable
        }

        // Show message if no results found
        if (reservations.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No reservations found for the selected criteria.");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_SearchActionPerformed
/*
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

    }//GEN-LAST:event_AddActionPerformed
*/
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
     resetForm();
    }//GEN-LAST:event_CancelActionPerformed

    private void DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardActionPerformed
 DashboardRecep reservationManager = new  DashboardRecep();
    reservationManager.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_DashboardActionPerformed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
 loadReservations();
    }//GEN-LAST:event_RetourActionPerformed

    private void jComboBoxNumChambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNumChambreActionPerformed
    
    }//GEN-LAST:event_jComboBoxNumChambreActionPerformed

    private void jComboBoxCINClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCINClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCINClientActionPerformed

    private void PDFReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFReservationActionPerformed
    try {
        // Step 1: Fetch all reservations from the database
        ReservationService reservationService = new ReservationService();
        List<Reservation> reservations = reservationService.findAll();

        // Step 2: Set up the PDF file
        String fileName = "Reservations.pdf";
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(fileName));

        document.open();
        document.add(new Paragraph("Historique des réservations : "));
        document.add(new Paragraph(" "));
        PdfPTable table = new PdfPTable(7);
        float[] columnWidths = {1f, 3f, 3f, 3f, 3f, 2.5f, 2f};
table.setWidths(columnWidths);
        table.addCell("ID");
        table.addCell("Date Début");
        table.addCell("Date Fin");
        table.addCell("CIN Client");
        table.addCell("N° Chambre");
        table.addCell("Status");
        table.addCell("Prix");

        // Step 5: Populate the table with reservation data
        for (Reservation reservation : reservations) {
            table.addCell(String.valueOf(reservation.getId()));
            table.addCell(reservation.getDatedebut().toString());
            table.addCell(reservation.getDatefin().toString());
            table.addCell(reservation.getCIN_client());
            table.addCell(String.valueOf(reservation.getN_chambre()));
            table.addCell(reservation.getStatus());
            table.addCell(String.format("%.2f", reservation.getPrix()));
        }
        document.add(table);
        document.close();

        File pdfFile = new File(fileName);
        if (Desktop.isDesktopSupported() && pdfFile.exists()) {
            Desktop.getDesktop().open(pdfFile);
        } else {
            JOptionPane.showMessageDialog(this, "PDF generated but cannot be opened automatically. Please open it manually.");
        }

        // Step 8: Show success message
        JOptionPane.showMessageDialog(this, "PDF généré avec succès!");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_PDFReservationActionPerformed

    private void jComboBoxSearcCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearcCLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSearcCLActionPerformed
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
    private javax.swing.JPanel ClientPanel;
    private javax.swing.JButton Dashboard;
    private javax.swing.JButton Logout;
    private javax.swing.JButton PDFReservation;
    private javax.swing.JButton Retour;
    private javax.swing.JButton Search;
    private javax.swing.JLabel ff;
    private javax.swing.JLabel ff1;
    private javax.swing.JLabel ff2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxCINClient;
    private javax.swing.JComboBox<String> jComboBoxNumChambre;
    private javax.swing.JComboBox<String> jComboBoxSearcCL;
    private com.toedter.calendar.JDateChooser jDateDebut;
    private com.toedter.calendar.JDateChooser jDateFin;
    private com.toedter.calendar.JDateChooser jDateSearchDebut;
    private com.toedter.calendar.JDateChooser jDateSearchFin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableReservations;
    // End of variables declaration//GEN-END:variables
}