package com.u2g.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.u2g.dao.PositionDao;
import com.u2g.entities.Position;
import com.u2g.service.PositionService;

@Service
public class PositionServiceImpl implements PositionService{
	@Autowired
	private PositionDao positionRepository;
	
	@Override
	public void createPosition(Position position) {
		positionRepository.save(position);
	}

}
