package app.view;

import app.controller.Transition;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateDataPegawaiView extends JFrame {
    JLabel lId = new JLabel("ID Pegawai : ");
    JLabel lNama = new JLabel("Nama : ");
    JLabel lPosisi = new JLabel("Posisi : ");
    JLabel lAlamat = new JLabel("Alamat : ");
    JLabel lNoHp = new JLabel("No HP : ");
    JLabel lGaji = new JLabel("Gaji Pokok : ");
    JLabel lInfo = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    public JTextField txId = new JTextField();
    public JTextField txNama = new JTextField();
    public JTextField txAlamat = new JTextField();
    public JTextField txNoHp = new JTextField();
    public JTextField txGaji = new JTextField();

    String[] posisi = {"", "Direktur", "Manager", "Programmer", "Marketing"};
    public JComboBox comPosisi = new JComboBox(posisi);

    public JButton btnSimpan = new JButton("UBAH");
    public JButton btnHomeTransition = new JButton("HOME");
    public JButton btnGajiTransition = new JButton("GAJI");
    public JButton btnDataTransition = new JButton("DATA");
    public JButton btnInformasiTransition = new JButton("INFORMASI");
    public JButton btnAdminTransition = new JButton("PEGAWAI");

    public UpdateDataPegawaiView() {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        add(lInfo).setBounds(160,330,600,30);
        add(btnHomeTransition).setBounds(20,20,100,60);
        add(btnGajiTransition).setBounds(20,90,100,60);
        add(btnDataTransition).setBounds(20,160,100,60);
        add(btnInformasiTransition).setBounds(20,230,100,60);
        add(btnAdminTransition).setBounds(470,20,100,60);
        add(btnSimpan).setBounds(470,270,100,60);

        add(lId).setBounds(130,40,100,20);
        add(lNama).setBounds(130,70,100,20);
        add(lPosisi).setBounds(130,100,100,20);
        add(lAlamat).setBounds(130,130,100,20);
        add(lNoHp).setBounds(130,160,100,20);
        add(lGaji).setBounds(130,190,100,20);

        add(txId).setBounds(230,40,200,20);
        add(txNama).setBounds(230,70,200,20);
        add(comPosisi).setBounds(230,100,100,20);
        add(txAlamat).setBounds(230,130,300,20);
        add(txNoHp).setBounds(230,160,150,20);
        add(txGaji).setBounds(230,190,150,20);

        btnAdminTransition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.homeTransition();
                dispose();
            }
        });
    }
}
