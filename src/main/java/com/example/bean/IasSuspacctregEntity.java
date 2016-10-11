package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "IAS_SUSPACCTREG", schema = "TYPE23", catalog = "")
public class IasSuspacctregEntity {
    private long id;
    private String brcno;
    private String prdno;
    private String acctno;
    private Long amt;
    private Time trandate;
    private String acctype;
    private String ccy;
    private Long gnldbbal;
    private Long gnlcrbal;
    private Long damt;
    private Long camt;
    private Long actdbbal;
    private Long actcrbal;

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
    @Column(name = "PRDNO")
    public String getPrdno() {
        return prdno;
    }

    public void setPrdno(String prdno) {
        this.prdno = prdno;
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
    @Column(name = "AMT")
    public Long getAmt() {
        return amt;
    }

    public void setAmt(Long amt) {
        this.amt = amt;
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
    @Column(name = "ACCTYPE")
    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
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
    @Column(name = "GNLDBBAL")
    public Long getGnldbbal() {
        return gnldbbal;
    }

    public void setGnldbbal(Long gnldbbal) {
        this.gnldbbal = gnldbbal;
    }

    @Basic
    @Column(name = "GNLCRBAL")
    public Long getGnlcrbal() {
        return gnlcrbal;
    }

    public void setGnlcrbal(Long gnlcrbal) {
        this.gnlcrbal = gnlcrbal;
    }

    @Basic
    @Column(name = "DAMT")
    public Long getDamt() {
        return damt;
    }

    public void setDamt(Long damt) {
        this.damt = damt;
    }

    @Basic
    @Column(name = "CAMT")
    public Long getCamt() {
        return camt;
    }

    public void setCamt(Long camt) {
        this.camt = camt;
    }

    @Basic
    @Column(name = "ACTDBBAL")
    public Long getActdbbal() {
        return actdbbal;
    }

    public void setActdbbal(Long actdbbal) {
        this.actdbbal = actdbbal;
    }

    @Basic
    @Column(name = "ACTCRBAL")
    public Long getActcrbal() {
        return actcrbal;
    }

    public void setActcrbal(Long actcrbal) {
        this.actcrbal = actcrbal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IasSuspacctregEntity that = (IasSuspacctregEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (prdno != null ? !prdno.equals(that.prdno) : that.prdno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (amt != null ? !amt.equals(that.amt) : that.amt != null) return false;
        if (trandate != null ? !trandate.equals(that.trandate) : that.trandate != null) return false;
        if (acctype != null ? !acctype.equals(that.acctype) : that.acctype != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (gnldbbal != null ? !gnldbbal.equals(that.gnldbbal) : that.gnldbbal != null) return false;
        if (gnlcrbal != null ? !gnlcrbal.equals(that.gnlcrbal) : that.gnlcrbal != null) return false;
        if (damt != null ? !damt.equals(that.damt) : that.damt != null) return false;
        if (camt != null ? !camt.equals(that.camt) : that.camt != null) return false;
        if (actdbbal != null ? !actdbbal.equals(that.actdbbal) : that.actdbbal != null) return false;
        if (actcrbal != null ? !actcrbal.equals(that.actcrbal) : that.actcrbal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (prdno != null ? prdno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (amt != null ? amt.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (acctype != null ? acctype.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (gnldbbal != null ? gnldbbal.hashCode() : 0);
        result = 31 * result + (gnlcrbal != null ? gnlcrbal.hashCode() : 0);
        result = 31 * result + (damt != null ? damt.hashCode() : 0);
        result = 31 * result + (camt != null ? camt.hashCode() : 0);
        result = 31 * result + (actdbbal != null ? actdbbal.hashCode() : 0);
        result = 31 * result + (actcrbal != null ? actcrbal.hashCode() : 0);
        return result;
    }
}
