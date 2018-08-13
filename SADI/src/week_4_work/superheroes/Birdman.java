package week_4_work.superheroes;

import week_4_work.interfaces.FlyingHero;

public class Birdman extends AbstractSuperHero implements FlyingHero
{
	public Birdman()
	{
		super("Birdman", "The World");
	}

	// inherits saveTheWorld from AbstractSuperhero

	@Override
	public void fly()
	{
		System.out.println("Birdman is flying close to the sun");
	}
}
