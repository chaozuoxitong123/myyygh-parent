package com.atguigu.yygh.hosp.controller;

import com.atguigu.yygh.hosp.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author malinyan
 * @Date 2023/9/9
 * @Time 12:21
 * @Version 1.0
 */
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {
    @Autowired
    private HospitalSetService hospitalSetService;

    @GetMapping("findAll")
    public List<HospitalSet> findAllHospitalSet(){
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }

    //逻辑删除医院设置
    @DeleteMapping("{id}")
    public boolean removeHospSet(@PathVariable Long id){
        boolean flag = hospitalSetService.removeById(id);
        return flag;
    }
}
