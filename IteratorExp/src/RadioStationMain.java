/**
 * Created by TS on 03.12.15.
 */
public class RadioStationMain {
    public static void main(String[] args){
        SongOfFemale songF = new SongOfFemale();
        SongOfMale songM= new SongOfMale();
        SongOfMale20 songM20=new SongOfMale20();

        Dj djTata = new Dj(songF,songM,songM20);

        djTata.showTheSongs();
    }
}
