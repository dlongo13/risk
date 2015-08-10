package fr.jchaline.risk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.jchaline.risk.dao.RoadDao;

@Service
public class RoadService {

	@Autowired
	private RoadDao dao;
}
