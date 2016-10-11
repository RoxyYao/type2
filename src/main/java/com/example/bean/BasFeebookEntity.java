package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_FEEBOOK", schema = "TYPE23", catalog = "")
public class BasFeebookEntity {
    private long id;
    private String brcno;
    private String trandate;
    private String seqno;
    private Long ctxnseq;
    private String feeno;
    private String ccy;
    private Long fee;
    private String acctno;
    private String inacctno;
    private String paybrc;
    private String feebrc;
    private String feesrc;
    private String feeflag;
    private String flag;
    private String altflg;
    private String feetype;
    private String altcode;
    private String feedate;
    private String relaactno;

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
    @Column(name = "TRANDATE")
    public String getTrandate() {
        return trandate;
    }

    public void setTrandate(String trandate) {
        this.trandate = trandate;
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
    @Column(name = "CTXNSEQ")
    public Long getCtxnseq() {
        return ctxnseq;
    }

    public void setCtxnseq(Long ctxnseq) {
        this.ctxnseq = ctxnseq;
    }

    @Basic
    @Column(name = "FEENO")
    public String getFeeno() {
        return feeno;
    }

    public void setFeeno(String feeno) {
        this.feeno = feeno;
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
    @Column(name = "FEE")
    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
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
    @Column(name = "INACCTNO")
    public String getInacctno() {
        return inacctno;
    }

    public void setInacctno(String inacctno) {
        this.inacctno = inacctno;
    }

    @Basic
    @Column(name = "PAYBRC")
    public String getPaybrc() {
        return paybrc;
    }

    public void setPaybrc(String paybrc) {
        this.paybrc = paybrc;
    }

    @Basic
    @Column(name = "FEEBRC")
    public String getFeebrc() {
        return feebrc;
    }

    public void setFeebrc(String feebrc) {
        this.feebrc = feebrc;
    }

    @Basic
    @Column(name = "FEESRC")
    public String getFeesrc() {
        return feesrc;
    }

    public void setFeesrc(String feesrc) {
        this.feesrc = feesrc;
    }

    @Basic
    @Column(name = "FEEFLAG")
    public String getFeeflag() {
        return feeflag;
    }

    public void setFeeflag(String feeflag) {
        this.feeflag = feeflag;
    }

    @Basic
    @Column(name = "FLAG")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "ALTFLG")
    public String getAltflg() {
        return altflg;
    }

    public void setAltflg(String altflg) {
        this.altflg = altflg;
    }

    @Basic
    @Column(name = "FEETYPE")
    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    @Basic
    @Column(name = "ALTCODE")
    public String getAltcode() {
        return altcode;
    }

    public void setAltcode(String altcode) {
        this.altcode = altcode;
    }

    @Basic
    @Column(name = "FEEDATE")
    public String getFeedate() {
        return feedate;
    }

    public void setFeedate(String feedate) {
        this.feedate = feedate;
    }

    @Basic
    @Column(name = "RELAACTNO")
    public String getRelaactno() {
        return relaactno;
    }

    public void setRelaactno(String relaactno) {
        this.relaactno = relaactno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasFeebookEntity that = (BasFeebookEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (trandate != null ? !trandate.equals(that.trandate) : that.trandate != null) return false;
        if (seqno != null ? !seqno.equals(that.seqno) : that.seqno != null) return false;
        if (ctxnseq != null ? !ctxnseq.equals(that.ctxnseq) : that.ctxnseq != null) return false;
        if (feeno != null ? !feeno.equals(that.feeno) : that.feeno != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (fee != null ? !fee.equals(that.fee) : that.fee != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (inacctno != null ? !inacctno.equals(that.inacctno) : that.inacctno != null) return false;
        if (paybrc != null ? !paybrc.equals(that.paybrc) : that.paybrc != null) return false;
        if (feebrc != null ? !feebrc.equals(that.feebrc) : that.feebrc != null) return false;
        if (feesrc != null ? !feesrc.equals(that.feesrc) : that.feesrc != null) return false;
        if (feeflag != null ? !feeflag.equals(that.feeflag) : that.feeflag != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (altflg != null ? !altflg.equals(that.altflg) : that.altflg != null) return false;
        if (feetype != null ? !feetype.equals(that.feetype) : that.feetype != null) return false;
        if (altcode != null ? !altcode.equals(that.altcode) : that.altcode != null) return false;
        if (feedate != null ? !feedate.equals(that.feedate) : that.feedate != null) return false;
        if (relaactno != null ? !relaactno.equals(that.relaactno) : that.relaactno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (seqno != null ? seqno.hashCode() : 0);
        result = 31 * result + (ctxnseq != null ? ctxnseq.hashCode() : 0);
        result = 31 * result + (feeno != null ? feeno.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (fee != null ? fee.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (inacctno != null ? inacctno.hashCode() : 0);
        result = 31 * result + (paybrc != null ? paybrc.hashCode() : 0);
        result = 31 * result + (feebrc != null ? feebrc.hashCode() : 0);
        result = 31 * result + (feesrc != null ? feesrc.hashCode() : 0);
        result = 31 * result + (feeflag != null ? feeflag.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (altflg != null ? altflg.hashCode() : 0);
        result = 31 * result + (feetype != null ? feetype.hashCode() : 0);
        result = 31 * result + (altcode != null ? altcode.hashCode() : 0);
        result = 31 * result + (feedate != null ? feedate.hashCode() : 0);
        result = 31 * result + (relaactno != null ? relaactno.hashCode() : 0);
        return result;
    }
}
