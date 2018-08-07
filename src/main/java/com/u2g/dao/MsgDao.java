package com.u2g.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.u2g.entities.Msg;

public interface MsgDao extends JpaRepository<Msg, Long> {

}
