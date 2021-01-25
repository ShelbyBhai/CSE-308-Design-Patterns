public class ComputerFactory {
    public ComputerCommon getComputer(String compName){
        if(compName.equalsIgnoreCase(null))
            return null;
        if(compName.equalsIgnoreCase("Computer A"))
            return new ComputerA();
        if(compName.equalsIgnoreCase("Computer B"))
            return new ComputerB();
        if(compName.equalsIgnoreCase("Computer C"))
            return new ComputerC();
        return null;
    }


}
