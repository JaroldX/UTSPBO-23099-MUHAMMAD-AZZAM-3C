package com.mycompany.reservasihotel;

import com.mycompany.reservasihotel.Admin;
import com.mycompany.reservasihotel.Customer;
import com.mycompany.reservasihotel.Kamar;

public class Hotel {
    private Kamar[] kamar;
    private Admin admin;
    private Customer[] customers;

    public Hotel() {
        kamar = new Kamar[10];
        admin = new Admin("admin", "123");
        customers = new Customer[10];
    }

    public void addKamar(Kamar room) {
        for (int i = 0; i < kamar.length; i++) {
            if (kamar[i] == null) {
                kamar[i] = room;
                break;
            }
        }
    }

    public Kamar[] getKamars() {
        return kamar;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Customer[] getCustomers() {
        return customers;
    }
}