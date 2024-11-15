public abstract class Universe extends Matter{
private String universeName;
private int currentState = -2;
public void changeStateOfUniverse(){
    if(currentState < 2)
    {
        currentState = currentState + 1;
    }
}
}
