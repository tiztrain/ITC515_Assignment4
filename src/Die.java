public class Die {
			
	private Face face;
	
	
	public Die() {
		face =  Face.getRandom();
	}

	
	
	public Face getFace() {
		return face;
	}

	//added
	public void setFace(Face face) {
		this.face = face;
	}
	
	
	public Face roll() {
		return Face.getRandom();
	}		

	
	
	public String toString() {
		return face.toString();
	}
}
