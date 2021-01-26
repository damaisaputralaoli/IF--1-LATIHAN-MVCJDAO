/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.damai.latihanmvcjdbc.event;

import edu.damai.latihanmvcjdbc.entity.Pelanggan;
import edu.damai.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author damai
 * NAMA     : Damai Saputra laoli
 * KELAS    : IF-1
 * NIM      : 10119012
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

}
