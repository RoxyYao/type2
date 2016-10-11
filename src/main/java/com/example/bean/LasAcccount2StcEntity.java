package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "LAS_ACCCOUNT2STC", schema = "TYPE23", catalog = "")
public class LasAcccount2StcEntity {
    private long id;
    private String brcno;
    private String acctno;
    private String custno;
    private String custname;
    private String openflg;
    private String acctstat;
    private String pwdstat;
    private String wthmode;
    private String pwd;
    private Long pwderrnum;
    private String profitbrc;
    private String openbrc;
    private Time opendate;
    private Long ctramt;
    private String acctinfo;

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
    @Column(name = "OPENFLG")
    public String getOpenflg() {
        return openflg;
    }

    public void setOpenflg(String openflg) {
        this.openflg = openflg;
    }

    @Basic
    @Column(name = "ACCTSTAT")
    public String getAcctstat() {
        return acctstat;
    }

    public void setAcctstat(String acctstat) {
        this.acctstat = acctstat;
    }

    @Basic
    @Column(name = "PWDSTAT")
    public String getPwdstat() {
        return pwdstat;
    }

    public void setPwdstat(String pwdstat) {
        this.pwdstat = pwdstat;
    }

    @Basic
    @Column(name = "WTHMODE")
    public String getWthmode() {
        return wthmode;
    }

    public void setWthmode(String wthmode) {
        this.wthmode = wthmode;
    }

    @Basic
    @Column(name = "PWD")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "PWDERRNUM")
    public Long getPwderrnum() {
        return pwderrnum;
    }

    public void setPwderrnum(Long pwderrnum) {
        this.pwderrnum = pwderrnum;
    }

    @Basic
    @Column(name = "PROFITBRC")
    public String getProfitbrc() {
        return profitbrc;
    }

    public void setProfitbrc(String profitbrc) {
        this.profitbrc = profitbrc;
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
    @Column(name = "OPENDATE")
    public Time getOpendate() {
        return opendate;
    }

    public void setOpendate(Time opendate) {
        this.opendate = opendate;
    }

    @Basic
    @Column(name = "CTRAMT")
    public Long getCtramt() {
        return ctramt;
    }

    public void setCtramt(Long ctramt) {
        this.ctramt = ctramt;
    }

    @Basic
    @Column(name = "ACCTINFO")
    public String getAcctinfo() {
        return acctinfo;
    }

    public void setAcctinfo(String acctinfo) {
        this.acctinfo = acctinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LasAcccount2StcEntity that = (LasAcccount2StcEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (custno != null ? !custno.equals(that.custno) : that.custno != null) return false;
        if (custname != null ? !custname.equals(that.custname) : that.custname != null) return false;
        if (openflg != null ? !openflg.equals(that.openflg) : that.openflg != null) return false;
        if (acctstat != null ? !acctstat.equals(that.acctstat) : that.acctstat != null) return false;
        if (pwdstat != null ? !pwdstat.equals(that.pwdstat) : that.pwdstat != null) return false;
        if (wthmode != null ? !wthmode.equals(that.wthmode) : that.wthmode != null) return false;
        if (pwd != null ? !pwd.equals(that.pwd) : that.pwd != null) return false;
        if (pwderrnum != null ? !pwderrnum.equals(that.pwderrnum) : that.pwderrnum != null) return false;
        if (profitbrc != null ? !profitbrc.equals(that.profitbrc) : that.profitbrc != null) return false;
        if (openbrc != null ? !openbrc.equals(that.openbrc) : that.openbrc != null) return false;
        if (opendate != null ? !opendate.equals(that.opendate) : that.opendate != null) return false;
        if (ctramt != null ? !ctramt.equals(that.ctramt) : that.ctramt != null) return false;
        if (acctinfo != null ? !acctinfo.equals(that.acctinfo) : that.acctinfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (custno != null ? custno.hashCode() : 0);
        result = 31 * result + (custname != null ? custname.hashCode() : 0);
        result = 31 * result + (openflg != null ? openflg.hashCode() : 0);
        result = 31 * result + (acctstat != null ? acctstat.hashCode() : 0);
        result = 31 * result + (pwdstat != null ? pwdstat.hashCode() : 0);
        result = 31 * result + (wthmode != null ? wthmode.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (pwderrnum != null ? pwderrnum.hashCode() : 0);
        result = 31 * result + (profitbrc != null ? profitbrc.hashCode() : 0);
        result = 31 * result + (openbrc != null ? openbrc.hashCode() : 0);
        result = 31 * result + (opendate != null ? opendate.hashCode() : 0);
        result = 31 * result + (ctramt != null ? ctramt.hashCode() : 0);
        result = 31 * result + (acctinfo != null ? acctinfo.hashCode() : 0);
        return result;
    }
}
