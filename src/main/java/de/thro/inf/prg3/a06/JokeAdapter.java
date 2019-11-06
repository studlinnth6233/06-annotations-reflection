package de.thro.inf.prg3.a06;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.thro.inf.prg3.a06.model.Joke;
import de.thro.inf.prg3.a06.model.JokeResponse;

import java.io.IOException;

public class JokeAdapter extends TypeAdapter<Joke>
{
	@Override
	public void write(JsonWriter out, Joke value) throws IOException { }

	@Override
	public Joke read(JsonReader in) throws IOException
	{
		return ((JokeResponse) new Gson().fromJson(in, JokeResponse.class)).getJoke();
	}
}
