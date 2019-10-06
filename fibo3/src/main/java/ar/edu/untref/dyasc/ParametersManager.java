package ar.edu.untref.dyasc;

public class ParametersManager {

    private String[] parameters;
    private int sequence_length;

    ParametersManager(String[] params){
        this.setParameters(params);
    }

    public void setParameters(String[] parameters) {
        this.parameters = parameters;
    }

    public String[] getParameters() {
        return parameters;
    }

    public void processParameters(){

    }
}
