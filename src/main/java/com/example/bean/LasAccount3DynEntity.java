package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "LAS_ACCOUNT3DYN", schema = "TYPE23", catalog = "")
public class LasAccount3DynEntity {
    private long id;
    private String brcno;
    private String acctno;
    private String subone;
    private String subtwo;
    private String ccy;
    private long bal;
    private String stoppayflag;
    private String frozenflag;
    private long lastbal;
    private long ctramt;
    private Long intctrlamt;
    private String intflag;
    private String taxflag;
    private String intplanno;
    private String taxplanno;
    private String floatintflag;
    private Long floatrate;
    private String opendate;
    private String beginintdate;
    private Time trandate;
    private String lastdate;
    private Long forctrlamt;
    private Long forcrtotbal;
    private Long forcrtotamt;
    private String forprono;
    private String openbrc;
    private String profitbrc;
    private String acctinfo;

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
    @Column(name = "ACCTNO")
    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
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
    @Column(name = "CCY")
    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    @Basic
    @Column(name = "BAL")
    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }

    @Basic
    @Column(name = "STOPPAYFLAG")
    public String getStoppayflag() {
        return stoppayflag;
    }

    public void setStoppayflag(String stoppayflag) {
        this.stoppayflag = stoppayflag;
    }

    @Basic
    @Column(name = "FROZENFLAG")
    public String getFrozenflag() {
        return frozenflag;
    }

    public void setFrozenflag(String frozenflag) {
        this.frozenflag = frozenflag;
    }

    @Basic
    @Column(name = "LASTBAL")
    public long getLastbal() {
        return lastbal;
    }

    public void setLastbal(long lastbal) {
        this.lastbal = lastbal;
    }

    @Basic
    @Column(name = "CTRAMT")
    public long getCtramt() {
        return ctramt;
    }

    public void setCtramt(long ctramt) {
        this.ctramt = ctramt;
    }

    @Basic
    @Column(name = "INTCTRLAMT")
    public Long getIntctrlamt() {
        return intctrlamt;
    }

    public void setIntctrlamt(Long intctrlamt) {
        this.intctrlamt = intctrlamt;
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
    @Column(name = "TAXFLAG")
    public String getTaxflag() {
        return taxflag;
    }

    public void setTaxflag(String taxflag) {
        this.taxflag = taxflag;
    }

    @Basic
    @Column(name = "INTPLANNO")
    public String getIntplanno() {
        return intplanno;
    }

    public void setIntplanno(String intplanno) {
        this.intplanno = intplanno;
    }

    @Basic
    @Column(name = "TAXPLANNO")
    public String getTaxplanno() {
        return taxplanno;
    }

    public void setTaxplanno(String taxplanno) {
        this.taxplanno = taxplanno;
    }

    @Basic
    @Column(name = "FLOATINTFLAG")
    public String getFloatintflag() {
        return floatintflag;
    }

    public void setFloatintflag(String floatintflag) {
        this.floatintflag = floatintflag;
    }

    @Basic
    @Column(name = "FLOATRATE")
    public Long getFloatrate() {
        return floatrate;
    }

    public void setFloatrate(Long floatrate) {
        this.floatrate = floatrate;
    }

    @Basic
    @Column(name = "OPENDATE")
    public String getOpendate() {
        return opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate;
    }

    @Basic
    @Column(name = "BEGININTDATE")
    public String getBeginintdate() {
        return beginintdate;
    }

    public void setBeginintdate(String beginintdate) {
        this.beginintdate = beginintdate;
    }

    @Basic
    @Column(name = "TRANDATE")
    public Time getTrandate() {
        return trandate;
    }

    public void setTrandate(Time trandate) {
        this.trandate = trandate;
    }

    @Basic
    @Column(name = "LASTDATE")
    public String getLastdate() {
        return lastdate;
    }

    public void setLastdate(String lastdate) {
        this.lastdate = lastdate;
    }

    @Basic
    @Column(name = "FORCTRLAMT")
    public Long getForctrlamt() {
        return forctrlamt;
    }

    public void setForctrlamt(Long forctrlamt) {
        this.forctrlamt = forctrlamt;
    }

    @Basic
    @Column(name = "FORCRTOTBAL")
    public Long getForcrtotbal() {
        return forcrtotbal;
    }

    public void setForcrtotbal(Long forcrtotbal) {
        this.forcrtotbal = forcrtotbal;
    }

    @Basic
    @Column(name = "FORCRTOTAMT")
    public Long getForcrtotamt() {
        return forcrtotamt;
    }

    public void setForcrtotamt(Long forcrtotamt) {
        this.forcrtotamt = forcrtotamt;
    }

    @Basic
    @Column(name = "FORPRONO")
    public String getForprono() {
        return forprono;
    }

    public void setForprono(String forprono) {
        this.forprono = forprono;
    }

    @Basic
    @Column(name = "OPENBRC")
    public String getOpenbrc() {
        return openbrc;
    }

    public void setOpenbrc(String openbrc) {
        this.openbrc = openbrc;
    }

    @Basic
    @Column(name = "PROFITBRC")
    public String getProfitbrc() {
        return profitbrc;
    }

    public void setProfitbrc(String profitbrc) {
        this.profitbrc = profitbrc;
    }

    @Basic
    @Column(name = "ACCTINFO")
    public String getAcctinfo() {
        return acctinfo;
    }

    public void setAcctinfo(String acctinfo) {
        this.acctinfo = acctinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LasAccount3DynEntity that = (LasAccount3DynEntity) o;

        if (id != that.id) return false;
        if (bal != that.bal) return false;
        if (lastbal != that.lastbal) return false;
        if (ctramt != that.ctramt) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (subone != null ? !subone.equals(that.subone) : that.subone != null) return false;
        if (subtwo != null ? !subtwo.equals(that.subtwo) : that.subtwo != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (stoppayflag != null ? !stoppayflag.equals(that.stoppayflag) : that.stoppayflag != null) return false;
        if (frozenflag != null ? !frozenflag.equals(that.frozenflag) : that.frozenflag != null) return false;
        if (intctrlamt != null ? !intctrlamt.equals(that.intctrlamt) : that.intctrlamt != null) return false;
        if (intflag != null ? !intflag.equals(that.intflag) : that.intflag != null) return false;
        if (taxflag != null ? !taxflag.equals(that.taxflag) : that.taxflag != null) return false;
        if (intplanno != null ? !intplanno.equals(that.intplanno) : that.intplanno != null) return false;
        if (taxplanno != null ? !taxplanno.equals(that.taxplanno) : that.taxplanno != null) return false;
        if (floatintflag != null ? !floatintflag.equals(that.floatintflag) : that.floatintflag != null) return false;
        if (floatrate != null ? !floatrate.equals(that.floatrate) : that.floatrate != null) return false;
        if (opendate != null ? !opendate.equals(that.opendate) : that.opendate != null) return false;
        if (beginintdate != null ? !beginintdate.equals(that.beginintdate) : that.beginintdate != null) return false;
        if (trandate != null ? !trandate.equals(that.trandate) : that.trandate != null) return false;
        if (lastdate != null ? !lastdate.equals(that.lastdate) : that.lastdate != null) return false;
        if (forctrlamt != null ? !forctrlamt.equals(that.forctrlamt) : that.forctrlamt != null) return false;
        if (forcrtotbal != null ? !forcrtotbal.equals(that.forcrtotbal) : that.forcrtotbal != null) return false;
        if (forcrtotamt != null ? !forcrtotamt.equals(that.forcrtotamt) : that.forcrtotamt != null) return false;
        if (forprono != null ? !forprono.equals(that.forprono) : that.forprono != null) return false;
        if (openbrc != null ? !openbrc.equals(that.openbrc) : that.openbrc != null) return false;
        if (profitbrc != null ? !profitbrc.equals(that.profitbrc) : that.profitbrc != null) return false;
        if (acctinfo != null ? !acctinfo.equals(that.acctinfo) : that.acctinfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (subone != null ? subone.hashCode() : 0);
        result = 31 * result + (subtwo != null ? subtwo.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (int) (bal ^ (bal >>> 32));
        result = 31 * result + (stoppayflag != null ? stoppayflag.hashCode() : 0);
        result = 31 * result + (frozenflag != null ? frozenflag.hashCode() : 0);
        result = 31 * result + (int) (lastbal ^ (lastbal >>> 32));
        result = 31 * result + (int) (ctramt ^ (ctramt >>> 32));
        result = 31 * result + (intctrlamt != null ? intctrlamt.hashCode() : 0);
        result = 31 * result + (intflag != null ? intflag.hashCode() : 0);
        result = 31 * result + (taxflag != null ? taxflag.hashCode() : 0);
        result = 31 * result + (intplanno != null ? intplanno.hashCode() : 0);
        result = 31 * result + (taxplanno != null ? taxplanno.hashCode() : 0);
        result = 31 * result + (floatintflag != null ? floatintflag.hashCode() : 0);
        result = 31 * result + (floatrate != null ? floatrate.hashCode() : 0);
        result = 31 * result + (opendate != null ? opendate.hashCode() : 0);
        result = 31 * result + (beginintdate != null ? beginintdate.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (lastdate != null ? lastdate.hashCode() : 0);
        result = 31 * result + (forctrlamt != null ? forctrlamt.hashCode() : 0);
        result = 31 * result + (forcrtotbal != null ? forcrtotbal.hashCode() : 0);
        result = 31 * result + (forcrtotamt != null ? forcrtotamt.hashCode() : 0);
        result = 31 * result + (forprono != null ? forprono.hashCode() : 0);
        result = 31 * result + (openbrc != null ? openbrc.hashCode() : 0);
        result = 31 * result + (profitbrc != null ? profitbrc.hashCode() : 0);
        result = 31 * result + (acctinfo != null ? acctinfo.hashCode() : 0);
        return result;
    }
}
