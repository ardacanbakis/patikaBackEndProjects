package View;

import Business.ReservationManager;
import Entity.Reservation;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Date;

public class ReservationView extends JFrame {
    private JTable reservationsTable;
    private JButton btnAddReservation, btnEditReservation, btnDeleteReservation;
    private ReservationManager reservationManager;

    public ReservationView() {
        setTitle("Reservation Management");
        setSize(800, 500);
        setLayout(new BorderLayout());
        reservationManager = new ReservationManager();
        initializeUI();
        Layout.centerWindow(this);
        setVisible(true);
    }

    private void initializeUI() {
        reservationsTable = Layout.createTable(new DefaultTableModel(new Object[]{"Reservation ID", "Room ID", "Check-In", "Check-Out", "Total Price", "Customer Contact", "Name", "Surname", "ID Info"}, 0));
        add(new JScrollPane(reservationsTable), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        btnAddReservation = Layout.createButton("Add Reservation", "ADD_RESERVATION", this::addReservation);
        btnEditReservation = Layout.createButton("Edit Reservation", "EDIT_RESERVATION", this::editReservation);
        btnDeleteReservation = Layout.createButton("Delete Reservation", "DELETE_RESERVATION", this::deleteReservation);
        buttonPanel.add(btnAddReservation);
        buttonPanel.add(btnEditReservation);
        buttonPanel.add(btnDeleteReservation);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addReservation(ActionEvent e) {
        // Open dialog or form to input new reservation details
        // Validate and save new reservation
    }

    private void editReservation(ActionEvent e) {
        // Open dialog or form pre-populated with reservation details for editing
        // Validate and update reservation
    }

    private void deleteReservation(ActionEvent e) {
        // Confirm deletion
        // If confirmed, delete the reservation
    }
}
