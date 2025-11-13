import Service.CategorieService;
import Service.ChambreService;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JFrame;
import org.jfree.chart.plot.PlotOrientation;

public class Chart1 extends javax.swing.JPanel {

    public Chart1() {
        // Create a sample chart with dynamic data
        JFreeChart chart = createChart(createDataset());

        // Add the chart to a chart panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(700, 400));

        // Add the chart panel to the Chart1 panel
        setLayout(new java.awt.BorderLayout());
        add(chartPanel, java.awt.BorderLayout.CENTER);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Assuming you have a CategorieService and ChambreService to get data
        CategorieService categorieService = new CategorieService();
        ChambreService chambreService = new ChambreService();

        // Fetch the list of categories
        List<String> categories = categorieService.findAllLibelles();
        for (String category : categories) {
            int roomCount = chambreService.countChambresByCategorie(category);
            dataset.addValue(roomCount, "Chambres", category);
        }

        return dataset;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        return ChartFactory.createBarChart(
                "Nombre de Chambre par catégorie ",   // Title
                "Catégorie",                       // X-axis label
                "Nombres de Chambres",                // Y-axis label
                dataset,                          // Dataset
                PlotOrientation.VERTICAL,         // Plot orientation
                true,                             // Include legend
                true,                             // Tooltips
                false                             // URLs
        );
    }
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
       JFrame frame = new JFrame("Chambre par categorie ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an instance of Chart1 and add it to the frame
        Chart1 chart1Panel = new Chart1();
        frame.getContentPane().add(chart1Panel);

        frame.pack();
        frame.setSize(800, 600);  // Adjust size as needed
        frame.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
