
public class BigScreenGraph {
    public static void main(String[] args) throws Exception {
        String file = "input1.txt";
        Graph BSG = new Graph();
        BSG.readActMovfile(file);
        System.out.println("=======================");
//        BSG.displayActMov();
        System.out.println("=======================");
//        BSG.displayMoviesOfActor("Aamir Khan");
//        BSG.displayMoviesOfActor("A6");
//        BSG.displayMoviesOfActor("Nicolas Cage");
        System.out.println("=======================");
//        BSG.displayActorsOfMovie("Munna Bhai MBBS");
//        BSG.displayActorsOfMovie("M8");
//        BSG.displayActorsOfMovie("Last Dance");
        System.out.println("=======================");
//        BSG.findMovieRelation("PK", "Dangal");
//        BSG.findMovieRelation("PK", "M8");
//        BSG.findMovieRelation("Once Upon A Time in Mexico", "Sleepy Hollow");
        System.out.println("=======================");
//        BSG.findMovieTransRelation("M1", "M8");
//        BSG.findMovieTransRelation("Teaching Mrs", "The Adventures of Pluto Nash");
        BSG.findMovieTransRelation("The Astronaut", "The Story of Us");
//        BSG.findMovieTransRelation("Once Upon A Time in Mexico", "Sleepy Hollow");
        System.out.println("=======================");

    }
}
