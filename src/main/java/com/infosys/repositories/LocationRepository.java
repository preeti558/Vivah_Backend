package com.infosys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.entities.Location;

public interface LocationRepository extends JpaRepository<Location,Integer>{

}