package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class UserView extends JFrame {
    private JTable usersTable;
    private JButton btnAddUser, btnEditUser, btnDeleteUser;
    private DefaultTableModel tableModel;

    public UserView() {
        setTitle("User Management");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        initializeUI();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeUI() {
        tableModel = new DefaultTableModel(new Object[]{"User ID", "Username", "Role"}, 0);
        usersTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(usersTable);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        btnAddUser = new JButton("Add User");
        btnEditUser = new JButton("Edit User");
        btnDeleteUser = new JButton("Delete User");

        btnAddUser.addActionListener(e -> JOptionPane.showMessageDialog(this, "Add User functionality placeholder"));
        btnEditUser.addActionListener(e -> JOptionPane.showMessageDialog(this, "Edit User functionality placeholder"));
        btnDeleteUser.addActionListener(e -> JOptionPane.showMessageDialog(this, "Delete User functionality placeholder"));

        buttonPanel.add(btnAddUser);
        buttonPanel.add(btnEditUser);
        buttonPanel.add(btnDeleteUser);

        add(buttonPanel, BorderLayout.SOUTH);
    }
}
