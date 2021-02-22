package com.cts.flight.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.flight.entity.AirlineInfo;

@Repository
public class AirlineInfoDaoImpl {

	@PersistenceContext
	private EntityManager em;

	// list all airlines
	@Transactional
	public List<AirlineInfo> listAllAirlines() {
		return em.createQuery("from AirlineInfo").getResultList();
	}
	
	
	@Transactional
	public int countRecords() {
		return em.createQuery("select count(*) from AirlineInfo").getMaxResults();
	}
	
	@Transactional
	public AirlineInfo save(AirlineInfo ai) {
		em.persist(ai);
		return ai;
	}
	
	
	
	@Transactional
	public AirlineInfo findbyId(int id) {
		return em.find(AirlineInfo.class, id);
	}
	
	

}
