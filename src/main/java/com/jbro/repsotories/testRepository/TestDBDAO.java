package com.jbro.repsotories.testRepository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by kwangjeong on 2017. 8. 3..
 */
public interface TestDBDAO extends CrudRepository<TestDB, Long> {
    public List<TestDB> findById(Long id);
    public List<TestDB> findAll();
}
