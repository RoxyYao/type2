package com.example.bean.cis;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Administrator on 2016/10/11
 * .
 */
@Entity
@Table(name = "CIS_CUSTOMERINFO", schema = "TYPE23")
public class CisCustomerinfo {
    private Long id;
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
    private String email;
    private String nationcode;
    private Time begindate;
    private Time moddate;
    private Time enddate;
    private String channel;
    private String ctrlcode;
    private String status;
    private String address;

    public CisCustomerinfo() {

    }

    public CisCustomerinfo(Long id, String brcno, String custno, String custname, String idtype, String idno, Time lostdate, String custtype, String custmngno, String linkman, String phone, String email, String nationcode, Time begindate, Time moddate, Time enddate, String channel, String ctrlcode, String status, String address) {
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

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BRCNO", nullable = false, length = 10)
    public String getBrcno() {
        return brcno;
    }

    public void setBrcno(String brcno) {
        this.brcno = brcno;
    }

    @Basic
    @Column(name = "CUSTNO", nullable = false, length = 21)
    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno;
    }

    @Basic
    @Column(name = "CUSTNAME", nullable = false, length = 70)
    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Basic
    @Column(name = "IDTYPE", nullable = false, length = 2)
    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    @Basic
    @Column(name = "IDNO", nullable = false, length = 18)
    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    @Basic
    @Column(name = "LOSTDATE", nullable = true)
    public Time getLostdate() {
        return lostdate;
    }

    public void setLostdate(Time lostdate) {
        this.lostdate = lostdate;
    }

    @Basic
    @Column(name = "CUSTTYPE", nullable = false, length = 1)
    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype;
    }

    @Basic
    @Column(name = "CUSTMNGNO", nullable = true, length = 10)
    public String getCustmngno() {
        return custmngno;
    }

    public void setCustmngno(String custmngno) {
        this.custmngno = custmngno;
    }

    @Basic
    @Column(name = "LINKMAN", nullable = true, length = 50)
    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    @Basic
    @Column(name = "PHONE", nullable = false, length = 15)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 20)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "NATIONCODE", nullable = true, length = 2)
    public String getNationcode() {
        return nationcode;
    }

    public void setNationcode(String nationcode) {
        this.nationcode = nationcode;
    }

    @Basic
    @Column(name = "BEGINDATE", nullable = false)
    public Time getBegindate() {
        return begindate;
    }

    public void setBegindate(Time begindate) {
        this.begindate = begindate;
    }

    @Basic
    @Column(name = "MODDATE", nullable = false)
    public Time getModdate() {
        return moddate;
    }

    public void setModdate(Time moddate) {
        this.moddate = moddate;
    }

    @Basic
    @Column(name = "ENDDATE", nullable = true)
    public Time getEnddate() {
        return enddate;
    }

    public void setEnddate(Time enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "CHANNEL", nullable = false, length = 1)
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Basic
    @Column(name = "CTRLCODE", nullable = false, length = 2)
    public String getCtrlcode() {
        return ctrlcode;
    }

    public void setCtrlcode(String ctrlcode) {
        this.ctrlcode = ctrlcode;
    }

    @Basic
    @Column(name = "STATUS", nullable = false, length = 2)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = false, length = 70)
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

        CisCustomerinfo that = (CisCustomerinfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
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
        int result = id != null ? id.hashCode() : 0;
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
