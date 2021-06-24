/*
Nama  : Sri Rahayu
NIM   : 03082200013
Kelas : 20TI2
*/
package edu.uph.pbo;

public class Matakuliah {
    String no;
    String kodematakuliah;
    String namamatakuliah;
    int sks;
    char huruf;
    
    public Matakuliah() {
    }

    public Matakuliah(String no, String kodematakuliahString, String namamatakuliah, int sks, char huruf) {
        this.no = no;
        this.kodematakuliah = kodematakuliah;
        this.namamatakuliah = namamatakuliah;
        this.sks = sks;
        this.huruf = huruf;
    }

    public String getno() {
        return this.no;
    }

    public String getkodematakuliah() {
        return this.kodematakuliah;
    }

    public void setkodematakuliah(String kodematakuliah) {
        this.kodematakuliah = kodematakuliah;
    }

    public String getnamamatakuliah() {
        return this.namamatakuliah;
    }

    public char gethuruf() {
        return this.huruf;
    }

    public void huruf(char huruf) {
        this.huruf = huruf;
    }
    
    public void no(String no) {
        this.no = no;
    }

    public void setnamamatakuliah(String namamatakuliah) {
        this.namamatakuliah = namamatakuliah;
    }

    public int getsks() {
        return this.sks;
    }

    public void setsks(int sks) {
        this.sks = sks;
    }

    public Matakuliah kodematakuliah(String kodematakuliah) {
        setkodematakuliah(kodematakuliah);
        return this;
    }

    public Matakuliah namamatakuliah(String namamatakuliah) {
        setnamamatakuliah(namamatakuliah);
        return this;
    }

    public Matakuliah sks(int sks) {
        setsks(sks);
        return this;
    }

    @Override
    public String toString() {
        return "" +
            getno() + "\t\t" +
            getkodematakuliah() + "\t\t" +
            getnamamatakuliah() + "\t\t" +
            getsks() + "\t\t" +
            gethuruf();
    }

}