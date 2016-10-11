package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "LAS_INTOUTPUT", schema = "TYPE23", catalog = "")
public class LasIntoutputEntity {
    private long id;
    private String brcno;
    private String prdno;
    private String subone;
    private String subtwo;
    private String acctno;
    private Time trandate;
    private String flag23;
    private String ccy;
    private String custno;
    private String custname;
    private Long bal;
    private Long intamt;
    private Long accum;
    private Long accum2;
    private Long rate;
    private Long rate2;
    private Time beginintdate;
    private Time endintdate;
    private String intflag;
    private String custtype;
    private String intacctflag;

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
    @Column(name = "ACCTNO")
    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
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
    @Column(name = "FLAG23")
    public String getFlag23() {
        return flag23;
    }

    public void setFlag23(String flag23) {
        this.flag23 = flag23;
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
    @Column(name = "CUSTNO")
    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno;
    }

    @Basic
    @Column(name = "CUSTNAME")
    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Basic
    @Column(name = "BAL")
    public Long getBal() {
        return bal;
    }

    public void setBal(Long bal) {
        this.bal = bal;
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
    @Column(name = "ACCUM")
    public Long getAccum() {
        return accum;
    }

    public void setAccum(Long accum) {
        this.accum = accum;
    }

    @Basic
    @Column(name = "ACCUM2")
    public Long getAccum2() {
        return accum2;
    }

    public void setAccum2(Long accum2) {
        this.accum2 = accum2;
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
    @Column(name = "RATE2")
    public Long getRate2() {
        return rate2;
    }

    public void setRate2(Long rate2) {
        this.rate2 = rate2;
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
    @Column(name = "ENDINTDATE")
    public Time getEndintdate() {
        return endintdate;
    }

    public void setEndintdate(Time endintdate) {
        this.endintdate = endintdate;
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
    @Column(name = "CUSTTYPE")
    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype;
    }

    @Basic
    @Column(name = "INTACCTFLAG")
    public String getIntacctflag() {
        return intacctflag;
    }

    public void setIntacctflag(String intacctflag) {
        this.intacctflag = intacctflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LasIntoutputEntity that = (LasIntoutputEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (prdno != null ? !prdno.equals(that.prdno) : that.prdno != null) return false;
        if (subone != null ? !subone.equals(that.subone) : that.subone != null) return false;
        if (subtwo != null ? !subtwo.equals(that.subtwo) : that.subtwo != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (trandate != null ? !trandate.equals(that.trandate) : that.trandate != null) return false;
        if (flag23 != null ? !flag23.equals(that.flag23) : that.flag23 != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (custno != null ? !custno.equals(that.custno) : that.custno != null) return false;
        if (custname != null ? !custname.equals(that.custname) : that.custname != null) return false;
        if (bal != null ? !bal.equals(that.bal) : that.bal != null) return false;
        if (intamt != null ? !intamt.equals(that.intamt) : that.intamt != null) return false;
        if (accum != null ? !accum.equals(that.accum) : that.accum != null) return false;
        if (accum2 != null ? !accum2.equals(that.accum2) : that.accum2 != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;
        if (rate2 != null ? !rate2.equals(that.rate2) : that.rate2 != null) return false;
        if (beginintdate != null ? !beginintdate.equals(that.beginintdate) : that.beginintdate != null) return false;
        if (endintdate != null ? !endintdate.equals(that.endintdate) : that.endintdate != null) return false;
        if (intflag != null ? !intflag.equals(that.intflag) : that.intflag != null) return false;
        if (custtype != null ? !custtype.equals(that.custtype) : that.custtype != null) return false;
        if (intacctflag != null ? !intacctflag.equals(that.intacctflag) : that.intacctflag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (prdno != null ? prdno.hashCode() : 0);
        result = 31 * result + (subone != null ? subone.hashCode() : 0);
        result = 31 * result + (subtwo != null ? subtwo.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (flag23 != null ? flag23.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (custno != null ? custno.hashCode() : 0);
        result = 31 * result + (custname != null ? custname.hashCode() : 0);
        result = 31 * result + (bal != null ? bal.hashCode() : 0);
        result = 31 * result + (intamt != null ? intamt.hashCode() : 0);
        result = 31 * result + (accum != null ? accum.hashCode() : 0);
        result = 31 * result + (accum2 != null ? accum2.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (rate2 != null ? rate2.hashCode() : 0);
        result = 31 * result + (beginintdate != null ? beginintdate.hashCode() : 0);
        result = 31 * result + (endintdate != null ? endintdate.hashCode() : 0);
        result = 31 * result + (intflag != null ? intflag.hashCode() : 0);
        result = 31 * result + (custtype != null ? custtype.hashCode() : 0);
        result = 31 * result + (intacctflag != null ? intacctflag.hashCode() : 0);
        return result;
    }
}
