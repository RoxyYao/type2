package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "GLS_DAYBALHIS", schema = "TYPE23", catalog = "")
public class GlsDaybalhisEntity {
    private long id;
    private String brcno;
    private String ccy;
    private String subone;
    private String subtwo;
    private Time trandate;
    private String baldir;
    private Long begindebit;
    private Long begincredit;
    private Long debit;
    private Long credit;
    private Long enddebit;
    private Long endcredit;
    private Long dcount;
    private Long ccount;
    private Long opensum;
    private Long closesum;
    private Long acctsum;
    private String subtype;
    private String acckind;
    private String balanceflag;

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
    @Column(name = "CCY")
    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
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
    @Column(name = "TRANDATE")
    public Time getTrandate() {
        return trandate;
    }

    public void setTrandate(Time trandate) {
        this.trandate = trandate;
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
    @Column(name = "BEGINDEBIT")
    public Long getBegindebit() {
        return begindebit;
    }

    public void setBegindebit(Long begindebit) {
        this.begindebit = begindebit;
    }

    @Basic
    @Column(name = "BEGINCREDIT")
    public Long getBegincredit() {
        return begincredit;
    }

    public void setBegincredit(Long begincredit) {
        this.begincredit = begincredit;
    }

    @Basic
    @Column(name = "DEBIT")
    public Long getDebit() {
        return debit;
    }

    public void setDebit(Long debit) {
        this.debit = debit;
    }

    @Basic
    @Column(name = "CREDIT")
    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "ENDDEBIT")
    public Long getEnddebit() {
        return enddebit;
    }

    public void setEnddebit(Long enddebit) {
        this.enddebit = enddebit;
    }

    @Basic
    @Column(name = "ENDCREDIT")
    public Long getEndcredit() {
        return endcredit;
    }

    public void setEndcredit(Long endcredit) {
        this.endcredit = endcredit;
    }

    @Basic
    @Column(name = "DCOUNT")
    public Long getDcount() {
        return dcount;
    }

    public void setDcount(Long dcount) {
        this.dcount = dcount;
    }

    @Basic
    @Column(name = "CCOUNT")
    public Long getCcount() {
        return ccount;
    }

    public void setCcount(Long ccount) {
        this.ccount = ccount;
    }

    @Basic
    @Column(name = "OPENSUM")
    public Long getOpensum() {
        return opensum;
    }

    public void setOpensum(Long opensum) {
        this.opensum = opensum;
    }

    @Basic
    @Column(name = "CLOSESUM")
    public Long getClosesum() {
        return closesum;
    }

    public void setClosesum(Long closesum) {
        this.closesum = closesum;
    }

    @Basic
    @Column(name = "ACCTSUM")
    public Long getAcctsum() {
        return acctsum;
    }

    public void setAcctsum(Long acctsum) {
        this.acctsum = acctsum;
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
    @Column(name = "ACCKIND")
    public String getAcckind() {
        return acckind;
    }

    public void setAcckind(String acckind) {
        this.acckind = acckind;
    }

    @Basic
    @Column(name = "BALANCEFLAG")
    public String getBalanceflag() {
        return balanceflag;
    }

    public void setBalanceflag(String balanceflag) {
        this.balanceflag = balanceflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlsDaybalhisEntity that = (GlsDaybalhisEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (subone != null ? !subone.equals(that.subone) : that.subone != null) return false;
        if (subtwo != null ? !subtwo.equals(that.subtwo) : that.subtwo != null) return false;
        if (trandate != null ? !trandate.equals(that.trandate) : that.trandate != null) return false;
        if (baldir != null ? !baldir.equals(that.baldir) : that.baldir != null) return false;
        if (begindebit != null ? !begindebit.equals(that.begindebit) : that.begindebit != null) return false;
        if (begincredit != null ? !begincredit.equals(that.begincredit) : that.begincredit != null) return false;
        if (debit != null ? !debit.equals(that.debit) : that.debit != null) return false;
        if (credit != null ? !credit.equals(that.credit) : that.credit != null) return false;
        if (enddebit != null ? !enddebit.equals(that.enddebit) : that.enddebit != null) return false;
        if (endcredit != null ? !endcredit.equals(that.endcredit) : that.endcredit != null) return false;
        if (dcount != null ? !dcount.equals(that.dcount) : that.dcount != null) return false;
        if (ccount != null ? !ccount.equals(that.ccount) : that.ccount != null) return false;
        if (opensum != null ? !opensum.equals(that.opensum) : that.opensum != null) return false;
        if (closesum != null ? !closesum.equals(that.closesum) : that.closesum != null) return false;
        if (acctsum != null ? !acctsum.equals(that.acctsum) : that.acctsum != null) return false;
        if (subtype != null ? !subtype.equals(that.subtype) : that.subtype != null) return false;
        if (acckind != null ? !acckind.equals(that.acckind) : that.acckind != null) return false;
        if (balanceflag != null ? !balanceflag.equals(that.balanceflag) : that.balanceflag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (subone != null ? subone.hashCode() : 0);
        result = 31 * result + (subtwo != null ? subtwo.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (baldir != null ? baldir.hashCode() : 0);
        result = 31 * result + (begindebit != null ? begindebit.hashCode() : 0);
        result = 31 * result + (begincredit != null ? begincredit.hashCode() : 0);
        result = 31 * result + (debit != null ? debit.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        result = 31 * result + (enddebit != null ? enddebit.hashCode() : 0);
        result = 31 * result + (endcredit != null ? endcredit.hashCode() : 0);
        result = 31 * result + (dcount != null ? dcount.hashCode() : 0);
        result = 31 * result + (ccount != null ? ccount.hashCode() : 0);
        result = 31 * result + (opensum != null ? opensum.hashCode() : 0);
        result = 31 * result + (closesum != null ? closesum.hashCode() : 0);
        result = 31 * result + (acctsum != null ? acctsum.hashCode() : 0);
        result = 31 * result + (subtype != null ? subtype.hashCode() : 0);
        result = 31 * result + (acckind != null ? acckind.hashCode() : 0);
        result = 31 * result + (balanceflag != null ? balanceflag.hashCode() : 0);
        return result;
    }
}
