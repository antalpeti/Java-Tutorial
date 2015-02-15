package tutorialspoint.modifiertypes;

/**
 * Example of public access control.
 */
class StreamingAudioPlayer extends AudioPlayer {
  @Override
  protected boolean openSpeaker(Speaker sp) {
    return super.openSpeaker(sp);
  }

  public static void main(String[] args) {

  }
}
