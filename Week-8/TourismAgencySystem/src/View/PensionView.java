package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PensionView extends JFrame {
    private JList<String> listPensions;
    private DefaultListModel<String> model;

    public PensionView() {
        setTitle("Manage Pension Types");
        setSize(400, 300);
        setLayout(new BorderLayout(10, 10));
        initializeComponents();
        Layout.centerWindow(this);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void initializeComponents() {
        model = new DefaultListModel<>();
        listPensions = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(listPensions);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelButtons = new JPanel();
        JButton btnAdd = Layout.createButton("Add", "ADD", this::addPensionType);
        JButton btnEdit = Layout.createButton("Edit", "EDIT", this::editPensionType);
        JButton btnDelete = Layout.createButton("Delete", "DELETE", this::deletePensionType);
        panelButtons.add(btnAdd);
        panelButtons.add(btnEdit);
        panelButtons.add(btnDelete);

        add(panelButtons, BorderLayout.SOUTH);
    }

    private void addPensionType(ActionEvent e) {
        // Logic to add a new pension type
        String type = JOptionPane.showInputDialog(this, "Enter new pension type:");
        if (type != null && !type.isEmpty()) {
            model.addElement(type);
            // Save to database
        }
    }

    private void editPensionType(ActionEvent e) {
        // Logic to edit the selected pension type
        String selected = listPensions.getSelectedValue();
        if (selected != null) {
            String type = JOptionPane.showInputDialog(this, "Edit pension type:", selected);
            if (type != null && !type.isEmpty()) {
                model.setElementAt(type, listPensions.getSelectedIndex());
                // Update database
            }
        }
    }

    private void deletePensionType(ActionEvent e) {
        // Logic to delete the selected pension type
        String selected = listPensions.getSelectedValue();
        if (selected != null) {
            int response = JOptionPane.showConfirmDialog(this, "Delete this pension type?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                model.removeElement(selected);
                // Delete from database
            }
        }
    }
}
