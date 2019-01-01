import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Graph {
    List<Actor> actors;
    List<Movie> movies;

    Graph() {
        actors = new LinkedList<>();
        movies = new LinkedList<>();
    }

    void readActMovfile(String fileName) throws Exception {
        try {
            FileReader file = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(file);

            String line = reader.readLine();
            while (line != null) {
                Actor actor1, actor2;
                Movie movie;
                String[] movie_record = line.split("\\s+/\\s+");
                // 2 - Movie / Single_Actor
                // 3 - Movie / Actor1 / Actor2
                if (movie_record.length != 2 && movie_record.length != 3) {
                    throw new Exception("Movie Information is Not Complete in the Line => " + line);
                }
                String movie_name = movie_record[0];
                movie = getOrAddMovie(movies, movie_name);

                String a1; // Actor1 Name
                String a2; // Actor2 Name

                a1 = movie_record[1];
                actor1 = getOrAddActor(actors, a1);

                if (movie_record.length == 2) { // Only One Actor is Provided
                    actor1.CoStars.put(movie, null); // There is No Co-Star
                } else { // movie_record.length == 3
                    a2 = movie_record[2];
                    actor2 = getOrAddActor(actors, a2);
                    actor1.CoStars.put(movie, actor2);
                    actor2.CoStars.put(movie, actor1);
                }

                line = reader.readLine();
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println("The Input file doesn't exist.");
        }
    }

    private static Actor getOrAddActor(List<Actor> list, String name) {
        Actor actor = list.stream()
                .filter(a -> a.Name.equals(name))
                .findAny()
                .orElse(null);
        if (actor == null) {
            actor = new Actor(name);
            list.add(actor);
        }
        return actor;
    }

    private static Movie getOrAddMovie(List<Movie> list, String name) {
        Movie movie = list.stream()
                .filter(a -> a.Name.equals(name))
                .findAny()
                .orElse(null);
        if (movie == null) {
            movie = new Movie(name);
            list.add(movie);
        }
        return movie;
    }

    // 1. List the number of movies and the actors represented in the graph
    void displayActMov() {
        System.out.println("Total Number of Movies : " + movies.size());
        movies.forEach(System.out::println);
        System.out.println("--------------------");
        System.out.println("Total Number of Movies : " + actors.size());
        actors.forEach(a -> System.out.println(a.Name));
    }

    // 2. List the names of the movies in which performer A has acted.
    void displayMoviesOfActor(String actor_name) throws Exception {
        Actor actor = actors.stream()
                .filter(a -> a.Name.equals(actor_name))
                .findAny()
                .orElseThrow(() -> new Exception("No Actor with name " + actor_name));
        System.out.println("Movies acted by " + actor_name);
        actor.CoStars.forEach((movie, co_actor) -> System.out.println(movie));
    }

    // 3. List the names of the performers in the movie X
    void displayActorsOfMovie(String movie_name) throws Exception {
        System.out.println("Actors of Movie " + movie_name);
        for (String actor : getActors(movie_name)) {
            if (actor != null) System.out.println(actor);
        }
    }

    // 4. Consider the following relation R on the movies
    void findMovieRelation(String movA, String movB) throws Exception {
        Tuple<Boolean, String> bs = getDirectRelation(movA, movB);
        if (bs.x) {
            System.out.println("The Common Actor between " + movA + " and " + movB + " is " + bs.y);
        } else {
            System.out.println("There is No Direct Relation between " + movA + " and " + movB);
        }
    }

    // 5. Consider the following relation T on the movies
    void findMovieTransRelation(String movA, String movB) throws Exception {
        String[] actors1 = getActors(movA);
        String[] actors2 = getActors(movB);
        Actor actor1 = getActor(actors1[0]);
        Actor actor2 = getActor(actors2[0]);
        LinkedList<String> actors_chain = new LinkedList<>();
        actors_chain.add(actor1.Name);
        Tuple<Boolean, Stack<Actor>> results = getTransitiveRelation(actor1, actor2);
        if (results.x) { // The is a transitive RelationShip
            System.out.println("Movies " + movA + ", " + movB + " are in a Transitive Relationship. Below is the Actors Chain.");
            results.y.forEach(actor -> System.out.println(actor.Name));
        } else { // There is No Relationship
            System.out.println("Movies " + movA + ", " + movB + " are not in a Transitive Relationship.");
        }
    }

    private Movie getMovie(String movie_name) throws Exception {
        return movies.stream()
                .filter(a -> a.Name.equals(movie_name))
                .findAny()
                .orElseThrow(() -> new Exception("No Movie with name " + movie_name));
    }

    private Actor getActor(String actor_name) throws Exception {
        return actors.stream()
                .filter(a -> a.Name.equals(actor_name))
                .findAny()
                .orElseThrow(() -> new Exception("No Actor with name " + actor_name));
    }

    private List<String> getMoviesOfActor(String actor) {
        List<String> ms = new ArrayList<>();
        actors.stream()
                .filter(a -> a.Name.equals(actor))
                .forEach(a -> a.CoStars.keySet().stream().map(m -> m.Name).forEach(ms::add));
        return ms;
    }

    private String[] getActors(String movie_name) throws Exception {
        movies.stream()
                .filter(a -> a.Name.equals(movie_name))
                .findAny()
                .orElseThrow(() -> new Exception("No Movie with name " + movie_name));
        String[] acs = new String[2];
        outer:
        for (int i = 0; i < actors.size(); i++) {
            Actor a1 = actors.get(i);
            for (Map.Entry<Movie, Actor> am : a1.CoStars.entrySet()) {
                if (am.getKey().Name.equals(movie_name)) {
                    acs[0] = a1.Name;
                    acs[1] = am.getValue() == null ? null : am.getValue().Name;
                    break outer;
                }
            }
        }
        return acs;
    }

    private Tuple<Boolean, String> getDirectRelation(String movA, String movB) throws Exception {
        String[] actors1 = getActors(movA);
        String[] actors2 = getActors(movB);
        String CommonActor = "";
        boolean isRelated = false;
        for (int i = 0; i < 2; i++) {
            if (actors1[i].equals(actors2[0]) || actors1[i].equals(actors2[1])) {
                CommonActor = actors1[i];
                isRelated = true;
                break;
            }
        }
        return new Tuple<>(isRelated, CommonActor);
    }

    private Tuple<Boolean, Stack<Actor>> getTransitiveRelation(Actor actor1, Actor actor2) {
        Map<Actor, Boolean> visited = new HashMap<>();
        Stack<Actor> actorsPath = new Stack<>();

        visited.put(actor1, true);
        actorsPath.push(actor1);
        Stack<Actor> co_actors = new Stack<>();
        // Push Unique Neighbours, since an actor an act in multiple movies with a single actor
        for (Actor actor : new HashSet<>(actor1.CoStars.values())) {
            if (actor.equals(actor2)) {
                actorsPath.push(actor2);
                return new Tuple<>(true, actorsPath);
            }
            co_actors.push(actor);
        }
        return helper(co_actors, actor2, actorsPath, visited, false);
    }

    private Tuple<Boolean, Stack<Actor>> helper(Stack<Actor> co_actors, Actor actor, Stack<Actor> actorsPath, Map<Actor, Boolean> visited, boolean found) {
        boolean prevoius_result = false;
        while (!co_actors.isEmpty()) {
            Actor temp = co_actors.pop();
            visited.put(temp, true);
            // Push the Actor Temporarily onto Actors Path
            actorsPath.push(temp);
            // Push Unique Neighbours, since an actor an act in multiple movies with a single actor
            Set<Actor> tempNeighbours = new HashSet<>(temp.CoStars.values());
            int count = 0; // How many neighbours added
            for (Actor a : tempNeighbours) {
                if (!visited.containsKey(a)) {
                    count++;
                    if (a.equals(actor)) {
                        found = true;
//                        actorsPath.push(actor);
                    }
                    co_actors.push(a); // Push related actors to Neighbour
                }
            }
            if (count == 0) {
                for (int i = 0; i < count; i++) {
                    if (!actorsPath.isEmpty()) actorsPath.pop(); // Remove that actor last pushed
                }
            }
            prevoius_result = helper(co_actors, actor, actorsPath, visited, found).x;
        }
        return prevoius_result ? new Tuple<>(true, actorsPath) : new Tuple<>(found, actorsPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        actors.forEach(actor -> sb.append(actor + "\n"));
        return sb.toString();
    }
}

class Actor {
    String Name;
    Map<Movie, Actor> CoStars;

    Actor(String _name) {
        Name = _name;
        CoStars = new HashMap<>();
    }

    boolean equals(Actor actor) {
        return Name.equals(actor.Name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Name + " => [");
        CoStars.forEach((movie, actor) -> sb.append("(" + movie.Name + " -> " + actor.Name + ")"));
        sb.append("]");
        return sb.toString();
    }
}

class Movie {
    String Name;

    Movie(String _name) {
        Name = _name;
    }

    @Override
    public String toString() {
        return Name;
    }
}

class Tuple<X, Y> {
    public final X x;
    public final Y y;

    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }
}