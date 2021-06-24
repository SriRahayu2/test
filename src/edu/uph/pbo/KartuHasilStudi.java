/*
Nama  : Sri Rahayu
NIM   : 03082200013
Kelas : 20TI2
*/
package edu.uph.pbo;

import java.util.ArrayList;

public class KartuHasilStudi {
    private static final String Nilaistudi = null;
    ArrayList<NilaiStudi> ListNilaiStudi = new ArrayList<NilaiStudi>();
    Matakuliah Matakuliah;
    int Semester;
    Mahasiswa Mahasiswa;

    public KartuHasilStudi() {
    }

    public KartuHasilStudi(ArrayList<NilaiStudi> ListNilaiStudi, int Semester, Mahasiswa Mahasiswa, Matakuliah Matakuliah) {
        this.Mahasiswa = Mahasiswa;
        this.Semester = Semester;
        this.ListNilaiStudi = ListNilaiStudi;
        this.Matakuliah = Matakuliah;
    }

    public ArrayList<NilaiStudi> getListNilaiStudi() {
        return this.ListNilaiStudi;
    }

    public void setListNilaiStudi(ArrayList<NilaiStudi> ListNilaiStudi) {
        this.ListNilaiStudi = ListNilaiStudi;
    }

    public int getSemester() {
        return this.Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public Mahasiswa getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(Mahasiswa Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public Matakuliah getMatakuliah() {
        return this.Matakuliah;
    }

    public void setMatakuliah(Matakuliah Matakuliah) {
        this.Matakuliah = Matakuliah;
    }

    public KartuHasilStudi ListNilaiStudi(ArrayList<NilaiStudi> ListNilaiStudi) {
        setListNilaiStudi(ListNilaiStudi);
        return this;
    }

    public KartuHasilStudi Semester(int Semester) {
        setSemester(Semester);
        return this;
    }

    public KartuHasilStudi Mahasiswa(Mahasiswa Mahasiswa) {
        setMahasiswa(Mahasiswa);
        return this;
    }

    public KartuHasilStudi Matakuliah(Matakuliah Matakuliah) {
        setMatakuliah(Matakuliah);
        return this;
    }

    public void tambahNilai(NilaiStudi st){
        ListNilaiStudi.add(st);
    }

    public double ipk(){
        double totalsatu = 0.0, totaldua = 0.0;
        for(NilaiStudi i : ListNilaiStudi){
            totalsatu += i.getnilaiangka() * i.getMatakuliah().getsks();
            totaldua += i.getsks();
        }
        return totalsatu/totaldua;
    }

    Matakuliah mk1 = new Matakuliah("1","001","Filsafat Ilmu Pengetahuan",2,'A');
    Matakuliah mk2 = new Matakuliah("2","002","Pemrograman Berorientasi Objek",3,'B');
    Matakuliah mk3 = new Matakuliah("3","003","Bahasa Indonesia",2,'A');
    Mahasiswa mhs = new Mahasiswa("Sri Rahayu","03082200013");
    
    int totalsks = mk1.getsks() + mk2.getsks() + mk3.getsks();

    public void tampilkanKHS(){
        System.out.println("--Tampilkan KHS--");
        System.out.println(mhs.toString());
        System.out.println("Semester       : " + getSemester());
        System.out.println("IPK            : " );
        System.out.println("Total SKS      : " + totalsks);
        System.out.println("");
        System.out.println("Nilai");
        System.out.println("No."+ "\t\t"+"Kode MataKuliah"+"\t\t"+"Nama MataKuliah"+"\t\t"+"SKS"+ "\t\t"+"Nilai");
        System.out.println(mk1.toString());
        System.out.println(mk2.toString());
        System.out.println(mk3.toString());
    }


    public void tampilkanJadwalKuliah() {
        System.out.println("Kartu Hasil Studi ");
        System.out.println("Nama Mahasiswa : \nSemester : \nIPK : \nTotal SKS :  ");
        System.out.println("");
        System.out.println("Nilai");
        for(NilaiStudi ns : ListNilaiStudi){
            System.out.println(ns.toString());
        }
        System.out.println("No. \t\tKode Matakuliah \t\tNama Matakuliah \tSKS \tNilai");
    }
}