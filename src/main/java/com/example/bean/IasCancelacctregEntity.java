package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "IAS_CANCELACCTREG", schema = "TYPE23", catalog = "")
public class IasCancelacctregEntity {
    private long id;
    private String brcno;
    private String prdno;
    private String acctno;
    private String canno;
    private String acctname;
    private String source;
    private Long openaccamt;
    private Long balance;
    private Time trandate;
    private Time candate;
    private String state;
    private String reason;
    private String walkdir;

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
    @Column(name = "CANNO")
    public String getCanno() {
        return canno;
    }

    public void setCanno(String canno) {
        this.canno = canno;
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
    @Column(name = "SOURCE")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "OPENACCAMT")
    public Long getOpenaccamt() {
        return openaccamt;
    }

    public void setOpenaccamt(Long openaccamt) {
        this.openaccamt = openaccamt;
    }

    @Basic
    @Column(name = "BALANCE")
    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "TRANDATE")
    public Time getTrandate() {
        return trandate;
    }

    public void setTrandate(Time trandate) {
        this.trandate = trandate;
    }

    @Basic
    @Column(name = "CANDATE")
    public Time getCandate() {
        return candate;
    }

    public void setCandate(Time candate) {
        this.candate = candate;
    }

    @Basic
    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "REASON")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "WALKDIR")
    public String getWalkdir() {
        return walkdir;
    }

    public void setWalkdir(String walkdir) {
        this.walkdir = walkdir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IasCancelacctregEntity that = (IasCancelacctregEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (prdno != null ? !prdno.equals(that.prdno) : that.prdno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (canno != null ? !canno.equals(that.canno) : that.canno != null) return false;
        if (acctname != null ? !acctname.equals(that.acctname) : that.acctname != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (openaccamt != null ? !openaccamt.equals(that.openaccamt) : that.openaccamt != null) return false;
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (trandate != null ? !trandate.equals(that.trandate) : that.trandate != null) return false;
        if (candate != null ? !candate.equals(that.candate) : that.candate != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (walkdir != null ? !walkdir.equals(that.walkdir) : that.walkdir != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (prdno != null ? prdno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (canno != null ? canno.hashCode() : 0);
        result = 31 * result + (acctname != null ? acctname.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (openaccamt != null ? openaccamt.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (candate != null ? candate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (walkdir != null ? walkdir.hashCode() : 0);
        return result;
    }
}
