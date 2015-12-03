import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by TS on 03.12.15.
 */
public class SongOfFemale implements  SongIterator {
    private List<String> bestSong ;

    public SongOfFemale() {
        bestSong = new ArrayList<String>();
        bestSong.add("I swear");
        bestSong.add("Wawa one");
        bestSong.add("To love you more");
    }

    @Override
    public Iterator createIterator() {
        return bestSong.iterator();
    }
}
