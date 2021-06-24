/*
Nama  : Sri Rahayu
NIM   : 03082200013
Kelas : 20TI2
*/
package edu.uph.pbo;

public class NilaiStudi {
    Matakuliah Matakuliah;
    Double nilaiangka;
    char nilaihuruf;
    double ipk;
    int A = 4, B = 3, C = 2, D = 1, E = 0; 
    
    public NilaiStudi() {
    }

    public NilaiStudi(Matakuliah Matakuliah, Double nilaiangka, char nilaihuruf, double ipk) {
        this.Matakuliah = Matakuliah;
        this.nilaiangka = nilaiangka;
        this.nilaihuruf = nilaihuruf;
        this.ipk = ipk;
    }

    public int getsks(){
        int sks = Matakuliah.sks;
        return sks;
    }

    public Matakuliah getMatakuliah() {
        return this.Matakuliah;
    }

    public void setMatakuliah(Matakuliah Matakuliah) {
        this.Matakuliah = Matakuliah;
    }

    public Double getnilaiangka() {
        return this.nilaiangka;
    }

    public void setnilaiangka(Double nilaiangka) {
        this.nilaiangka = nilaiangka;
    }

    public char getnilaihuruf() {
        return this.nilaihuruf;
    }

    public void setnilaihuruf(char nilaihuruf) {
        this.nilaihuruf = nilaihuruf;
    }

    public double getipk() {
        return this.ipk;
    }

    public void setipk(double ipk) {
        this.ipk = ipk;
    }

    public NilaiStudi Matakuliah(Matakuliah Matakuliah) {
        setMatakuliah(Matakuliah);
        return this;
    }

    public NilaiStudi NilaiAngka(Double NilaiAngka) {
        setnilaiangka(nilaiangka);
        return this;
    }

    public NilaiStudi nilaihuruf(char nilaihuruf) {
        setnilaihuruf(nilaihuruf);
        return this;
    }

    public NilaiStudi ipk(double ipk) {
        setipk(ipk);
        return this;
    }

    @Override
    public String toString() {
        return "" +
            "Nilai : " + Matakuliah.getsks();
    }

}