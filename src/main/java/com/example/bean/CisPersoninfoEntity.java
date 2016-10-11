package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "CIS_PERSONINFO", schema = "TYPE23", catalog = "")
public class CisPersoninfoEntity {
    private long id;
    private String brcno;
    private String custno;
    private String homeplace;
    private Time borndate;
    private String sex;
    private String folk;
    private String edulevel;
    private String marrstatus;
    private String healthstatus;
    private String custtype;
    private String housetel;
    private String offitel;
    private String tlpos;
    private String worktype;
    private String position;
    private String salary;
    private String signinvcode;

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
    @Column(name = "CUSTNO")
    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno;
    }

    @Basic
    @Column(name = "HOMEPLACE")
    public String getHomeplace() {
        return homeplace;
    }

    public void setHomeplace(String homeplace) {
        this.homeplace = homeplace;
    }

    @Basic
    @Column(name = "BORNDATE")
    public Time getBorndate() {
        return borndate;
    }

    public void setBorndate(Time borndate) {
        this.borndate = borndate;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "FOLK")
    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk;
    }

    @Basic
    @Column(name = "EDULEVEL")
    public String getEdulevel() {
        return edulevel;
    }

    public void setEdulevel(String edulevel) {
        this.edulevel = edulevel;
    }

    @Basic
    @Column(name = "MARRSTATUS")
    public String getMarrstatus() {
        return marrstatus;
    }

    public void setMarrstatus(String marrstatus) {
        this.marrstatus = marrstatus;
    }

    @Basic
    @Column(name = "HEALTHSTATUS")
    public String getHealthstatus() {
        return healthstatus;
    }

    public void setHealthstatus(String healthstatus) {
        this.healthstatus = healthstatus;
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
    @Column(name = "HOUSETEL")
    public String getHousetel() {
        return housetel;
    }

    public void setHousetel(String housetel) {
        this.housetel = housetel;
    }

    @Basic
    @Column(name = "OFFITEL")
    public String getOffitel() {
        return offitel;
    }

    public void setOffitel(String offitel) {
        this.offitel = offitel;
    }

    @Basic
    @Column(name = "TLPOS")
    public String getTlpos() {
        return tlpos;
    }

    public void setTlpos(String tlpos) {
        this.tlpos = tlpos;
    }

    @Basic
    @Column(name = "WORKTYPE")
    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }

    @Basic
    @Column(name = "POSITION")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "SALARY")
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "SIGNINVCODE")
    public String getSigninvcode() {
        return signinvcode;
    }

    public void setSigninvcode(String signinvcode) {
        this.signinvcode = signinvcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CisPersoninfoEntity that = (CisPersoninfoEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (custno != null ? !custno.equals(that.custno) : that.custno != null) return false;
        if (homeplace != null ? !homeplace.equals(that.homeplace) : that.homeplace != null) return false;
        if (borndate != null ? !borndate.equals(that.borndate) : that.borndate != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (folk != null ? !folk.equals(that.folk) : that.folk != null) return false;
        if (edulevel != null ? !edulevel.equals(that.edulevel) : that.edulevel != null) return false;
        if (marrstatus != null ? !marrstatus.equals(that.marrstatus) : that.marrstatus != null) return false;
        if (healthstatus != null ? !healthstatus.equals(that.healthstatus) : that.healthstatus != null) return false;
        if (custtype != null ? !custtype.equals(that.custtype) : that.custtype != null) return false;
        if (housetel != null ? !housetel.equals(that.housetel) : that.housetel != null) return false;
        if (offitel != null ? !offitel.equals(that.offitel) : that.offitel != null) return false;
        if (tlpos != null ? !tlpos.equals(that.tlpos) : that.tlpos != null) return false;
        if (worktype != null ? !worktype.equals(that.worktype) : that.worktype != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
        if (signinvcode != null ? !signinvcode.equals(that.signinvcode) : that.signinvcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (custno != null ? custno.hashCode() : 0);
        result = 31 * result + (homeplace != null ? homeplace.hashCode() : 0);
        result = 31 * result + (borndate != null ? borndate.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (folk != null ? folk.hashCode() : 0);
        result = 31 * result + (edulevel != null ? edulevel.hashCode() : 0);
        result = 31 * result + (marrstatus != null ? marrstatus.hashCode() : 0);
        result = 31 * result + (healthstatus != null ? healthstatus.hashCode() : 0);
        result = 31 * result + (custtype != null ? custtype.hashCode() : 0);
        result = 31 * result + (housetel != null ? housetel.hashCode() : 0);
        result = 31 * result + (offitel != null ? offitel.hashCode() : 0);
        result = 31 * result + (tlpos != null ? tlpos.hashCode() : 0);
        result = 31 * result + (worktype != null ? worktype.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (signinvcode != null ? signinvcode.hashCode() : 0);
        return result;
    }
}
