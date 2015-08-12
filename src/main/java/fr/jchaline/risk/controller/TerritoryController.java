package fr.jchaline.risk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.jchaline.risk.dao.TerritoryDao;
import fr.jchaline.risk.domain.Territory;

@RestController
@RequestMapping(value = "/territory", method = RequestMethod.GET, produces=MimeTypeUtils.APPLICATION_JSON_VALUE)
public class TerritoryController {
	
	@Autowired
	private TerritoryDao dao;
	
	@RequestMapping("/list")
	public List<Territory> list() {
		return dao.findAll();
	}
	
}
