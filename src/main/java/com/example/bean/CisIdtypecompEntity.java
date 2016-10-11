package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "CIS_IDTYPECOMP", schema = "TYPE23", catalog = "")
public class CisIdtypecompEntity {
    private long id;
    private String idtype;
    private String idname;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IDTYPE")
    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    @Basic
    @Column(name = "IDNAME")
    public String getIdname() {
        return idname;
    }

    public void setIdname(String idname) {
        this.idname = idname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CisIdtypecompEntity that = (CisIdtypecompEntity) o;

        if (id != that.id) return false;
        if (idtype != null ? !idtype.equals(that.idtype) : that.idtype != null) return false;
        if (idname != null ? !idname.equals(that.idname) : that.idname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (idtype != null ? idtype.hashCode() : 0);
        result = 31 * result + (idname != null ? idname.hashCode() : 0);
        return result;
    }
}
