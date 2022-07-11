package mavenfiles;
import java.time.LocalDate;
import java.util.List;



public class AlbumSongExample {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericDao dao = new GenericDao();
		//AlbumSongDao dao = new AlbumSongDao();
		
		//adding an album
	/*Album album = new Album();
		album.setName("Hits of 2021");
		album.setReleaseDate(LocalDate.of(2020, 12, 30));
		album.setCopyright("Amazon Music");
		dao.save(album);*/ 
		
		//adding song to an album
		/*Album album = (Album) dao.fetchById(Album.class, 1);
		Song song = new Song();
		song.setTitle("Ghi");
		song.setArtist("beyonce");
		song.setDuration(3.30);
		song.setAlbum(album);
		dao.save(song);*/ //ONE TO MANY RELATIONSHIP SEETING ALBUM THEN SONGS IN ALBUM
		
		/*List<Song> songs = dao.fetchSongsSungBy("Taylor Swift");
		for(Song song : songs)
			System.out.println(song.getTitle() + " " + song.getDuration()); */
		
		//dao.delete(Song.class, 4);
		Song song=(Song) dao.fetchById(Song.class, 2);
		
			System.out.println(song.getTitle() + " " + song.getDuration());
		
	}
}
