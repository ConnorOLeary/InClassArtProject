package art.view;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import art.controller.ArtController;

import java.util.ArrayList;
import javax.imageio.ImageIO;

public class ShapeCanvas extends JPanel{

	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> plygonList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Rectangle> rectangleList;
	private ArtController app;
	
	private BufferedImage canvasImage;
	
	public ShapeCanvas(ArtController app) {
		
	}
}
