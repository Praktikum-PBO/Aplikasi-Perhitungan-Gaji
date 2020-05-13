package app.controller;

import app.model.PegawaiModel;
import app.view.DataPegawaiView;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DataPegawaiController {
    DataPegawaiView dataPegawaiView;
    PegawaiModel pegawaiModel;
    String[][] dataPegawai;
    public DataPegawaiController(DataPegawaiView dataPegawaiView, PegawaiModel pegawaiModel) {
        this.dataPegawaiView = dataPegawaiView;
        this.pegawaiModel = pegawaiModel;
        this.dataPegawai = pegawaiModel.getPegawaiForTable();
        dataPegawaiView.btnShow.addActionListener((ActionEvent e) -> {
            if (this.dataPegawai == null) {
                JOptionPane.showMessageDialog(null, "Data kosong");
            } else {
                this.dataPegawaiView.jTable.setModel((new JTable(dataPegawai, this.dataPegawaiView.columns)).getModel());
            }
        });
    }
}
