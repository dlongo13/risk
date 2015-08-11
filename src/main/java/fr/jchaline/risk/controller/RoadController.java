package fr.jchaline.risk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.jchaline.risk.dao.RoadDao;
import fr.jchaline.risk.domain.Road;

@RestController
@RequestMapping(value = "/road", method = RequestMethod.GET)
public class RoadController {
	
	@Autowired
	private RoadDao dao;
	
	@RequestMapping("/list")
	public List<Road> list() {
		return dao.findAll();
	}

}
