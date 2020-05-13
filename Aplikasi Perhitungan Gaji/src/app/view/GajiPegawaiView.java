package app.view;

import app.controller.Transition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GajiPegawaiView extends JFrame {
    JLabel lId = new JLabel("ID Pegawai : ");
    JLabel lNama = new JLabel("Nama : ");
    JLabel lPosisi = new JLabel("Posisi : ");
    JLabel lAlamat = new JLabel("Alamat : ");
    JLabel lNoHp = new JLabel("No HP : ");
    JLabel lGaji = new JLabel("Gaji Pokok : ");
    JLabel lJamLembur = new JLabel("Jam Lembur : ");
    JLabel lTunjangan = new JLabel("Tunjangan : ");
    JLabel lPajak = new JLabel("Pajak : ");
    JLabel lSumGaji = new JLabel("Total Gaji : ");

    public JTextField txId = new JTextField();
    public JTextField txNama = new JTextField();
    public JTextField txAlamat = new JTextField();
    public JTextField txNoHp = new JTextField();
    public JTextField txGaji = new JTextField();
    public JTextField txJamLembur = new JTextField();
    public JTextField txTunjangan = new JTextField();
    public JTextField txPajak = new JTextField();
    public JTextField txSumGaji = new JTextField();

    String[] posisi = {"", "Direktur", "Manager", "Programmer", "Marketing"};
    public JComboBox comPosisi = new JComboBox(posisi);

    public JButton btnHitung;
    public JButton btnSimpan;

    public GajiPegawaiView() {
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

        ImageIcon hitung = new ImageIcon("icon/hitung.jpeg");
        Image getHitung = hitung.getImage();
        Image modifiedHitung = getHitung.getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        hitung = new ImageIcon(modifiedHitung);
        btnHitung = new JButton("Petunjuk", hitung);
        btnPetunjuk.setHorizontalAlignment(JButton.LEFT);

        ImageIcon simpan = new ImageIcon("icon/simpan.jpeg");
        Image getSimpan = simpan.getImage();
        Image modifiedSimpan = getSimpan.getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        simpan = new ImageIcon(modifiedSimpan);
        btnSimpan = new JButton("Petunjuk", simpan);
        btnPetunjuk.setHorizontalAlignment(JButton.LEFT);

        ImageIcon footer = new ImageIcon("icon/footer.png");
        Image getFooter = footer.getImage();
        Image modifiedFooter = getFooter.getScaledInstance(420, 40, Image.SCALE_REPLICATE);
        footer = new ImageIcon(modifiedFooter);
        JLabel lFooter = new JLabel(footer);

        add(lId);
        add(lNama);
        add(lPosisi);
        add(lAlamat);
        add(lNoHp);
        add(lGaji);
        add(lJamLembur);
        add(lTunjangan);
        add(lPajak);
        add(lSumGaji);

        add(txId);
        add(txNama);
        add(comPosisi);
        add(txAlamat);
        add(txNoHp);
        add(txGaji);
        add(txJamLembur);
        add(txTunjangan);
        add(txPajak);
        add(txSumGaji);

        add(lFooter);
        add(btnSimpan);
        add(btnHitung);
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
        btnHitung.setBounds(800, 400, 190, 100);
        btnSimpan.setBounds(800, 505, 190, 100);
        lFooter.setBounds(350, 630, 420, 40);

        lId.setBounds(230,40,100,20);
        lNama.setBounds(230,70,100,20);
        lPosisi.setBounds(230,100,100,20);
        lAlamat.setBounds(230,130,100,20);
        lNoHp.setBounds(230,160,100,20);
        lGaji.setBounds(230,190,100,20);
        lJamLembur.setBounds(230,220,100,20);
        lTunjangan.setBounds(230,250,100,20);
        lPajak.setBounds(230,280,100,20);
        lSumGaji.setBounds(230,310,100,20);

        txId.setBounds(330,40,200,20);
        txNama.setBounds(330,70,200,20);
        comPosisi.setBounds(330,100,100,20);
        txAlamat.setBounds(330,130,300,20);
        txNoHp.setBounds(330,160,150,20);
        txGaji.setBounds(330,190,150,20);
        txJamLembur.setBounds(330,220,100,20);
        txTunjangan.setBounds(330,250,150,20);
        txPajak.setBounds(330,280,150,20);
        txSumGaji.setBounds(330,310,150,20);

        setSize(1080, 720);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

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
