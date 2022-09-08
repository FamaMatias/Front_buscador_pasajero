package com.speedup.qa.models;

public class CredentialData {
    private Integer adultos;
    private Integer ninos;
    private Integer bebes;


    public CredentialData(Integer adultos, Integer niños, Integer bebes) {
        this.adultos = adultos;
        this.ninos = ninos;
        this.bebes = bebes;
    }

    public Integer getAdultos() {
        return adultos;
    }
    public Integer getNinos() {
        return ninos;
    }

    public Integer getBebes() {
        return bebes;
    }

}
