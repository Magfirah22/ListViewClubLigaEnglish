package id.ac.poliban.mi.firah.listviewclubligaenglish;

public class Tim {
    private String flag;
    private String timName;
    private String timDesc;

    public Tim(String flag, String timName, String timDesc) {
        this.flag = flag;
        this.timName = timName;
        this.timDesc = timDesc;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getTimName() {
        return timName;
    }

    public void setTimName(String timName) {
        this.timName = timName;
    }

    public String getTimDesc() {
        return timDesc;
    }

    public void setTimDesc(String timDesc) {
        this.timDesc = timDesc;
    }

    public String toString(){
        return String.format("%30s\n\n%s", getTimName(), getTimDesc());
    }
}
