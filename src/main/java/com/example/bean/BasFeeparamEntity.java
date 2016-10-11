package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_FEEPARAM", schema = "TYPE23", catalog = "")
public class BasFeeparamEntity {
    private long id;
    private String brcno;
    private String prodno;
    private String subone;
    private String subtwo;
    private String custno;
    private String custtype;
    private String custsrvlvl;
    private String sersource;
    private String subtype1;
    private String subtype2;
    private String subtype3;
    private String subtype4;
    private String subtype5;
    private String feetype;
    private String acctno;
    private String acctname;
    private String ccy;
    private String amount;
    private String relacctno;

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
    @Column(name = "PRODNO")
    public String getProdno() {
        return prodno;
    }

    public void setProdno(String prodno) {
        this.prodno = prodno;
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
    @Column(name = "CUSTNO")
    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno;
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
    @Column(name = "CUSTSRVLVL")
    public String getCustsrvlvl() {
        return custsrvlvl;
    }

    public void setCustsrvlvl(String custsrvlvl) {
        this.custsrvlvl = custsrvlvl;
    }

    @Basic
    @Column(name = "SERSOURCE")
    public String getSersource() {
        return sersource;
    }

    public void setSersource(String sersource) {
        this.sersource = sersource;
    }

    @Basic
    @Column(name = "SUBTYPE1")
    public String getSubtype1() {
        return subtype1;
    }

    public void setSubtype1(String subtype1) {
        this.subtype1 = subtype1;
    }

    @Basic
    @Column(name = "SUBTYPE2")
    public String getSubtype2() {
        return subtype2;
    }

    public void setSubtype2(String subtype2) {
        this.subtype2 = subtype2;
    }

    @Basic
    @Column(name = "SUBTYPE3")
    public String getSubtype3() {
        return subtype3;
    }

    public void setSubtype3(String subtype3) {
        this.subtype3 = subtype3;
    }

    @Basic
    @Column(name = "SUBTYPE4")
    public String getSubtype4() {
        return subtype4;
    }

    public void setSubtype4(String subtype4) {
        this.subtype4 = subtype4;
    }

    @Basic
    @Column(name = "SUBTYPE5")
    public String getSubtype5() {
        return subtype5;
    }

    public void setSubtype5(String subtype5) {
        this.subtype5 = subtype5;
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
    @Column(name = "CCY")
    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    @Basic
    @Column(name = "AMOUNT")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "RELACCTNO")
    public String getRelacctno() {
        return relacctno;
    }

    public void setRelacctno(String relacctno) {
        this.relacctno = relacctno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasFeeparamEntity that = (BasFeeparamEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (prodno != null ? !prodno.equals(that.prodno) : that.prodno != null) return false;
        if (subone != null ? !subone.equals(that.subone) : that.subone != null) return false;
        if (subtwo != null ? !subtwo.equals(that.subtwo) : that.subtwo != null) return false;
        if (custno != null ? !custno.equals(that.custno) : that.custno != null) return false;
        if (custtype != null ? !custtype.equals(that.custtype) : that.custtype != null) return false;
        if (custsrvlvl != null ? !custsrvlvl.equals(that.custsrvlvl) : that.custsrvlvl != null) return false;
        if (sersource != null ? !sersource.equals(that.sersource) : that.sersource != null) return false;
        if (subtype1 != null ? !subtype1.equals(that.subtype1) : that.subtype1 != null) return false;
        if (subtype2 != null ? !subtype2.equals(that.subtype2) : that.subtype2 != null) return false;
        if (subtype3 != null ? !subtype3.equals(that.subtype3) : that.subtype3 != null) return false;
        if (subtype4 != null ? !subtype4.equals(that.subtype4) : that.subtype4 != null) return false;
        if (subtype5 != null ? !subtype5.equals(that.subtype5) : that.subtype5 != null) return false;
        if (feetype != null ? !feetype.equals(that.feetype) : that.feetype != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (acctname != null ? !acctname.equals(that.acctname) : that.acctname != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (relacctno != null ? !relacctno.equals(that.relacctno) : that.relacctno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (prodno != null ? prodno.hashCode() : 0);
        result = 31 * result + (subone != null ? subone.hashCode() : 0);
        result = 31 * result + (subtwo != null ? subtwo.hashCode() : 0);
        result = 31 * result + (custno != null ? custno.hashCode() : 0);
        result = 31 * result + (custtype != null ? custtype.hashCode() : 0);
        result = 31 * result + (custsrvlvl != null ? custsrvlvl.hashCode() : 0);
        result = 31 * result + (sersource != null ? sersource.hashCode() : 0);
        result = 31 * result + (subtype1 != null ? subtype1.hashCode() : 0);
        result = 31 * result + (subtype2 != null ? subtype2.hashCode() : 0);
        result = 31 * result + (subtype3 != null ? subtype3.hashCode() : 0);
        result = 31 * result + (subtype4 != null ? subtype4.hashCode() : 0);
        result = 31 * result + (subtype5 != null ? subtype5.hashCode() : 0);
        result = 31 * result + (feetype != null ? feetype.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (acctname != null ? acctname.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (relacctno != null ? relacctno.hashCode() : 0);
        return result;
    }
}
