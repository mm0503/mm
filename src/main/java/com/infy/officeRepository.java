package com.infy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface officeRepository extends CrudRepository<Office, Integer> {

}
