package DSA.Candidate;

public class Skill {
    private String name;
    private int FSP;
    private int CSP;
    public int gap;

    //methods
    public Skill(String name, int FSP, int CSP) {
        this.name = name;
        this.FSP = FSP;
        this.CSP = CSP;
        this.gap = FSP - CSP;
    }

    public String getName() {
        return this.name;
    }

    public int getFSP() {
        return this.FSP;
    }

    public int getCSP() {
        return this.CSP;
    }

    public int getGap() {
        return this.gap;
    }
}
