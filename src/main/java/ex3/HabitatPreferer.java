package ex3;

import ex3.model.TypeAlimentation;
import ex3.model.TypeAnimal;

public class HabitatPreferer {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((typeAlimentation == null) ? 0 : typeAlimentation.hashCode());
		result = prime * result + ((typeAnimal == null) ? 0 : typeAnimal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof HabitatPreferer)) {
			HabitatPreferer other = (HabitatPreferer) obj;
			if (typeAlimentation != other.typeAlimentation)
				return false;
			if (typeAnimal != other.typeAnimal)
				return false;
			return true;
		} else
			return false;
	}

	private TypeAnimal typeAnimal;
	private TypeAlimentation typeAlimentation;

	public HabitatPreferer(TypeAnimal typeAnimal, TypeAlimentation typeAlimentation) {
		this.typeAnimal = typeAnimal;
		this.typeAlimentation = typeAlimentation;
	}

}
