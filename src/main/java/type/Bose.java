package type;

import interf.Song;
import interf.Speakrs;
import org.springframework.stereotype.Component;

@Component
public class Bose implements Speakrs {

      @Override
    public String sound(Song song) {
        return "the music play" + song.getTitle() + " interpret is play "+ song.getTitle();
    }


}
