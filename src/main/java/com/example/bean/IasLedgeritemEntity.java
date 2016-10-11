package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "IAS_LEDGERITEM", schema = "TYPE23", catalog = "")
public class IasLedgeritemEntity {
    private long id;
    private String brcno;
    private String prdno;
    private String acctno;
    private Long acctcounts;
    private Time trandate;
    private String recordtype;
    private Time validdate;
    private Long amt;
    private String cdflag;
    private Long currbal;
    private String trantype;
    private String oppaccno;
    private String oppaccname;
    private String seqno;

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
    @Column(name = "ACCTCOUNTS")
    public Long getAcctcounts() {
        return acctcounts;
    }

    public void setAcctcounts(Long acctcounts) {
        this.acctcounts = acctcounts;
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
    @Column(name = "RECORDTYPE")
    public String getRecordtype() {
        return recordtype;
    }

    public void setRecordtype(String recordtype) {
        this.recordtype = recordtype;
    }

    @Basic
    @Column(name = "VALIDDATE")
    public Time getValiddate() {
        return validdate;
    }

    public void setValiddate(Time validdate) {
        this.validdate = validdate;
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
    @Column(name = "CDFLAG")
    public String getCdflag() {
        return cdflag;
    }

    public void setCdflag(String cdflag) {
        this.cdflag = cdflag;
    }

    @Basic
    @Column(name = "CURRBAL")
    public Long getCurrbal() {
        return currbal;
    }

    public void setCurrbal(Long currbal) {
        this.currbal = currbal;
    }

    @Basic
    @Column(name = "TRANTYPE")
    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype;
    }

    @Basic
    @Column(name = "OPPACCNO")
    public String getOppaccno() {
        return oppaccno;
    }

    public void setOppaccno(String oppaccno) {
        this.oppaccno = oppaccno;
    }

    @Basic
    @Column(name = "OPPACCNAME")
    public String getOppaccname() {
        return oppaccname;
    }

    public void setOppaccname(String oppaccname) {
        this.oppaccname = oppaccname;
    }

    @Basic
    @Column(name = "SEQNO")
    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IasLedgeritemEntity that = (IasLedgeritemEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (prdno != null ? !prdno.equals(that.prdno) : that.prdno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (acctcounts != null ? !acctcounts.equals(that.acctcounts) : that.acctcounts != null) return false;
        if (trandate != null ? !trandate.equals(that.trandate) : that.trandate != null) return false;
        if (recordtype != null ? !recordtype.equals(that.recordtype) : that.recordtype != null) return false;
        if (validdate != null ? !validdate.equals(that.validdate) : that.validdate != null) return false;
        if (amt != null ? !amt.equals(that.amt) : that.amt != null) return false;
        if (cdflag != null ? !cdflag.equals(that.cdflag) : that.cdflag != null) return false;
        if (currbal != null ? !currbal.equals(that.currbal) : that.currbal != null) return false;
        if (trantype != null ? !trantype.equals(that.trantype) : that.trantype != null) return false;
        if (oppaccno != null ? !oppaccno.equals(that.oppaccno) : that.oppaccno != null) return false;
        if (oppaccname != null ? !oppaccname.equals(that.oppaccname) : that.oppaccname != null) return false;
        if (seqno != null ? !seqno.equals(that.seqno) : that.seqno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (prdno != null ? prdno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (acctcounts != null ? acctcounts.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (recordtype != null ? recordtype.hashCode() : 0);
        result = 31 * result + (validdate != null ? validdate.hashCode() : 0);
        result = 31 * result + (amt != null ? amt.hashCode() : 0);
        result = 31 * result + (cdflag != null ? cdflag.hashCode() : 0);
        result = 31 * result + (currbal != null ? currbal.hashCode() : 0);
        result = 31 * result + (trantype != null ? trantype.hashCode() : 0);
        result = 31 * result + (oppaccno != null ? oppaccno.hashCode() : 0);
        result = 31 * result + (oppaccname != null ? oppaccname.hashCode() : 0);
        result = 31 * result + (seqno != null ? seqno.hashCode() : 0);
        return result;
    }
}
