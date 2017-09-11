package pl.biuro.podrozy;

public class Test {

	public static void main(String[] args) {
				String serverUrl = "http://localhost:8080/biuro/podrozy";
				try{
					String url = serverUrl+"/stworz/wycieczka";
					String message = "<wycieczka id_wycieczki=\"1\"><nazwa>nazwaWycieczki</nazwa><opis>opisWycieczki</opis><data_odjazdu>11092017</data_odjazdu><data_przyjazdu>12092017</data_przyjazdu></wycieczka>";
		
					
					System.out.println("DOPOST "+url );
					String txt = HttpHelper.doPost(url,message,"application/xml");
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
		
					
					url = serverUrl+"/pobierz/wycieczki";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					url = serverUrl+"/stworz/katalog";
					message = "<katalog id=\"1\"><nazwa>nazwaKatalogu</nazwa></katalog>";
		
					
					System.out.println("DOPOST "+url );
					txt = HttpHelper.doPost(url,message,"application/xml");
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
		
					url = serverUrl+"/pobierz/katalogi";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					url = serverUrl+"/stworz/rezerwacja";
					message = "<rezerwacja id=\"1\"><liczba_osob>10</liczba_osob><stan>false</stan><zaliczka>54.32</zaliczka></rezerwacja>";
		
					
					System.out.println("DOPOST "+url );
					txt = HttpHelper.doPost(url,message,"application/xml");
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
		
					url = serverUrl+"/pobierz/rezerwacje";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					url = serverUrl+"/stworz/uczestnictwo";
					message = "<uczestnictwo id=\"1\"><liczba_osob>10</liczba_osob></uczestnictwo>";
		
					
					System.out.println("DOPOST "+url );
					txt = HttpHelper.doPost(url,message,"application/xml");
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
		
					url = serverUrl+"/pobierz/uczestnictwa";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					url = serverUrl+"/stworz/miejsce";
					message = "<miejsce id=\"1\"><nazwa>nazwaMiejsca</nazwa><opis>opisMiejsca</opis></miejsce>";
		
					
					System.out.println("DOPOST "+url );
					txt = HttpHelper.doPost(url,message,"application/xml");
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
		
					url = serverUrl+"/pobierz/miejsca";
					System.out.println("DOGET "+url );
					txt = HttpHelper.doGet(url);
					System.out.println("-----------------------");
					System.out.println(txt);
					System.out.println("-----------------------");
					
					
				} catch (Exception e) {e.printStackTrace();}
				
				
				
				
			}
}
