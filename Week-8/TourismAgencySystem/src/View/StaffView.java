package View;

import Entity.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class StaffView extends JFrame {
    private JTable roomsTable;
    private JButton btnAddRoom, btnEditRoom, btnDeleteRoom, btnManageReservations;
    private DefaultTableModel roomsTableModel;

    public StaffView(User loginUser) {
        setTitle("Staff Room and Reservation Management");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 500);
        setLayout(new BorderLayout(10, 10));
        initializeUI();
        Layout.centerWindow(this);
        setVisible(true);
    }

    private void initializeUI() {
        roomsTableModel = new DefaultTableModel(new Object[]{"Room ID", "Hotel ID", "Type", "Price", "Amenities"}, 0);
        roomsTable = new JTable(roomsTableModel);
        add(new JScrollPane(roomsTable), BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel();
        btnAddRoom = Layout.createButton("Add Room", "ADD_ROOM", this::addRoom);
        btnEditRoom = Layout.createButton("Edit Room", "EDIT_ROOM", this::editRoom);
        btnDeleteRoom = Layout.createButton("Delete Room", "DELETE_ROOM", this::deleteRoom);
        btnManageReservations = Layout.createButton("Manage Reservations", "MANAGE_RESERVATIONS", this::manageReservations);

        buttonsPanel.add(btnAddRoom);
        buttonsPanel.add(btnEditRoom);
        buttonsPanel.add(btnDeleteRoom);
        buttonsPanel.add(btnManageReservations);

        add(buttonsPanel, BorderLayout.SOUTH);
    }

    private void addRoom(ActionEvent e) {
        // Open dialog or another frame to add room details
        // Save the room to the database and refresh the room list
    }

    private void editRoom(ActionEvent e) {
        // Determine selected room from the table
        // Open dialog or frame pre-populated with room details for editing
        // Update room in the database and refresh the room list
    }

    private void deleteRoom(ActionEvent e) {
        // Confirm deletion
        // If confirmed, delete the selected room from the database and refresh the list
    }

    private void manageReservations(ActionEvent e) {
        // Open the reservation management view/dialog
    }
}
