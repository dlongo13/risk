package fr.jchaline.risk.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.jchaline.risk.domain.Territory;

public interface TerritoryDao extends JpaRepository<Territory, Long> {
	
	Page<Territory> findAll(Pageable pageable);

}
