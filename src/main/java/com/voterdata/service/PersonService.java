package com.voterdata.service;

import com.voterdata.entity.PersonEntity;
import com.voterdata.model.PersonModel;
import com.voterdata.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepo repo;

    public List<PersonModel> getPersonInfo(){
        List<PersonModel> result = new ArrayList<>();
        List<PersonEntity> personData = repo.findAll();
       personData.forEach(entry -> {
           PersonModel model = new PersonModel();
           model.setId(entry.getId());
           model.setFirstName(entry.getFirstName());
           model.setLastName(entry.getLastName());
           model.setContactNumber(entry.getContactNumber());
           result.add(model);
       });
       return result;
    }

}
