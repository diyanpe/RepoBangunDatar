/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gitbangundatar;

/**
 *
 * @author pebri
 */
public abstract class BangunDatar {

   private String nama;
   private String jumlahSudut;

    public BangunDatar() {
    }

    public BangunDatar(String nama, String jumlahSudut) {
        this.nama = nama;
        this.jumlahSudut = jumlahSudut;
    }
   
   public abstract double hitungLuas();
   
   public abstract double hitungKeliling();


}
