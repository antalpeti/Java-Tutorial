package com.tutorialspoint.appletbasics;

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

public class AudioDemo extends Applet {
  private AudioClip clip;
  private AppletContext context;

  @Override
  public void init() {
    context = this.getAppletContext();
    String audioURL = this.getParameter("audio");
    if (audioURL == null) {
      audioURL = "com/tutorialspoint/appletbasics/sliders.au";
    }
    try {
      URL url = new URL(this.getDocumentBase(), audioURL);
      clip = context.getAudioClip(url);
    } catch (MalformedURLException e) {
      e.printStackTrace();
      context.showStatus("Could not load audio file!");
    }
  }

  @Override
  public void start() {
    if (clip != null) {
      clip.loop();
    }
  }

  @Override
  public void stop() {
    if (clip != null) {
      clip.stop();
    }
  }
}
