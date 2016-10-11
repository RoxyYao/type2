package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_BRANCH", schema = "TYPE23", catalog = "")
public class BasBranchEntity {
    private long id;
    private String brcno;
    private String brcname;
    private String shname;
    private String address;
    private String phone;
    private String citycode;
    private String brctype;
    private Long brclvl;
    private String brcattr;
    private String selbal;
    private String selflag;
    private String profitbrc;
    private String status;
    private String accsysid;
    private String exbillbrc;
    private String fbbrc;
    private String remitbrc;
    private String ipaddr;
    private String zipcode;
    private String areacode;
    private String begindate;
    private String branchcode;
    private String flag;

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
    @Column(name = "BRCNAME")
    public String getBrcname() {
        return brcname;
    }

    public void setBrcname(String brcname) {
        this.brcname = brcname;
    }

    @Basic
    @Column(name = "SHNAME")
    public String getShname() {
        return shname;
    }

    public void setShname(String shname) {
        this.shname = shname;
    }

    @Basic
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "CITYCODE")
    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
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
    @Column(name = "BRCLVL")
    public Long getBrclvl() {
        return brclvl;
    }

    public void setBrclvl(Long brclvl) {
        this.brclvl = brclvl;
    }

    @Basic
    @Column(name = "BRCATTR")
    public String getBrcattr() {
        return brcattr;
    }

    public void setBrcattr(String brcattr) {
        this.brcattr = brcattr;
    }

    @Basic
    @Column(name = "SELBAL")
    public String getSelbal() {
        return selbal;
    }

    public void setSelbal(String selbal) {
        this.selbal = selbal;
    }

    @Basic
    @Column(name = "SELFLAG")
    public String getSelflag() {
        return selflag;
    }

    public void setSelflag(String selflag) {
        this.selflag = selflag;
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
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ACCSYSID")
    public String getAccsysid() {
        return accsysid;
    }

    public void setAccsysid(String accsysid) {
        this.accsysid = accsysid;
    }

    @Basic
    @Column(name = "EXBILLBRC")
    public String getExbillbrc() {
        return exbillbrc;
    }

    public void setExbillbrc(String exbillbrc) {
        this.exbillbrc = exbillbrc;
    }

    @Basic
    @Column(name = "FBBRC")
    public String getFbbrc() {
        return fbbrc;
    }

    public void setFbbrc(String fbbrc) {
        this.fbbrc = fbbrc;
    }

    @Basic
    @Column(name = "REMITBRC")
    public String getRemitbrc() {
        return remitbrc;
    }

    public void setRemitbrc(String remitbrc) {
        this.remitbrc = remitbrc;
    }

    @Basic
    @Column(name = "IPADDR")
    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    @Basic
    @Column(name = "ZIPCODE")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "AREACODE")
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Basic
    @Column(name = "BEGINDATE")
    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }

    @Basic
    @Column(name = "BRANCHCODE")
    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    @Basic
    @Column(name = "FLAG")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasBranchEntity that = (BasBranchEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (brcname != null ? !brcname.equals(that.brcname) : that.brcname != null) return false;
        if (shname != null ? !shname.equals(that.shname) : that.shname != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (citycode != null ? !citycode.equals(that.citycode) : that.citycode != null) return false;
        if (brctype != null ? !brctype.equals(that.brctype) : that.brctype != null) return false;
        if (brclvl != null ? !brclvl.equals(that.brclvl) : that.brclvl != null) return false;
        if (brcattr != null ? !brcattr.equals(that.brcattr) : that.brcattr != null) return false;
        if (selbal != null ? !selbal.equals(that.selbal) : that.selbal != null) return false;
        if (selflag != null ? !selflag.equals(that.selflag) : that.selflag != null) return false;
        if (profitbrc != null ? !profitbrc.equals(that.profitbrc) : that.profitbrc != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (accsysid != null ? !accsysid.equals(that.accsysid) : that.accsysid != null) return false;
        if (exbillbrc != null ? !exbillbrc.equals(that.exbillbrc) : that.exbillbrc != null) return false;
        if (fbbrc != null ? !fbbrc.equals(that.fbbrc) : that.fbbrc != null) return false;
        if (remitbrc != null ? !remitbrc.equals(that.remitbrc) : that.remitbrc != null) return false;
        if (ipaddr != null ? !ipaddr.equals(that.ipaddr) : that.ipaddr != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (areacode != null ? !areacode.equals(that.areacode) : that.areacode != null) return false;
        if (begindate != null ? !begindate.equals(that.begindate) : that.begindate != null) return false;
        if (branchcode != null ? !branchcode.equals(that.branchcode) : that.branchcode != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (brcname != null ? brcname.hashCode() : 0);
        result = 31 * result + (shname != null ? shname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (citycode != null ? citycode.hashCode() : 0);
        result = 31 * result + (brctype != null ? brctype.hashCode() : 0);
        result = 31 * result + (brclvl != null ? brclvl.hashCode() : 0);
        result = 31 * result + (brcattr != null ? brcattr.hashCode() : 0);
        result = 31 * result + (selbal != null ? selbal.hashCode() : 0);
        result = 31 * result + (selflag != null ? selflag.hashCode() : 0);
        result = 31 * result + (profitbrc != null ? profitbrc.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (accsysid != null ? accsysid.hashCode() : 0);
        result = 31 * result + (exbillbrc != null ? exbillbrc.hashCode() : 0);
        result = 31 * result + (fbbrc != null ? fbbrc.hashCode() : 0);
        result = 31 * result + (remitbrc != null ? remitbrc.hashCode() : 0);
        result = 31 * result + (ipaddr != null ? ipaddr.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (areacode != null ? areacode.hashCode() : 0);
        result = 31 * result + (begindate != null ? begindate.hashCode() : 0);
        result = 31 * result + (branchcode != null ? branchcode.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        return result;
    }
}
