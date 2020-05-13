package app.controller;

import app.model.PegawaiModel;
import app.view.AdminDataPegawaiView;
import app.view.UpdateDataPegawaiView;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AdminDataPegawaiController {
    AdminDataPegawaiView adminDataPegawaiView;
    PegawaiModel pegawaiModel;
    String[][] dataPegawai;

    public AdminDataPegawaiController(AdminDataPegawaiView adminDataPegawaiView, PegawaiModel pegawaiModel) {
        this.adminDataPegawaiView = adminDataPegawaiView;
        this.pegawaiModel = pegawaiModel;
        this.dataPegawai = pegawaiModel.getPegawaiForTable();

        this.adminDataPegawaiView.btnShow.addActionListener((ActionEvent e) -> {
            if (this.dataPegawai == null) {
                JOptionPane.showMessageDialog(null, "Data kosong");
            } else {
                this.setDataTabel(adminDataPegawaiView);
            }
        });

        this.adminDataPegawaiView.btnDelete.addActionListener((ActionEvent e) -> {
            int row = this.adminDataPegawaiView.jTable.getSelectedRow();
            String idPegawai = this.adminDataPegawaiView.jTable.getValueAt(row, 0).toString();
            this.pegawaiModel.deletePegawai(idPegawai);
            this.setDataTabel(adminDataPegawaiView);
        });

        this.adminDataPegawaiView.btnUpdate.addActionListener((ActionEvent e) -> {
            int row = this.adminDataPegawaiView.jTable.getSelectedRow();
            String idPegawai = this.adminDataPegawaiView.jTable.getValueAt(row, 0).toString();
            UpdateDataPegawaiView updateDataPegawaiView = new UpdateDataPegawaiView();
            UpdateDataPegawaiController updateDataPegawaiController = new UpdateDataPegawaiController(updateDataPegawaiView, pegawaiModel, idPegawai);
            this.adminDataPegawaiView.dispose();
        });
    }

    private void setDataTabel(AdminDataPegawaiView adminDataPegawaiView) {
        this.dataPegawai = pegawaiModel.getPegawaiForTable();
        this.adminDataPegawaiView.jTable.setModel((new JTable(dataPegawai, this.adminDataPegawaiView.columns)).getModel());
    }

}

