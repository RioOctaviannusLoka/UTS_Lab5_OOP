package Soal4;

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
    }
}
