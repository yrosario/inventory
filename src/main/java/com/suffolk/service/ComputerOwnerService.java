package com.suffolk.service;

import java.util.List;

import com.suffolk.model.ComputerOwner;

public interface ComputerOwnerService {
	public List<ComputerOwner> findByUserCid(Long cid);
	public List<ComputerOwner> findByComputerSn(String sn);
	public void delete(Long cid, String sn);
}
