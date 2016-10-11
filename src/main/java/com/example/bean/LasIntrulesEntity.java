package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "LAS_INTRULES", schema = "TYPE23", catalog = "")
public class LasIntrulesEntity {
    private long id;
    private String brcno;
    private String planno;
    private String rateno;
    private String ccy;
    private String planname;
    private Time eftdate;
    private String monthday;
    private String yearday;
    private String intaccrmtd;
    private String intway;
    private String balopt;
    private String speopt;
    private long mincalintunit;
    private String aptflag;
    private String conbas;
    private String calintcycunit;
    private long calintcycterm;
    private String calintdate;
    private String setintcycunit;
    private long setintcycterm;
    private String setintdate;
    private String strintflag;
    private String ratechgflag;
    private String ratechgunit;
    private long ratechgterm;

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
    @Column(name = "PLANNO")
    public String getPlanno() {
        return planno;
    }

    public void setPlanno(String planno) {
        this.planno = planno;
    }

    @Basic
    @Column(name = "RATENO")
    public String getRateno() {
        return rateno;
    }

    public void setRateno(String rateno) {
        this.rateno = rateno;
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
    @Column(name = "PLANNAME")
    public String getPlanname() {
        return planname;
    }

    public void setPlanname(String planname) {
        this.planname = planname;
    }

    @Basic
    @Column(name = "EFTDATE")
    public Time getEftdate() {
        return eftdate;
    }

    public void setEftdate(Time eftdate) {
        this.eftdate = eftdate;
    }

    @Basic
    @Column(name = "MONTHDAY")
    public String getMonthday() {
        return monthday;
    }

    public void setMonthday(String monthday) {
        this.monthday = monthday;
    }

    @Basic
    @Column(name = "YEARDAY")
    public String getYearday() {
        return yearday;
    }

    public void setYearday(String yearday) {
        this.yearday = yearday;
    }

    @Basic
    @Column(name = "INTACCRMTD")
    public String getIntaccrmtd() {
        return intaccrmtd;
    }

    public void setIntaccrmtd(String intaccrmtd) {
        this.intaccrmtd = intaccrmtd;
    }

    @Basic
    @Column(name = "INTWAY")
    public String getIntway() {
        return intway;
    }

    public void setIntway(String intway) {
        this.intway = intway;
    }

    @Basic
    @Column(name = "BALOPT")
    public String getBalopt() {
        return balopt;
    }

    public void setBalopt(String balopt) {
        this.balopt = balopt;
    }

    @Basic
    @Column(name = "SPEOPT")
    public String getSpeopt() {
        return speopt;
    }

    public void setSpeopt(String speopt) {
        this.speopt = speopt;
    }

    @Basic
    @Column(name = "MINCALINTUNIT")
    public long getMincalintunit() {
        return mincalintunit;
    }

    public void setMincalintunit(long mincalintunit) {
        this.mincalintunit = mincalintunit;
    }

    @Basic
    @Column(name = "APTFLAG")
    public String getAptflag() {
        return aptflag;
    }

    public void setAptflag(String aptflag) {
        this.aptflag = aptflag;
    }

    @Basic
    @Column(name = "CONBAS")
    public String getConbas() {
        return conbas;
    }

    public void setConbas(String conbas) {
        this.conbas = conbas;
    }

    @Basic
    @Column(name = "CALINTCYCUNIT")
    public String getCalintcycunit() {
        return calintcycunit;
    }

    public void setCalintcycunit(String calintcycunit) {
        this.calintcycunit = calintcycunit;
    }

    @Basic
    @Column(name = "CALINTCYCTERM")
    public long getCalintcycterm() {
        return calintcycterm;
    }

    public void setCalintcycterm(long calintcycterm) {
        this.calintcycterm = calintcycterm;
    }

    @Basic
    @Column(name = "CALINTDATE")
    public String getCalintdate() {
        return calintdate;
    }

    public void setCalintdate(String calintdate) {
        this.calintdate = calintdate;
    }

    @Basic
    @Column(name = "SETINTCYCUNIT")
    public String getSetintcycunit() {
        return setintcycunit;
    }

    public void setSetintcycunit(String setintcycunit) {
        this.setintcycunit = setintcycunit;
    }

    @Basic
    @Column(name = "SETINTCYCTERM")
    public long getSetintcycterm() {
        return setintcycterm;
    }

    public void setSetintcycterm(long setintcycterm) {
        this.setintcycterm = setintcycterm;
    }

    @Basic
    @Column(name = "SETINTDATE")
    public String getSetintdate() {
        return setintdate;
    }

    public void setSetintdate(String setintdate) {
        this.setintdate = setintdate;
    }

    @Basic
    @Column(name = "STRINTFLAG")
    public String getStrintflag() {
        return strintflag;
    }

    public void setStrintflag(String strintflag) {
        this.strintflag = strintflag;
    }

    @Basic
    @Column(name = "RATECHGFLAG")
    public String getRatechgflag() {
        return ratechgflag;
    }

    public void setRatechgflag(String ratechgflag) {
        this.ratechgflag = ratechgflag;
    }

    @Basic
    @Column(name = "RATECHGUNIT")
    public String getRatechgunit() {
        return ratechgunit;
    }

    public void setRatechgunit(String ratechgunit) {
        this.ratechgunit = ratechgunit;
    }

    @Basic
    @Column(name = "RATECHGTERM")
    public long getRatechgterm() {
        return ratechgterm;
    }

    public void setRatechgterm(long ratechgterm) {
        this.ratechgterm = ratechgterm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LasIntrulesEntity that = (LasIntrulesEntity) o;

        if (id != that.id) return false;
        if (mincalintunit != that.mincalintunit) return false;
        if (calintcycterm != that.calintcycterm) return false;
        if (setintcycterm != that.setintcycterm) return false;
        if (ratechgterm != that.ratechgterm) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (planno != null ? !planno.equals(that.planno) : that.planno != null) return false;
        if (rateno != null ? !rateno.equals(that.rateno) : that.rateno != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (planname != null ? !planname.equals(that.planname) : that.planname != null) return false;
        if (eftdate != null ? !eftdate.equals(that.eftdate) : that.eftdate != null) return false;
        if (monthday != null ? !monthday.equals(that.monthday) : that.monthday != null) return false;
        if (yearday != null ? !yearday.equals(that.yearday) : that.yearday != null) return false;
        if (intaccrmtd != null ? !intaccrmtd.equals(that.intaccrmtd) : that.intaccrmtd != null) return false;
        if (intway != null ? !intway.equals(that.intway) : that.intway != null) return false;
        if (balopt != null ? !balopt.equals(that.balopt) : that.balopt != null) return false;
        if (speopt != null ? !speopt.equals(that.speopt) : that.speopt != null) return false;
        if (aptflag != null ? !aptflag.equals(that.aptflag) : that.aptflag != null) return false;
        if (conbas != null ? !conbas.equals(that.conbas) : that.conbas != null) return false;
        if (calintcycunit != null ? !calintcycunit.equals(that.calintcycunit) : that.calintcycunit != null)
            return false;
        if (calintdate != null ? !calintdate.equals(that.calintdate) : that.calintdate != null) return false;
        if (setintcycunit != null ? !setintcycunit.equals(that.setintcycunit) : that.setintcycunit != null)
            return false;
        if (setintdate != null ? !setintdate.equals(that.setintdate) : that.setintdate != null) return false;
        if (strintflag != null ? !strintflag.equals(that.strintflag) : that.strintflag != null) return false;
        if (ratechgflag != null ? !ratechgflag.equals(that.ratechgflag) : that.ratechgflag != null) return false;
        if (ratechgunit != null ? !ratechgunit.equals(that.ratechgunit) : that.ratechgunit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (planno != null ? planno.hashCode() : 0);
        result = 31 * result + (rateno != null ? rateno.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (planname != null ? planname.hashCode() : 0);
        result = 31 * result + (eftdate != null ? eftdate.hashCode() : 0);
        result = 31 * result + (monthday != null ? monthday.hashCode() : 0);
        result = 31 * result + (yearday != null ? yearday.hashCode() : 0);
        result = 31 * result + (intaccrmtd != null ? intaccrmtd.hashCode() : 0);
        result = 31 * result + (intway != null ? intway.hashCode() : 0);
        result = 31 * result + (balopt != null ? balopt.hashCode() : 0);
        result = 31 * result + (speopt != null ? speopt.hashCode() : 0);
        result = 31 * result + (int) (mincalintunit ^ (mincalintunit >>> 32));
        result = 31 * result + (aptflag != null ? aptflag.hashCode() : 0);
        result = 31 * result + (conbas != null ? conbas.hashCode() : 0);
        result = 31 * result + (calintcycunit != null ? calintcycunit.hashCode() : 0);
        result = 31 * result + (int) (calintcycterm ^ (calintcycterm >>> 32));
        result = 31 * result + (calintdate != null ? calintdate.hashCode() : 0);
        result = 31 * result + (setintcycunit != null ? setintcycunit.hashCode() : 0);
        result = 31 * result + (int) (setintcycterm ^ (setintcycterm >>> 32));
        result = 31 * result + (setintdate != null ? setintdate.hashCode() : 0);
        result = 31 * result + (strintflag != null ? strintflag.hashCode() : 0);
        result = 31 * result + (ratechgflag != null ? ratechgflag.hashCode() : 0);
        result = 31 * result + (ratechgunit != null ? ratechgunit.hashCode() : 0);
        result = 31 * result + (int) (ratechgterm ^ (ratechgterm >>> 32));
        return result;
    }
}
