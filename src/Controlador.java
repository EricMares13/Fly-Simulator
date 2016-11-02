import java.util.Scanner;

public class Controlador {
	
	static Scanner sc;
	static EspaiAeri espai;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		//a1=new Aula(1,"Aula Química",2);
		espai = new EspaiAeri("Espai aeri asd", 5);
		do{
			System.out.println("Entra una opció de les següents");
			System.out.println("1.- Dona d'alta un avió");
			System.out.println("2.- Quin avió vols gestionar");
			System.out.println("3.- Manteniment de l'espai aeri");
			System.out.println("4.- Informació de l'espai aeri");
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
			System.out.println("Entra La matrícula a buscar:");
			String MatriculaBuscar=sc.next();
			sc.nextLine();
			a1.buscarAlumne(MatriculaBuscar);
		}*/
		
	
	
	public static void altaAvio (){
		String model="", matricula="", marca ="";
		int passatges=0;
		int posX = 0, posY = 0;
		
			System.out.println("Entra el model de l'avió:");
			model=sc.next();
			sc.nextLine();
			System.out.println("Entra la matrícula de l'avio:");
			matricula=sc.next();
			sc.nextLine();
			System.out.println("Entra la marca de l'avió:");
			marca=sc.next();
			sc.nextLine();
			System.out.println("Entra el nombre de passatges que van a l'avió:");
			passatges=sc.nextInt();
			sc.nextLine();
			System.out.println("Entra la posició X de l'avió:");
			posX=sc.nextInt();
			sc.nextLine();
			System.out.println("Entra la posició Y de l'avió:");
			posY=sc.nextInt();
			sc.nextLine();
		
		
		espai.afegirAvions(model, matricula, marca, passatges, posX, posY);
	}
		
		
		
	

}
