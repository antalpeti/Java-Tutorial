package com.tutorialspoint.appletbasics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class CheckerApplet extends Applet {
  int squareSize = 50;// initialized to default size

  @Override
  public void init() {
    String squareSizeParam = getParameter("squareSize");
    parseSquareSize(squareSizeParam);
    String colorParam = getParameter("color");
    Color fg = parseColor(colorParam);
    setBackground(Color.black);
    setForeground(fg);
  }

  private void parseSquareSize(String param) {
    if (param == null) {
      return;
    }
    try {
      squareSize = Integer.parseInt(param);
    } catch (Exception e) {
      // Let default value remain
    }
  }

  private Color parseColor(String param) {
    if (param == null) {
      return null;
    }
    Color color = null;
    try {
      switch (param) {
        case "blue":
          color = Color.BLUE;
          break;
        case "green":
          color = Color.GREEN;
          break;
        case "red":
          color = Color.RED;
          break;
        case "yellow":
          color = Color.YELLOW;
          break;
        default:
          break;
      }
    } catch (Exception e) {
      // Give back null
    }
    return color;
  }

  @Override
  public void paint(Graphics g) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (j % 2 == 0 && i % 2 == 0) {
          g.drawRect(squareSize * i, squareSize * j, squareSize, squareSize);
        }
      }
    }
  }
}
