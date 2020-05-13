package app.model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminModel {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi_pbo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";

    Connection connection;
    Statement statement;

    public AdminModel() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil!");
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
            System.out.println(err);
        }
    }

    public boolean getAdmin(String username, String password) {
        try {
            int jmlData = 0;
            String query = "SELECT * FROM `data_admin` WHERE `username`='" + username + "' AND `password`='" + password + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jmlData++;
            }
            if (jmlData != 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Admin tidak terdaftar");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Admin tidak terdaftar");
            return false;
        }
    }
}
