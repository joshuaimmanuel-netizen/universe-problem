public class Star {
private String starName;
private Universe currentUniverseReference;
private int ageOfTheStar = -2;
public void changeAgeOfTheStar()
{
    if(ageOfTheStar < 2)
    {
        ageOfTheStar = ageOfTheStar + 1;
    }
}

}
