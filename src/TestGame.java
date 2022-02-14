import java.util.Random;
public class TestGame {
	 public static void main(String[] args) {
		 DoublyLinkedList list = new DoublyLinkedList();
		 
		 list.basaEkle((int)(Math.random()*100));
		 list.basaEkle((int)(Math.random()*100));
		 list.indekseEkle((int)(Math.random()*100), 3);
		 list.indekseEkle((int)(Math.random()*100), 6);
		 list.indekseEkle((int)(Math.random()*100), 2);
		 list.indekseEkle((int)(Math.random()*100), 7);
		 list.indekseEkle((int)(Math.random()*100), 1);

		 list.indekseEkle((int)(Math.random()*100), 6);
		 list.indekseEkle((int)(Math.random()*100), 8);
		 list.sonaEkle((int)(Math.random()*100));
		 list.indeksiSil(5);
		 
		 list.listeyiYazdir();
		 list.maxNode();
		 list.search(25);
		 System.out.println("PRO PLAYER:");
		 list.findStudents(80, 100);
		 System.out.println("NOVICE");
		 list.findStudents(0, 30);

	 }
}
