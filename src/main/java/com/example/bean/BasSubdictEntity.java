package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_SUBDICT", schema = "TYPE23", catalog = "")
public class BasSubdictEntity {
    private long id;
    private String brcno;
    private String subone;
    private String subtwo;
    private String subname;
    private String subtype;
    private String subkind;
    private String balctrldir;
    private String amtctrldir;
    private String intflag;
    private String bal0Flag;
    private String redflag;
    private String openaccflag;
    private String ctrlflag;
    private String getrateflag;
    private String countflag;
    private String computeflag;
    private Time eftdate;
    private String ccy;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BRCNO")
    public String getBrcno() {
        return brcno;
    }

    public void setBrcno(String brcno) {
        this.brcno = brcno;
    }

    @Basic
    @Column(name = "SUBONE")
    public String getSubone() {
        return subone;
    }

    public void setSubone(String subone) {
        this.subone = subone;
    }

    @Basic
    @Column(name = "SUBTWO")
    public String getSubtwo() {
        return subtwo;
    }

    public void setSubtwo(String subtwo) {
        this.subtwo = subtwo;
    }

    @Basic
    @Column(name = "SUBNAME")
    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @Basic
    @Column(name = "SUBTYPE")
    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    @Basic
    @Column(name = "SUBKIND")
    public String getSubkind() {
        return subkind;
    }

    public void setSubkind(String subkind) {
        this.subkind = subkind;
    }

    @Basic
    @Column(name = "BALCTRLDIR")
    public String getBalctrldir() {
        return balctrldir;
    }

    public void setBalctrldir(String balctrldir) {
        this.balctrldir = balctrldir;
    }

    @Basic
    @Column(name = "AMTCTRLDIR")
    public String getAmtctrldir() {
        return amtctrldir;
    }

    public void setAmtctrldir(String amtctrldir) {
        this.amtctrldir = amtctrldir;
    }

    @Basic
    @Column(name = "INTFLAG")
    public String getIntflag() {
        return intflag;
    }

    public void setIntflag(String intflag) {
        this.intflag = intflag;
    }

    @Basic
    @Column(name = "BAL0FLAG")
    public String getBal0Flag() {
        return bal0Flag;
    }

    public void setBal0Flag(String bal0Flag) {
        this.bal0Flag = bal0Flag;
    }

    @Basic
    @Column(name = "REDFLAG")
    public String getRedflag() {
        return redflag;
    }

    public void setRedflag(String redflag) {
        this.redflag = redflag;
    }

    @Basic
    @Column(name = "OPENACCFLAG")
    public String getOpenaccflag() {
        return openaccflag;
    }

    public void setOpenaccflag(String openaccflag) {
        this.openaccflag = openaccflag;
    }

    @Basic
    @Column(name = "CTRLFLAG")
    public String getCtrlflag() {
        return ctrlflag;
    }

    public void setCtrlflag(String ctrlflag) {
        this.ctrlflag = ctrlflag;
    }

    @Basic
    @Column(name = "GETRATEFLAG")
    public String getGetrateflag() {
        return getrateflag;
    }

    public void setGetrateflag(String getrateflag) {
        this.getrateflag = getrateflag;
    }

    @Basic
    @Column(name = "COUNTFLAG")
    public String getCountflag() {
        return countflag;
    }

    public void setCountflag(String countflag) {
        this.countflag = countflag;
    }

    @Basic
    @Column(name = "COMPUTEFLAG")
    public String getComputeflag() {
        return computeflag;
    }

    public void setComputeflag(String computeflag) {
        this.computeflag = computeflag;
    }

    @Basic
    @Column(name = "EFTDATE")
    public Time getEftdate() {
        return eftdate;
    }

    public void setEftdate(Time eftdate) {
        this.eftdate = eftdate;
    }

    @Basic
    @Column(name = "CCY")
    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasSubdictEntity that = (BasSubdictEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (subone != null ? !subone.equals(that.subone) : that.subone != null) return false;
        if (subtwo != null ? !subtwo.equals(that.subtwo) : that.subtwo != null) return false;
        if (subname != null ? !subname.equals(that.subname) : that.subname != null) return false;
        if (subtype != null ? !subtype.equals(that.subtype) : that.subtype != null) return false;
        if (subkind != null ? !subkind.equals(that.subkind) : that.subkind != null) return false;
        if (balctrldir != null ? !balctrldir.equals(that.balctrldir) : that.balctrldir != null) return false;
        if (amtctrldir != null ? !amtctrldir.equals(that.amtctrldir) : that.amtctrldir != null) return false;
        if (intflag != null ? !intflag.equals(that.intflag) : that.intflag != null) return false;
        if (bal0Flag != null ? !bal0Flag.equals(that.bal0Flag) : that.bal0Flag != null) return false;
        if (redflag != null ? !redflag.equals(that.redflag) : that.redflag != null) return false;
        if (openaccflag != null ? !openaccflag.equals(that.openaccflag) : that.openaccflag != null) return false;
        if (ctrlflag != null ? !ctrlflag.equals(that.ctrlflag) : that.ctrlflag != null) return false;
        if (getrateflag != null ? !getrateflag.equals(that.getrateflag) : that.getrateflag != null) return false;
        if (countflag != null ? !countflag.equals(that.countflag) : that.countflag != null) return false;
        if (computeflag != null ? !computeflag.equals(that.computeflag) : that.computeflag != null) return false;
        if (eftdate != null ? !eftdate.equals(that.eftdate) : that.eftdate != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (subone != null ? subone.hashCode() : 0);
        result = 31 * result + (subtwo != null ? subtwo.hashCode() : 0);
        result = 31 * result + (subname != null ? subname.hashCode() : 0);
        result = 31 * result + (subtype != null ? subtype.hashCode() : 0);
        result = 31 * result + (subkind != null ? subkind.hashCode() : 0);
        result = 31 * result + (balctrldir != null ? balctrldir.hashCode() : 0);
        result = 31 * result + (amtctrldir != null ? amtctrldir.hashCode() : 0);
        result = 31 * result + (intflag != null ? intflag.hashCode() : 0);
        result = 31 * result + (bal0Flag != null ? bal0Flag.hashCode() : 0);
        result = 31 * result + (redflag != null ? redflag.hashCode() : 0);
        result = 31 * result + (openaccflag != null ? openaccflag.hashCode() : 0);
        result = 31 * result + (ctrlflag != null ? ctrlflag.hashCode() : 0);
        result = 31 * result + (getrateflag != null ? getrateflag.hashCode() : 0);
        result = 31 * result + (countflag != null ? countflag.hashCode() : 0);
        result = 31 * result + (computeflag != null ? computeflag.hashCode() : 0);
        result = 31 * result + (eftdate != null ? eftdate.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        return result;
    }
}
