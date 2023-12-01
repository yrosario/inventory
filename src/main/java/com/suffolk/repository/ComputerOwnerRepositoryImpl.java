package com.suffolk.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

import jakarta.persistence.EntityManager;
import com.suffolk.model.ComputerOwner;

@Repository
public class ComputerOwnerRepositoryImpl implements ComputerRepositoryExtended{
	
	private EntityManager entityManager;
	
	private Logger logger = LoggerFactory.getLogger(ComputerOwnerRepository.class);
	
	public ComputerOwnerRepositoryImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@SuppressWarnings("unchecked")
	public List<ComputerOwner> findByUserCid(Long cid) {
		List<ComputerOwner> result = (List<ComputerOwner>) entityManager.createQuery("FROM ComputerOwner o WHERE o.user.cId = :c_id")
				.setParameter("c_id", cid).getResultList();
		
		this.logger.info("VALUE RETURNED " + result.toString());
		
		return result;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<ComputerOwner> findByComputerSn(String sn) {
		List<ComputerOwner>  result= (List<ComputerOwner>) this.entityManager.createQuery("From ComputerOwner o WHERE o.computer.sn = :sn")
				.setParameter("sn", sn)
				.getResultList();
		return result;
	}
	
}
