package BeatBox;
import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    } // close main

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, 102, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 20, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);
            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 20, 100);
            MidiEvent noteOff = new MidiEvent(b, 12);
            track.add(noteOff);

            ShortMessage second = new ShortMessage();
            second.setMessage(192, 1, 15, 0);
            MidiEvent changeInstrument2 = new MidiEvent(second, 13);
            track.add(changeInstrument2);

            ShortMessage c = new ShortMessage();
            c.setMessage(144, 1, 53, 50);
            MidiEvent noteOnC = new MidiEvent(c, 13);
            track.add(noteOnC);
            ShortMessage d = new ShortMessage();
            d.setMessage(128, 1, 53, 50);
            MidiEvent noteOffD = new MidiEvent(d, 21);
            track.add(noteOffD);

            ShortMessage e = new ShortMessage();
            e.setMessage(144, 9, 62, 100);
            MidiEvent noteOnE = new MidiEvent(e, 19);
            track.add(noteOnE);
            ShortMessage f = new ShortMessage();
            f.setMessage(128, 9, 62, 100);
            MidiEvent noteOffF = new MidiEvent(f, 30);
            track.add(noteOffF);

            player.setSequence(seq);
            player.start();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    } // close play

} // close class