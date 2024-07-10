package View;

import javax.swing.*;
import java.awt.*;

public class HotelView extends JFrame {
    public HotelView() {
        setTitle("Add / Update Hotel");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 700); // Adjusted for additional fields
        setLayout(new GridLayout(0, 2, 10, 10)); // Adjusted GridLayout for uniformity
        initializeComponents();
        Layout.centerWindow(this);
        setVisible(true);
    }

    private void initializeComponents() {
        // Hotel Name
        add(Layout.createLabel("Hotel Name:"));
        JTextField txtHotelName = Layout.createTextField(20);
        add(txtHotelName);

        // Address
        add(Layout.createLabel("Address:"));
        JTextField txtAddress = Layout.createTextField(20);
        add(txtAddress);

        // City
        add(Layout.createLabel("City:"));
        JTextField txtCity = Layout.createTextField(20);
        add(txtCity);

        // Email
        add(Layout.createLabel("Email:"));
        JTextField txtEmail = Layout.createTextField(20);
        add(txtEmail);

        // Phone
        add(Layout.createLabel("Phone:"));
        JTextField txtPhone = Layout.createTextField(20);
        add(txtPhone);

        // Star Rating
        add(Layout.createLabel("Star Rating:"));
        JComboBox<String> cbStarRating = new JComboBox<>(new String[]{"1 Star", "2 Stars", "3 Stars", "4 Stars", "5 Stars"});
        add(cbStarRating);

        // Amenities - Assuming a dynamic approach might be needed for real data
        add(Layout.createLabel("Amenities:"));
        JPanel amenitiesPanel = new JPanel(new FlowLayout());
        JCheckBox chkFreeParking = Layout.createCheckBox("Free Parking");
        amenitiesPanel.add(chkFreeParking);

        JCheckBox chkFreeWifi = Layout.createCheckBox("Free WiFi");
        amenitiesPanel.add(chkFreeWifi);

        JCheckBox chkSpa = Layout.createCheckBox("Spa");
        amenitiesPanel.add(chkSpa);

        JCheckBox chkPool = Layout.createCheckBox("Swimming Pool");
        amenitiesPanel.add(chkPool);

        JCheckBox chkGym = Layout.createCheckBox("Fitness Center");
        amenitiesPanel.add(chkGym);

        JCheckBox chkConcierge = Layout.createCheckBox("Concierge Service");
        amenitiesPanel.add(chkConcierge);

        add(amenitiesPanel);

        // Save Button
        JButton btnSave = Layout.createButton("Save", "SAVE", e -> saveHotelInfo());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSave);
        add(buttonPanel); // Adjust for grid alignment
    }

    private void saveHotelInfo() {
        // Implement the save logic here
        JOptionPane.showMessageDialog(this, "Hotel information saved.");
    }
}
