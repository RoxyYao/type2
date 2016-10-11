package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "KAS_IAHISTRANSLOG", schema = "TYPE23", catalog = "")
public class KasIahistranslogEntity {
    private long id;
    private String brcno;
    private String seqno;
    private String seriesno;
    private String acctno;
    private String acctname;
    private String baldir;
    private String acckind;
    private String accttype;
    private Time trandate;
    private String logflag;
    private String subone;
    private String subtwo;
    private Time curdate;
    private String ccy;
    private Long beginbal;
    private Long amt;
    private Long curbal;
    private String enlistflag;
    private String trankind;
    private String remark;

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
    @Column(name = "SEQNO")
    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    @Basic
    @Column(name = "SERIESNO")
    public String getSeriesno() {
        return seriesno;
    }

    public void setSeriesno(String seriesno) {
        this.seriesno = seriesno;
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
    @Column(name = "ACCTNAME")
    public String getAcctname() {
        return acctname;
    }

    public void setAcctname(String acctname) {
        this.acctname = acctname;
    }

    @Basic
    @Column(name = "BALDIR")
    public String getBaldir() {
        return baldir;
    }

    public void setBaldir(String baldir) {
        this.baldir = baldir;
    }

    @Basic
    @Column(name = "ACCKIND")
    public String getAcckind() {
        return acckind;
    }

    public void setAcckind(String acckind) {
        this.acckind = acckind;
    }

    @Basic
    @Column(name = "ACCTTYPE")
    public String getAccttype() {
        return accttype;
    }

    public void setAccttype(String accttype) {
        this.accttype = accttype;
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
    @Column(name = "LOGFLAG")
    public String getLogflag() {
        return logflag;
    }

    public void setLogflag(String logflag) {
        this.logflag = logflag;
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
    @Column(name = "CURDATE")
    public Time getCurdate() {
        return curdate;
    }

    public void setCurdate(Time curdate) {
        this.curdate = curdate;
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
    @Column(name = "BEGINBAL")
    public Long getBeginbal() {
        return beginbal;
    }

    public void setBeginbal(Long beginbal) {
        this.beginbal = beginbal;
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
    @Column(name = "CURBAL")
    public Long getCurbal() {
        return curbal;
    }

    public void setCurbal(Long curbal) {
        this.curbal = curbal;
    }

    @Basic
    @Column(name = "ENLISTFLAG")
    public String getEnlistflag() {
        return enlistflag;
    }

    public void setEnlistflag(String enlistflag) {
        this.enlistflag = enlistflag;
    }

    @Basic
    @Column(name = "TRANKIND")
    public String getTrankind() {
        return trankind;
    }

    public void setTrankind(String trankind) {
        this.trankind = trankind;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KasIahistranslogEntity that = (KasIahistranslogEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (seqno != null ? !seqno.equals(that.seqno) : that.seqno != null) return false;
        if (seriesno != null ? !seriesno.equals(that.seriesno) : that.seriesno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (acctname != null ? !acctname.equals(that.acctname) : that.acctname != null) return false;
        if (baldir != null ? !baldir.equals(that.baldir) : that.baldir != null) return false;
        if (acckind != null ? !acckind.equals(that.acckind) : that.acckind != null) return false;
        if (accttype != null ? !accttype.equals(that.accttype) : that.accttype != null) return false;
        if (trandate != null ? !trandate.equals(that.trandate) : that.trandate != null) return false;
        if (logflag != null ? !logflag.equals(that.logflag) : that.logflag != null) return false;
        if (subone != null ? !subone.equals(that.subone) : that.subone != null) return false;
        if (subtwo != null ? !subtwo.equals(that.subtwo) : that.subtwo != null) return false;
        if (curdate != null ? !curdate.equals(that.curdate) : that.curdate != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (beginbal != null ? !beginbal.equals(that.beginbal) : that.beginbal != null) return false;
        if (amt != null ? !amt.equals(that.amt) : that.amt != null) return false;
        if (curbal != null ? !curbal.equals(that.curbal) : that.curbal != null) return false;
        if (enlistflag != null ? !enlistflag.equals(that.enlistflag) : that.enlistflag != null) return false;
        if (trankind != null ? !trankind.equals(that.trankind) : that.trankind != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (seqno != null ? seqno.hashCode() : 0);
        result = 31 * result + (seriesno != null ? seriesno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (acctname != null ? acctname.hashCode() : 0);
        result = 31 * result + (baldir != null ? baldir.hashCode() : 0);
        result = 31 * result + (acckind != null ? acckind.hashCode() : 0);
        result = 31 * result + (accttype != null ? accttype.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (logflag != null ? logflag.hashCode() : 0);
        result = 31 * result + (subone != null ? subone.hashCode() : 0);
        result = 31 * result + (subtwo != null ? subtwo.hashCode() : 0);
        result = 31 * result + (curdate != null ? curdate.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (beginbal != null ? beginbal.hashCode() : 0);
        result = 31 * result + (amt != null ? amt.hashCode() : 0);
        result = 31 * result + (curbal != null ? curbal.hashCode() : 0);
        result = 31 * result + (enlistflag != null ? enlistflag.hashCode() : 0);
        result = 31 * result + (trankind != null ? trankind.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
