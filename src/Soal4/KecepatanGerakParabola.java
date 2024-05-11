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

import java.lang.Math;

public class KecepatanGerakParabola {
    private float kecAwal;
    private float sudut;
    private float gravitasi;
    private float waktu;

    // Constructor
    public KecepatanGerakParabola(float kecAwal, float sudut, float gravitasi, float waktu) {
        this.kecAwal = kecAwal;
        this.sudut = sudut;
        this.gravitasi = gravitasi;
        this.waktu = waktu;
    }

    // Method Overloading
    public KecepatanGerakParabola(float kecAwal, float sudut, float waktu) {
        this.kecAwal = kecAwal;
        this.sudut = sudut;
        this.gravitasi = 9.8F;
        this.waktu = waktu;
    }

    public float hitungKecepatanGerakParabola() {
        float Vx = (float) (kecAwal * Math.cos(Math.toRadians(sudut)));
        float Vy = (float) ((kecAwal * Math.sin(Math.toRadians(sudut))) - (gravitasi * waktu));
        return (float) Math.sqrt(Vx*Vx + Vy * Vy);
    }
}
