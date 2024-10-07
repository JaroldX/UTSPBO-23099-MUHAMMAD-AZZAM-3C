package com.mycompany.reservasihotel;

public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void manageKamars(Hotel hotel) {
        System.out.println("Manage Kamars:");
        for (Kamar kamar : hotel.getKamars()) {
            System.out.println("Kamar " + kamar.getNoKamar() + " - " + kamar.getTipeKamar());
        }
    }

    public void viewBookings(Hotel hotel) {
        System.out.println("View Bookings:");
        for (Customer customer : hotel.getCustomers()) {
            for (Booking booking : customer.getBookings()) {
                System.out.println("Customer " + customer.getUsername() + " - Kamar " + booking.getKamar().getNoKamar());
            }
        }
    }
}
