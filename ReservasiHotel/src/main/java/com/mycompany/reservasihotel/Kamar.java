package com.mycompany.reservasihotel;

public class Kamar {
    private int NoKamar;
    private String TipeKamar;
    private boolean Sedia;

    public Kamar(int NoKamar, String TipeKamar) {
        this.NoKamar = NoKamar;
        this.TipeKamar = TipeKamar;
        this.Sedia = true;
    }

    public int getNoKamar() {
        return NoKamar;
    }

    public String getTipeKamar() {
        return TipeKamar;
    }

    public boolean Sedia() {
        return Sedia;
    }

    public void bookKamar() {
        Sedia = false;
    }

    public void cancelKamar() {
        Sedia = true;
    }
}