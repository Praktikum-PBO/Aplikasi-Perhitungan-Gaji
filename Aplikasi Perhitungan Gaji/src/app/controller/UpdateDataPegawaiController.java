package app.controller;

import app.model.PegawaiModel;
import app.view.UpdateDataPegawaiView;

import java.awt.event.ActionEvent;

public class UpdateDataPegawaiController {
    UpdateDataPegawaiView updateDataPegawaiView;
    PegawaiModel pegawaiModel;

    public UpdateDataPegawaiController(UpdateDataPegawaiView updateDataPegawaiView, PegawaiModel pegawaiModel, String idPegawai) {
        this.updateDataPegawaiView = updateDataPegawaiView;
        this.pegawaiModel = pegawaiModel;
        String data[] = this.pegawaiModel.getPegawai(idPegawai);
        setText(data);

        this.updateDataPegawaiView.btnSimpan.addActionListener((ActionEvent e) -> {
            String id = this.updateDataPegawaiView.txId.getText();
            String nama = this.updateDataPegawaiView.txNama.getText();
            String alamat = this.updateDataPegawaiView.txAlamat.getText();
            String noHp = this.updateDataPegawaiView.txNoHp.getText();
            String posisi = this.updateDataPegawaiView.comPosisi.getSelectedItem().toString();
            int gaji = Integer.parseInt(this.updateDataPegawaiView.txGaji.getText());

            this.pegawaiModel.updatePegawai(idPegawai, nama, alamat, noHp, posisi, gaji);
        });
    }

    private void setText(String[] data) {
        this.updateDataPegawaiView.txId.setText(data[0]);
        this.updateDataPegawaiView.txNama.setText(data[1]);
        this.updateDataPegawaiView.txAlamat.setText(data[2]);
        this.updateDataPegawaiView.txNoHp.setText(data[3]);
        this.updateDataPegawaiView.comPosisi.setSelectedItem(data[4]);
        this.updateDataPegawaiView.txGaji.setText(data[5]);
    }
}
