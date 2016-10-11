package com.example.Controller;

import com.example.bean.demoBean;
import com.example.repository.demoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yy on 2016/9/24
 * .
 */
@RestController
public class demoController {
    @Autowired
    private demoRepository demoRepository;
    @RequestMapping("/save")
    public String save(){
        System.out.println("进入sava方法");
        demoRepository.save(new demoBean("title1", "content1"));
        demoRepository.save(new demoBean("title2", "content2"));
        demoRepository.save(new demoBean("title3", "content3"));
        demoRepository.save(new demoBean("title4", "content4"));
        demoRepository.save(new demoBean("title5", "content5"));
        return "save ok";
    }

    /**
     * 获取所有数据.
     * @return
     */
    @RequestMapping("/findAll")
    public Iterable<demoBean> findAll(){
        // 内存数据库操作
        return demoRepository.findAll();
    }

}
