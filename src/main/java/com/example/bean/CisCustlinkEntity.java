package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "CIS_CUSTLINK", schema = "TYPE23", catalog = "")
public class CisCustlinkEntity {
    private long id;
    private String brcno;
    private String custno1;
    private String custname1;
    private String custno2;
    private String custname2;
    private String relatype;
    private String relanature;

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
    @Column(name = "CUSTNO1")
    public String getCustno1() {
        return custno1;
    }

    public void setCustno1(String custno1) {
        this.custno1 = custno1;
    }

    @Basic
    @Column(name = "CUSTNAME1")
    public String getCustname1() {
        return custname1;
    }

    public void setCustname1(String custname1) {
        this.custname1 = custname1;
    }

    @Basic
    @Column(name = "CUSTNO2")
    public String getCustno2() {
        return custno2;
    }

    public void setCustno2(String custno2) {
        this.custno2 = custno2;
    }

    @Basic
    @Column(name = "CUSTNAME2")
    public String getCustname2() {
        return custname2;
    }

    public void setCustname2(String custname2) {
        this.custname2 = custname2;
    }

    @Basic
    @Column(name = "RELATYPE")
    public String getRelatype() {
        return relatype;
    }

    public void setRelatype(String relatype) {
        this.relatype = relatype;
    }

    @Basic
    @Column(name = "RELANATURE")
    public String getRelanature() {
        return relanature;
    }

    public void setRelanature(String relanature) {
        this.relanature = relanature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CisCustlinkEntity that = (CisCustlinkEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (custno1 != null ? !custno1.equals(that.custno1) : that.custno1 != null) return false;
        if (custname1 != null ? !custname1.equals(that.custname1) : that.custname1 != null) return false;
        if (custno2 != null ? !custno2.equals(that.custno2) : that.custno2 != null) return false;
        if (custname2 != null ? !custname2.equals(that.custname2) : that.custname2 != null) return false;
        if (relatype != null ? !relatype.equals(that.relatype) : that.relatype != null) return false;
        if (relanature != null ? !relanature.equals(that.relanature) : that.relanature != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (custno1 != null ? custno1.hashCode() : 0);
        result = 31 * result + (custname1 != null ? custname1.hashCode() : 0);
        result = 31 * result + (custno2 != null ? custno2.hashCode() : 0);
        result = 31 * result + (custname2 != null ? custname2.hashCode() : 0);
        result = 31 * result + (relatype != null ? relatype.hashCode() : 0);
        result = 31 * result + (relanature != null ? relanature.hashCode() : 0);
        return result;
    }
}
