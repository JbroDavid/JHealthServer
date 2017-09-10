package com.jbro.repsotories.trainerRepository;

import com.jbro.repsotories.testRepository.TestDB;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by kwangjeong on 2017. 9. 10..
 */
public interface TrainerDAO extends CrudRepository<Trainer, Long> {
    public List<Trainer> findById(Long id);
    public List<Trainer> findAll();
    public Trainer findOne(long id);
}
