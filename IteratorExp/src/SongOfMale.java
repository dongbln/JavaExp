import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by TS on 03.12.15.
 */
public class SongOfMale implements SongIterator {
    private String[] bestSongs;

    public SongOfMale() {
        bestSongs = new String[3];
        bestSongs[0] = "Truly Madly Deeply";
        bestSongs[1] = "(Everything I Do) I Do It For You";
        bestSongs[2] = "When You Say Nothing At All";

    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
