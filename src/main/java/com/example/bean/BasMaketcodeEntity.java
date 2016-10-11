package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_MAKETCODE", schema = "TYPE23", catalog = "")
public class BasMaketcodeEntity {
    private long id;
    private String brcno;
    private String makcode;
    private String usertype;
    private String userno;
    private Long usecount;

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
    @Column(name = "MAKCODE")
    public String getMakcode() {
        return makcode;
    }

    public void setMakcode(String makcode) {
        this.makcode = makcode;
    }

    @Basic
    @Column(name = "USERTYPE")
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Basic
    @Column(name = "USERNO")
    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    @Basic
    @Column(name = "USECOUNT")
    public Long getUsecount() {
        return usecount;
    }

    public void setUsecount(Long usecount) {
        this.usecount = usecount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasMaketcodeEntity that = (BasMaketcodeEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (makcode != null ? !makcode.equals(that.makcode) : that.makcode != null) return false;
        if (usertype != null ? !usertype.equals(that.usertype) : that.usertype != null) return false;
        if (userno != null ? !userno.equals(that.userno) : that.userno != null) return false;
        if (usecount != null ? !usecount.equals(that.usecount) : that.usecount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (makcode != null ? makcode.hashCode() : 0);
        result = 31 * result + (usertype != null ? usertype.hashCode() : 0);
        result = 31 * result + (userno != null ? userno.hashCode() : 0);
        result = 31 * result + (usecount != null ? usecount.hashCode() : 0);
        return result;
    }
}
