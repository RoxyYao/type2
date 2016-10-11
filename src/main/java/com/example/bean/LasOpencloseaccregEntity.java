package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "LAS_OPENCLOSEACCREG", schema = "TYPE23", catalog = "")
public class LasOpencloseaccregEntity {
    private long id;
    private String brcno;
    private String acctno;
    private String custno;
    private String custname;
    private String seqno;
    private String flag23;
    private String openbrc;
    private String acct1;
    private String ccy;
    private String prdno;
    private String subone;
    private String subtwo;
    private String accstat;
    private Time opendate;
    private Time closedate;
    private Long closeamt;
    private Long intamt;

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
    @Column(name = "SEQNO")
    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
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
    @Column(name = "OPENBRC")
    public String getOpenbrc() {
        return openbrc;
    }

    public void setOpenbrc(String openbrc) {
        this.openbrc = openbrc;
    }

    @Basic
    @Column(name = "ACCT1")
    public String getAcct1() {
        return acct1;
    }

    public void setAcct1(String acct1) {
        this.acct1 = acct1;
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
    @Column(name = "ACCSTAT")
    public String getAccstat() {
        return accstat;
    }

    public void setAccstat(String accstat) {
        this.accstat = accstat;
    }

    @Basic
    @Column(name = "OPENDATE")
    public Time getOpendate() {
        return opendate;
    }

    public void setOpendate(Time opendate) {
        this.opendate = opendate;
    }

    @Basic
    @Column(name = "CLOSEDATE")
    public Time getClosedate() {
        return closedate;
    }

    public void setClosedate(Time closedate) {
        this.closedate = closedate;
    }

    @Basic
    @Column(name = "CLOSEAMT")
    public Long getCloseamt() {
        return closeamt;
    }

    public void setCloseamt(Long closeamt) {
        this.closeamt = closeamt;
    }

    @Basic
    @Column(name = "INTAMT")
    public Long getIntamt() {
        return intamt;
    }

    public void setIntamt(Long intamt) {
        this.intamt = intamt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LasOpencloseaccregEntity that = (LasOpencloseaccregEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (custno != null ? !custno.equals(that.custno) : that.custno != null) return false;
        if (custname != null ? !custname.equals(that.custname) : that.custname != null) return false;
        if (seqno != null ? !seqno.equals(that.seqno) : that.seqno != null) return false;
        if (flag23 != null ? !flag23.equals(that.flag23) : that.flag23 != null) return false;
        if (openbrc != null ? !openbrc.equals(that.openbrc) : that.openbrc != null) return false;
        if (acct1 != null ? !acct1.equals(that.acct1) : that.acct1 != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (prdno != null ? !prdno.equals(that.prdno) : that.prdno != null) return false;
        if (subone != null ? !subone.equals(that.subone) : that.subone != null) return false;
        if (subtwo != null ? !subtwo.equals(that.subtwo) : that.subtwo != null) return false;
        if (accstat != null ? !accstat.equals(that.accstat) : that.accstat != null) return false;
        if (opendate != null ? !opendate.equals(that.opendate) : that.opendate != null) return false;
        if (closedate != null ? !closedate.equals(that.closedate) : that.closedate != null) return false;
        if (closeamt != null ? !closeamt.equals(that.closeamt) : that.closeamt != null) return false;
        if (intamt != null ? !intamt.equals(that.intamt) : that.intamt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (custno != null ? custno.hashCode() : 0);
        result = 31 * result + (custname != null ? custname.hashCode() : 0);
        result = 31 * result + (seqno != null ? seqno.hashCode() : 0);
        result = 31 * result + (flag23 != null ? flag23.hashCode() : 0);
        result = 31 * result + (openbrc != null ? openbrc.hashCode() : 0);
        result = 31 * result + (acct1 != null ? acct1.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (prdno != null ? prdno.hashCode() : 0);
        result = 31 * result + (subone != null ? subone.hashCode() : 0);
        result = 31 * result + (subtwo != null ? subtwo.hashCode() : 0);
        result = 31 * result + (accstat != null ? accstat.hashCode() : 0);
        result = 31 * result + (opendate != null ? opendate.hashCode() : 0);
        result = 31 * result + (closedate != null ? closedate.hashCode() : 0);
        result = 31 * result + (closeamt != null ? closeamt.hashCode() : 0);
        result = 31 * result + (intamt != null ? intamt.hashCode() : 0);
        return result;
    }
}
