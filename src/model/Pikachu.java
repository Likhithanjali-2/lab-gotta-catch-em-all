package model;

public class Pikachu extends Pokemon{
	String characteristics, type,evolution,baseExp;
	public Pikachu(String pokemonName, int pokemonNumber) {
		super.pokemonName = "Pikachu";
		super.pokemonNumber = 25;
		this.characteristics = "Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.";
		this.type = "ELECTRIC";
		this.evolution = "RAICHU";
		this.baseExp = "112"; 
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
/*
 * PROGRESSION - 6 
 * Go to JAVA Resouces - src/model and create a child class
 * called Pikachu inside the model package with the following arguments 
 * String characteristics 
 * String type 
 * String evolution 
 * String baseExp
 * 
 * Pikachu must extend the Pokemon class
 * Generate appropriate getters and setters 
 * Generate a six argument constructor with the following arguments
 * (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and
 * pokemonName and pokemonNumber should refer to the parent constructor in the
 * Pokemon class.
 * 
 * pokemonName = Pikachu 
 * pokemonNumber = 25 
 * characteristics = Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise
 * mascot." 
 * type = "ELECTRIC" 
 * evolution = "RAICHU" 
 * baseExp = "112"
 */
