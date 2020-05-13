package app.view;

import app.controller.Transition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeView extends JFrame {

    public HomeView() {
        ImageIcon background3 = new ImageIcon("icon/background3.jpeg");
        Image getBackground3 = background3.getImage();
        Image modifiedBackground3 = getBackground3.getScaledInstance(1080, 720, Image.SCALE_REPLICATE);
        background3 = new ImageIcon(modifiedBackground3);
        JLabel lBackground3 = new JLabel(background3);

        ImageIcon admin = new ImageIcon("icon/admin.jpeg");
        Image getAdmin = admin.getImage();
        Image modifiedAdmin = getAdmin.getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        admin = new ImageIcon(modifiedAdmin);
        JButton btnAdmin = new JButton("Admin", admin);
        btnAdmin.setHorizontalAlignment(JButton.LEFT);

        ImageIcon home = new ImageIcon("icon/home.jpeg");
        Image getHome = home.getImage();
        Image modifiedHome = getHome.getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        home = new ImageIcon(modifiedHome);
        JButton btnHome = new JButton("Home", home);
        btnHome.setHorizontalAlignment(JButton.LEFT);

        ImageIcon gaji = new ImageIcon("icon/gaji.jpeg");
        Image getGaji = gaji.getImage();
        Image modifiedGaji = getGaji.getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        gaji = new ImageIcon(modifiedGaji);
        JButton btnGaji = new JButton("Gaji", gaji);
        btnGaji.setHorizontalAlignment(JButton.LEFT);

        ImageIcon data = new ImageIcon("icon/data.jpeg");
        Image getData = data.getImage();
        Image modifiedData = getData.getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        data = new ImageIcon(modifiedData);
        JButton btnData = new JButton("Data", data);
        btnData.setHorizontalAlignment(JButton.LEFT);

        ImageIcon petunjuk = new ImageIcon("icon/petunjuk.jpeg");
        Image getPetunjuk = petunjuk.getImage();
        Image modifiedPetunjuk = getPetunjuk.getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        petunjuk = new ImageIcon(modifiedPetunjuk);
        JButton btnPetunjuk = new JButton("Petunjuk", petunjuk);
        btnPetunjuk.setHorizontalAlignment(JButton.LEFT);

        ImageIcon informasi = new ImageIcon("icon/informasi1.png");
        Image getInformasi = informasi.getImage();
        Image modifiedInformasi = getInformasi.getScaledInstance(665, 175, Image.SCALE_REPLICATE);
        informasi = new ImageIcon(modifiedInformasi);
        JLabel lInformasi = new JLabel(informasi);

        ImageIcon footer = new ImageIcon("icon/footer.png");
        Image getFooter = footer.getImage();
        Image modifiedFooter = getFooter.getScaledInstance(420, 40, Image.SCALE_REPLICATE);
        footer = new ImageIcon(modifiedFooter);
        JLabel lFooter = new JLabel(footer);

        add(lFooter);
        add(lInformasi);
        add(btnAdmin);
        add(btnPetunjuk);
        add(btnGaji);
        add(btnData);
        add(btnHome);
        add(lBackground3);

        lBackground3.setBounds(0, 0, 1080, 720);
        btnHome.setBounds(3, 3, 190, 100);
        btnGaji.setBounds(3, 106, 190, 100);
        btnData.setBounds(3, 209, 190, 100);
        btnPetunjuk.setBounds(3, 312, 190, 100);
        btnAdmin.setBounds(800, 3, 190, 100);
        lInformasi.setBounds(250, 175, 665, 175);
        lFooter.setBounds(350, 630, 420, 40);

        setSize(1080, 720);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.homeTransition();
                dispose();
            }
        });

        btnGaji.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.gajiPegawaiTransition();
                dispose();
            }
        });

        btnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.dataPegawaiTransition();
                dispose();
            }
        });

        btnPetunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.informasiPegawaiTransition();
                dispose();
            }
        });

        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.loginAdminTransition();
                dispose();
            }
        });
    }
}
