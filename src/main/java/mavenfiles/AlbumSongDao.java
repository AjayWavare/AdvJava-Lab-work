package mavenfiles;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class AlbumSongDao extends GenericDao {

	public List<Song> fetchSongsSungBy(String artist) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select s from Song s where s.artist = :artist");
			q.setParameter("artist", artist);
			List<Song> list = q.getResultList();
			return list;
		}
		finally {//here catch block is excluded as the exception is unchecked 
			emf.close();
		}
	}
}
