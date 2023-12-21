/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitbangundatar;

/**
 *
 * @author User
 */
public class Lingkaran  extends BangunDatar{
    private double phi = 3.14;
    private double r;

    public Lingkaran() {
    }

    public Lingkaran(double phi, double r, String nama, String jumlahSudut) {
        super(nama, jumlahSudut);
        this.phi = phi;
        this.r = r;
    }

    @Override
    public double hitungLuas() {
         return phi * r * r;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double hitungKeliling() {
        return 2 * phi * r; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
