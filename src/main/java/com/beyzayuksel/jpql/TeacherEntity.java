package com.beyzayuksel.jpql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherEntity extends CrudRepository<TeacherEntity, Long> {
}
