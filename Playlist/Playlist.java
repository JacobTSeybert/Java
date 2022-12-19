import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
//Create and ArrayList with a playlist of songs for desert Island
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
//Inital songs
    desertIslandPlaylist.add ("Cigarettes");
    desertIslandPlaylist.add ("Burn");
    desertIslandPlaylist.add ("Righteous");
    desertIslandPlaylist.add ("Industry Baby");
    desertIslandPlaylist.add ("Tyler Herro");
    desertIslandPlaylist.add ("Go");
    desertIslandPlaylist.add ("Wasted");
    desertIslandPlaylist.add ("Legends");
    desertIslandPlaylist.add ("Rockstar In His Prime");
//print out the songs and size of array
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
//remove songs until only 5 remain
    desertIslandPlaylist.remove (6);
    desertIslandPlaylist.remove (6);
    desertIslandPlaylist.remove (5);
    desertIslandPlaylist.remove (0);
//print out new array and make sure size = 5
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
//swap the order of two of the remaining songs
    int indexA = desertIslandPlaylist.indexOf("Tyler Herro");
    int indexB = desertIslandPlaylist.indexOf("Burn");
    String tempA = "Tyler Herro";
    desertIslandPlaylist.set(indexA, "Burn");
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
  }
}