package app.view;

import javax.swing.*;
import java.awt.*;

public class AdminLoginView extends JFrame {
    JLabel lUsername, lPassword, lTitleLogin;
    public JTextField fUsername;
    public JPasswordField fPassword;
    public JButton btnLogin, btnBack;

    public AdminLoginView() {
        ImageIcon backgroundLogin = new ImageIcon("icon/backgroundLogin.jpeg");
        Image getBackgroundLogin = backgroundLogin.getImage();
        Image modifiedBackgroundLogin = getBackgroundLogin.getScaledInstance(1080, 720, Image.SCALE_REPLICATE);
        backgroundLogin = new ImageIcon(modifiedBackgroundLogin);
        JLabel lBackground = new JLabel(backgroundLogin);

        lTitleLogin = new JLabel("LOGIN ADMIN");
        lTitleLogin.setFont(new Font("Tahoma", Font.BOLD, 28));
        lTitleLogin.setForeground(new Color(57, 35, 2));
        lUsername = new JLabel("Username :");
        lUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
        lUsername.setForeground(new Color(36, 17, 1));
        lPassword = new JLabel("Password :");
        lPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
        lPassword.setForeground(new Color(36, 17, 1));
        fUsername = new JTextField();
        fUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        fUsername.setForeground(new Color(54, 31, 15));
        fUsername.setBackground(new Color(255, 255, 255));
        fPassword = new JPasswordField();
        fUsername.setForeground(new Color(54, 31, 15));
        fUsername.setBackground(new Color(255, 255, 255));
        btnLogin = new JButton("LOGIN");
        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnLogin.setForeground(new Color(36, 17, 1));
        btnLogin.setBackground(new Color(243, 238, 230, 255));
        btnBack = new JButton("BACK");
        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnBack.setForeground(new Color(36, 17, 1));
        btnBack.setBackground(new Color(243, 238, 230, 255));

        setLayout(null);

        add(btnBack);
        add(btnLogin);
        add(fPassword);
        add(fUsername);
        add(lPassword);
        add(lUsername);
        add(lTitleLogin);
        add(lBackground);

        lBackground.setBounds(0,0, 1080, 720);
        lTitleLogin.setBounds(425,150, 300, 80);
        lUsername.setBounds(350,250, 100, 30);
        fUsername.setBounds(450,250, 225, 30);
        lPassword.setBounds(350,325, 100, 30);
        fPassword.setBounds(450,325, 225, 30);
        btnLogin.setBounds(420,410, 90, 30);
        btnBack.setBounds(540,410, 90, 30);

        setSize(1080, 720);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
