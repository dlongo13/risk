package fr.jchaline.risk.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.jchaline.risk.dao.PlayerDao;
import fr.jchaline.risk.dao.RoadDao;
import fr.jchaline.risk.dao.TerritoryDao;
import fr.jchaline.risk.dao.TroopDao;
import fr.jchaline.risk.domain.Player;
import fr.jchaline.risk.domain.Road;
import fr.jchaline.risk.domain.Territory;
import fr.jchaline.risk.domain.Troop;

/**
 * TODO : generate test data in dev mode only
 * @author jeremy
 *
 */
@Service
public class FactoryService {

	@Autowired
	private PlayerDao playerDao;
	
	@Autowired
	private TerritoryDao territoryDao;

	@Autowired
	private RoadDao roadDao;

	@Autowired
	private TroopDao troopDao;

	public void generateData() {
		
		List<Territory> territoryList = Arrays.asList(new Territory("Espagne"), new Territory("Angleterre"), 
				new Territory("France"), new Territory("USA"), new Territory("Cameroun"),
				new Territory("Australie"), new Territory("Japon"), new Territory("Argentine")
		);
		territoryList.stream().forEach(territoryDao::save);
		Map<String, Territory> mapTerritory = territoryList.stream().collect(Collectors.toMap(Territory::getName, Function.identity()));
		
		List<Road> roadList = Arrays.asList(
			new Road(mapTerritory.get("France"), mapTerritory.get("Espagne")),
			new Road(mapTerritory.get("France"), mapTerritory.get("Angleterre")),
			new Road(mapTerritory.get("USA"), mapTerritory.get("Angleterre")),
			new Road(mapTerritory.get("USA"), mapTerritory.get("Japon")),
			new Road(mapTerritory.get("Australie"), mapTerritory.get("Japon")),
			new Road(mapTerritory.get("Australie"), mapTerritory.get("Cameroun")),
			new Road(mapTerritory.get("France"), mapTerritory.get("USA")),
			new Road(mapTerritory.get("Argentine"), mapTerritory.get("USA")),
			new Road(mapTerritory.get("Cameroun"), mapTerritory.get("Espagne"))
		);
		roadList.stream().forEach(roadDao::save);
		
		List<Player> playerList = Arrays.asList(new Player("John"), new Player("Jack"));
		playerList.stream().forEach(playerDao::save);
		Map<String, Player> mapPlayer = playerList.stream().collect(Collectors.toMap(Player::getName, Function.identity()));
		
		List<Troop> troopList = Arrays.asList(new Troop(mapPlayer.get("John"), mapTerritory.get("France")));
		troopList.stream().forEach(troopDao::save);
	}
}
