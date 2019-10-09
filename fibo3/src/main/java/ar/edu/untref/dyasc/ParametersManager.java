package ar.edu.untref.dyasc;

public class ParametersManager {

    private String[] parameters;
    private int sequenceLength;
    private boolean valid = false;
    private Order order = Order.DIRECT;
    private Orientation orientation = Orientation.HORIZONTAL;
    private OperationMode mode;
    private String filepath;
    private boolean saveFile = false;

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

            String[] option_tokens = option.split("=");
            String option_type = option_tokens[0];
            String option_value = option_tokens[1];


            this.analizeOutputOption(option_type , option_value);
            this.analizeModeOperationOption(option_type , option_value);
            this.analizeFileOption(option_type , option_value);
        }
    }

    private void analizeFileOption(String option_type, String option_value) {
        if (option_type.equalsIgnoreCase("f")){
            this.filepath = option_value;
            this.setSaveFile(true);
        }
    }

    private void analizeModeOperationOption(String option_type, String option_value) {
        if (option_type.equalsIgnoreCase("m")) {
            if(option_value.equalsIgnoreCase("s")){
                this.setMode(OperationMode.SUM);
            }
            if(option_value.equalsIgnoreCase("l")){
                this.setMode(OperationMode.LIST);
            }
        }
    }

    private void analizeOutputOption(String option_type, String option_value) {


        if (option_type.equalsIgnoreCase("o")){
            if (option_value.length() == 2){
                char order_value = option_value.toLowerCase().charAt(1);
                char orientation_value = option_value.toLowerCase().charAt(0);

                if (order_value == 'd'){
                    this.setDirectOrder();
                }

                if (orientation_value == 'v'){
                    this.setVerticalOrientation();
                }

                if (orientation_value == 'h'){
                    this.setHorizontalOrientation();
                }

                if (order_value == 'i'){
                    this.setInverseOrder();
                }
            }

        }
    }

    private void setVerticalOrientation() {
        this.setOrientation(Orientation.VERTICAL);
    }

    private void setHorizontalOrientation() {
        this.setOrientation(Orientation.HORIZONTAL);
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

    public Order getOrder() {
        return this.order;
    }

    public boolean isDirectOrder(){
        return this.order == Order.DIRECT;
    }

    public boolean isInverseOrder(){
        return this.order == Order.INVERSE;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setDirectOrder(){
        this.setOrder(Order.DIRECT);
    }

    public void setInverseOrder(){
        this.setOrder(Order.INVERSE);
    }

    public boolean isHorizontalOriented() {
        return this.orientation == Orientation.HORIZONTAL;
    }

    public boolean isVerticalOriented() {
        return this.orientation == Orientation.VERTICAL;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public Orientation getOrientation(){
        return this.orientation;
    }

    public boolean hasOperationSum() {
        return this.getMode() == OperationMode.SUM;
    }

    public OperationMode getMode() {
        return mode;
    }

    public void setMode(OperationMode mode) {
        this.mode = mode;
    }

    public boolean hasSaveFileOption() {
        return this.isSaveFile() == true;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public void setSaveFile(boolean saveFile){
        this.saveFile = saveFile;
    }

    public boolean isSaveFile() {
        return this.saveFile;
    }
}
