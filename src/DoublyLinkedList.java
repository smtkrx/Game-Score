
public class DoublyLinkedList <D>{
	GameScore bas;
	GameScore son;
	int sayac=0;

	public boolean doluMu() {
		if(bas!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void basaEkle(int sayi) {

		GameScore yeniEleman = new GameScore(sayi);
		if(doluMu()) {
			//list is full
			bas.onceki=yeniEleman;
			yeniEleman.siradaki=bas;
			bas=yeniEleman;
			
		}
		else {
			//add to index
			bas=yeniEleman;
			son=yeniEleman;
		}
	}
	public void indekseEkle(int sayi,int indeks) {
		GameScore yeniEleman = new GameScore(sayi);
		if(doluMu()) {
			if(indeks==0) {
				//same as insertion
				bas.onceki=yeniEleman;
				yeniEleman.siradaki=bas;
				bas=yeniEleman;
			}
			else {//add to index
				GameScore isaretci1=null;
				GameScore isaretci2=bas;
				int currentIndex=0;
				while( isaretci2!=null && currentIndex < indeks) {
					isaretci1=isaretci2;
					isaretci2=isaretci2.siradaki;
					currentIndex++;
			}
				if(isaretci2==null) {
					son.siradaki=yeniEleman;
					yeniEleman.onceki=son;
					son=yeniEleman;
				}
				else {
					yeniEleman.siradaki=isaretci2;
					isaretci1.siradaki=yeniEleman;
					isaretci2=yeniEleman;
				}
		}
	}
}
	public void sonaEkle(int sayi) {
		GameScore yeniEleman = new GameScore(sayi);
		if(doluMu()) {
			//list is full
			son.siradaki=yeniEleman;
			yeniEleman.onceki=son;
			son=yeniEleman;
		}
		else {
			//list is empty
			bas=yeniEleman;
			son=yeniEleman;
		}
	}
	public GameScore indeksiSil(int anahtar) // Function used to delete the selected item in the queue
	{ 
		GameScore aktif = bas; 
		while (aktif.sayi != anahtar) // Until we find a match
		{
			aktif = aktif.siradaki; // The loop is constantly transferred to the next
			if (aktif == null)
				return null; // no matches found
		}
		if (aktif == bas) 
			bas = aktif.siradaki; 
		else 
				
			aktif.onceki.siradaki = aktif.siradaki;

		if (aktif == son) 
			son = aktif.onceki; 
		else 
			
			aktif.siradaki.onceki = aktif.onceki;
		return aktif; // Returning found value
	}
	public void maxNode() { 
        GameScore current = bas;
        int max;
        if(bas == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            //Initializing max with head node data  
            max = bas.sayi;
            while(current != null){  
                 //If current node's data is greater than max  
                 //Then, replace value of max with current node's data  
                 if(max < current.sayi ) {  
                     max = current.sayi;
                 } 
                 current = current.siradaki; 
            }
            System.out.println("Maximum value node in the list And is WINNER: "+max);  
        }
}
	public void search(int x) 
    { 
        GameScore current = bas;    //Initialize current 
        while (current != null) 
        { 
            if (current.sayi == x)
            	System.out.println("Found it: "+x);  //data found 
            	current = current.siradaki; 
        } 
        System.out.println("Data not found");
        //data not found 
    } 
	 public void findStudents (int a, int b) {
			GameScore isaretci=bas;
	        GameScore current = bas;
	        int tmp;  
	  
	        if(bas == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            //Initializing max with head node data  
	            tmp = bas.sayi;
	            while(current != null){  
	                 //If current node's data is greater than max  
	                 //Then, replace value of max with current node's data  
	                 if(a < current.sayi && current.sayi<b) {  
	                     tmp = current.sayi;	 
	                     System.out.println(" "+tmp);  
	                 } 
	                 current = current.siradaki; 
	            }
	        }
	}	  
	public void listeyiYazdir() {
		GameScore isaretci=bas;
		while(isaretci!=null) {
			System.out.println(isaretci.PlayerName[sayac]+":"+isaretci.sayi);
			isaretci=isaretci.siradaki;	
			sayac++;
		}
	}
}
