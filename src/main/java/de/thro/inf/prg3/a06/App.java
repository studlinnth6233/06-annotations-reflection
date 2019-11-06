package de.thro.inf.prg3.a06;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.thro.inf.prg3.a06.model.Joke;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public class App
{
	public static void main(String[] args)
	{
		Gson gson = new GsonBuilder().registerTypeAdapter(Joke.class, new JokeAdapter()).create();

		Joke joke = gson.fromJson("{\n" +
			"  \"type\": \"success\",\n" +
			"  \"value\": {\n" +
			"    \"id\": 467,\n" +
			"    \"joke\": \"Chuck Norris can delete the Recycling Bin.\",\n" +
			"    \"categories\": [\n" +
			"      \"nerdy\"\n" +
			"    ]\n" +
			"  }\n" +
			"}", Joke.class);

		System.out.println(joke);
	}
}
