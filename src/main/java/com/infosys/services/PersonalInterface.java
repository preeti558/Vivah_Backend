package com.infosys.services;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.infosys.entities.Personal;
import com.infosys.entities.Registration;


public interface PersonalInterface {
	
    Personal savePersonal(Personal personal);
    Personal createPersonal(Registration registration, MultipartFile file, String bloodGroup) throws IOException;
    Personal getPersonalById(Integer id);
    List<Personal> getAllPersonal();
    Personal updatePersonalInfo(Integer id, MultipartFile file, String bloodGroup, Registration registration)  throws IOException;
    void deletePersonal(Integer id);
}