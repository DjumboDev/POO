package me.djumbodev.poo.Personnes;

public enum PhoneCountry {
 // Region 1 North America
    UNITED_STATES(1,1),
    CANADA(1,1),

    // Region 2 Europe
    FRANCE(3,33),
    BELGIUM(3,33),
   GREECE(3,30);

    private final int assignedRegion;
    private final int assignedCode;

    private PhoneCountry(int assignedRegion, int assignedCode){

       IO.println("Enumération et Constructeurs PhoneCountry");

       this.assignedRegion = assignedRegion;
       this.assignedCode = assignedCode;
    }
    public int getAssignedRegion(){
       return this.assignedRegion;
    }
    public int getAssignedCode(){
       return this.assignedCode;
    }
}
