package com.example.Controller;

import com.example.bean.cis.CisCustomerinfo;
import com.example.repository.CisCustomerinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.List;

/**
 * Created by Administrator on 2016/9/29.
 */

@RestController
public class CisCustomerinfoController {

    @Autowired
    private CisCustomerinfoRepository cisCustomerinfoRepository;

    /*
    保存数据
    @return
     */
    @RequestMapping("/save")
    public CisCustomerinfo save( String brcno, String custno, String custname, String idtype, String idno, Time lostdate, String custtype, String custmngno, String linkman, String phone, String email, String nationcode, Time begindate, Time moddate, Time enddate, String channel, String ctrlcode, String status, String address){
        CisCustomerinfo c=cisCustomerinfoRepository.save(new CisCustomerinfo(null,brcno,custno,custname, idtype,idno, lostdate, custtype,custmngno, linkman, phone, email, nationcode, begindate,  moddate, enddate, channel, ctrlcode, status, address));
        return c;
    }

    /**
     * 获取所有数据
     */
    @RequestMapping("/find1")
    public List<CisCustomerinfo> find1(String custNo){
        List<CisCustomerinfo> cisCustomerinfo=cisCustomerinfoRepository.findByCustname(custNo);
        return cisCustomerinfo;
    }
    @RequestMapping("/find2")
    public CisCustomerinfo find2(String brcno,String custno){
        CisCustomerinfo cisCustomerinfo=cisCustomerinfoRepository.withBrcnoAndCustNoQuery(brcno, custno);
        return cisCustomerinfo;
    }
}
