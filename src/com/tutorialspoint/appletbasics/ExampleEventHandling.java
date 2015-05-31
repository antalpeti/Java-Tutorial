package com.tutorialspoint.appletbasics;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ExampleEventHandling extends Applet implements MouseListener {

  StringBuffer strBuffer;

  @Override
  public void init() {
    addMouseListener(this);
    strBuffer = new StringBuffer();
    addItem("initializing the apple ");
  }

  @Override
  public void start() {
    addItem("starting the applet ");
  }

  @Override
  public void stop() {
    addItem("stopping the applet ");
  }

  @Override
  public void destroy() {
    addItem("unloading the applet");
  }

  void addItem(String word) {
    System.out.println(word);
    strBuffer.setLength(0);
    strBuffer.append(word);
    repaint();
  }

  @Override
  public void paint(Graphics g) {
    // Draw a Rectangle around the applet's display area.
    g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

    // display the string inside the rectangle.
    g.drawString(strBuffer.toString(), 10, 10);
  }

  @Override
  public void mouseEntered(MouseEvent event) {
    addItem("mouse entered! ");
  }

  @Override
  public void mouseExited(MouseEvent event) {
    addItem("mouse exited! ");
  }

  @Override
  public void mousePressed(MouseEvent event) {
    addItem("mouse pressed! ");
  }

  @Override
  public void mouseReleased(MouseEvent event) {
    addItem("mouse released! ");
  }

  @Override
  public void mouseClicked(MouseEvent event) {
    addItem("mouse clicked! ");
  }
}
