public class Triple<A, B, C> {

    private A team;
    private B win;
    private C loss;

    public Triple(A teams, B wins, C losses){
        team = teams;
        win = wins;
        loss = losses;
    }

    public A getTeam() { return team; }
    public B getWins() { return win; }
    public C getLoses() { return loss; }
}

