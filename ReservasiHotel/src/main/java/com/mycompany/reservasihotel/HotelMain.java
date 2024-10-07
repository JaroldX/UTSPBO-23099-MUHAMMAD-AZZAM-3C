package com.mycompany.reservasihotel;

import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Inisialisasi kamar
        hotel.addKamar(new Kamar(1, "Single"));
        hotel.addKamar(new Kamar(2, "Double"));
        hotel.addKamar(new Kamar(3, "Suite"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat Datang, Silahkan Login Reservasi Hotel!");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Customer");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loginAdmin(hotel, scanner);
                    break;
                case 2:
                    loginCustomer(hotel, scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Pilihan Invalid");
            }
        }
    }
    public static void loginAdmin(Hotel hotel, Scanner scanner) {
    System.out.println("Login Admin");
    System.out.print("Enter username: ");
    String username = scanner.next();
    System.out.print("Enter password: ");
    String password = scanner.next();

    if (username.equals("admin") && password.equals("123")) {
        System.out.println("Login Sukses");
        adminMenu(hotel, scanner);
    } else {
        System.out.println("username atau password invalid");
    }
}

    public static void adminMenu(Hotel hotel, Scanner scanner) {
        while (true) {
            System.out.println("Admin Menu");
            System.out.println("1. Lihat Kamar");
            System.out.println("2. Tambah Kamar");
            System.out.println("3. Logout");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    LihatKamar(hotel);
                    break;
                case 2:
                    TambahKamar(hotel, scanner);
                    break;
                case 3:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Pilihan Invalid");
            }
        }
    }

    public static void LihatKamar(Hotel hotel) {
        System.out.println("Semua Kamar:");
        for (Kamar kamar : hotel.getKamars()) {
            System.out.println("Room " + kamar.getNoKamar() + " - " + kamar.getTipeKamar());
        }
    }

    public static void TambahKamar(Hotel hotel, Scanner scanner) {
        System.out.print("Masukkan Nomor Kamar: ");
        int nomorKamar = scanner.nextInt();
        System.out.print("Masukkan Tipe Kamar: ");
        String tipeKamar = scanner.next();

        hotel.addKamar(new Kamar(nomorKamar, tipeKamar));
        System.out.println("Kamar Telah Ditambah");
    }
    
    public static void loginCustomer(Hotel hotel, Scanner scanner) {
        System.out.println("Login Customer");
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (username.equals("customer") && password.equals("123")) {
            System.out.println("Login successful!");
            customerMenu(hotel, scanner);
        } else {
            System.out.println("username atau password Invalid");
        }
    }

    public static void customerMenu(Hotel hotel, Scanner scanner) {
        while (true) {
            System.out.println("Customer Menu");
            System.out.println("1. Book Kamar");
            System.out.println("2. Logout");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookKamar(hotel, scanner);
                    break;
                case 2:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Pilihan Salah");
            }
        }
    
    }
    
    public static void bookKamar(Hotel hotel, Scanner scanner) {
        System.out.print("Masukkan Nomor Kamar: ");
        int noKamar = scanner.nextInt();

        for (Kamar kamar : hotel.getKamars()) {
                System.out.println("Kamar Telah Di booking");
            }
    }
}

   


