package com.suffolk.repository;

import java.util.List;

import com.suffolk.model.ComputerOwner;

public interface ComputerRepositoryExtended {
	public List<ComputerOwner> findByUserCid(Long cid);
	public List<ComputerOwner> findByComputerSn(String sn);


}
