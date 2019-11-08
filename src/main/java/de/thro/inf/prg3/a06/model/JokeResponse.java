package de.thro.inf.prg3.a06.model;

/**
 * Wrapper class for the Response of a joke
 * This is used to convert between Json and Joke
 */
public class JokeResponse
{
	private String type;
	private Joke value;

	/**
	 * GETTER : value
	 *
	 * @return The actual joke of the response
	 */
	public Joke getJoke()
	{
		return this.value;
	}
}
