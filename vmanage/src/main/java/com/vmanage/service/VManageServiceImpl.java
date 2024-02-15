package com.vmanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vmanage.entity.VManageEntity;
import com.vmanage.repository.VManageRepo;

@Service
public class VManageServiceImpl implements VManageService {

	@Autowired
	private VManageRepo repo;
	
	public VManageServiceImpl() {
		System.out.println("VManageServiceImpl");
	}
	
	@Override
	public boolean saveAndValidate(VManageEntity entity) {
		System.out.println("saveAndValidateCreated");
		System.out.println("repo is called in service layer");
		this.repo.save(entity);
		return false;
	}

}
