package com.samsung.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samsung.dao.DaoLayer;
import com.samsung.dao.Dto;
import com.samsung.exception.model.EmptyInputException;
import com.samsung.model.ModelLayer;

@Service
public class ServicesImpl implements ServicesLayer {

	@Autowired
	// ServicesImpl servicesImpl;
	private DaoLayer daoLayer;

	public List<ModelLayer>GetAll() {		
		List<ModelLayer> model1 =  daoLayer.findAll();
		if (model1.isEmpty()) {
			throw new EmptyInputException("The Field is empty, check your input", "601");
		}
		return model1;		
	}

	public ModelLayer FindTheId(Long EmpId) {
		ModelLayer model2 = daoLayer.findById(EmpId).get();
		return model2;
	}

	public String DelectById(Long EmpId) {
		daoLayer.deleteById(EmpId);
		return "Deleted_Successfully";
	}

	public Dto UpdateData(ModelLayer modelLayer) {
		Dto dto = new Dto();	
		if (modelLayer.getEmpName().isEmpty() && modelLayer.getEmpPhone().isEmpty() && modelLayer.getEmpPlace().isEmpty()) {
			throw new EmptyInputException("The Field is empty, check your input", "605");
		}
		
		ModelLayer model3 = daoLayer.save(modelLayer);
		dto.setEmpName(model3.getEmpName());
		dto.setEmpPhone(model3.getEmpPhone());
		dto.setEmpPlace(model3.getEmpPlace());
		dto.setEmpWork(model3.getEmpWork());
		dto.setEmpDepartment(model3.getEmpDepartment());
		return dto;
	}

	public Dto CreateData(ModelLayer modelLayer) {
		Dto dto = new Dto();
		ModelLayer model4 = daoLayer.save(modelLayer);
		dto.setEmpName(model4.getEmpName());
		dto.setEmpPhone(model4.getEmpPhone());
		dto.setEmpPlace(model4.getEmpPlace());
		dto.setEmpWork(model4.getEmpWork());
		dto.setEmpDepartment(model4.getEmpDepartment());

		/*if (model4.getEmpName().isEmpty() && dto.getEmpPhone().isEmpty() && dto.getEmpPlace().isEmpty()
				&& model4.getEmpSalary() == 0) {
			throw new EmptyInputException("The Field is empty, check your input", "606");
		}*/
		return dto;
	}


}
