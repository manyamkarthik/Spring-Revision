package com.spring.application.service;

import com.spring.application.constants.EazySchoolConstants;
import com.spring.application.model.Person;
import com.spring.application.model.Roles;
import com.spring.application.repository.PersonRepository;
import com.spring.application.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    RolesRepository rolesRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public boolean createNewPerson(Person person) {
        boolean isSaved=false;
        Roles roles=rolesRepository.getByRoleName(EazySchoolConstants.STUDENT_ROLE);
        person.setRoles(roles);
        person.setPwd(passwordEncoder.encode(person.getPwd()));

        person=personRepository.save(person);
        if(person!=null && person.getPersonId()>0){
            return !isSaved;
        }
        return isSaved;
    }
}
