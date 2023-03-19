package DSA.Candidate;

import java.util.ArrayList;

public class Respondent {
    private String name;
    private String email;
    private ArrayList<Skill> skill;
    private String position;

    //methods
    public Respondent(String name, String position, String email) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.skill = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }

    public String getEmail() {
        return this.email;
    }

    public void addSkill(String name, int FSP, int CSP) {
        boolean isValid = true;
        Skill skillElement = new Skill(name, FSP, CSP);
        for (int i = 0; i < skill.size(); i++) {
            if (skill.get(i).getName().equals(name)) isValid = false;
        }
        if (isValid)
            skill.add(skillElement);
    }

    public int size() {
        return skill.size();
    }

    public Skill getSkill(int i) {
        if (i >= skill.size()) return null;
        return skill.get(i);
    }

    public String toString() {
        String skills = "Skills";
        String FSP = "FSP";
        String CSP = "CSP";
        String gap = "Proficiency Gap";
        String s = String.format("Name : %s\t\t Position : %s\t\t Email : %s ", this.name, this.position, this.email) + "\n";
        s += "-----------------------------------------------------------------------------------\n";
        s += String.format("%20s %20s %20s %20s", skills, FSP, CSP, gap) + "\n";
        s += "-----------------------------------------------------------------------------------\n";
        for (int i = 0; i < size(); i++) {
            s += String.format("%20s %20d %20d %20d", skill.get(i).getName(), skill.get(i).getFSP(), skill.get(i).getCSP(), skill.get(i).getGap()) + "\n";
        }
        return s;
    }
}
