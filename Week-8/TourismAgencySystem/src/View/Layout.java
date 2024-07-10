package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;


public class Layout {


    public static void setMargin(JComponent component, int margin) {
        component.setBorder(BorderFactory.createEmptyBorder(margin, margin, margin, margin));
    }


    public static JButton createButton(String text, String actionCommand, ActionListener listener) {
        JButton button = new JButton(text);
        button.setActionCommand(actionCommand);
        button.addActionListener(listener);
        return button;
    }


    public static JLabel createLabel(String text) {
        JLabel label = new JLabel(text);

        return label;
    }


    public static JTextField createTextField(int columns) {
        JTextField textField = new JTextField(columns);

        return textField;
    }


    public static JCheckBox createCheckBox(String text) {
        JCheckBox checkBox = new JCheckBox(text);

        return checkBox;
    }


    public static void centerWindow(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((screenSize.width - frame.getWidth()) / 2, (screenSize.height - frame.getHeight()) / 2);
    }


    public static JTable createTable(DefaultTableModel model) {
        JTable table = new JTable(model);

        table.setFillsViewportHeight(true);
        return table;
    }


    public static void resetTextFields(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }


    public static <T> JComboBox<T> createComboBox(T[] items) {
        JComboBox<T> comboBox = new JComboBox<>(items);
        return comboBox;
    }

    protected void add(JPanel container) {
    }

    protected void guiInitilaze(int i, int i1) {
    }

    protected void setSize(int i, int i1) {
    }

    protected void setLocationRelativeTo(Object o) {
    }
    void setVisible(boolean b) {
    }

    private void dispose() {
    }
}
