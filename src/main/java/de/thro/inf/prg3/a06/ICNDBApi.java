package de.thro.inf.prg3.a06;

import de.thro.inf.prg3.a06.model.Joke;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public interface ICNDBApi
{
	@GET("random") Call<Joke> getRandomJoke();
	Call<Joke> getRandomJoke(String[] categoriesToInclude);

	Call<List<Joke>> getRandomJokes(int count);

	Call<Joke> getJokeByID(int id);
}
