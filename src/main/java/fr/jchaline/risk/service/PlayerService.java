package fr.jchaline.risk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.jchaline.risk.dao.PlayerDao;

@Transactional(readOnly = true)
@Service
public class PlayerService {

	@Autowired
	private PlayerDao dao;
	
}
