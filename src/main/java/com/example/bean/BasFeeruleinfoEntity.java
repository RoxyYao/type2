package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_FEERULEINFO", schema = "TYPE23", catalog = "")
public class BasFeeruleinfoEntity {
    private long id;
    private String brcno;
    private String prodno;
    private String custno;
    private String custtype;
    private Long custsrvlvl;
    private String sersource;
    private String subtype1;
    private String subtype2;
    private String subtype3;
    private String subtype4;
    private String subtype5;
    private String feeno;
    private String feeflag;
    private Long benefitrate;
    private String feeway;

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
    public Long getCustsrvlvl() {
        return custsrvlvl;
    }

    public void setCustsrvlvl(Long custsrvlvl) {
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
    @Column(name = "FEENO")
    public String getFeeno() {
        return feeno;
    }

    public void setFeeno(String feeno) {
        this.feeno = feeno;
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
    @Column(name = "BENEFITRATE")
    public Long getBenefitrate() {
        return benefitrate;
    }

    public void setBenefitrate(Long benefitrate) {
        this.benefitrate = benefitrate;
    }

    @Basic
    @Column(name = "FEEWAY")
    public String getFeeway() {
        return feeway;
    }

    public void setFeeway(String feeway) {
        this.feeway = feeway;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasFeeruleinfoEntity that = (BasFeeruleinfoEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (prodno != null ? !prodno.equals(that.prodno) : that.prodno != null) return false;
        if (custno != null ? !custno.equals(that.custno) : that.custno != null) return false;
        if (custtype != null ? !custtype.equals(that.custtype) : that.custtype != null) return false;
        if (custsrvlvl != null ? !custsrvlvl.equals(that.custsrvlvl) : that.custsrvlvl != null) return false;
        if (sersource != null ? !sersource.equals(that.sersource) : that.sersource != null) return false;
        if (subtype1 != null ? !subtype1.equals(that.subtype1) : that.subtype1 != null) return false;
        if (subtype2 != null ? !subtype2.equals(that.subtype2) : that.subtype2 != null) return false;
        if (subtype3 != null ? !subtype3.equals(that.subtype3) : that.subtype3 != null) return false;
        if (subtype4 != null ? !subtype4.equals(that.subtype4) : that.subtype4 != null) return false;
        if (subtype5 != null ? !subtype5.equals(that.subtype5) : that.subtype5 != null) return false;
        if (feeno != null ? !feeno.equals(that.feeno) : that.feeno != null) return false;
        if (feeflag != null ? !feeflag.equals(that.feeflag) : that.feeflag != null) return false;
        if (benefitrate != null ? !benefitrate.equals(that.benefitrate) : that.benefitrate != null) return false;
        if (feeway != null ? !feeway.equals(that.feeway) : that.feeway != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (prodno != null ? prodno.hashCode() : 0);
        result = 31 * result + (custno != null ? custno.hashCode() : 0);
        result = 31 * result + (custtype != null ? custtype.hashCode() : 0);
        result = 31 * result + (custsrvlvl != null ? custsrvlvl.hashCode() : 0);
        result = 31 * result + (sersource != null ? sersource.hashCode() : 0);
        result = 31 * result + (subtype1 != null ? subtype1.hashCode() : 0);
        result = 31 * result + (subtype2 != null ? subtype2.hashCode() : 0);
        result = 31 * result + (subtype3 != null ? subtype3.hashCode() : 0);
        result = 31 * result + (subtype4 != null ? subtype4.hashCode() : 0);
        result = 31 * result + (subtype5 != null ? subtype5.hashCode() : 0);
        result = 31 * result + (feeno != null ? feeno.hashCode() : 0);
        result = 31 * result + (feeflag != null ? feeflag.hashCode() : 0);
        result = 31 * result + (benefitrate != null ? benefitrate.hashCode() : 0);
        result = 31 * result + (feeway != null ? feeway.hashCode() : 0);
        return result;
    }
}
