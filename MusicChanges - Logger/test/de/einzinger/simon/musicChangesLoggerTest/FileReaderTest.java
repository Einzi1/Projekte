package de.einzinger.simon.musicChangesLoggerTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.io.FileReader;

import org.junit.Test;

import mockit.Injectable;

public class FileReaderTest {

	@Test
	public void test(@Injectable FileReader reader) {
		assertThat(reader, is(notNullValue()));
	}

}
