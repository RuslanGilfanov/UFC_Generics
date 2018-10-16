public class Pair <A, B> {

    private A team;
    private B stat;

    public Pair(A teams, B stats){
        team = teams;
        stat = stats;
    }

    public A getTeam() {
        return team;
    }

    public B getStats() {
        return stat;
    }
}
