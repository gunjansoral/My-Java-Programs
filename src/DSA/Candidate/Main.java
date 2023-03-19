package DSA.Candidate;


public class Main {
    //method for fetching data
    public static void main(String[] args) {
        Respondent gunjan = new Respondent("Gunjan Soral", "SSD", "gunjan.soral@gmail.com");
        gunjan.addSkill("Java", 5, 3);
        gunjan.addSkill("javascript", 5, 3);
        gunjan.addSkill("React Js", 5, 3);
        gunjan.addSkill("React Js", 5, 3);

        System.out.println(gunjan);
    }
}
