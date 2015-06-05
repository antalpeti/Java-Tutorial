package com.tutorialspoint.appletbasics;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageDemo extends Applet {
  private Image image;
  private AppletContext context;

  @Override
  public void init() {
    context = this.getAppletContext();
    String imageURL = this.getParameter("image");
    if (imageURL == null) {
      imageURL = "com/tutorialspoint/appletbasics/java.png";
    }
    try {
      URL url = new URL(this.getDocumentBase(), imageURL);
      image = context.getImage(url);
    } catch (MalformedURLException e) {
      e.printStackTrace();
      // Display in browser status bar
      context.showStatus("Could not load image!");
    }
  }

  @Override
  public void paint(Graphics g) {
    context.showStatus("Displaying image");
    g.drawImage(image, 0, 0, 486, 630, null);
    g.drawString("www.javalicense.com", 10, 600);
  }
}
