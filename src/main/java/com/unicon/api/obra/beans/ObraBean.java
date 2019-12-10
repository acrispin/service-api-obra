package com.unicon.api.obra.beans;

import java.io.Serializable;

public class ObraBean implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Integer idMarca;
    protected String codigo;
    protected String nombre;
    protected String direccion;
    protected String codigoPostal;
    protected String tipoCalle;
    protected String numeroCalle;
    protected String nombreUrbanizacion;
    protected Double volumenAprox;
    protected String referenciaDireccion;
    protected String telefono;
    protected Double volumenInicial;
    protected String cuadrante;
    protected Integer pisos;
    protected Double latitud;
    protected Double longitud;
    protected String unidadNegocio;
    protected String unidadMedida;
    protected Double duracion;
    protected Integer tipo;
    protected String propietario;
    protected String codigoExterno;

    public ObraBean() {
    }

    public ObraBean(Integer idMarca, String codigo, String nombre, String codigoPostal, Integer pisos) {
        this.idMarca = idMarca;
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "ObraBean{" +
                "idMarca=" + idMarca +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", tipoCalle='" + tipoCalle + '\'' +
                ", numeroCalle='" + numeroCalle + '\'' +
                ", nombreUrbanizacion='" + nombreUrbanizacion + '\'' +
                ", volumenAprox=" + volumenAprox +
                ", referenciaDireccion='" + referenciaDireccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", volumenInicial=" + volumenInicial +
                ", cuadrante='" + cuadrante + '\'' +
                ", pisos=" + pisos +
                ", longitud=" + longitud +
                ", latitud=" + latitud +
                ", unidadNegocio='" + unidadNegocio + '\'' +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", duracion=" + duracion +
                ", tipo=" + tipo +
                ", propietario='" + propietario + '\'' +
                ", codigoExterno='" + codigoExterno + '\'' +
                '}';
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTipoCalle() {
        return tipoCalle;
    }

    public void setTipoCalle(String tipoCalle) {
        this.tipoCalle = tipoCalle;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getNombreUrbanizacion() {
        return nombreUrbanizacion;
    }

    public void setNombreUrbanizacion(String nombreUrbanizacion) {
        this.nombreUrbanizacion = nombreUrbanizacion;
    }

    public Double getVolumenAprox() {
        return volumenAprox;
    }

    public void setVolumenAprox(Double volumenAprox) {
        this.volumenAprox = volumenAprox;
    }

    public String getReferenciaDireccion() {
        return referenciaDireccion;
    }

    public void setReferenciaDireccion(String referenciaDireccion) {
        this.referenciaDireccion = referenciaDireccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Double getVolumenInicial() {
        return volumenInicial;
    }

    public void setVolumenInicial(Double volumenInicial) {
        this.volumenInicial = volumenInicial;
    }

    public String getCuadrante() {
        return cuadrante;
    }

    public void setCuadrante(String cuadrante) {
        this.cuadrante = cuadrante;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public String getCodigoExterno() {
        return codigoExterno;
    }

    public void setCodigoExterno(String codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public String getUnidadNegocio() {
        return unidadNegocio;
    }

    public void setUnidadNegocio(String unidadNegocio) {
        this.unidadNegocio = unidadNegocio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
