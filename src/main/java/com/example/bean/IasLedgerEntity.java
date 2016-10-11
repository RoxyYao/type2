package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "IAS_LEDGER", schema = "TYPE23", catalog = "")
public class IasLedgerEntity {
    private long id;
    private String brcno;
    private String prdno;
    private String acctno;
    private String acctname;
    private String ccy;
    private String baldir;
    private String accttype;
    private String status;
    private Time lastdate;
    private Long lastbal;
    private Long currbal;
    private Long ctrlbal;
    private String balctrlflag;
    private String acckind;
    private String bal0Flag;
    private String redflag;
    private String accctrlflag;
    private String amtctrldir;
    private String flag;
    private Time begindate;
    private Time enddate;

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
    @Column(name = "BALDIR")
    public String getBaldir() {
        return baldir;
    }

    public void setBaldir(String baldir) {
        this.baldir = baldir;
    }

    @Basic
    @Column(name = "ACCTTYPE")
    public String getAccttype() {
        return accttype;
    }

    public void setAccttype(String accttype) {
        this.accttype = accttype;
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
    @Column(name = "LASTDATE")
    public Time getLastdate() {
        return lastdate;
    }

    public void setLastdate(Time lastdate) {
        this.lastdate = lastdate;
    }

    @Basic
    @Column(name = "LASTBAL")
    public Long getLastbal() {
        return lastbal;
    }

    public void setLastbal(Long lastbal) {
        this.lastbal = lastbal;
    }

    @Basic
    @Column(name = "CURRBAL")
    public Long getCurrbal() {
        return currbal;
    }

    public void setCurrbal(Long currbal) {
        this.currbal = currbal;
    }

    @Basic
    @Column(name = "CTRLBAL")
    public Long getCtrlbal() {
        return ctrlbal;
    }

    public void setCtrlbal(Long ctrlbal) {
        this.ctrlbal = ctrlbal;
    }

    @Basic
    @Column(name = "BALCTRLFLAG")
    public String getBalctrlflag() {
        return balctrlflag;
    }

    public void setBalctrlflag(String balctrlflag) {
        this.balctrlflag = balctrlflag;
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
    @Column(name = "BAL0FLAG")
    public String getBal0Flag() {
        return bal0Flag;
    }

    public void setBal0Flag(String bal0Flag) {
        this.bal0Flag = bal0Flag;
    }

    @Basic
    @Column(name = "REDFLAG")
    public String getRedflag() {
        return redflag;
    }

    public void setRedflag(String redflag) {
        this.redflag = redflag;
    }

    @Basic
    @Column(name = "ACCCTRLFLAG")
    public String getAccctrlflag() {
        return accctrlflag;
    }

    public void setAccctrlflag(String accctrlflag) {
        this.accctrlflag = accctrlflag;
    }

    @Basic
    @Column(name = "AMTCTRLDIR")
    public String getAmtctrldir() {
        return amtctrldir;
    }

    public void setAmtctrldir(String amtctrldir) {
        this.amtctrldir = amtctrldir;
    }

    @Basic
    @Column(name = "FLAG")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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
    @Column(name = "ENDDATE")
    public Time getEnddate() {
        return enddate;
    }

    public void setEnddate(Time enddate) {
        this.enddate = enddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IasLedgerEntity that = (IasLedgerEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (prdno != null ? !prdno.equals(that.prdno) : that.prdno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (acctname != null ? !acctname.equals(that.acctname) : that.acctname != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (baldir != null ? !baldir.equals(that.baldir) : that.baldir != null) return false;
        if (accttype != null ? !accttype.equals(that.accttype) : that.accttype != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (lastdate != null ? !lastdate.equals(that.lastdate) : that.lastdate != null) return false;
        if (lastbal != null ? !lastbal.equals(that.lastbal) : that.lastbal != null) return false;
        if (currbal != null ? !currbal.equals(that.currbal) : that.currbal != null) return false;
        if (ctrlbal != null ? !ctrlbal.equals(that.ctrlbal) : that.ctrlbal != null) return false;
        if (balctrlflag != null ? !balctrlflag.equals(that.balctrlflag) : that.balctrlflag != null) return false;
        if (acckind != null ? !acckind.equals(that.acckind) : that.acckind != null) return false;
        if (bal0Flag != null ? !bal0Flag.equals(that.bal0Flag) : that.bal0Flag != null) return false;
        if (redflag != null ? !redflag.equals(that.redflag) : that.redflag != null) return false;
        if (accctrlflag != null ? !accctrlflag.equals(that.accctrlflag) : that.accctrlflag != null) return false;
        if (amtctrldir != null ? !amtctrldir.equals(that.amtctrldir) : that.amtctrldir != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (begindate != null ? !begindate.equals(that.begindate) : that.begindate != null) return false;
        if (enddate != null ? !enddate.equals(that.enddate) : that.enddate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (prdno != null ? prdno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (acctname != null ? acctname.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (baldir != null ? baldir.hashCode() : 0);
        result = 31 * result + (accttype != null ? accttype.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lastdate != null ? lastdate.hashCode() : 0);
        result = 31 * result + (lastbal != null ? lastbal.hashCode() : 0);
        result = 31 * result + (currbal != null ? currbal.hashCode() : 0);
        result = 31 * result + (ctrlbal != null ? ctrlbal.hashCode() : 0);
        result = 31 * result + (balctrlflag != null ? balctrlflag.hashCode() : 0);
        result = 31 * result + (acckind != null ? acckind.hashCode() : 0);
        result = 31 * result + (bal0Flag != null ? bal0Flag.hashCode() : 0);
        result = 31 * result + (redflag != null ? redflag.hashCode() : 0);
        result = 31 * result + (accctrlflag != null ? accctrlflag.hashCode() : 0);
        result = 31 * result + (amtctrldir != null ? amtctrldir.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (begindate != null ? begindate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        return result;
    }
}
