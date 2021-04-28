package inheritance2;

public class CustomerManager {
	
   public void add(Logger logger) {
	   
	   //müþteri ekleme kodlarý
	   System.out.println("Müþteri eklendi");
	   
	// DatabaseLogger logger = new DatabaseLogger(); 
	   //bir iþ yapan sýnýf baþka bir iþ yapan sýnýfý kullanacaksa 
	   //asla somut sýnýfa (file, database...) gidilmez 
	   //bir kodun içerisinde baþka bir iþ yapan sýnýf new'leniyor ise o kod sürdürülebilir deðildir
	   
	   logger.log();
   }
}
