package com.kf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kf.model.DoPerson;

@Repository("personRepository")
public interface PersonRepository extends JpaRepository<DoPerson, Long> {

}
