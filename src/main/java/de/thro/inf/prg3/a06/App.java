package de.thro.inf.prg3.a06;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.thro.inf.prg3.a06.model.Joke;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public class App
{
	public static void main(String[] args) throws IOException
	{
		Gson gson = new GsonBuilder().registerTypeAdapter(Joke.class, new JokeAdapter()).create();

		Retrofit retrofit = new Retrofit.Builder()
			.baseUrl("http://api.icndb.com/jokes/random/")
			.addConverterFactory(GsonConverterFactory.create(gson))
			.build();

		ICNDBApi icndb = retrofit.create(ICNDBApi.class);

		Call<Joke> jokeCall = icndb.getRandomJoke();
		Joke joke = jokeCall.execute().body();

		System.out.println(joke.getContent());
	}
}
