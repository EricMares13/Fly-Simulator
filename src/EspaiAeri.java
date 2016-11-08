
public class EspaiAeri {

	private Avions LlistaAvions[];
	private int numAvions=0;
	private int capacitat = 0;
	String nomEspaiAeri;
	
	public EspaiAeri(){
		/*this.numAvions = numeroAvions;
		this.nomEspaiAeri = NomEspaiAeri;
		
		
		
		LlistaAvions = new Avions[numeroAvions];*/
		
		this.numAvions=0;
		this.capacitat=0;
		LlistaAvions = new Avions[5];
	}
	
	public int getnumAvions(){
		return numAvions;
	}
	
	public int getCapacitat(){
		return capacitat;
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
		
		CreacioAvio.infoEspaiAeri();
	}
	
	public void mostrarAvions(){
		
		
		
	}

	public void infoEspaiAeri() {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
