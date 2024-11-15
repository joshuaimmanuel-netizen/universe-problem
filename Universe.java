public class Universe {
    private String universeName;
    private int currentStateOfStar = -2;
    public void changeStateOfStar()
    {
        if(currentStateOfStar < 2)
        {
            currentStateOfStar++;
        }
    }

}
