package module2.task2.exs5;

public class School {
    private String title;
    private String specType;
    private int espCount;

    private Esper[] espers;
    private SpecialSchool specialSchool = new SpecialSchool();

    public School(String title, String spec_type, int espCount, Esper[] espers) {
        this.title = title;
        this.specType = spec_type;
        this.espCount = espCount;
        this.espers = espers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpecType() {
        return specType;
    }

    public void setSpecType(String specType) {
        this.specType = specType;
    }

    public int getEspCount() {
        return espCount;
    }

    public void setEspCount(int espCount) {
        this.espCount = espCount;
    }

    public Esper[] getEspers() {
        return espers;
    }

    public void setEspers(Esper[] espers) {
        this.espers = espers;
    }

    public int isPartOfTheSchool(){
        int finalNumber = 0;
        for( Esper esper : espers){
            if( specType.equalsIgnoreCase(esper.getType()) && esper.getMighty()>10){
                finalNumber++;
            }
            if (esper.getMighty() > 10 && esper.getMighty() < 1000){
                finalNumber++;
            }else if (esper.getMighty() > 1000 && !specType.equalsIgnoreCase(esper.getType())){
                specialSchool.admitEsper();
            }
        }
        return finalNumber;
    }

    public SpecialSchool getSpecialSchool() {
        return specialSchool;
    }

    public void setSpecialSchool(SpecialSchool specialSchool) {
        this.specialSchool = specialSchool;
    }
}
