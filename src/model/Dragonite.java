package model;

public class Dragonite extends Pokemon{
	String characteristics, type,evolution,baseExp;
	public Dragonite(String pokemonName, int pokemonNumber) {
		super.pokemonName = "Dragonite";
		super.pokemonNumber = 149;
		this.characteristics = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.";
		this.type = "DRAGON";
		this.evolution = "DRATINI";
		this.baseExp = "270";
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

//PROGRESSION - 4
//Go to JAVA Resouces - src/model and create a child class called Dragonite inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Dragonite must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Dragonite
//pokemonNumber = 149
//characteristics = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism."
//type = "DRAGON"
//evolution = "DRATINI"
//baseExp = "270" 
