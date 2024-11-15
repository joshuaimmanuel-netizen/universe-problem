public class Star {
    private String starName;
    private Universe refUniverse;
    private int ageOfStar = -2;
    public void changeAgeOfStar(){
        if(ageOfStar < 2)
        {
            ageOfStar++;
        }
    }
}
