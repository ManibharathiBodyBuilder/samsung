package com.samsung.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samsung.model.ModelLayer;

public interface DaoLayer extends JpaRepository<ModelLayer,Long> {

}
