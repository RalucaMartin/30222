package javasmmr.zoowsome.services.factories;

public final class Constants {

	public static final Integer NR_OF_ANIMALS = 15;
	public static final Integer ZOO_DIMENSION = 50;
	public static final Integer NR_OF_CARETAKERS = 5;
	
	public static final class XML_TAGS {
		
		public static final String ANIMAL = "ANIMAL";
		public static final String DISCRIMINANT = "DISCRIMINANT";
	}

	public static final class Species {

		public static final String MAMMALS = "MAMMALS";
		public static final String REPTILES = "REPTILES";
		public static final String BIRDS = "BIRDS";
		public static final String AQUATICS = "AQUATICS";
		public static final String INSECTS = "INSECTS";
	}

	public static final class Animals {
		
		public static final class Mammals {
			
			public static final String TIGER = "TIGER";
			public static final String MONKEY = "MONKEY";
			public static final String COW = "COW";
		}

		public static final class Reptiles {
			
			public static final String LIZZARD = "LIZZARD";
			public static final String KOMODODRAGON = "KOMODO-DRAGON";
			public static final String SNAKE = "SNAKE";
		}

		public static final class Birds {
			
			public static final String VULTURE = "VULTURE";
			public static final String SWAN = "SWAN";
			public static final String OWL = "OWL";
		}

		public static final class Aquatics {
			
			public static final String SHARK = "SHARK";
			public static final String OCTOPUS = "OCTOPUS";
			public static final String FISH = "FISH";
		}

		public static final class Insects {
			
			public static final String BUTTERFLY = "BUTTERFLY";
			public static final String COCKROACH = "COCKROACH";
			public static final String SPIDER = "SPIDER";
		}
	}

	public static final class Employees {
		
		public static final class Caretakers {
			
			public static final String[] NAME = {"Mike", "Andrew", "Louise", "John", "Michael"};
			public static final String CARETAKER = "Caretaker";
			public static final String TCO_SUCCESS = "SUCCESS";
			public static final String TCO_KILLED = "KILLED";
			public static final String TCO_NO_TIME = "NO_TIME";
			
		}
	}
}
