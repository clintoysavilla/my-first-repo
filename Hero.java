public class Hero<VariableType> {
    
    private String heroName;
    private String heroOrigin;
    private VariableType heroVoiceline;

    public void setheroVoiceline(VariableType heroVoiceline){
        this.heroVoiceline=heroVoiceline;
    }
    public VariableType getheroVoiceline(){
        return heroVoiceline;
    }

    public void setheroName(String heroName){
        this.heroName=heroName;
    }
    public String getheroName(){
        return heroName;
    }
    public void setheroOrigin(String heroOrigin){
        this.heroOrigin=heroOrigin;
    }
    public String getheroOrigin(){
        return heroOrigin;
    }
}
