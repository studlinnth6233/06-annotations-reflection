package de.thro.inf.prg3.a06.model;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Peter Kurfer
 * Created on 11/9/17.
 */
public final class Joke
{
	@SerializedName("id")         int number;
	@SerializedName("joke")       String content;
	@SerializedName("categories") String[] rubrics;

	/**
	 * GETTER : number
	 *
	 * @return ID of the joke
	 */
	public int getNumber()
	{
		return number;
	}

	/**
	 * GETTER : content
	 *
	 * @return Content of the joke
	 */
	public String getContent()
	{
		return content;
	}

	/**
	 * GETTER : rubrics
	 *
	 * @return Categories of the joke
	 */
	public String[] getRubrics()
	{
		return rubrics;
	}

	/**
	 * Compares to jokes by their id, content and categories
	 *
	 * @param o Joke to compare to
	 *
	 * @return True / False whether jokes are equal or not
	 */
	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;

		if (!(o instanceof Joke)) return false;

		Joke joke1 = (Joke) o;

		return new EqualsBuilder()
			.append(getNumber(), joke1.getNumber())
			.append(getContent(), joke1.getContent())
			.append(rubrics, joke1.rubrics)
			.isEquals();
	}

	/**
	 * Calculate the hash code for the joke
	 *
	 * @return HashCode for the joke
	 */
	@Override
	public int hashCode()
	{
		return new HashCodeBuilder(17, 37)
			.append(getNumber())
			.append(getContent())
			.append(rubrics)
			.toHashCode();
	}

	/**
	 * Converts the joke into a readable String format
	 *
	 * @return String representation of the joke
	 */
	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
			.append("number", number)
			.append("content", content)
			.append("rubrics", rubrics)
			.toString();
	}
}
