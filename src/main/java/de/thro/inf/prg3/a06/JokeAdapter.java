package de.thro.inf.prg3.a06;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.thro.inf.prg3.a06.model.Joke;
import de.thro.inf.prg3.a06.model.JokeResponse;

import java.io.IOException;

/**
 * Json TypeAdapter for Joke
 * This is used for conversion between Json and Joke
 */
public class JokeAdapter extends TypeAdapter<Joke>
{
	/**
	 * Converts joke into Json format
	 *
	 * @param out   JsonWriter to convert to
	 * @param value Joke to convert
	 */
	@Override
	public void write(JsonWriter out, Joke value) throws IOException { }

	/**
	 * Converts from Json format into a joke
	 *
	 * @param in JsonReader to convert from
	 *
	 * @return Converted joke
	 */
	@Override
	public Joke read(JsonReader in) throws IOException
	{
		return ((JokeResponse) new Gson().fromJson(in, JokeResponse.class)).getJoke();
	}
}
