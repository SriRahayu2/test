/*
Nama  : Sri Rahayu
NIM   : 03082200013
Kelas : 20TI2
*/
package edu.uph.pbo;

public class Mahasiswa {
    String nama;
    String StudentID;
    
    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String StudentID) {
        this.nama = nama;
        this.StudentID = StudentID;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStudentID() {
        return this.StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public Mahasiswa Nama(String Nama) {
        setNama(Nama);
        return this;
    }

    public Mahasiswa StudentID(String StudentID) {
        setStudentID(StudentID);
        return this;
    }

    @Override
    public String toString() {
        return "" +
            "Nama Mahasiswa : " + getNama() + "\n" +
            " Student ID    : " + getStudentID() + "\t";
    }

}