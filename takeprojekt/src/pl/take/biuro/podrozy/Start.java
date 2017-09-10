package pl.take.biuro.podrozy;


import javax.persistence.NoResultException;

import pl.take.biuro.podrozy.HttpHelper;

public class Start {
	public static void main(String[] args) {
		//EntityManagerFactory factory = Persistence.createEntityManagerFactory("takeprojekt");
		//EntityManager em = factory.createEntityManager();
		BiuroRemote biuro = new BiuroRemote();
		String url = "http://localhost:8080/biuro/podrozy/test";
		System.out.println("DOGET "+url );
		String txt = HttpHelper.doGet(url);
		System.out.println("-----------------------");
		System.out.println(txt);
		System.out.println("-----------------------");
		try
		{
			Wycieczka wyc = biuro.znajdzWycieczke(1);	
			System.out.println("Nazwa: " + wyc.getNazwa() + " Opis: " + wyc.getOpis() + " DataP: " + wyc.getData_przyjazdu() + " DataO: " + wyc.getData_odjazdu());

		}catch (NoResultException ex) {System.out.println(ex.getMessage());}
		
//		Miejsce mp = new Miejsce();
//		em.getTransaction().begin();
//		mp.setNazwa("NazwaMiejsca");
//		mp.setOpis("opisMiejsca");
//		em.persist(mp);
//		em.getTransaction().commit();
//		em.close();
		//System.out.println("Blblblbl");
	}
}
