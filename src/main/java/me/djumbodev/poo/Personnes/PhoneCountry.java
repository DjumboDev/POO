package me.djumbodev.poo.Personnes;

public enum PhoneCountry {
   // Region 1 North America
   UNITED_STATES(1,1),
   CANADA(1,1),

   // Region 2 Europe
   GREECE(3,30),
   NETHERLANDS(3,31),
   BELGIUM(3,32),
   FRANCE(3,33),
   SPAIN(3,34);


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
