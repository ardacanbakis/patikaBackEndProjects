package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class SeasonView extends JFrame {
    private JTable seasonsTable;
    private DefaultTableModel tableModel;

    public SeasonView() {
        setTitle("Season Management");
        setSize(500, 300);
        setLayout(new BorderLayout(10, 10));
        initializeUI();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeUI() {
        String[] columnNames = {"Season ID", "Hotel ID", "Start Date", "End Date"};
        tableModel = new DefaultTableModel(columnNames, 0);
        seasonsTable = new JTable(tableModel);

        add(new JScrollPane(seasonsTable), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        JButton btnAddSeason = new JButton("Add Season");
        btnAddSeason.addActionListener(this::addSeason);
        JButton btnEditSeason = new JButton("Edit Season");
        btnEditSeason.addActionListener(this::editSeason);
        JButton btnDeleteSeason = new JButton("Delete Season");
        btnDeleteSeason.addActionListener(this::deleteSeason);

        buttonPanel.add(btnAddSeason);
        buttonPanel.add(btnEditSeason);
        buttonPanel.add(btnDeleteSeason);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addSeason(ActionEvent e) {
        // Open a dialog or another window to input new season details
        // Validate and save new season to the database
    }

    private void editSeason(ActionEvent e) {
        // Determine selected season from the table
        // Open a dialog or window with the season details for editing
        // Validate and save edited details to the database
    }

    private void deleteSeason(ActionEvent e) {
        // Determine selected season from the table
        // Confirm deletion
        // Delete the season from the database
    }
}
