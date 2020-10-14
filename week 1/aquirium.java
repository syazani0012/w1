public class Aquirium{
	public int length, height, width;

	public void fillFish(){
		Fish fish1 = new Fish();
		fish1.color = "green";
		System.out.println("Many " + fish1 + "fish here");

		fish1.Swim();
	}
}