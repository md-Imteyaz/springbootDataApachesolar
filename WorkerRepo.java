package com.SpringbootApacheSolar.repo;

import org.springframework.data.repository.CrudRepository;

import com.SpringbootApacheSolar.Model.Workers;

public interface WorkerRepo extends solrCrudRepository<Workers,Long> {

	Workers findByName(String name);

}
