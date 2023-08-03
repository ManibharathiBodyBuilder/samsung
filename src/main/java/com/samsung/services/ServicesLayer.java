package com.samsung.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.samsung.dao.Dto;
import com.samsung.model.ModelLayer;

@Component
public interface ServicesLayer {

	public List<ModelLayer> GetAll();

	public ModelLayer FindTheId(Long empId);

	public String DelectById(Long empId);

	public Dto UpdateData(ModelLayer modelLayer);

	public Dto CreateData(ModelLayer modelLayer);

}
