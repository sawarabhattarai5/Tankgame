
package tank;


public class Game_Start {
    public static void main( String[] args ) {
        
    Sound_Effect play_sound = new Sound_Effect();
    play_sound.play_continously("resource/Music.mid");
    new Frame( new Control_Panel() );
  }
}
