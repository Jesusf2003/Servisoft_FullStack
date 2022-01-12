package com.springboot.servisoft.model;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @Column(name = "codper")
    private Long codper;

    @Column(name = "nomper")
    private String nomper;

    @Column(name = "apeper")
    private String apeper;

    @Column(name = "userper")
    private String userper;

    @Column(name = "pswper")
    private String pswper;

    @Column(name = "celper")
    private String celper;

    @Column(name = "dniper")
    private String dniper;

    @Column(name = "rolper")
    private String rolper;

    @Column(name = "estper")
    private String estper;

    @Column(name = "mailper")
    private String mailper;

    @ManyToOne
    @JoinColumn(name = "codubi")
    private Ubigeo ubigeo;

    public Long getCodper() {
        return codper;
    }

    public void setCodper(Long codper) {
        this.codper = codper;
    }

    public String getNomper() {
        return nomper;
    }

    public void setNomper(String nomper) {
        this.nomper = nomper;
    }

    public String getApeper() {
        return apeper;
    }

    public void setApeper(String apeper) {
        this.apeper = apeper;
    }

    public String getUserper() {
        return userper;
    }

    public void setUserper(String userper) {
        this.userper = userper;
    }

    public String getPswper() {
        return pswper;
    }

    public void setPswper(String pswper) {
        this.pswper = pswper;
    }

    public String getCelper() {
        return celper;
    }

    public void setCelper(String celper) {
        this.celper = celper;
    }

    public String getDniper() {
        return dniper;
    }

    public void setDniper(String dniper) {
        this.dniper = dniper;
    }

    public String getRolper() {
        return rolper;
    }

    public void setRolper(String rolper) {
        this.rolper = rolper;
    }

    public String getEstper() {
        return estper;
    }

    public void setEstper(String estper) {
        this.estper = estper;
    }

    public String getMailper() {
        return mailper;
    }

    public void setMailper(String mailper) {
        this.mailper = mailper;
    }

    public Ubigeo getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }
}