/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitbangundatar;

/**
 *
 * @author User
 */
public class PersegiPanjang extends BangunDatar{
    private int panjang = 5;
    private int lebar = 3;

    public PersegiPanjang() {
    }

    public PersegiPanjang(int panjang, int lebar, String nama, String jumlahSudut) {
        super(nama, jumlahSudut);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    
    @Override
    public double hitungLuas() {      
        return panjang * lebar; 
    }

    @Override
    public double hitungKeliling() {
        return 2*(panjang+lebar);
    }
    
    
}
