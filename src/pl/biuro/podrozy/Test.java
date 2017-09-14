package pl.biuro.podrozy;

public class Test {

	public static void main(String[] args) {
				String serverUrl = "http://localhost:8080/biuro";
				try{
					String url = serverUrl+"/wycieczka";
					//String message = "<wycieczka id_wycieczki=\"1\"><nazwa>nazwaWycieczki</nazwa><opis>opisWycieczki</opis><data_odjazdu>11092017</data_odjazdu><data_przyjazdu>12092017</data_przyjazdu></wycieczka>";
		
					String message="{\"nazwa\":\"lolo\",\"opis\":\"asas\"}";
									
					System.out.println("DOPOST "+url );
					String txt = HttpHelper.doPost(url,message,"application/json");
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					url = serverUrl+"/wycieczka";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					url = serverUrl+"/katalog";
					message = "{\"cena\":\"69\",\"data_odjazdu\":\"12212211\",\"data_przyjazdu\":\"13568879\"}";
		
					
					System.out.println("DOPOST "+url );
					txt = HttpHelper.doPost(url,message,"application/json");
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
		
					url = serverUrl+"/katalog";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					url = serverUrl+"/rezerwacja";
					message="{\"liczba_osob\":\"69\",\"stan\":\"false\",\"zaliczka\":\"69.69\"}";
					
					System.out.println("DOPOST "+url );
					txt = HttpHelper.doPost(url,message,"application/json");
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
		
					url = serverUrl+"/rezerwacja";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");

					url = serverUrl+"/miejsce"; 
					message = "{\"miejscowosc\":\"nazwaMiejscowosc\",\"adres\":\"adresMiejsca\"}";
		
					
					System.out.println("DOPOST "+url );
					txt = HttpHelper.doPost(url,message,"application/json");
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
		
					url = serverUrl+"/miejsce";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					url = serverUrl+"/katalog/2/rezerwacja/3";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					url = serverUrl+"/miejsce/4/katalog/2";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					url = serverUrl+"/wycieczka/1/katalog/2";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					url = serverUrl+"/miejsce/4/wycieczka/1";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					
				} catch (Exception e) {e.printStackTrace();}
				
				
				
				
			}
}
