package com.example.repository;

import com.kift.demo.bean.cis.CisCustomerinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * Created by Administrator on 2016/9/29.
 */
public interface CisCustomerinfoRepository extends JpaRepository<CisCustomerinfo,Long>{
    //1
    List<CisCustomerinfo> findByCustname(String custname);
    //2
    @Query("select c from CisCustomerinfo c where c.brcno=:brcno and c.custno=:custno")
    CisCustomerinfo withBrcnoAndCustNoQuery(@Param("brcno") String brcno, @Param("custno") String custno);


}
