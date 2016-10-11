package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_PRD", schema = "TYPE23", catalog = "")
public class BasPrdEntity {
    private long id;
    private String brcno;
    private String prdno;
    private String prdname;
    private String subone;
    private String subtwo;
    private String custtype;
    private String acctype;
    private String tranctrl1;
    private String tranctrl2;
    private String setflag;
    private String planno;
    private String prdtype;

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
    @Column(name = "PRDNAME")
    public String getPrdname() {
        return prdname;
    }

    public void setPrdname(String prdname) {
        this.prdname = prdname;
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
    @Column(name = "CUSTTYPE")
    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype;
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
    @Column(name = "TRANCTRL1")
    public String getTranctrl1() {
        return tranctrl1;
    }

    public void setTranctrl1(String tranctrl1) {
        this.tranctrl1 = tranctrl1;
    }

    @Basic
    @Column(name = "TRANCTRL2")
    public String getTranctrl2() {
        return tranctrl2;
    }

    public void setTranctrl2(String tranctrl2) {
        this.tranctrl2 = tranctrl2;
    }

    @Basic
    @Column(name = "SETFLAG")
    public String getSetflag() {
        return setflag;
    }

    public void setSetflag(String setflag) {
        this.setflag = setflag;
    }

    @Basic
    @Column(name = "PLANNO")
    public String getPlanno() {
        return planno;
    }

    public void setPlanno(String planno) {
        this.planno = planno;
    }

    @Basic
    @Column(name = "PRDTYPE")
    public String getPrdtype() {
        return prdtype;
    }

    public void setPrdtype(String prdtype) {
        this.prdtype = prdtype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasPrdEntity that = (BasPrdEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (prdno != null ? !prdno.equals(that.prdno) : that.prdno != null) return false;
        if (prdname != null ? !prdname.equals(that.prdname) : that.prdname != null) return false;
        if (subone != null ? !subone.equals(that.subone) : that.subone != null) return false;
        if (subtwo != null ? !subtwo.equals(that.subtwo) : that.subtwo != null) return false;
        if (custtype != null ? !custtype.equals(that.custtype) : that.custtype != null) return false;
        if (acctype != null ? !acctype.equals(that.acctype) : that.acctype != null) return false;
        if (tranctrl1 != null ? !tranctrl1.equals(that.tranctrl1) : that.tranctrl1 != null) return false;
        if (tranctrl2 != null ? !tranctrl2.equals(that.tranctrl2) : that.tranctrl2 != null) return false;
        if (setflag != null ? !setflag.equals(that.setflag) : that.setflag != null) return false;
        if (planno != null ? !planno.equals(that.planno) : that.planno != null) return false;
        if (prdtype != null ? !prdtype.equals(that.prdtype) : that.prdtype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (prdno != null ? prdno.hashCode() : 0);
        result = 31 * result + (prdname != null ? prdname.hashCode() : 0);
        result = 31 * result + (subone != null ? subone.hashCode() : 0);
        result = 31 * result + (subtwo != null ? subtwo.hashCode() : 0);
        result = 31 * result + (custtype != null ? custtype.hashCode() : 0);
        result = 31 * result + (acctype != null ? acctype.hashCode() : 0);
        result = 31 * result + (tranctrl1 != null ? tranctrl1.hashCode() : 0);
        result = 31 * result + (tranctrl2 != null ? tranctrl2.hashCode() : 0);
        result = 31 * result + (setflag != null ? setflag.hashCode() : 0);
        result = 31 * result + (planno != null ? planno.hashCode() : 0);
        result = 31 * result + (prdtype != null ? prdtype.hashCode() : 0);
        return result;
    }
}
