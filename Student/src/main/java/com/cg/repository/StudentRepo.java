package com.cg.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.Student;
;

public interface StudentRepo extends MongoRepository<Student, Integer> {

}
