package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "LAS_INTITEM", schema = "TYPE23", catalog = "")
public class LasIntitemEntity {
    private long id;
    private String brcno;
    private String acctno;
    private String seqno;
    private String ccy;
    private String staflag;
    private String strdate;
    private String enddate;
    private long intbal;
    private String intdate;
    private String acdrateflag;
    private String rateno;
    private long rate;
    private long intamt;
    private String frzdlag;
    private String backflag;
    private String dealflag;

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
    @Column(name = "SEQNO")
    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
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
    @Column(name = "STAFLAG")
    public String getStaflag() {
        return staflag;
    }

    public void setStaflag(String staflag) {
        this.staflag = staflag;
    }

    @Basic
    @Column(name = "STRDATE")
    public String getStrdate() {
        return strdate;
    }

    public void setStrdate(String strdate) {
        this.strdate = strdate;
    }

    @Basic
    @Column(name = "ENDDATE")
    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "INTBAL")
    public long getIntbal() {
        return intbal;
    }

    public void setIntbal(long intbal) {
        this.intbal = intbal;
    }

    @Basic
    @Column(name = "INTDATE")
    public String getIntdate() {
        return intdate;
    }

    public void setIntdate(String intdate) {
        this.intdate = intdate;
    }

    @Basic
    @Column(name = "ACDRATEFLAG")
    public String getAcdrateflag() {
        return acdrateflag;
    }

    public void setAcdrateflag(String acdrateflag) {
        this.acdrateflag = acdrateflag;
    }

    @Basic
    @Column(name = "RATENO")
    public String getRateno() {
        return rateno;
    }

    public void setRateno(String rateno) {
        this.rateno = rateno;
    }

    @Basic
    @Column(name = "RATE")
    public long getRate() {
        return rate;
    }

    public void setRate(long rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "INTAMT")
    public long getIntamt() {
        return intamt;
    }

    public void setIntamt(long intamt) {
        this.intamt = intamt;
    }

    @Basic
    @Column(name = "FRZDLAG")
    public String getFrzdlag() {
        return frzdlag;
    }

    public void setFrzdlag(String frzdlag) {
        this.frzdlag = frzdlag;
    }

    @Basic
    @Column(name = "BACKFLAG")
    public String getBackflag() {
        return backflag;
    }

    public void setBackflag(String backflag) {
        this.backflag = backflag;
    }

    @Basic
    @Column(name = "DEALFLAG")
    public String getDealflag() {
        return dealflag;
    }

    public void setDealflag(String dealflag) {
        this.dealflag = dealflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LasIntitemEntity that = (LasIntitemEntity) o;

        if (id != that.id) return false;
        if (intbal != that.intbal) return false;
        if (rate != that.rate) return false;
        if (intamt != that.intamt) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (seqno != null ? !seqno.equals(that.seqno) : that.seqno != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (staflag != null ? !staflag.equals(that.staflag) : that.staflag != null) return false;
        if (strdate != null ? !strdate.equals(that.strdate) : that.strdate != null) return false;
        if (enddate != null ? !enddate.equals(that.enddate) : that.enddate != null) return false;
        if (intdate != null ? !intdate.equals(that.intdate) : that.intdate != null) return false;
        if (acdrateflag != null ? !acdrateflag.equals(that.acdrateflag) : that.acdrateflag != null) return false;
        if (rateno != null ? !rateno.equals(that.rateno) : that.rateno != null) return false;
        if (frzdlag != null ? !frzdlag.equals(that.frzdlag) : that.frzdlag != null) return false;
        if (backflag != null ? !backflag.equals(that.backflag) : that.backflag != null) return false;
        if (dealflag != null ? !dealflag.equals(that.dealflag) : that.dealflag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (seqno != null ? seqno.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (staflag != null ? staflag.hashCode() : 0);
        result = 31 * result + (strdate != null ? strdate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + (int) (intbal ^ (intbal >>> 32));
        result = 31 * result + (intdate != null ? intdate.hashCode() : 0);
        result = 31 * result + (acdrateflag != null ? acdrateflag.hashCode() : 0);
        result = 31 * result + (rateno != null ? rateno.hashCode() : 0);
        result = 31 * result + (int) (rate ^ (rate >>> 32));
        result = 31 * result + (int) (intamt ^ (intamt >>> 32));
        result = 31 * result + (frzdlag != null ? frzdlag.hashCode() : 0);
        result = 31 * result + (backflag != null ? backflag.hashCode() : 0);
        result = 31 * result + (dealflag != null ? dealflag.hashCode() : 0);
        return result;
    }
}
