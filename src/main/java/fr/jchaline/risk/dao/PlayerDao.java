package fr.jchaline.risk.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.jchaline.risk.domain.Player;

public interface PlayerDao extends JpaRepository<Player, Long> {
	
	Page<Player> findAll(Pageable pageable);
	
}
