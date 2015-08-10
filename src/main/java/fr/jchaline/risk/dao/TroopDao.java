package fr.jchaline.risk.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.jchaline.risk.domain.Troop;

public interface TroopDao extends JpaRepository<Troop, Long> {
	Page<Troop> findAll(Pageable pageable);
}
