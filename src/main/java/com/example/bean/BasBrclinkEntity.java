package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_BRCLINK", schema = "TYPE23", catalog = "")
public class BasBrclinkEntity {
    private long id;
    private String brcno;
    private String linktype;
    private String linksubtype;
    private String highbrc;
    private String highbrcaccidx;
    private String subidx;

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
    @Column(name = "LINKTYPE")
    public String getLinktype() {
        return linktype;
    }

    public void setLinktype(String linktype) {
        this.linktype = linktype;
    }

    @Basic
    @Column(name = "LINKSUBTYPE")
    public String getLinksubtype() {
        return linksubtype;
    }

    public void setLinksubtype(String linksubtype) {
        this.linksubtype = linksubtype;
    }

    @Basic
    @Column(name = "HIGHBRC")
    public String getHighbrc() {
        return highbrc;
    }

    public void setHighbrc(String highbrc) {
        this.highbrc = highbrc;
    }

    @Basic
    @Column(name = "HIGHBRCACCIDX")
    public String getHighbrcaccidx() {
        return highbrcaccidx;
    }

    public void setHighbrcaccidx(String highbrcaccidx) {
        this.highbrcaccidx = highbrcaccidx;
    }

    @Basic
    @Column(name = "SUBIDX")
    public String getSubidx() {
        return subidx;
    }

    public void setSubidx(String subidx) {
        this.subidx = subidx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasBrclinkEntity that = (BasBrclinkEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (linktype != null ? !linktype.equals(that.linktype) : that.linktype != null) return false;
        if (linksubtype != null ? !linksubtype.equals(that.linksubtype) : that.linksubtype != null) return false;
        if (highbrc != null ? !highbrc.equals(that.highbrc) : that.highbrc != null) return false;
        if (highbrcaccidx != null ? !highbrcaccidx.equals(that.highbrcaccidx) : that.highbrcaccidx != null)
            return false;
        if (subidx != null ? !subidx.equals(that.subidx) : that.subidx != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (linktype != null ? linktype.hashCode() : 0);
        result = 31 * result + (linksubtype != null ? linksubtype.hashCode() : 0);
        result = 31 * result + (highbrc != null ? highbrc.hashCode() : 0);
        result = 31 * result + (highbrcaccidx != null ? highbrcaccidx.hashCode() : 0);
        result = 31 * result + (subidx != null ? subidx.hashCode() : 0);
        return result;
    }
}
