import Service.ReservationService;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import entities.Reservation;

import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.List;
public class Chart2 extends javax.swing.JPanel {

    private JComboBox<String> clientComboBox; // Combo box to select client
    private JPanel chartPanel;  // Panel to hold the chart

    public Chart2() {
        // Initialize the client combo box
        clientComboBox = new JComboBox<>();
        clientComboBox.setBorder(BorderFactory.createEmptyBorder(20, 300, 0, 300));
        clientComboBox.addActionListener(e -> updateChart()); // Add listener for combo box selection

        // Initialize the chart panel
        chartPanel = new JPanel();
chartPanel.setBorder(BorderFactory.createEmptyBorder(60, 20, 20, 20));
        // Create a sample chart initially
        updateChart();

        // Add components to the panel
        setLayout(new BorderLayout());
        add(clientComboBox, BorderLayout.NORTH);
        add(chartPanel, BorderLayout.CENTER);
    }

    List<Reservation> fetchReservations() {
        // Fetch the list of reservations from the ReservationService
        ReservationService reservationService = new ReservationService();
        return reservationService.findAll();  // Fetch all reservations from the database
    }

   private DefaultCategoryDataset createDataset(String selectedClient, List<Reservation> reservations) {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    // Map to store the count of reservations per year
    Map<Integer, Integer> yearlyReservations = new HashMap<>();

    // Loop through reservations and group by client and year
    for (Reservation reservation : reservations) {
        if (reservation.getCIN_client().equals(selectedClient)) {
            // Convert java.sql.Date to java.util.Date and then to LocalDate to get the year
            java.sql.Date sqlDate = (java.sql.Date) reservation.getDatedebut(); // Get the java.sql.Date
            LocalDate localDate = sqlDate.toLocalDate(); // Convert directly to LocalDate

            int year = localDate.getYear(); // Get the year from LocalDate

            // Increment reservation count for the specific year
            yearlyReservations.put(year, yearlyReservations.getOrDefault(year, 0) + 1);
        }
    }

    // Populate dataset with data from the map
    for (Map.Entry<Integer, Integer> entry : yearlyReservations.entrySet()) {
        int year = entry.getKey();
        int count = entry.getValue();
        dataset.addValue(count, selectedClient, String.valueOf(year));
    }

    return dataset;
}
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        return ChartFactory.createBarChart(
                "Réservations d'un client par année", // Title
                "Année",                            // X-axis label
                "Nombre de Réservations",          // Y-axis label
                dataset,                           // Dataset
                PlotOrientation.VERTICAL,          // Orientation
                true,                              // Include legend
                true,                              // Tooltips
                false                              // URLs
        );
    }

    // Updates the chart based on the selected client
    private void updateChart() {
        String selectedClient = (String) clientComboBox.getSelectedItem();
        if (selectedClient != null) {
            List<Reservation> reservations = fetchReservations();
            DefaultCategoryDataset dataset = createDataset(selectedClient, reservations);
            JFreeChart chart = createChart(dataset);
            ChartPanel chartPanelComponent = new ChartPanel(chart);
            chartPanel.removeAll();  // Remove old chart
            chartPanel.add(chartPanelComponent);  // Add new chart
            chartPanel.revalidate();  // Revalidate the panel
            chartPanel.repaint();  // Repaint the panel
        }
    }

    // Load the clients into the combo box
    void loadClients(List<Reservation> reservations) {
   Set<String> clients = new HashSet<>();
    for (Reservation reservation : reservations) {
        clients.add(reservation.getCIN_client());
    }
    
    System.out.println("Loaded clients: " + clients);  // Debugging the loaded clients
    
    for (String client : clients) {
        clientComboBox.addItem(client);
    }

    if (!clients.isEmpty()) {
        clientComboBox.setSelectedIndex(0);  // Default client
        updateChart();  // Update chart with the first client
    }}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
 public static void main(String[] args) {
     JFrame frame = new JFrame("Chart2 ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an instance of Chart2 and add it to the frame
        Chart2 chart2Panel = new Chart2();
        frame.getContentPane().add(chart2Panel);

        // Load clients and update the chart
        List<Reservation> reservations = chart2Panel.fetchReservations();
        chart2Panel.loadClients(reservations);

        // Set the size of the frame and make it visible
        frame.pack();
        frame.setSize(800, 600);  // Adjust size as needed
        frame.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
