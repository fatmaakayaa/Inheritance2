package inheritance2;

public class CustomerManager {
	
   public void add(Logger logger) {
	   
	   //m��teri ekleme kodlar�
	   System.out.println("M��teri eklendi");
	   
	// DatabaseLogger logger = new DatabaseLogger(); 
	   //bir i� yapan s�n�f ba�ka bir i� yapan s�n�f� kullanacaksa 
	   //asla somut s�n�fa (file, database...) gidilmez 
	   //bir kodun i�erisinde ba�ka bir i� yapan s�n�f new'leniyor ise o kod s�rd�r�lebilir de�ildir
	   
	   logger.log();
   }
}
