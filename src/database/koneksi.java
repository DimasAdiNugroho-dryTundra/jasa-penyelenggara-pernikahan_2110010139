/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author Asus
 */
public class koneksi {
    public Connection konekDB;
    public Statement perintah;
    
    public koneksi(){
        try {
            String namaDB = "nikah_2110010139";
            String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost/" + namaDB;
            
            Class.forName("com.mysql.jdbc.Driver");
            konekDB = DriverManager.getConnection(url, username, password);
            perintah = konekDB.createStatement();
            
            System.out.println("Database berhasil dikoneksikan.");           
        } catch (Exception e) {
            //menangkap kesalahan
            JOptionPane.showMessageDialog(null, e.toString());
        }
    };
    
}
