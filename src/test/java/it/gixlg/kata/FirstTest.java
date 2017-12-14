/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package it.gixlg.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Before;
import org.junit.jupiter.api.*;


class FirstTest {

	Game game;

	@BeforeEach
	void init(){
		game = GameFactory.createGame();
	}

	@Test
	void myFirstTest() {
		assertEquals("1", game.say(1));
	}

	@Test
	void mySecondTest() {
		assertEquals("2", game.say(2));
	}

	@Test
	void my3Test() {
		assertEquals("11", game.say(11));
	}

	@Test
	void my4Test() {
		assertEquals("Fizz", game.say(3));
	}

	@Test
	void my5Test() {
		assertEquals("Fizz", game.say(6));
	}

	@Test
	void my6Test() {
		assertEquals("Buzz", game.say(5));
	}

}
