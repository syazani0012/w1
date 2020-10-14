public class Fish {

	//attributes or data member or fields
	public String color = "blue";

	//method
	public void Swim(){
		System.out.println(color + "fish swim");
	}

	//setter / mutator method
	public void SetColor(String warna){
		color = warna;
	}

	public String GetColor(){
		return color;
	}
}