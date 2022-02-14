public class GameScore{
	String GameName;
	String[] PlayerName= new String[10];
	int sayi;
	int MaxPoints;
	GameScore onceki;
	GameScore siradaki;
	
	
	public GameScore(int sayi){
		// TODO Auto-generated constructor stub
		PlayerName[0]="Samet";
		PlayerName[1]="Eren";
		PlayerName[2]="Ahmet";
		PlayerName[3]="Mehmet";
		PlayerName[4]="Fatih";
		PlayerName[5]="Cagri";
		PlayerName[6]="Zeynep";
		PlayerName[7]="Reyhan";
		PlayerName[8]="Kubilay";
		PlayerName[9]="Burak";
		this.GameName=GameName;
		this.sayi=sayi;
		this.siradaki=null;
		this.onceki=null;
	}
}