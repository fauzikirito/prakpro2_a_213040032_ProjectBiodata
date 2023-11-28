/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import javax.swing.*;
import dao.BiodataDao;
import biodata.BiodataFrame;
/**
 *
 * @author Shinichi
 */
public class MainTest extends JFrame {
   private final BiodataDao biodataDao; // Variable biodataDao untuk menyimpan nilai biodataDao
   private final BiodataFrame biodataFrame; // Variable biodataFrame untuk menyimpan nilai biodataFrame

    // Konstructor Main
    public MainTest() {
        // Set judul frame
        this.setTitle("Biodata");

        // Set ukuran frame
        this.setSize(400, 500);
        
        // Inisialisasi nilai dari biodataDao dan biodataFrame
        this.biodataDao = new BiodataDao();
        this.biodataFrame = new BiodataFrame(biodataDao);

        // Set frame untuk ditampilkan
        this.biodataFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            // Override method run dari Runnable
            public void run() {
                // Instansiasi StudiKasus dengan nama h
                new MainTest();
            }
        });
    }
}
