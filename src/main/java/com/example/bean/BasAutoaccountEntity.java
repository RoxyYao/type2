package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_AUTOACCOUNT", schema = "TYPE23")
public class BasAutoaccountEntity {
    private long id;
    private String brcno;
    private String accttype;
    private String account;
    private String acctname;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    @Column(name = "ACCTTYPE", nullable = false, length = 1)
    public String getAccttype() {
        return accttype;
    }

    public void setAccttype(String accttype) {
        this.accttype = accttype;
    }

    @Basic
    @Column(name = "ACCOUNT", nullable = false, length = 18)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "ACCTNAME", nullable = true, length = 32)
    public String getAcctname() {
        return acctname;
    }

    public void setAcctname(String acctname) {
        this.acctname = acctname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasAutoaccountEntity that = (BasAutoaccountEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (accttype != null ? !accttype.equals(that.accttype) : that.accttype != null) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (acctname != null ? !acctname.equals(that.acctname) : that.acctname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (accttype != null ? accttype.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (acctname != null ? acctname.hashCode() : 0);
        return result;
    }
}
