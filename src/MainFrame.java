import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
    JLabel appLabel;
    JLabel radiusLabel;
    JLabel heightLabel;
    JLabel areaLabel;
    JLabel aboutLabel;
    JTextField radiusField;
    JTextField heightField;
    JTextField areaField;
    JButton calcButton;

    public MainFrame() {
        this.setComponent();
        this.setFrame();
    }
    private void setComponent() {
        appLabel = new JLabel("Kör alapú kúp térfogata");
        appLabel.setBounds(30, 30, 200, 30);
        radiusLabel = new JLabel("Sugár");
        radiusLabel.setBounds(30, 70, 100, 30);
        heightLabel = new JLabel("Magasság");
        heightLabel.setBounds(30, 110, 100, 30);
        areaLabel = new JLabel("Térfogat");
        areaLabel.setBounds(30, 190, 100, 30);
        aboutLabel = new JLabel("Nagy János, 2022-04-13, Szoft I N");
        aboutLabel.setBounds(30, 230, 250, 30);
        radiusField = new JTextField();
        radiusField.setBounds(150, 70, 100, 30);
        heightField = new JTextField();
        heightField.setBounds(150, 110, 100, 30);
        areaField = new JTextField();
        areaField.setBounds(150, 190, 100, 30);
        calcButton = new JButton("Számít");
        calcButton.setBounds(150, 150, 100, 30);
        calcButton.addActionListener(event -> calcButtonClick());
    }
    private void setFrame() {
        this.add(appLabel);
        this.add(radiusLabel);
        this.add(heightLabel);
        this.add(areaLabel);
        this.add(aboutLabel);
        this.add(radiusField);
        this.add(heightField);
        this.add(areaField);
        this.add(calcButton);

        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 340);
        this.setVisible(true);
    }
    private void calcButtonClick() {
        String sugarStr = radiusField.getText();
        double sugar = Double.parseDouble(sugarStr);
        String heightStr = heightField.getText();
        double height = Double.parseDouble(heightStr);
        Double area = 1.0/3.0 * Math.pow(sugar, 2)* Math.PI * height;
        areaField.setText(area.toString());
    }
}
