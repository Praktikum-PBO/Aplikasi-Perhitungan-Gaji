package app.view;

import app.controller.Transition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InformasiPegawaiView extends JFrame {
    JLabel lInfo, lInfo1, lInfo2;
    public JButton btnHome;

    public InformasiPegawaiView() {

        lInfo = new JLabel("PETUNJUK KARYAWAN");
        lInfo.setFont(new Font("Tahoma", Font.BOLD, 38));

        lInfo1 = new JLabel("klik tombol gaji untuk menghitung gaji anda");
        lInfo1.setFont(new Font("Tahoma", Font.BOLD, 24));

        lInfo2 = new JLabel("klik tombol data untuk melihat data sudah masuk atau belum");
        lInfo2.setFont(new Font("Tahoma", Font.BOLD, 24));

        btnHome = new JButton("HOME");

        ImageIcon background3 = new ImageIcon("icon/background3.jpeg");
        Image getBackground3 = background3.getImage();
        Image modifiedBackground3 = getBackground3.getScaledInstance(1080, 720, Image.SCALE_REPLICATE);
        background3 = new ImageIcon(modifiedBackground3);
        JLabel lBackground3 = new JLabel(background3);

        ImageIcon gaji = new ImageIcon("icon/gaji.jpeg");
        Image getGaji = gaji.getImage();
        Image modifiedGaji = getGaji.getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        gaji = new ImageIcon(modifiedGaji);
        JLabel lGaji = new JLabel(gaji);

        ImageIcon data = new ImageIcon("icon/data.jpeg");
        Image getData = data.getImage();
        Image modifiedData = getData.getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        data = new ImageIcon(modifiedData);
        JLabel lData = new JLabel(data);

        add(lInfo2);
        add(lInfo1);
        add(lInfo);
        add(lGaji);
        add(lData);
        add(btnHome);
        add(lBackground3);

        lBackground3.setBounds(0, 0, 1080, 720);
        lInfo.setBounds(200, 100, 600, 40);
        lGaji.setBounds(50, 200, 100, 100);
        lInfo1.setBounds(200, 200, 800, 100);
        lData.setBounds(50, 310, 100, 100);
        lInfo2.setBounds(200, 310, 800, 100);
        btnHome.setBounds(400, 500, 90, 30);

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
    }
}
