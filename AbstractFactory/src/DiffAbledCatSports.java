public class DiffAbledCatSports implements SportsCatFactory {
    public DiffAbledCatSports() {
    }

    public OutDoorAdventureSports getODAS() {
        // TODO implement here
    	OutDoorAdventureSports g1 = new ParaGlidingDiffAbled();
    	return g1;
    	
    }

    public OutDoorRegular getODRS() {
        // TODO implement here
    	OutDoorRegular g2 = new CricketDiffAbled();
    	return g2;
    	
    }

}