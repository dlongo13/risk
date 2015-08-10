package fr.jchaline.risk.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.jchaline.risk.domain.Road;

public interface RoadDao extends JpaRepository<Road, Long> {
	
	Page<Road> findAll(Pageable pageable);
	
}
