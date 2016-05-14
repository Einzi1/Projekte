package de.einzinger.simon.musicChangesLoggerTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.io.FileReader;
import java.util.logging.Handler;
import java.util.logging.Logger;

import org.junit.Test;

import mockit.Injectable;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.internal.expectations.TestOnlyPhase;

public class FileReaderTest {

	@Test
	public void test(@Injectable FileReader reader) {
		assertThat(reader, is(notNullValue()));
	}
}