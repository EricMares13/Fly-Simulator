
public class Avions {
	
	private String model="";
	private String marca="";
	private String matricula="";
	private int posX = 0;
	private int posY = 0;
	private int alçada = 0;
	private double velocitat = 0;
	private boolean motor = false;
	private boolean rodes = false;
	private boolean aparcat = false;
	private int passatges = 0;
	
	
	public Avions(String model, String marca, String matricula, int posX, int posY, int passatges){
		
		this.model=model;
		this.marca=marca;
		this.matricula=matricula;
		this.posX=posX;
		this.posY=posY;
		this.passatges=passatges;
		
		
	}
	
	public void infoEspaiAeri(){
		
		System.out.println("Informació dels avions ");
		System.out.println("Marca: \t " + this.marca);
		System.out.println("Marca: \t " + this.model);
		System.out.println("Matricula: \t " + this.matricula);
		System.out.println("Coordenada X: \t " + this.posX);
		System.out.println("Coordenada Y: \t " + this.posY);
		System.out.println("Alçada: \t " + this.alçada);
		System.out.println("Velocitat: \t " + this.velocitat);
		System.out.println("Rodes: \t" + funcionalitat(this.rodes));
		System.out.println("Motor: \t " + funcionalitat(this.motor));
		System.out.println("Aparcat: \t " + funcionalitat(this.aparcat));
		System.out.println("Passatges: \t " + this.passatges);
		
		
		
	}
	
	
	public String funcionalitat(Boolean control){
	
	String funcio;
	
	if(control == true){
		
		funcio="ON";
	}else{
		funcio = "OFF";
	}
	
		
	return funcio;	
	}
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getAlçada() {
		return alçada;
	}
	public void setAlçada(int alçada) {
		this.alçada = alçada;
	}
	public double getVelocitat() {
		return velocitat;
	}
	public void setVelocitat(double velocitat) {
		this.velocitat = velocitat;
	}
	public boolean isRodes() {
		return rodes;
	}
	public void setRodes(boolean rodes) {
		this.rodes = rodes;
	}
	public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	public boolean isAparcat() {
		return aparcat;
	}
	public void setAparcat(boolean aparcat) {
		this.aparcat = aparcat;
	}
	public int getPassatges() {
		return passatges;
	}
	public void setPassatges(int passatges) {
		this.passatges = passatges;
	}
	
	
	

}
