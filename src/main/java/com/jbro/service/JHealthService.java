package com.jbro.service;

import com.jbro.repsotories.testRepository.TestDB;
import com.jbro.repsotories.trainerRepository.Trainer;

/**
 * Created by kwangjeong on 2017. 8. 3..
 */
public interface JHealthService {
    void saveTestDB(TestDB testDB);
    void saveTrainer(Trainer trainer);
}
