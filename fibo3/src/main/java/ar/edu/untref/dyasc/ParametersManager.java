package ar.edu.untref.dyasc;

public class ParametersManager {

    private String[] parameters;
    private int sequenceLength;
    private boolean valid = false;

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
        if(!parameter.startsWith("-")){
            try{
                this.setSequenceLength(Integer.parseInt(parameter));
                this.setValid(true);
            }catch (Exception e){
                this.setValid(false);
            }
        }
        if (parameter.startsWith("-") && parameter.contains("=")) {
            String option = this.removeCharacter(parameter , "-");
            System.out.println(option);
            String[] option_tokens = option.split("=");
            String option_type = option_tokens[0];
            String option_value = option_tokens[1];

        }
    }

    public int getSequenceLength() {
        return sequenceLength;
    }

    public void setSequenceLength(int sequence_length) {
        this.sequenceLength = sequence_length;
    }

    public boolean isValid() {
        return this.valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private String removeCharacter(String word , String character){
        String modified_word = word.replace(character , "");
        return modified_word;

    }
}
