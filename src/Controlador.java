import java.util.Scanner;

public class Controlador {
	
	static Scanner sc;
	static EspaiAeri espai;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		//a1=new Aula(1,"Aula Qu�mica",2);
		espai = new EspaiAeri("Espai aeri asd", 5);
		do{
			System.out.println("Entra una opci� de les seg�ents");
			System.out.println("1.- Dona d'alta un avi�");
			System.out.println("2.- Quin avi� vols gestionar");
			System.out.println("3.- Manteniment de l'espai aeri");
			System.out.println("4.- Informaci� de l'espai aeri");
			System.out.println("0.- Sortir");
			
			sc = new Scanner(System.in);
		    i = sc.nextInt();
		    switch (i)
		    {
		    case 1: altaAvio();  break;
		    	
		    case 2:  break;
		    	
		    case 3:  break;
		    
		    //case 4: infoEspaiAeri(); break;
		    	
		    }
		}while (i!=0);
		
		
	}	
		
		
		
		
		/*public static void infoEspaiAeri(){
			System.out.println("Entra La matr�cula a buscar:");
			String MatriculaBuscar=sc.next();
			sc.nextLine();
			a1.buscarAlumne(MatriculaBuscar);
		}*/
		
	
	
	public static void altaAvio (){
		String model="", matricula="", marca ="";
		int passatges=0;
		int posX = 0, posY = 0;
		
			System.out.println("Entra el model de l'avi�:");
			model=sc.next();
			sc.nextLine();
			System.out.println("Entra la matr�cula de l'avio:");
			matricula=sc.next();
			sc.nextLine();
			System.out.println("Entra la marca de l'avi�:");
			marca=sc.next();
			sc.nextLine();
			System.out.println("Entra el nombre de passatges que van a l'avi�:");
			passatges=sc.nextInt();
			sc.nextLine();
			System.out.println("Entra la posici� X de l'avi�:");
			posX=sc.nextInt();
			sc.nextLine();
			System.out.println("Entra la posici� Y de l'avi�:");
			posY=sc.nextInt();
			sc.nextLine();
		
		
		espai.afegirAvions(model, matricula, marca, passatges, posX, posY);
	}
		
		
		
	

}
