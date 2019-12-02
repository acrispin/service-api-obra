package com.unicon.api.serviceapiobra.beans;

import java.io.Serializable;

public class ResponseContactoBean extends ResponseBean implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String codigoObra;
    protected String secuencia;
    protected Integer codigoUsuario;

    public ResponseContactoBean() {
        super();
    }

    public ResponseContactoBean(String codigoObra, String secuencia, int codigoUsuario) {
        super();
        this.codigoObra = codigoObra;
        this.secuencia = secuencia;
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public String toString() {
        return "ResponseContactoBean{" +
                "codigoObra='" + codigoObra + '\'' +
                ", secuencia='" + secuencia + '\'' +
                ", codigoUsuario=" + codigoUsuario +
                ", id=" + id +
                ", codigo='" + codigo + '\'' +
                ", estado=" + estado +
                ", mensaje='" + mensaje + '\'' +
                ", resultado=" + resultado +
                '}';
    }

    public String getCodigoObra() {
        return codigoObra;
    }

    public void setCodigoObra(String codigoObra) {
        this.codigoObra = codigoObra;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
}
