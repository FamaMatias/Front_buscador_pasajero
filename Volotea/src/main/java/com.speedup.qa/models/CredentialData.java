package com.speedup.qa.models;

public class CredentialData {
    private Integer  adults;
    private Integer child;
    private Integer baby;


    public Integer getAdults() {
        return adults;
    }
    public Integer getChild() {
        return child;
    }
    public Integer getBaby() {
        return baby;
    }

    public CredentialData(Integer adults, Integer child, Integer baby) {
        this.adults = adults;
        this.child = child;
        this.baby = baby;
    }


}
