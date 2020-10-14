public class Driver{

	public static void main(String [] arg){
		//fish actually is a data type
		//fish nemo; == int x;
		Fish nemo = new Fish(); //nemo adalah object,fish adalah class
		nemo.Swim();
		nemo.color = "red";//tukar value
		nemo.Swim();

		Fish dory = new Fish();//another subject
		dory.Swim();
		dory.color = "yellow";
		dory.Swim();

		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();

		Aquirium fancyAquirium = new Aquirium();
		fancyAquirium.fillFish();
	}
}