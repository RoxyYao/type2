package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "LAS_ACCOUNT2ITEM", schema = "TYPE23", catalog = "")
public class LasAccount2ItemEntity {
    private long id;
    private String brcno;
    private String acctno;
    private String seqno;
    private String tranbrc;
    private String ccy;
    private long tranamt;
    private long bal;
    private Time trandate;
    private String rcdtype;
    private String cdflag;
    private Long intamt;
    private Long intrate;
    private String oppaccno;
    private String oppaccname;
    private String channel;
    private String tranbrief;
    private Long intday;
    private Long intaccum1;
    private Long intaccum2;

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
    @Column(name = "TRANBRC")
    public String getTranbrc() {
        return tranbrc;
    }

    public void setTranbrc(String tranbrc) {
        this.tranbrc = tranbrc;
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
    @Column(name = "TRANAMT")
    public long getTranamt() {
        return tranamt;
    }

    public void setTranamt(long tranamt) {
        this.tranamt = tranamt;
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
    @Column(name = "TRANDATE")
    public Time getTrandate() {
        return trandate;
    }

    public void setTrandate(Time trandate) {
        this.trandate = trandate;
    }

    @Basic
    @Column(name = "RCDTYPE")
    public String getRcdtype() {
        return rcdtype;
    }

    public void setRcdtype(String rcdtype) {
        this.rcdtype = rcdtype;
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
    @Column(name = "INTAMT")
    public Long getIntamt() {
        return intamt;
    }

    public void setIntamt(Long intamt) {
        this.intamt = intamt;
    }

    @Basic
    @Column(name = "INTRATE")
    public Long getIntrate() {
        return intrate;
    }

    public void setIntrate(Long intrate) {
        this.intrate = intrate;
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
    @Column(name = "CHANNEL")
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Basic
    @Column(name = "TRANBRIEF")
    public String getTranbrief() {
        return tranbrief;
    }

    public void setTranbrief(String tranbrief) {
        this.tranbrief = tranbrief;
    }

    @Basic
    @Column(name = "INTDAY")
    public Long getIntday() {
        return intday;
    }

    public void setIntday(Long intday) {
        this.intday = intday;
    }

    @Basic
    @Column(name = "INTACCUM1")
    public Long getIntaccum1() {
        return intaccum1;
    }

    public void setIntaccum1(Long intaccum1) {
        this.intaccum1 = intaccum1;
    }

    @Basic
    @Column(name = "INTACCUM2")
    public Long getIntaccum2() {
        return intaccum2;
    }

    public void setIntaccum2(Long intaccum2) {
        this.intaccum2 = intaccum2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LasAccount2ItemEntity that = (LasAccount2ItemEntity) o;

        if (id != that.id) return false;
        if (tranamt != that.tranamt) return false;
        if (bal != that.bal) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (seqno != null ? !seqno.equals(that.seqno) : that.seqno != null) return false;
        if (tranbrc != null ? !tranbrc.equals(that.tranbrc) : that.tranbrc != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (trandate != null ? !trandate.equals(that.trandate) : that.trandate != null) return false;
        if (rcdtype != null ? !rcdtype.equals(that.rcdtype) : that.rcdtype != null) return false;
        if (cdflag != null ? !cdflag.equals(that.cdflag) : that.cdflag != null) return false;
        if (intamt != null ? !intamt.equals(that.intamt) : that.intamt != null) return false;
        if (intrate != null ? !intrate.equals(that.intrate) : that.intrate != null) return false;
        if (oppaccno != null ? !oppaccno.equals(that.oppaccno) : that.oppaccno != null) return false;
        if (oppaccname != null ? !oppaccname.equals(that.oppaccname) : that.oppaccname != null) return false;
        if (channel != null ? !channel.equals(that.channel) : that.channel != null) return false;
        if (tranbrief != null ? !tranbrief.equals(that.tranbrief) : that.tranbrief != null) return false;
        if (intday != null ? !intday.equals(that.intday) : that.intday != null) return false;
        if (intaccum1 != null ? !intaccum1.equals(that.intaccum1) : that.intaccum1 != null) return false;
        if (intaccum2 != null ? !intaccum2.equals(that.intaccum2) : that.intaccum2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (seqno != null ? seqno.hashCode() : 0);
        result = 31 * result + (tranbrc != null ? tranbrc.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (int) (tranamt ^ (tranamt >>> 32));
        result = 31 * result + (int) (bal ^ (bal >>> 32));
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (rcdtype != null ? rcdtype.hashCode() : 0);
        result = 31 * result + (cdflag != null ? cdflag.hashCode() : 0);
        result = 31 * result + (intamt != null ? intamt.hashCode() : 0);
        result = 31 * result + (intrate != null ? intrate.hashCode() : 0);
        result = 31 * result + (oppaccno != null ? oppaccno.hashCode() : 0);
        result = 31 * result + (oppaccname != null ? oppaccname.hashCode() : 0);
        result = 31 * result + (channel != null ? channel.hashCode() : 0);
        result = 31 * result + (tranbrief != null ? tranbrief.hashCode() : 0);
        result = 31 * result + (intday != null ? intday.hashCode() : 0);
        result = 31 * result + (intaccum1 != null ? intaccum1.hashCode() : 0);
        result = 31 * result + (intaccum2 != null ? intaccum2.hashCode() : 0);
        return result;
    }
}
