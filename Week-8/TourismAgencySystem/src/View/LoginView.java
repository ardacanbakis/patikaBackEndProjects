package View;

import Business.UserManager;
import Core.Helper;
import Entity.User;

import javax.swing.*;

public class LoginView extends Layout {
    private JPanel container;
    private JPanel w_top;
    private JLabel lbl_welcome;
    private JLabel lbl_welcome2;
    private JLabel lbl_username;
    private JTextField fld_username;
    private JLabel lbl_password;
    private JPasswordField fld_password;
    private JButton btn_login;
    private JPanel w_bot;
    private final UserManager userManager = new UserManager();

    public LoginView() {
        this.add(container);
        this.setSize(400, 400); // Set the size of the frame
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        btn_login.addActionListener(e -> {
            JTextField[] checkFieldList = {this.fld_username, this.fld_password};
            if (Helper.isFieldListEmpty(checkFieldList)) {
                Helper.showMsg("FILL");
            } else {
                User loginUser = this.userManager.findByLogin(this.fld_username.getText(), this.fld_password.getText());
                if (loginUser == null) {
                    Helper.showMsg("NOT FOUND");
                } else {
                    if (Boolean.parseBoolean(String.valueOf(loginUser.getRole().toString().equals("ADMIN")))) {
                        AdminView adminView = new AdminView(loginUser);
                    } else {
                        StaffView staffView = new StaffView(loginUser);
                    }
                   
                }

            }
        });
    }


}