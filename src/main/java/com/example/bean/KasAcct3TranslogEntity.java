package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "KAS_ACCT3TRANSLOG", schema = "TYPE23", catalog = "")
public class KasAcct3TranslogEntity {
    private long id;
    private String brcno;
    private String seqno;
    private String seriesno;
    private String acctno;
    private String acctname;
    private String oppaccno;
    private String oppaccname;
    private Time trandate;
    private String logflag;
    private String prdno;
    private String subone;
    private String subtwo;
    private Long rate;
    private Time beginintdate;
    private Time curintdate;
    private Time curtime;
    private String ccy;
    private String cdflag;
    private Long beginbal;
    private Long amt;
    private Long curbal;
    private Long beginintcount;
    private Long curintcount;
    private String balbalanceflag;
    private String custtype;
    private String baseccy;
    private Long baseamt;
    private Long exchrate;
    private String doflag;
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
    @Column(name = "PRDNO")
    public String getPrdno() {
        return prdno;
    }

    public void setPrdno(String prdno) {
        this.prdno = prdno;
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
    @Column(name = "RATE")
    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "BEGININTDATE")
    public Time getBeginintdate() {
        return beginintdate;
    }

    public void setBeginintdate(Time beginintdate) {
        this.beginintdate = beginintdate;
    }

    @Basic
    @Column(name = "CURINTDATE")
    public Time getCurintdate() {
        return curintdate;
    }

    public void setCurintdate(Time curintdate) {
        this.curintdate = curintdate;
    }

    @Basic
    @Column(name = "CURTIME")
    public Time getCurtime() {
        return curtime;
    }

    public void setCurtime(Time curtime) {
        this.curtime = curtime;
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
    @Column(name = "CDFLAG")
    public String getCdflag() {
        return cdflag;
    }

    public void setCdflag(String cdflag) {
        this.cdflag = cdflag;
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
    @Column(name = "BEGININTCOUNT")
    public Long getBeginintcount() {
        return beginintcount;
    }

    public void setBeginintcount(Long beginintcount) {
        this.beginintcount = beginintcount;
    }

    @Basic
    @Column(name = "CURINTCOUNT")
    public Long getCurintcount() {
        return curintcount;
    }

    public void setCurintcount(Long curintcount) {
        this.curintcount = curintcount;
    }

    @Basic
    @Column(name = "BALBALANCEFLAG")
    public String getBalbalanceflag() {
        return balbalanceflag;
    }

    public void setBalbalanceflag(String balbalanceflag) {
        this.balbalanceflag = balbalanceflag;
    }

    @Basic
    @Column(name = "CUSTTYPE")
    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype;
    }

    @Basic
    @Column(name = "BASECCY")
    public String getBaseccy() {
        return baseccy;
    }

    public void setBaseccy(String baseccy) {
        this.baseccy = baseccy;
    }

    @Basic
    @Column(name = "BASEAMT")
    public Long getBaseamt() {
        return baseamt;
    }

    public void setBaseamt(Long baseamt) {
        this.baseamt = baseamt;
    }

    @Basic
    @Column(name = "EXCHRATE")
    public Long getExchrate() {
        return exchrate;
    }

    public void setExchrate(Long exchrate) {
        this.exchrate = exchrate;
    }

    @Basic
    @Column(name = "DOFLAG")
    public String getDoflag() {
        return doflag;
    }

    public void setDoflag(String doflag) {
        this.doflag = doflag;
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

        KasAcct3TranslogEntity that = (KasAcct3TranslogEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (seqno != null ? !seqno.equals(that.seqno) : that.seqno != null) return false;
        if (seriesno != null ? !seriesno.equals(that.seriesno) : that.seriesno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (acctname != null ? !acctname.equals(that.acctname) : that.acctname != null) return false;
        if (oppaccno != null ? !oppaccno.equals(that.oppaccno) : that.oppaccno != null) return false;
        if (oppaccname != null ? !oppaccname.equals(that.oppaccname) : that.oppaccname != null) return false;
        if (trandate != null ? !trandate.equals(that.trandate) : that.trandate != null) return false;
        if (logflag != null ? !logflag.equals(that.logflag) : that.logflag != null) return false;
        if (prdno != null ? !prdno.equals(that.prdno) : that.prdno != null) return false;
        if (subone != null ? !subone.equals(that.subone) : that.subone != null) return false;
        if (subtwo != null ? !subtwo.equals(that.subtwo) : that.subtwo != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;
        if (beginintdate != null ? !beginintdate.equals(that.beginintdate) : that.beginintdate != null) return false;
        if (curintdate != null ? !curintdate.equals(that.curintdate) : that.curintdate != null) return false;
        if (curtime != null ? !curtime.equals(that.curtime) : that.curtime != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (cdflag != null ? !cdflag.equals(that.cdflag) : that.cdflag != null) return false;
        if (beginbal != null ? !beginbal.equals(that.beginbal) : that.beginbal != null) return false;
        if (amt != null ? !amt.equals(that.amt) : that.amt != null) return false;
        if (curbal != null ? !curbal.equals(that.curbal) : that.curbal != null) return false;
        if (beginintcount != null ? !beginintcount.equals(that.beginintcount) : that.beginintcount != null)
            return false;
        if (curintcount != null ? !curintcount.equals(that.curintcount) : that.curintcount != null) return false;
        if (balbalanceflag != null ? !balbalanceflag.equals(that.balbalanceflag) : that.balbalanceflag != null)
            return false;
        if (custtype != null ? !custtype.equals(that.custtype) : that.custtype != null) return false;
        if (baseccy != null ? !baseccy.equals(that.baseccy) : that.baseccy != null) return false;
        if (baseamt != null ? !baseamt.equals(that.baseamt) : that.baseamt != null) return false;
        if (exchrate != null ? !exchrate.equals(that.exchrate) : that.exchrate != null) return false;
        if (doflag != null ? !doflag.equals(that.doflag) : that.doflag != null) return false;
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
        result = 31 * result + (oppaccno != null ? oppaccno.hashCode() : 0);
        result = 31 * result + (oppaccname != null ? oppaccname.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (logflag != null ? logflag.hashCode() : 0);
        result = 31 * result + (prdno != null ? prdno.hashCode() : 0);
        result = 31 * result + (subone != null ? subone.hashCode() : 0);
        result = 31 * result + (subtwo != null ? subtwo.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (beginintdate != null ? beginintdate.hashCode() : 0);
        result = 31 * result + (curintdate != null ? curintdate.hashCode() : 0);
        result = 31 * result + (curtime != null ? curtime.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (cdflag != null ? cdflag.hashCode() : 0);
        result = 31 * result + (beginbal != null ? beginbal.hashCode() : 0);
        result = 31 * result + (amt != null ? amt.hashCode() : 0);
        result = 31 * result + (curbal != null ? curbal.hashCode() : 0);
        result = 31 * result + (beginintcount != null ? beginintcount.hashCode() : 0);
        result = 31 * result + (curintcount != null ? curintcount.hashCode() : 0);
        result = 31 * result + (balbalanceflag != null ? balbalanceflag.hashCode() : 0);
        result = 31 * result + (custtype != null ? custtype.hashCode() : 0);
        result = 31 * result + (baseccy != null ? baseccy.hashCode() : 0);
        result = 31 * result + (baseamt != null ? baseamt.hashCode() : 0);
        result = 31 * result + (exchrate != null ? exchrate.hashCode() : 0);
        result = 31 * result + (doflag != null ? doflag.hashCode() : 0);
        result = 31 * result + (enlistflag != null ? enlistflag.hashCode() : 0);
        result = 31 * result + (trankind != null ? trankind.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
