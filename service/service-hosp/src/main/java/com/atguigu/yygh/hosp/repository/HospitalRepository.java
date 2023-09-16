package com.atguigu.yygh.hosp.repository;

import com.atguigu.yygh.model.hosp.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author malinyan
 * @Date 2023/9/16
 * @Time 21:14
 * @Version 1.0
 */
@Repository
public class HospitalRepository extends MongoRepository<Hospital,String> {

}
