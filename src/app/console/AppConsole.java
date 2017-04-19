package app.console;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import character.Hero;
import exception.StockageException;


public class AppConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bijour");
		try {
			List<Hero> h=Files.list(Paths.get("data/characters/Heroes"))
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
			
			h.get(0).display();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
