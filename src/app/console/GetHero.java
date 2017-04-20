package app.console;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import character.Hero;
import exception.StockageException;
import item.Weapon;

public class GetHero implements GetData {

	@Override
	public List<Hero> GetDataFile() {
		List<Hero> h;
		try {
			h=Files.list(Paths.get("data/characters/Heroes"))
			.map(path->{
				try {
					Optional<String> premiereLigneDuFichier=Files.lines(path).findFirst();
					String premiereLigne=premiereLigneDuFichier.orElseThrow(()->new StockageException("fichier vide"));
					String[] valueTab=premiereLigne.split(";");
					return new Hero(valueTab[0], 
							valueTab[1], 
							Integer.valueOf( valueTab[2]), 
							Integer.valueOf( valueTab[3]), 
							Integer.valueOf( valueTab[4]), 
							Integer.valueOf( valueTab[5]), 
							Integer.valueOf( valueTab[6]));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new StockageException(e);
				}

				
			}).collect(Collectors.toList());
		}catch(IOException e){
			throw new StockageException(e);
		}
		return h;
	}

}
