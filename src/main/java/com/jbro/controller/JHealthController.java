package com.jbro.controller;
import com.jbro.repsotories.testRepository.TestDB;
import com.jbro.repsotories.testRepository.TestDBDAO;
import com.jbro.service.JHealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kwangjeong on 2017. 8. 2..
 */
@RestController
public class JHealthController {
    @Autowired
    JHealthService jHealthService;

    @RequestMapping(value = "/saveTestDB", method = {RequestMethod.POST})//ajax로 받아지는거
    public void saveTestDB(TestDB testDB) {
        this.jHealthService.saveTestDB(testDB);
    }
}
