package app.console;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import exception.StockageException;
import item.Weapon;

public class GetWeapon implements GetData {

	@Override
	public List<Weapon> GetDataFile() {
		List<Weapon> w=null;
		try {
			w=Files.list(Paths.get("data/weapons"))
			.map(path->{
				try {
					Optional<String> premiereLigneDuFichier=Files.lines(path).findFirst();
					String premiereLigne=premiereLigneDuFichier.orElseThrow(()->new StockageException("fichier vide"));
					String[] valueTab=premiereLigne.split(";");
					return new Weapon(valueTab[0], 
							Integer.valueOf( valueTab[1]), 
							valueTab[2]);
							
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new StockageException(e);
				}

				
			}).collect(Collectors.toList());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return w;
	}

}
