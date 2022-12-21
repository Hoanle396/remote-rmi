package com.gui.common;

import com.gui.MainFrame;
import com.gui.client.ClientPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.TitledBorder;

// TODO: default for server panel
public class CommonPanel extends JPanel {
    private JLabel host_label;
    private JComboBox<String> host_combo;
    private JTextField host_text;
    private JLabel port_label;
    private JLabel pass_label;
    private JTextField port_text;
    private JTextField pass_text;
    private JPasswordField pass_field;
    private JLabel help_label;

    public CommonPanel() {
        // TODO: style common panel
        this.setBorder(BorderFactory.createTitledBorder(null, "Server Listening",
            TitledBorder.DEFAULT_JUSTIFICATION,
            TitledBorder.DEFAULT_POSITION,
            new Font("segoe ui", Font.BOLD, 16),
            Color.decode(ClientPanel.FOREGROUND))
        );
        this.setBounds(50, 30, MainFrame.WIDTH_FRAME - 100, 450);
        this.setBackground(Color.decode(ClientPanel.BACKGROUND));
        this.setForeground(Color.decode(ClientPanel.FOREGROUND));
        this.setLayout(null);

        // TODO: add components
        this.initcomponents();
    }

    private void initcomponents() {
        // TODO: constructor
        this.host_label = new JLabel();
        this.host_combo = new JComboBox<>();
        this.host_text = new JTextField();
        this.port_label = new JLabel();
        this.pass_label = new JLabel();
        this.port_text = new JTextField();
        this.pass_text = new JTextField();
        this.pass_field = new JPasswordField();
        this.help_label = new JLabel();

        // TODO: style host_label
        this.host_label.setText("Server IP:");
        this.host_label.setBounds(30, 60, 200, 50);
        this.host_label.setFont(new Font("segoe ui", Font.BOLD, 14));
        this.add(this.host_label);

        // TODO: style host_combo for server panel
        this.host_combo.setBounds(240, 75, 230, 40);
        this.add(this.host_combo);

        // TODO: style host_text for client panel
        this.host_text.setBounds(240, 75, 230, 40);
        this.host_text.setVisible(false);
        this.add(this.host_text);

        // TODO: style port_label
        this.port_label.setText("Server port:");
        this.port_label.setBounds(30, 120, 200, 50);
        this.port_label.setFont(new Font("segoe ui", Font.BOLD, 14));
        this.add(this.port_label);

        // TODO: style port_text
        this.port_text.setBounds(240, 125, 230, 40);
        this.port_text.setText("8888");
        this.add(this.port_text);

        // TODO: style pass_label
        this.pass_label.setText("Set password:");
        this.pass_label.setBounds(30, 170, 200, 50);
        this.pass_label.setFont(new Font("segoe ui", Font.BOLD, 14));
        this.add(this.pass_label);

        // TODO: style pass_text for server panel
        this.pass_text.setBounds(240, 175, 230, 40);
        this.pass_text.setText("123456");
        this.add(this.pass_text);

        // TODO: style pass_field for client panel
        this.pass_field.setBounds(240, 175, 230, 40);
        this.pass_field.setText("123456");
        this.pass_field.setVisible(false);
        this.add(this.pass_field);

        // TODO: style help_label
        this.help_label.setText("<html>>>Help: send name or IP address and port to your partner.<br>>>Example: 192.168.0.1:9999</html>");
        this.help_label.setBounds(40, 230, 530, 70);
        this.help_label.setForeground(Color.decode(ClientPanel.FOREGROUND));
        this.help_label.setFont(new Font("segoe ui", Font.BOLD, 13));
        this.add(this.help_label);
    }



    @Override
    public void setEnabled(boolean b) {
        this.host_combo.setEnabled(b);
        this.host_text.setEnabled(b);
        this.pass_field.setEnabled(b);
        this.pass_text.setEnabled(b);
        this.port_text.setEnabled(b);
    }

    public JLabel getHostLabel() {
        return host_label;
    }

    public JComboBox<String> getHostCombo() {
        return host_combo;
    }

    public JTextField getHostText() {
        return host_text;
    }

    public JLabel getPortLabel() {
        return port_label;
    }

    public JLabel getPassLabel() {
        return pass_label;
    }

    public JTextField getPortText() {
        return port_text;
    }

    public JTextField getPassText() {
        return pass_text;
    }

    public JPasswordField getPassField() {
        return pass_field;
    }

    public JLabel getHelpLabel() {
        return help_label;
    }
}