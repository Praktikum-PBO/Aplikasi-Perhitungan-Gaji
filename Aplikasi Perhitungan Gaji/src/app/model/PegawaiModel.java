package app.model;

import java.sql.*;
import javax.swing.JOptionPane;

public class PegawaiModel {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi_pbo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";

    Connection connection;
    Statement statement;

    public PegawaiModel() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil!");
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
            System.out.println(err);
        }
    }

    public void insertPegawai(String idPegawai, String namaPegawai, String posisiPegawai, String alamatPegawai, String noHp, int gajiPokok, int jamLembur, int tunjangan, int pajak, int sumGaji) {
        try {
            String query = "INSERT INTO `data_pegawai` (`id_pegawai`, `nama_pegawai`, `posisi_pegawai`, `alamat_pegawai`, `no_hp`, `gaji_pokok`, `jam_lembur`, `tunjangan`, `pajak`, `sum_gaji`) " +
                    "VALUES ('" + idPegawai +"', '" + namaPegawai +"', '" + posisiPegawai +"', '" + alamatPegawai +"', '" + noHp +"', " + gajiPokok +", " + jamLembur +", " + tunjangan +", " + pajak +", " + sumGaji + ")";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data pegawai, id sudah terpakai");
        }
    }
    private int getBanyakPegawai() {
        int jmlData = 0;
        try {
            statement = connection.createStatement();
            String query = "SELECT * FROM `data_pegawai`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jmlData++;
            }
            return jmlData;
        } catch (Exception e) {
            return 0;
        }
    }
    public String[][] getPegawaiForTable() {
        try {
            int jmlData = 0;
            String dataPegawai[][] = new String[this.getBanyakPegawai()][7];
            String query = "SELECT * FROM `data_pegawai`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                dataPegawai[jmlData][0] = resultSet.getString("id_pegawai");
                dataPegawai[jmlData][1] = resultSet.getString("nama_pegawai");
                dataPegawai[jmlData][2] = resultSet.getString("posisi_pegawai");
                dataPegawai[jmlData][3] = Integer.toString(resultSet.getInt("gaji_pokok"));
                dataPegawai[jmlData][4] = Integer.toString(resultSet.getInt("jam_lembur"));
                dataPegawai[jmlData][5] = Integer.toString(resultSet.getInt("tunjangan"));
                dataPegawai[jmlData][6] = Integer.toString(resultSet.getInt("sum_gaji"));
                jmlData++;
            }
            return dataPegawai;
        } catch (Exception e) {
            return null;
        }
    }

    public void deletePegawai(String idPegawai) {
        try {
            String query = "DELETE FROM `data_pegawai` WHERE `id_pegawai`='" + idPegawai + "'";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
        }
    }

    public void updatePegawai(String idPegawai, String nama, String alamat, String noHp, String posisi, int gaji) {
        try {
            String query = "UPDATE `data_pegawai` SET `nama_pegawai`='" + nama + "', `alamat_pegawai`='" + alamat + "', `no_hp`='" + noHp + "', `posisi`='" + posisi + "', `gaji`=" + gaji + " WHERE `id_pegawai`='" + idPegawai + "'";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data barang berhasil diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal di update");
        }
    }

    public String[] getPegawai(String idPegawai) {
        try {
            String[] data = new String[6];
            String query = "SELECT * FROM `data_admin` WHERE `id_pegawai`='" + idPegawai + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                data[0] = resultSet.getString("id_pegawai");
                data[1] = resultSet.getString("nama_pegawai");
                data[2] = resultSet.getString("alamat_pegawai");
                data[3] = resultSet.getString("no_hp");
                data[4] = resultSet.getString("posisi_pegawai");
                data[5] = Integer.toString(resultSet.getInt("gaji_pokok"));
            }
            return data;
        } catch (Exception e) {
            return null;
        }
    }
}
