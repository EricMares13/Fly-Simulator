
public class EspaiAeri {

	private Avions LlistaAvions[];
	private int numAvions=0;
	private int capacitat = 0;
	String nomEspaiAeri;
	
	public EspaiAeri(String NomEspaiAeri, int numeroAvions){
		this.numAvions = numeroAvions;
		this.nomEspaiAeri = NomEspaiAeri;
		this.capacitat = capacitat;
		
		
		LlistaAvions = new Avions[numeroAvions];
		
	}
	
	private int getnumAvions(){
		return numAvions;
	}
	
	
	
	
	public void afegirAvions(String matr, String mod, String marc, int passatges, int posX, int posY)
	{ 
		Avions CreacioAvio =new Avions(matr,mod,marc, passatges, posX, posY);
		int voltes=0;
		while(voltes<this.capacitat){
	  
			if(LlistaAvions[numAvions]!=null){
				LlistaAvions[numAvions]=CreacioAvio;
				  numAvions++;
				  	
			}
				
			for(numAvions=0; numAvions<=LlistaAvions.length;numAvions++){
				if(LlistaAvions[numAvions].getMatricula().equals(matr)){
					System.out.println("Matricula ja introduida");
					break;
					
				}
				
				if(LlistaAvions[numAvions]==null){
					LlistaAvions[numAvions]=CreacioAvio;
					numAvions++;
					break;
				}
			}
			voltes++;
		}
	}

	
}
