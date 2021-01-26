/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.damai.latihanmvcjdbc.main;

import edu.damai.latihanmvcjdbc.database.KingsBarbershopDatabase;
import java.sql.SQLException;
import java.util.List;
import edu.damai.latihanmvcjdbc.entity.Pelanggan;
import edu.damai.latihanmvcjdbc.error.PelangganException;
import edu.damai.latihanmvcjdbc.service.PelangganDao;
import javax.swing.SwingUtilities;
import edu.damai.latihanmvcjdbc.view.MainViewPelanggan;
import java.util.logging.Logger;

/**
 *
 * @author damai
 * NAMA     : damai saputra laoli
 * KELAS    : IF-1
 * NIM      : 10119012
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
//                    Logger.getLogger(LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
}