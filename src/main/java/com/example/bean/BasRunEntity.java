package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/1010
 * .
 */
@Entity
@Table(name = "BAS_RUN", schema = "TYPE23")
public class BasRunEntity {
    private long id;
    private String brcno;
    private String brctype;
    private Time trandate;
    private Time lastdate;
    private Time nextdate;
    private Time cleardate;
    private Time credate;
    private String seqno;
    private String intflag;
    private Time yearsumdate;
    private String ccy;
    private String potccy;
    private String invflag;
    private String smsflag;
    private String glsflag;

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
    @Column(name = "BRCTYPE")
    public String getBrctype() {
        return brctype;
    }

    public void setBrctype(String brctype) {
        this.brctype = brctype;
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
    @Column(name = "LASTDATE")
    public Time getLastdate() {
        return lastdate;
    }

    public void setLastdate(Time lastdate) {
        this.lastdate = lastdate;
    }

    @Basic
    @Column(name = "NEXTDATE")
    public Time getNextdate() {
        return nextdate;
    }

    public void setNextdate(Time nextdate) {
        this.nextdate = nextdate;
    }

    @Basic
    @Column(name = "CLEARDATE")
    public Time getCleardate() {
        return cleardate;
    }

    public void setCleardate(Time cleardate) {
        this.cleardate = cleardate;
    }

    @Basic
    @Column(name = "CREDATE")
    public Time getCredate() {
        return credate;
    }

    public void setCredate(Time credate) {
        this.credate = credate;
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
    @Column(name = "INTFLAG")
    public String getIntflag() {
        return intflag;
    }

    public void setIntflag(String intflag) {
        this.intflag = intflag;
    }

    @Basic
    @Column(name = "YEARSUMDATE")
    public Time getYearsumdate() {
        return yearsumdate;
    }

    public void setYearsumdate(Time yearsumdate) {
        this.yearsumdate = yearsumdate;
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
    @Column(name = "POTCCY")
    public String getPotccy() {
        return potccy;
    }

    public void setPotccy(String potccy) {
        this.potccy = potccy;
    }

    @Basic
    @Column(name = "INVFLAG")
    public String getInvflag() {
        return invflag;
    }

    public void setInvflag(String invflag) {
        this.invflag = invflag;
    }

    @Basic
    @Column(name = "SMSFLAG")
    public String getSmsflag() {
        return smsflag;
    }

    public void setSmsflag(String smsflag) {
        this.smsflag = smsflag;
    }

    @Basic
    @Column(name = "GLSFLAG")
    public String getGlsflag() {
        return glsflag;
    }

    public void setGlsflag(String glsflag) {
        this.glsflag = glsflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasRunEntity that = (BasRunEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (brctype != null ? !brctype.equals(that.brctype) : that.brctype != null) return false;
        if (trandate != null ? !trandate.equals(that.trandate) : that.trandate != null) return false;
        if (lastdate != null ? !lastdate.equals(that.lastdate) : that.lastdate != null) return false;
        if (nextdate != null ? !nextdate.equals(that.nextdate) : that.nextdate != null) return false;
        if (cleardate != null ? !cleardate.equals(that.cleardate) : that.cleardate != null) return false;
        if (credate != null ? !credate.equals(that.credate) : that.credate != null) return false;
        if (seqno != null ? !seqno.equals(that.seqno) : that.seqno != null) return false;
        if (intflag != null ? !intflag.equals(that.intflag) : that.intflag != null) return false;
        if (yearsumdate != null ? !yearsumdate.equals(that.yearsumdate) : that.yearsumdate != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (potccy != null ? !potccy.equals(that.potccy) : that.potccy != null) return false;
        if (invflag != null ? !invflag.equals(that.invflag) : that.invflag != null) return false;
        if (smsflag != null ? !smsflag.equals(that.smsflag) : that.smsflag != null) return false;
        if (glsflag != null ? !glsflag.equals(that.glsflag) : that.glsflag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (brctype != null ? brctype.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (lastdate != null ? lastdate.hashCode() : 0);
        result = 31 * result + (nextdate != null ? nextdate.hashCode() : 0);
        result = 31 * result + (cleardate != null ? cleardate.hashCode() : 0);
        result = 31 * result + (credate != null ? credate.hashCode() : 0);
        result = 31 * result + (seqno != null ? seqno.hashCode() : 0);
        result = 31 * result + (intflag != null ? intflag.hashCode() : 0);
        result = 31 * result + (yearsumdate != null ? yearsumdate.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (potccy != null ? potccy.hashCode() : 0);
        result = 31 * result + (invflag != null ? invflag.hashCode() : 0);
        result = 31 * result + (smsflag != null ? smsflag.hashCode() : 0);
        result = 31 * result + (glsflag != null ? glsflag.hashCode() : 0);
        return result;
    }
}
