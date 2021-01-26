/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.damai.latihanmvcjdbc.service;

import java.util.List;
import edu.damai.latihanmvcjdbc.entity.Pelanggan;
import edu.damai.latihanmvcjdbc.error.PelangganException;

/**
 *
 * @author damai
 * NAMA     : damai saputra laoli
 * KELAS    : IF-1
 * NIM      : 10119012
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
