package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Bulbasaur bul = new Bulbasaur(null, 0);
	Charizard cha = new Charizard(null, 0);
	Dragonite dra = new Dragonite(null, 0);
	Mew mew = new Mew(null, 0);
	Pikachu pik = new Pikachu(null, 0);
	
	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			  
			msg = "<center>" + bul.pokemonName() + "  #" + bul.pokemonNumber() ;
			request.setAttribute("message1",msg);
			request.setAttribute("character1",bul.characteristics());
			request.setAttribute("type1",bul.type());
			request.setAttribute("evolution1", bul.evolution());
			request.setAttribute("baseExp1", bul.baseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			
			
			msg = "<center>" + cha.pokemonName() + "  #" + cha.pokemonNumber() ;
			request.setAttribute("message2",msg);
			request.setAttribute("character2", cha.characteristics());
			request.setAttribute("type2",cha.type());
			request.setAttribute("evolution2", cha.evolution());
			request.setAttribute("baseExp2", cha.baseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	

			msg = "<center>" + dra.pokemonName() + "  #" + dra.pokemonNumber() ;
			request.setAttribute("message3",msg);
			request.setAttribute("character3", dra.characteristics());
			request.setAttribute("type3",dra.type());
			request.setAttribute("evolution3",dra.evolution());
			request.setAttribute("baseExp3",dra.baseExp() );
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			
			msg = "<center>" + mew.pokemonName() + "  #" + mew.pokemonNumber() ;
			request.setAttribute("message4",msg);
			request.setAttribute("character4",mew.characteristics());
			request.setAttribute("type4",mew.type());
			request.setAttribute("evolution4", mew.evolution());
			request.setAttribute("baseExp4",mew.baseExp() );
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
				  
			msg = "<center>" + pik.pokemonName() + "  #" + pik.pokemonNumber() ;
			request.setAttribute("message5",msg);
			request.setAttribute("character5", pik.characteristics());
			request.setAttribute("type5",pik.type());
			request.setAttribute("evolution5", pik.evolution());
			request.setAttribute("baseExp5",pik.baseExp());
		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
