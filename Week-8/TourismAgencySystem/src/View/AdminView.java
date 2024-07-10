package View;

import Entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AdminView extends JFrame {
    private JTable usersTable;
    private JButton btnAddUser, btnDeleteUser, btnEditUser;
    private JPanel panelMain;
    private DefaultTableModel userModel;

    public AdminView(User loginUser) {
        setTitle("Admin Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initUI();
        Layout.centerWindow(this);
        setVisible(true);
    }

    private void initUI() {
        panelMain = new JPanel();
        panelMain.setLayout(new BorderLayout());

        userModel = new DefaultTableModel(new Object[]{"ID", "Username", "Role"}, 0);
        usersTable = new JTable(userModel);
        JScrollPane scrollPane = new JScrollPane(usersTable);
        panelMain.add(scrollPane, BorderLayout.CENTER);

        JPanel panelButtons = new JPanel();
        btnAddUser = new JButton("Add User");
        btnAddUser.addActionListener(this::addUser);
        btnDeleteUser = new JButton("Delete User");
        btnDeleteUser.addActionListener(this::deleteUser);
        btnEditUser = new JButton("Edit User");
        btnEditUser.addActionListener(this::editUser);
        panelButtons.add(btnAddUser);
        panelButtons.add(btnDeleteUser);
        panelButtons.add(btnEditUser);
        panelMain.add(panelButtons, BorderLayout.SOUTH);

        add(panelMain);
    }

    private void addUser(ActionEvent e) {

    }

    private void deleteUser(ActionEvent e) {

    }

    private void editUser(ActionEvent e) {

    }
}
