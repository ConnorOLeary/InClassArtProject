package art.controller;

import java.awt.Component;
import java.io.IOException;

import art.view.*;

public class ArtController {
	private ArtFrame canvas;
	public ArtController() {
		canvas = new ArtFrame(this);
	}

	public void start() {
		
	}

	public Component getFrame() {
		return null;
	}

	public void handleErrors(IOException error) {
		
	}
}
