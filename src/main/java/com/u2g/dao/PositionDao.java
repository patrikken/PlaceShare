package com.u2g.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.u2g.entities.Position;

public interface PositionDao extends JpaRepository<Position, Long> {

}
