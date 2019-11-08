package de.thro.inf.prg3.a06;

import de.thro.inf.prg3.a06.model.Joke;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public interface ICNDBApi
{
	@GET("random")
	Call<Joke> getRandomJoke();

	@GET("random")
	Call<Joke> getRandomJoke(@Query("limitTo") String[] categoriesToInclude);

	@GET("random")
	Call<List<Joke>> getRandomJokes(@Query("count") int count);

	@GET("{id}")
	Call<Joke> getJokeByID(@Path("id") int id);
}
