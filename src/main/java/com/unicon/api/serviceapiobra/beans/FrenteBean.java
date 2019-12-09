
package com.unicon.api.serviceapiobra.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class FrenteBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idMarca;
    private int idFrente;
    private String codigoObra;
    private String codigoExterno;
    private String descripcionFrente;
    private String tipoCalle;
    private String direccionFrente;
    private String nombreUrbanizacion;
    private String numeroCalle;
    private String codigoPostal;
    private String referencia;
    private double latitud;
    private double longitud;
    private String cuadrante;
    private String codigoPlanta;
    private BigDecimal volumen;
    private String unidadMedida;

    public FrenteBean() {
    }

    public FrenteBean(int idMarca, int idFrente, String codigoObra, String codigoExterno, String descripcionFrente, String tipoCalle) {
        this.idMarca = idMarca;
        this.idFrente = idFrente;
        this.codigoObra = codigoObra;
        this.codigoExterno = codigoExterno;
        this.descripcionFrente = descripcionFrente;
        this.tipoCalle = tipoCalle;
    }

    @Override
    public String toString() {
        return "FrenteBean{" +
                "idMarca=" + idMarca +
                ", idFrente=" + idFrente +
                ", codigoObra='" + codigoObra + '\'' +
                ", codigoExterno='" + codigoExterno + '\'' +
                ", descripcionFrente='" + descripcionFrente + '\'' +
                ", tipoCalle='" + tipoCalle + '\'' +
                ", direccionFrente='" + direccionFrente + '\'' +
                ", nombreUrbanizacion='" + nombreUrbanizacion + '\'' +
                ", numeroCalle='" + numeroCalle + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", referencia='" + referencia + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", cuadrante='" + cuadrante + '\'' +
                ", codigoPlanta='" + codigoPlanta + '\'' +
                ", volumen=" + volumen +
                ", unidadMedida='" + unidadMedida + '\'' +
                '}';
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdFrente() {
        return idFrente;
    }

    public void setIdFrente(int idFrente) {
        this.idFrente = idFrente;
    }

    public String getCodigoObra() {
        return codigoObra;
    }

    public void setCodigoObra(String codigoObra) {
        this.codigoObra = codigoObra;
    }

    public String getCodigoExterno() {
        return codigoExterno;
    }

    public void setCodigoExterno(String codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public String getDescripcionFrente() {
        return descripcionFrente;
    }

    public void setDescripcionFrente(String descripcionFrente) {
        this.descripcionFrente = descripcionFrente;
    }

    public String getTipoCalle() {
        return tipoCalle;
    }

    public void setTipoCalle(String tipoCalle) {
        this.tipoCalle = tipoCalle;
    }

    public String getDireccionFrente() {
        return direccionFrente;
    }

    public void setDireccionFrente(String direccionFrente) {
        this.direccionFrente = direccionFrente;
    }

    public String getNombreUrbanizacion() {
        return nombreUrbanizacion;
    }

    public void setNombreUrbanizacion(String nombreUrbanizacion) {
        this.nombreUrbanizacion = nombreUrbanizacion;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getCuadrante() {
        return cuadrante;
    }

    public void setCuadrante(String cuadrante) {
        this.cuadrante = cuadrante;
    }

    public String getCodigoPlanta() {
        return codigoPlanta;
    }

    public void setCodigoPlanta(String codigoPlanta) {
        this.codigoPlanta = codigoPlanta;
    }

    public BigDecimal getVolumen() {
        return volumen;
    }

    public void setVolumen(BigDecimal volumen) {
        this.volumen = volumen;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
}
