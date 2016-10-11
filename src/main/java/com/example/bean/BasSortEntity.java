package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_SORT", schema = "TYPE23", catalog = "")
public class BasSortEntity {
    private long id;
    private String brcno;
    private Long sort2;
    private Long sort3;
    private Long ctxnseq;
    private String feeno;

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
    @Column(name = "SORT2")
    public Long getSort2() {
        return sort2;
    }

    public void setSort2(Long sort2) {
        this.sort2 = sort2;
    }

    @Basic
    @Column(name = "SORT3")
    public Long getSort3() {
        return sort3;
    }

    public void setSort3(Long sort3) {
        this.sort3 = sort3;
    }

    @Basic
    @Column(name = "CTXNSEQ")
    public Long getCtxnseq() {
        return ctxnseq;
    }

    public void setCtxnseq(Long ctxnseq) {
        this.ctxnseq = ctxnseq;
    }

    @Basic
    @Column(name = "FEENO")
    public String getFeeno() {
        return feeno;
    }

    public void setFeeno(String feeno) {
        this.feeno = feeno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasSortEntity that = (BasSortEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (sort2 != null ? !sort2.equals(that.sort2) : that.sort2 != null) return false;
        if (sort3 != null ? !sort3.equals(that.sort3) : that.sort3 != null) return false;
        if (ctxnseq != null ? !ctxnseq.equals(that.ctxnseq) : that.ctxnseq != null) return false;
        if (feeno != null ? !feeno.equals(that.feeno) : that.feeno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (sort2 != null ? sort2.hashCode() : 0);
        result = 31 * result + (sort3 != null ? sort3.hashCode() : 0);
        result = 31 * result + (ctxnseq != null ? ctxnseq.hashCode() : 0);
        result = 31 * result + (feeno != null ? feeno.hashCode() : 0);
        return result;
    }
}
