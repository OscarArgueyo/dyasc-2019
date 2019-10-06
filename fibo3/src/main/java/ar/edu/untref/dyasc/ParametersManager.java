package ar.edu.untref.dyasc;

public class ParametersManager {

    private String[] parameters;
    private int sequenceLength;

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
        for (String param :this.getParameters()){
            this.analizeParameter(param);
        }
    }

    private void analizeParameter(String parameter) {
        if(!parameter.contains("-")){
            this.setSequenceLength(Integer.parseInt(parameter));
        }else {
            System.out.println("Esto es un parametro con opciones");
        }
    }

    public int getSequenceLength() {
        return sequenceLength;
    }

    public void setSequenceLength(int sequence_length) {
        this.sequenceLength = sequence_length;
    }
}
