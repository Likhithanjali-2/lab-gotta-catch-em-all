package model;

public class Mew extends Pokemon{
	String characteristics, type,evolution,baseExp;
	public Mew(String pokemonName, int pokemonNumber) {
		super.pokemonName = "Mew";
		super.pokemonNumber = 151;
		this.characteristics = "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
		this.type = "PSYCHIC";
		this.evolution = "   NONE  ";
		this.baseExp = "64";	
	}
	public String pokemonName(){
		return this.pokemonName;
	}
	public int pokemonNumber(){
		return this.pokemonNumber;
	}
	public String characteristics(){
		return this.characteristics;
	}
	public String type(){
		return this.type;
	}
	public String evolution(){
		return this.evolution;
	}
	public String baseExp(){
		return this.baseExp;
	}
}

//PROGRESSION - 5
//Go to JAVA Resouces - src/model and create a child class called Mew inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Mew must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class.
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Mew
//pokemonNumber = 151
//characteristics = "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine."
//type = "PSYCHIC"
//evolution = "NONE"
//baseExp = "64" 
