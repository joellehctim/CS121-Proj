package WeekNine.staticActivity;

public class Player {
    private int number;
    private String name;
    private int goals;
    private static int instanceCount = 0;


    public Player(String name, int number, int goals) {
        this.name = name;
        this.number= number;
        this.goals = goals;
        instanceCount ++;


    }
    public static int getInstanceCount(){
        return instanceCount;
    }
    public String getName(){
        return name;

    }
    public int getNumber(){
        return number;
    }

    public int getGoals(){
        return goals;
    }
}
