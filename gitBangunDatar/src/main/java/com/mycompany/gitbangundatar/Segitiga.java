/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitbangundatar;

/**
 *
 * @author 62822
 */
public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;
    private int sisi1;
    private int sisi2;

    public Segitiga() {
    }

    public Segitiga(double alas, double tinggi, int sisi1, int sisi2, String nama, String jumlahSudut) {
        super(nama, jumlahSudut);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }


    @Override
    public double hitungLuas() {
        return 1/2 *alas*tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisi1+sisi2;
    }
    
    
}
