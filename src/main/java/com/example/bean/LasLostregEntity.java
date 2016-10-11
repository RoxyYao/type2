package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "LAS_LOSTREG", schema = "TYPE23", catalog = "")
public class LasLostregEntity {
    private long id;
    private String brcno;
    private String acctno;
    private String flag23;
    private String lostflag;
    private String loststat;
    private String lostno;
    private Long bal;
    private String idtype;
    private String idno;
    private String custname;
    private String address;
    private Time lostdate;
    private Time canceldate;
    private String newacctno;
    private String lostdes;

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
    @Column(name = "FLAG23")
    public String getFlag23() {
        return flag23;
    }

    public void setFlag23(String flag23) {
        this.flag23 = flag23;
    }

    @Basic
    @Column(name = "LOSTFLAG")
    public String getLostflag() {
        return lostflag;
    }

    public void setLostflag(String lostflag) {
        this.lostflag = lostflag;
    }

    @Basic
    @Column(name = "LOSTSTAT")
    public String getLoststat() {
        return loststat;
    }

    public void setLoststat(String loststat) {
        this.loststat = loststat;
    }

    @Basic
    @Column(name = "LOSTNO")
    public String getLostno() {
        return lostno;
    }

    public void setLostno(String lostno) {
        this.lostno = lostno;
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
    @Column(name = "CUSTNAME")
    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Basic
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    @Column(name = "CANCELDATE")
    public Time getCanceldate() {
        return canceldate;
    }

    public void setCanceldate(Time canceldate) {
        this.canceldate = canceldate;
    }

    @Basic
    @Column(name = "NEWACCTNO")
    public String getNewacctno() {
        return newacctno;
    }

    public void setNewacctno(String newacctno) {
        this.newacctno = newacctno;
    }

    @Basic
    @Column(name = "LOSTDES")
    public String getLostdes() {
        return lostdes;
    }

    public void setLostdes(String lostdes) {
        this.lostdes = lostdes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LasLostregEntity that = (LasLostregEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (flag23 != null ? !flag23.equals(that.flag23) : that.flag23 != null) return false;
        if (lostflag != null ? !lostflag.equals(that.lostflag) : that.lostflag != null) return false;
        if (loststat != null ? !loststat.equals(that.loststat) : that.loststat != null) return false;
        if (lostno != null ? !lostno.equals(that.lostno) : that.lostno != null) return false;
        if (bal != null ? !bal.equals(that.bal) : that.bal != null) return false;
        if (idtype != null ? !idtype.equals(that.idtype) : that.idtype != null) return false;
        if (idno != null ? !idno.equals(that.idno) : that.idno != null) return false;
        if (custname != null ? !custname.equals(that.custname) : that.custname != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (lostdate != null ? !lostdate.equals(that.lostdate) : that.lostdate != null) return false;
        if (canceldate != null ? !canceldate.equals(that.canceldate) : that.canceldate != null) return false;
        if (newacctno != null ? !newacctno.equals(that.newacctno) : that.newacctno != null) return false;
        if (lostdes != null ? !lostdes.equals(that.lostdes) : that.lostdes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (flag23 != null ? flag23.hashCode() : 0);
        result = 31 * result + (lostflag != null ? lostflag.hashCode() : 0);
        result = 31 * result + (loststat != null ? loststat.hashCode() : 0);
        result = 31 * result + (lostno != null ? lostno.hashCode() : 0);
        result = 31 * result + (bal != null ? bal.hashCode() : 0);
        result = 31 * result + (idtype != null ? idtype.hashCode() : 0);
        result = 31 * result + (idno != null ? idno.hashCode() : 0);
        result = 31 * result + (custname != null ? custname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (lostdate != null ? lostdate.hashCode() : 0);
        result = 31 * result + (canceldate != null ? canceldate.hashCode() : 0);
        result = 31 * result + (newacctno != null ? newacctno.hashCode() : 0);
        result = 31 * result + (lostdes != null ? lostdes.hashCode() : 0);
        return result;
    }
}
