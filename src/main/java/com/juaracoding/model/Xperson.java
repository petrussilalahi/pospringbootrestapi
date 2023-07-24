package com.juaracoding.model;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author petrus a.k.a. Petrus
Java Developer
Created on 24/07/23 21.05
@Last Modified 24/07/23 21.05
Version 1.0
*/

import java.time.LocalDate;

public class Xperson {

    private Long idPeron;
    private String namaLengkap;
    private LocalDate tanggalLahir;
    private String email;

    public Long getIdPeron() {
        return idPeron;
    }

    public void setIdPeron(Long idPeron) {
        this.idPeron = idPeron;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
