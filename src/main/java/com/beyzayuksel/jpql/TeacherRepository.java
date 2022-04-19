package com.beyzayuksel.jpql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends CrudRepository<TeacherEntity, Long> {

    // Crud Repository de bir çok method var. Bizde kendi query mizi yazabiliyoruz
    // Kendi query mi kendim yazmak istiyorum.
    // 1. step: Entity ile aynı isim olacak. >> teacherSurname
    // 2. step: find, delete, count, get >> find
    // 3. step: Yazdığım Entity ismine göre yazmak. >> find_1_TeacherEntitiesBy
    // 4. step: Sona By ekle.
    // 5. step: TeacherSurname >> find_1_TeacherEntitiesByTeacherSurname
    List<TeacherEntity> find_1_TeacherEntitiesByTeacherSurname(String teacherSurname);

}
