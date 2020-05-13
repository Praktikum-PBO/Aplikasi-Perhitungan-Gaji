package app.view;

import app.controller.Transition;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminHomeView extends JFrame {
    public JButton btnHomeTransition = new JButton("Home");
    public JButton btnGajiTransition = new JButton("Tambah");
    public JButton btnDataTransition = new JButton("Data");
    public JButton btnInformasiTransition = new JButton("Petunjuk");
    public JButton btnAdminTransition = new JButton("Karyawan");

    JLabel lTampilan = new JLabel("Selamat Datang Admin");
    JLabel lTampilan2 = new JLabel("Masuk Menu Tambah untuk Menambah data");
    JLabel lTampilan3 = new JLabel("Menu Petunjuk Jika Kesulitan");
    JLabel lTampilanDefault = new JLabel("APP PERHITUNGAN GAJI");

    public AdminHomeView() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLayout(null);
        setVisible(true);

        add(btnHomeTransition).setBounds(10,20,100,60);
        add(btnGajiTransition).setBounds(10,90,100,60);
        add(btnDataTransition).setBounds(10,160,100,60);
        add(btnInformasiTransition).setBounds(10,230,100,60);
        add(btnAdminTransition).setBounds(470,10,100,60);

        add(lTampilan);
        lTampilan.setBounds(150, 100, 200, 20);
        add(lTampilan2);
        lTampilan2.setBounds(150, 120, 300, 20);
        add(lTampilan3);
        lTampilan3.setBounds(150, 140, 200, 20);
        add(lTampilanDefault);
        lTampilanDefault.setBounds(180, 320, 200, 20);

        btnAdminTransition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.homeTransition();
                dispose();
            }
        });

        btnDataTransition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.adminDataPegawaiTransition();
                dispose();
            }
        });
    }
}
