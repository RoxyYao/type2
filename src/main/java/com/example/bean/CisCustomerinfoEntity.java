package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "CIS_CUSTOMERINFO", schema = "TYPE23", catalog = "")
public class CisCustomerinfoEntity {
    private long id;
    private String brcno;
    private String custno;
    private String custname;
    private String idtype;
    private String idno;
    private Time lostdate;
    private String custtype;
    private String custmngno;
    private String linkman;
    private String phone;

    public CisCustomerinfoEntity() {
    }

    public CisCustomerinfoEntity(long id, String brcno, String custno, String custname, String idtype, String idno, Time lostdate, String custtype, String custmngno, String linkman, String phone, String email, String nationcode, Time begindate, Time moddate, Time enddate, String channel, String ctrlcode, String status, String address) {
        this.id = id;
        this.brcno = brcno;
        this.custno = custno;
        this.custname = custname;
        this.idtype = idtype;
        this.idno = idno;
        this.lostdate = lostdate;
        this.custtype = custtype;
        this.custmngno = custmngno;
        this.linkman = linkman;
        this.phone = phone;
        this.email = email;
        this.nationcode = nationcode;
        this.begindate = begindate;
        this.moddate = moddate;
        this.enddate = enddate;
        this.channel = channel;
        this.ctrlcode = ctrlcode;
        this.status = status;
        this.address = address;
    }

    private String email;
    private String nationcode;
    private Time begindate;
    private Time moddate;
    private Time enddate;
    private String channel;
    private String ctrlcode;
    private String status;
    private String address;

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
    @Column(name = "CUSTNAME")
    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Basic
    @Column(name = "IDTYPE")
    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    @Basic
    @Column(name = "IDNO")
    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    @Basic
    @Column(name = "LOSTDATE")
    public Time getLostdate() {
        return lostdate;
    }

    public void setLostdate(Time lostdate) {
        this.lostdate = lostdate;
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
    @Column(name = "CUSTMNGNO")
    public String getCustmngno() {
        return custmngno;
    }

    public void setCustmngno(String custmngno) {
        this.custmngno = custmngno;
    }

    @Basic
    @Column(name = "LINKMAN")
    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    @Basic
    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "NATIONCODE")
    public String getNationcode() {
        return nationcode;
    }

    public void setNationcode(String nationcode) {
        this.nationcode = nationcode;
    }

    @Basic
    @Column(name = "BEGINDATE")
    public Time getBegindate() {
        return begindate;
    }

    public void setBegindate(Time begindate) {
        this.begindate = begindate;
    }

    @Basic
    @Column(name = "MODDATE")
    public Time getModdate() {
        return moddate;
    }

    public void setModdate(Time moddate) {
        this.moddate = moddate;
    }

    @Basic
    @Column(name = "ENDDATE")
    public Time getEnddate() {
        return enddate;
    }

    public void setEnddate(Time enddate) {
        this.enddate = enddate;
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
    @Column(name = "CTRLCODE")
    public String getCtrlcode() {
        return ctrlcode;
    }

    public void setCtrlcode(String ctrlcode) {
        this.ctrlcode = ctrlcode;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CisCustomerinfoEntity that = (CisCustomerinfoEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (custno != null ? !custno.equals(that.custno) : that.custno != null) return false;
        if (custname != null ? !custname.equals(that.custname) : that.custname != null) return false;
        if (idtype != null ? !idtype.equals(that.idtype) : that.idtype != null) return false;
        if (idno != null ? !idno.equals(that.idno) : that.idno != null) return false;
        if (lostdate != null ? !lostdate.equals(that.lostdate) : that.lostdate != null) return false;
        if (custtype != null ? !custtype.equals(that.custtype) : that.custtype != null) return false;
        if (custmngno != null ? !custmngno.equals(that.custmngno) : that.custmngno != null) return false;
        if (linkman != null ? !linkman.equals(that.linkman) : that.linkman != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (nationcode != null ? !nationcode.equals(that.nationcode) : that.nationcode != null) return false;
        if (begindate != null ? !begindate.equals(that.begindate) : that.begindate != null) return false;
        if (moddate != null ? !moddate.equals(that.moddate) : that.moddate != null) return false;
        if (enddate != null ? !enddate.equals(that.enddate) : that.enddate != null) return false;
        if (channel != null ? !channel.equals(that.channel) : that.channel != null) return false;
        if (ctrlcode != null ? !ctrlcode.equals(that.ctrlcode) : that.ctrlcode != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (custno != null ? custno.hashCode() : 0);
        result = 31 * result + (custname != null ? custname.hashCode() : 0);
        result = 31 * result + (idtype != null ? idtype.hashCode() : 0);
        result = 31 * result + (idno != null ? idno.hashCode() : 0);
        result = 31 * result + (lostdate != null ? lostdate.hashCode() : 0);
        result = 31 * result + (custtype != null ? custtype.hashCode() : 0);
        result = 31 * result + (custmngno != null ? custmngno.hashCode() : 0);
        result = 31 * result + (linkman != null ? linkman.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nationcode != null ? nationcode.hashCode() : 0);
        result = 31 * result + (begindate != null ? begindate.hashCode() : 0);
        result = 31 * result + (moddate != null ? moddate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + (channel != null ? channel.hashCode() : 0);
        result = 31 * result + (ctrlcode != null ? ctrlcode.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
