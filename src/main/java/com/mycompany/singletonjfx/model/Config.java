package com.mycompany.singletonjfx.model;

public class Config {
    //objeto typo config unico (singleton)
    private static final Config instance = new Config();
    private String formatRelatorios = "html";
    private String tipoGrafico = "pizza";
    
    private Config(){}
    
    public static Config getInstance(){
        return instance;
    }
   
    public String getFormatRelatorios() {
        return formatRelatorios;
    }

    public void setFormatRelatorios(String formatRelatorios) {
        this.formatRelatorios = formatRelatorios;
    }

    public String getTipoGrafico() {
        return tipoGrafico;
    }

    public void setTipoGrafico(String tipoGrafico) {
        this.tipoGrafico = tipoGrafico;
    }
}
