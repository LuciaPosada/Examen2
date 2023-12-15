package com.lucia.juego;

public class Record {
    /**
     * puntuacion actual del record
     */
    private int puntuacionRecord;
    /**
     * alias del jugador que tenga el record
     */
    private String aliasRecord;

    public int getPuntuacionRecord() {
        return puntuacionRecord;
    }

    public void setPuntuacionRecord(int puntuacionRecord) {
        this.puntuacionRecord = puntuacionRecord;
    }

    public String getAliasRecord() {
        return aliasRecord;
    }

    public void setAliasRecord(String aliasRecord) {
        this.aliasRecord = aliasRecord;
    }
}
