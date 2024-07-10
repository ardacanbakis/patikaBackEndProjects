package Core;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setTheme() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public static void showMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean isFieldEmpty(JTextField field) {
        return field.getText().trim().isEmpty();
    }

    public static boolean areFieldsEmpty(JTextField[] fieldList) {
        for (JTextField field : fieldList) {
            if (isFieldEmpty(field)) return true;
        }
        return false;
    }

    public static int getLocationPoint(String type, Dimension size) {
        int screenX = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenY = Toolkit.getDefaultToolkit().getScreenSize().height;
        return switch (type) {
            case "x" -> (screenX - size.width) / 2;
            case "y" -> (screenY - size.height) / 2;
            default -> 0;
        };
    }

    public static boolean isFieldListEmpty(JTextField[] checkFieldList) {
        return false;
    }
}
