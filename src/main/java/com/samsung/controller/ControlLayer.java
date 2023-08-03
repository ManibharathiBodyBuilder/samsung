package com.samsung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samsung.dao.Dto;
import com.samsung.model.ModelLayer;
import com.samsung.services.ServicesLayer;

@RestController
public class ControlLayer {
	
	@Autowired
	ServicesLayer servicesLayer;

	@GetMapping("/GetData")
	public ResponseEntity<List<ModelLayer>> GetAllData() {
		List<ModelLayer> listItems = servicesLayer.GetAll();
		return new ResponseEntity<List<ModelLayer>>(listItems, HttpStatus.OK);
		}

	@GetMapping("/GetData/{ID}")
	public ResponseEntity<ModelLayer> GetByID(@PathVariable("ID") Long EmpId) {
		ModelLayer model2 = servicesLayer.FindTheId(EmpId);
		return new ResponseEntity<ModelLayer>(model2, HttpStatus.FOUND);
	}
	
	@DeleteMapping("/GetData/{DeleteID}")
	public ResponseEntity<String>DestoryID(@PathVariable("DeleteID")Long EmpId){
		servicesLayer.DelectById(EmpId);
		return new ResponseEntity<String>("Deleted_Successfully", HttpStatus.GONE);
	}

	@PutMapping("/GetData")
	public ResponseEntity<Dto> DataModify(@RequestBody ModelLayer modelLayer) {
		Dto model3 = servicesLayer.UpdateData(modelLayer);
		return new ResponseEntity<Dto>(model3, HttpStatus.ACCEPTED);
	}

	@PostMapping("/GetData")
	public ResponseEntity<Dto> NewRecordCreation(@RequestBody ModelLayer modelLayer) {
		Dto model4 = servicesLayer.CreateData(modelLayer);
		return new ResponseEntity<Dto>(model4, HttpStatus.CREATED);
	}

}
