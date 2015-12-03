import java.util.Iterator;

/**
 * Created by TS on 03.12.15.
 */
public class Dj {
    private SongOfFemale songOfFemale;
    private SongOfMale songOfMale;
    private SongOfMale20 songOfMale20;

    private SongIterator iterFemaleSong;
    private SongIterator iterMaleSong;
    private SongIterator iterMale20Song;

    public Dj(SongIterator newFemaleSong, SongIterator newMaleSong, SongIterator newMale20Song) {

        iterFemaleSong = newFemaleSong;
        iterMaleSong = newMaleSong;
        iterMale20Song = newMale20Song;

    }

    public void showTheSongs(){
        Iterator femaleSong = iterFemaleSong.createIterator();
        Iterator maleSong = iterMaleSong.createIterator();
        Iterator male20Song = iterMale20Song.createIterator();
        System.out.println("Song of female...   ");
        printSongOfFemale(femaleSong);
        System.out.println("Song of Male...   ");
        printSongOfFemale(maleSong);
        System.out.println("Song of Male20...   ");
        printSongOfFemale(male20Song);
    }

    public void printSongOfFemale(Iterator iterator) {
        while (iterator.hasNext()){
            String song = (String) iterator.next();
            System.out.println(song);
        }
    }
}
