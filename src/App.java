/*
Nama  : Sri Rahayu
NIM   : 03082200013
Kelas : 20TI2
*/
import edu.uph.pbo.KartuHasilStudi;
import edu.uph.pbo.Mahasiswa;
import edu.uph.pbo.NilaiStudi;
import edu.uph.pbo.Matakuliah;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);
        System.out.println("Choose :");
        System.out.println("1. Tampilkan KHS");
        System.out.println("2. Exit");
        int in = Input.nextShort();
        if (in == 1){
            KartuHasilStudi kartuhasilstudi = new KartuHasilStudi();

            kartuhasilstudi.tampilkanKHS();
        }
        if (in == 2){
            System.exit(0);
        }
        Input.close();

    }
}