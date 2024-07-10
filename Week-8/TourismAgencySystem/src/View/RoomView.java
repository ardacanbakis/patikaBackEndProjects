package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class RoomView extends JFrame {
    private JTable roomsTable;
    private DefaultTableModel tableModel;

    public RoomView() {
        setTitle("Room Management");
        setSize(700, 400);
        setLayout(new BorderLayout(10, 10));
        initializeUI();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeUI() {
        String[] columnNames = {"Room ID", "Hotel ID", "Type", "Price", "Amenities"};
        tableModel = new DefaultTableModel(columnNames, 0);
        roomsTable = new JTable(tableModel);

        add(new JScrollPane(roomsTable), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        JButton btnAddRoom = new JButton("Add Room");
        btnAddRoom.addActionListener(this::addRoom);
        JButton btnEditRoom = new JButton("Edit Room");
        btnEditRoom.addActionListener(this::editRoom);
        JButton btnDeleteRoom = new JButton("Delete Room");
        btnDeleteRoom.addActionListener(this::deleteRoom);

        buttonPanel.add(btnAddRoom);
        buttonPanel.add(btnEditRoom);
        buttonPanel.add(btnDeleteRoom);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addRoom(ActionEvent e) {
        // Logic to add a new room
    }

    private void editRoom(ActionEvent e) {
        // Logic to edit selected room
    }

    private void deleteRoom(ActionEvent e) {
        // Logic to delete selected room
    }
}
