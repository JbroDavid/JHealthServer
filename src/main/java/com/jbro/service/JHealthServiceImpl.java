package com.jbro.service;

import com.jbro.repsotories.testRepository.TestDB;
import com.jbro.repsotories.testRepository.TestDBDAO;
import com.jbro.repsotories.trainerRepository.Trainer;
import com.jbro.repsotories.trainerRepository.TrainerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kwangjeong on 2017. 8. 3..
 */
@Service
public class JHealthServiceImpl implements JHealthService {
    @Autowired
    TestDBDAO testDBDAO;

    @Autowired
    TrainerDAO trainerDAO;

    @Override
    public void saveTestDB(TestDB testDB) {
        this.testDBDAO.save(testDB);
    }

    @Override
    public void saveTrainer(Trainer trainer) {
        this.trainerDAO.save(trainer);
    }
}
