package Soal4;

//Gerak Parabola
/*Gerak parabola adalah gerak yang membentuk sebuah pola melengkung atau parabola. Fenomena ini terjadi ketika gerak
  lurus beraturan (GLB) dan gerak lurus berubah beraturan (GLBB) saling berpadu. Kedua jenis gerak ini membentuk
  sudut elevasi terhadap sumbu x (horizontal) dan sumbu y (vertikal). Sumbu x mewakili GLB, sedangkan sumbu y
  mencerminkan GLBB. Dalam konteks ini, kombinasi keduanya menghasilkan lintasan melengkung yang kita sebut sebagai
  gerak parabola.

  Rumus Kecepatan Gerak Parabola:
  Vt = √Vx^2 + Vy^2
  Vx = Vo cos alpha
  Vy = Vo sin alpha - g t

  Ket: Vt = kecepatan parabola sesaat setelah t detik (m/s)
       Vx = kecepatan di sumbu x (m/s)
       Vy = kecepatan di sumbu y (m/s)
       Vo = kecepatan awal ketika t = 0 detik (m/s)
       alpha = sudut elevasi gerak parabola
       g = percepatan gaya gravitasi (m/s^2)
       t = waktu (s)

  Gaya gravitasi (g) apabila tidak diinput nilainya oleh user, maka nilainya akan menjadi 9,8 m/s2
  Gaya gravitasi dapat berbeda pada setiap tempat di permukaan bumi. Di equator percepatan gravitasi
  sekitar 9,78 m/s2, sedangkan di daerah kutub sekitar 9,83 m/s2.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KecepatanGerakParabola v1 = new KecepatanGerakParabola(40, 30, 10, 1);
        System.out.println("Perhitungan 1");
        System.out.println("Kecepatan Awal : " + v1.getKecAwal() + " m/s");
        System.out.println("Sudut          : " + v1.getSudut() + " derajat");
        System.out.println("Gaya Gravitasi : " + v1.getGravitasi() + " m/s^2");
        System.out.println("Waktu          : " + v1.getWaktu() + " s");
        System.out.println("Kecepatan di sumbu x = " + v1.hitungKecepatanSumbuX() + " m/s");
        System.out.println("Kecepatan di sumbu y = " + v1.hitungKecepatanSumbuY() + " m/s");
        System.out.println("Kecepatan gerak parabola = " + v1.hitungKecepatanGerakParabola() + " m/s");
        System.out.println();

        KecepatanGerakParabola v2 = new KecepatanGerakParabola(50, 60, 2);
        System.out.println("Perhitungan 2");
        System.out.println("Kecepatan Awal : " + v2.getKecAwal() + " m/s");
        System.out.println("Sudut          : " + v2.getSudut() + " derajat");
        System.out.println("Gaya Gravitasi : " + v2.getGravitasi() + " m/s^2");
        System.out.println("Waktu          : " + v2.getWaktu() + " s");
        System.out.println("Kecepatan di sumbu x = " + v2.hitungKecepatanSumbuX() + " m/s");
        System.out.println("Kecepatan di sumbu y = " + v2.hitungKecepatanSumbuY() + " m/s");
        System.out.println("Kecepatan gerak parabola = " + v2.hitungKecepatanGerakParabola() + " m/s");
        System.out.println();

        System.out.println("Perhitungan 3 (User Input)");
        Scanner input = new Scanner(System.in);
        System.out.print("Kecepatan Awal : ");
        float kecAwal = input.nextFloat();
        System.out.print("Sudut          : ");
        float sudut = input.nextFloat();
        System.out.print("Gaya Gravitasi : ");
        float gravitasi = input.nextFloat();
        System.out.print("Waktu          : ");
        float waktu = input.nextFloat();
        KecepatanGerakParabola v3 = new KecepatanGerakParabola(kecAwal, sudut, gravitasi, waktu);
        System.out.println("Kecepatan di sumbu x = " + v3.hitungKecepatanSumbuX() + " m/s");
        System.out.println("Kecepatan di sumbu y = " + v3.hitungKecepatanSumbuY() + " m/s");
        System.out.println("Kecepatan gerak parabola = " + v3.hitungKecepatanGerakParabola() + " m/s");
    }
}
