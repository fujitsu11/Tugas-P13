import java.util.Scanner;
public class Biodata {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama, nim, kelas, alamat;
            
            int age;
            System.out.print("Masukkan nama: ");
            nama = input.nextLine();
            System.err.println("Masukkan NIM: ");
            nim = input.nextLine();
            System.out.print("Masukkan kode kelas: ");
            kelas = input.nextLine();
            System.out.print("Masukkan umur: ");
            age = input.nextInt();
                        System.out.print("Masukkan alamat: ");
            alamat = input.nextLine();
            input.nextLine(); // Consume the newline character
            System.out.println("\nBiodata:");
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Kelas: " + kelas);
            System.out.println("Umur: " + age);
            System.out.println("Alamat: " + alamat);

        }
    }
}