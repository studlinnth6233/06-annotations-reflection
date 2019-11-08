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
	/**
	 * Send HTTP-GET Request to the Server to receive a random joke
	 *
	 * @return Call including the received joke
	 */
	@GET("random")
	Call<Joke> getRandomJoke();

	/**
	 * Send HTTP-GET Request to the Server to receive a random joke limited by categories
	 *
	 * @param categoriesToInclude Array of categories to limit the request by
	 *
	 * @return Call including the received joke
	 */
	@GET("random")
	Call<Joke> getRandomJoke(@Query("limitTo") String[] categoriesToInclude);

	/**
	 * Send HTTP-GET Request to the Server to receive x amount of random jokes
	 *
	 * @param count Amount of random jokes to receive
	 *
	 * @return Call including List of received jokes
	 */
	@GET("random")
	Call<List<Joke>> getRandomJokes(@Query("count") int count);

	/**
	 * Send HTTP-GET Request to the Server to receive joke by its ID
	 *
	 * @param id ID of the joke to receive
	 *
	 * @return Call including the received joke
	 */
	@GET("{id}")
	Call<Joke> getJokeByID(@Path("id") int id);
}
