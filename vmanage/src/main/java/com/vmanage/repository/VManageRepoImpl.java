package com.vmanage.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vmanage.entity.VManageEntity;

@Repository
public class VManageRepoImpl implements VManageRepo {
	
	
//	@Autowired
//	EntityManagerFactory factory;

	@Override
	public void save(VManageEntity entity) {
		
//		EntityManager manager=factory.createEntityManager();
//		EntityTransaction entityTransaction =manager.getTransaction();
		System.out.println("VManage Deatils are:"+entity);
		
	}

}
