import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by TS on 03.12.15.
 */
public class SongOfMale20  implements SongIterator{
    private Map<String, String> bestSongs;

    public SongOfMale20() {
        bestSongs = new HashMap<String, String>();
        bestSongs.put("JUSTIN BIEBER","WHAT DO YOU MEAN?");
        bestSongs.put("John Legend","ALL OF ME" );
        bestSongs.put("Sam Smith","STAY WITH ME");
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
