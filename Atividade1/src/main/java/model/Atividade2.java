package model;

public class Atividade2 {
	private String apredizado;
	private String expectativa;
	
	public String getApredizado() {
		return apredizado;
	}
	public void setApredizado(String apredizado) {
		this.apredizado = apredizado;
	}
	public String getExpectativa() {
		return expectativa;
	}
	public void setExpectativa(String expectativa) {
		this.expectativa = expectativa;
	}
	
	@Override
	public String toString() {
		return "Atividade2 [apredizado=" + apredizado + ", expectativa=" + expectativa + "]";
	}
	
	
}
