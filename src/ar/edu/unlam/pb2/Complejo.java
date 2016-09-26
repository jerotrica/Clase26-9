package ar.edu.unlam.pb2;

public class Complejo {

	private Double parteReal;
	private Double parteImaginaria;
	
	public Complejo(Double parteReal ,Double parteImaginaria){
		this.parteReal=parteReal;
		this.parteImaginaria=parteImaginaria;
	}
	
	public Complejo(){
		this.parteReal=0d;
		this.parteImaginaria=0d;
	}

	public Double getParteReal() {
		return parteReal;
	}

	public void setParteReal(Double parteReal) {
		this.parteReal = parteReal;
	}

	public Double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(Double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
	public Complejo suma(Complejo primerComplejo){
		Complejo nuevoComplejo =new Complejo();
		nuevoComplejo.setParteReal(this.parteReal+primerComplejo.parteReal);
		nuevoComplejo.setParteImaginaria(this.parteImaginaria+ primerComplejo.parteImaginaria);
		return nuevoComplejo ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((parteImaginaria == null) ? 0 : parteImaginaria.hashCode());
		result = prime * result
				+ ((parteReal == null) ? 0 : parteReal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (parteImaginaria == null) {
			if (other.parteImaginaria != null)
				return false;
		} else if (!parteImaginaria.equals(other.parteImaginaria))
			return false;
		if (parteReal == null) {
			if (other.parteReal != null)
				return false;
		} else if (!parteReal.equals(other.parteReal))
			return false;
		return true;
	}
	
	
	
}
