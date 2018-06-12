package ex3;

import ex3.model.Animal;
import ex3.model.TypeAlimentation;
import ex3.model.TypeAnimal;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.HERBIVORE)));
		zoo.addAnimal(new Animal("Zèbre", new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.HERBIVORE)));
		zoo.addAnimal(new Animal("Lion", new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.HERBIVORE)));
		zoo.addAnimal(new Animal("Panthère", new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.CARNIVORE)));
		zoo.addAnimal(new Animal("Requin blanc", new HabitatPreferer(TypeAnimal.POISSON, TypeAlimentation.HERBIVORE)));
		zoo.addAnimal(new Animal("Truite dorée", new HabitatPreferer(TypeAnimal.POISSON, TypeAlimentation.HERBIVORE)));
		zoo.addAnimal(new Animal("Boa constrictor", new HabitatPreferer(TypeAnimal.SERPENT, TypeAlimentation.CARNIVORE)));
		zoo.addAnimal(new Animal("Python", new HabitatPreferer(TypeAnimal.SERPENT, TypeAlimentation.CARNIVORE)));
		
		zoo.afficherListeAnimaux();
	}

}
