package com.beyzayuksel.jpql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;

    // http://localhost:8080/ownQueryInterface/Yuksel
    @GetMapping("ownQueryInterface/{surname}")
    @ResponseBody
    public  String getTeacherMethod(@PathVariable(name="surname") String surname){
        // Birden fazla list üzerinde çalışıyorsak iterable olarak tanımlamamız gerek
        Iterable<TeacherEntity> iterableList = teacherRepository.find_1_TeacherEntitiesByTeacherSurname(surname);
        return iterableList+"\n";
    }
}
