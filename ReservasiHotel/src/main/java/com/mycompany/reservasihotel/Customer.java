package com.mycompany.reservasihotel;

public class Customer {
    private String username;
    private String password;
    private Booking[] bookings;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        bookings = new Booking[10];
    }

    public String getUsername() {
        return username;
    }

    public void bookKamar(Hotel hotel, Kamar room) {
        for (int i = 0; i < bookings.length; i++) {
            if (bookings[i] == null) {
                bookings[i] = new Booking(room, this);
                room.bookKamar();
                break;
            }
        }
    }

    public Booking[] getBookings() {
        return bookings;
    }
}
