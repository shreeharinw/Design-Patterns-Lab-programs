public class GetSports {
    public static void main(String args[]) {
    	SportsCatFactory g1;
    	g1 = new DiffAbledCatSports();
    	OutDoorAdventureSports  oa1 = g1.getODAS();
    	OutDoorRegular  oa2 = g1.getODRS();
    	oa1.displaySportsName();
    	oa2.displaySportsName();
    }

}