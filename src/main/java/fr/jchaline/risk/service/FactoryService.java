package fr.jchaline.risk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.jchaline.risk.dao.PlayerDao;

@Service
public class FactoryService {

	@Autowired
	private PlayerDao staffDao;

	public void generateData() {
		
	}
}
