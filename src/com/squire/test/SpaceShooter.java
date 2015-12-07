package com.squire.test;

import com.squire.api.SquireGame;
import com.squire.test.states.StartState;

@SuppressWarnings("serial")
public class SpaceShooter extends SquireGame {

	public SpaceShooter(String title, int canvasWidth, int canvasHeight) {
		super(title, canvasWidth, canvasHeight);
	}

	@Override
	public void init() {
		getEngine().getStateHandler().setState(new StartState("start_state"));
	}

}
