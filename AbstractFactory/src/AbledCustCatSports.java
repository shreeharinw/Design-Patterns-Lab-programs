public class AbledCustCatSports implements SportsCatFactory {

    /**
     * Default constructor
     */
    public AbledCustCatSports() {
    }

    public OutDoorAdventureSports getODAS() {
        // TODO implement here
    	OutDoorAdventureSports g1 = new ParaGlidingReg();
    	return g1;
    }

   
    public OutDoorRegular getODRS() {
    	OutDoorRegular g2 = new CricketReg();
    	return g2;
    }

}