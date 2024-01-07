package task1.exs5;

public class Candidate {

    private String name;
    private String work;
    private int income;

    public boolean passTheRules(){
        String[] fullName = name.split(" ");
        String surname = fullName[fullName.length - 1];
        if (work.equalsIgnoreCase("banker") ){
            return false;
        } else if (income < 1000){
            return false;
        } else if ( surname.equalsIgnoreCase("Johnson") || surname.equalsIgnoreCase("Edisson")){
            return false;
        }
        else return true;
    }

    public Candidate(String name, String work, int income) {
        this.name = name;
        this.work = work;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
