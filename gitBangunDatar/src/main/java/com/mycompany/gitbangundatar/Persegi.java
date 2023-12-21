/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitbangundatar;

/**
 *
 * @author pebri
 */
public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi() {
    }

    public Persegi(double sisi, String nama, String jumlahSudut) {
        super(nama, jumlahSudut);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi*sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4*sisi;
    }
    
    
    
}
