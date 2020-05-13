package app.controller;

import app.model.AdminModel;
import app.model.PegawaiModel;
import app.view.*;

public class Transition {
    public void homeTransition() {
        HomeView homeView = new HomeView();
        PegawaiModel pegawaiModel = new PegawaiModel();
    }

    public void dataPegawaiTransition() {
        DataPegawaiView dataPegawaiView = new DataPegawaiView();
        PegawaiModel pegawaiModel = new PegawaiModel();
        DataPegawaiController dataPegawaiController = new DataPegawaiController(dataPegawaiView, pegawaiModel);
    }

    public void gajiPegawaiTransition() {
        GajiPegawaiView gajiPegawaiView = new GajiPegawaiView();
        PegawaiModel pegawaiModel = new PegawaiModel();
        GajiPegawaiController gajiPegawaiController = new GajiPegawaiController(gajiPegawaiView, pegawaiModel);
    }

    public void informasiPegawaiTransition() {
        InformasiPegawaiView informasiPegawaiView = new InformasiPegawaiView();
    }

    public void adminTransition() {
        AdminHomeView adminHomeView = new AdminHomeView();
    }

    public void adminDataPegawaiTransition() {
        AdminDataPegawaiView adminDataPegawaiView = new AdminDataPegawaiView();
        PegawaiModel pegawaiModel = new PegawaiModel();
        AdminDataPegawaiController adminDataPegawaiController = new AdminDataPegawaiController(adminDataPegawaiView, pegawaiModel);
    }

    public void loginAdminTransition() {
        AdminLoginView adminLoginView = new AdminLoginView();
        AdminModel adminModel = new AdminModel();
        AdminLoginController adminLoginController = new AdminLoginController(adminLoginView, adminModel);
    }
}
