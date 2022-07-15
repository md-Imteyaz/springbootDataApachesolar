package com.SpringbootApacheSolar.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringbootApacheSolar.Model.Workers;
import com.SpringbootApacheSolar.repo.WorkerRepo;

@RestController
public class WorkerController {
	@Autowired
	private WorkerRepo workerrepo;
	
	public void addworker() {
		List<Workers> al=new ArrayList<>();
		
		al.add(new Workers(111,"basali","kolkata"));
		al.add(new Workers(211,"heryy","london"));
		al.add(new Workers(311,"wasi","jharkhand"));
		al.add(new Workers(411,"omer","madina"));
		workerrepo.saveAll(al);
	}
	@GetMapping("/getAll")
	public Iterable<Workers> getWorkers(){
		return workerrepo.findAll();
		
	}
	@GetMapping("/getWorkersByName/{name}")

	public Workers getWorkersByName(@PathVariable String name) {
		return workerrepo.findByName(name) ;
		
	}

}
