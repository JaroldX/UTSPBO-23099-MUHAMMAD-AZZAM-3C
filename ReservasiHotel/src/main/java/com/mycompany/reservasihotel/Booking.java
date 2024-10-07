package com.mycompany.reservasihotel;

import java.util.Date;

public class Booking {
    private Kamar kamar;
    private Customer customer;
    private Date TanggalBooking;

    public Booking(Kamar kamar, Customer customer) {
        this.kamar = kamar;
        this.customer = customer;
        this.TanggalBooking = new Date();
    }

    public Kamar getKamar() {
        return kamar;
    }

    public Customer getCustomer() {
        return customer;
    }


    public void cancelKamar() {
        kamar.cancelKamar();
    }
}