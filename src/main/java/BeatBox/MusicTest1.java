package BeatBox;

import javax.sound.midi.*;

public class MusicTest1 {

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        } catch(MidiUnavailableException ex) {
            System.out.println("Bummer");
         }

}

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }

}
