package com.jbro.service;

import com.jbro.repsotories.testRepository.TestDB;
import com.jbro.repsotories.testRepository.TestDBDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kwangjeong on 2017. 8. 3..
 */
@Service
public class JHealthServiceImpl implements JHealthService {
    @Autowired
    TestDBDAO testDBDAO;

    @Override
    public void saveTestDB(TestDB testDB) {
        testDB.binaryToImageByteArray(); // is Business Logic
        this.testDBDAO.save(testDB);
    }
}
