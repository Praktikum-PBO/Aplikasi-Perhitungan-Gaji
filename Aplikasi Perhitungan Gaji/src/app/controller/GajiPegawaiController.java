package app.controller;

import app.model.PegawaiModel;
import app.view.GajiPegawaiView;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GajiPegawaiController {
    GajiPegawaiView gajiPegawaiView;
    PegawaiModel pegawaiModel;

    String idPegawai;
    String namaPegawai;
    String posisiPegawai;
    String alamatPegawai;
    String noHp;
    int tunjangan;
    int pajak;
    int sumGaji;
    int gajiPokok;
    int jamLembur;

    public GajiPegawaiController(GajiPegawaiView gajiPegawaiView, PegawaiModel pegawaiModel) {
        this.gajiPegawaiView = gajiPegawaiView;
        this.pegawaiModel = pegawaiModel;

        gajiPegawaiView.btnHitung.addActionListener((ActionEvent e) -> {
            try {
                this.gajiPokok = Integer.parseInt(gajiPegawaiView.txGaji.getText());
                this.jamLembur = Integer.parseInt(gajiPegawaiView.txJamLembur.getText());
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Masukkan angka yang benar");
            }
            if (this.gajiPokok == 0 || this.jamLembur == 0) {
                JOptionPane.showMessageDialog(null, "Field tidak boleh kosong");
            } else {
                this.tunjangan = jamLembur * 15000;
                this.pajak = (gajiPokok / 100) * 1;
                this.sumGaji = gajiPokok - pajak + tunjangan;
                this.setField(Integer.toString(tunjangan), Integer.toString(pajak), Integer.toString(sumGaji));
            }

        });

        gajiPegawaiView.btnSimpan.addActionListener((ActionEvent e) -> {
            this.idPegawai = gajiPegawaiView.txId.getText();
            this.namaPegawai = gajiPegawaiView.txNama.getText();
            this.posisiPegawai = gajiPegawaiView.comPosisi.getSelectedItem().toString();
            this.alamatPegawai = gajiPegawaiView.txAlamat.getText();
            this.noHp = gajiPegawaiView.txNoHp.getText();


            if (this.idPegawai.equals("")||this.namaPegawai.equals("")||this.posisiPegawai.equals("")||this.alamatPegawai.equals("")||this.noHp.equals("")||this.gajiPokok==0||this.jamLembur==0||this.tunjangan==0||this.pajak==0||this.sumGaji==0) {
                JOptionPane.showMessageDialog(null, "Field tidak boleh kosong");
            } else {
                pegawaiModel.insertPegawai(this.idPegawai, this.namaPegawai, this.posisiPegawai, this.alamatPegawai, this.noHp, this.gajiPokok, this.jamLembur, this.tunjangan, this.pajak, this.sumGaji);
                this.setEmptyField();
            }
        });
    }

    private void setField(String tunjangan, String pajak, String sumGaji) {
        this.gajiPegawaiView.txTunjangan.setText(tunjangan);
        this.gajiPegawaiView.txPajak.setText(pajak);
        this.gajiPegawaiView.txSumGaji.setText(sumGaji);
    }

    private void setEmptyField() {
        this.gajiPegawaiView.txId.setText("");
        this.gajiPegawaiView.txNama.setText("");
        this.gajiPegawaiView.comPosisi.setSelectedIndex(0);
        this.gajiPegawaiView.txAlamat.setText("");
        this.gajiPegawaiView.txNoHp.setText("");
        this.gajiPegawaiView.txGaji.setText("");
        this.gajiPegawaiView.txJamLembur.setText("");
        this.gajiPegawaiView.txTunjangan.setText("");
        this.gajiPegawaiView.txPajak.setText("");
        this.gajiPegawaiView.txSumGaji.setText("");
    }
}
