package first_classes;

public class Lesson50_Practice {
    // 1. Go to IMDB and choose an actress or actor
    // 2. Get date of birth, movies & their ratings
    // 3. Create vars for name, DOB, array for movie titles and ratings
    // 4. Print the name of the person
    // 5. Print the year of born & calculate the age and print it
    // 6. Print out the movie title
    // 7. Create a function:
    // - if ratings are <= 5.0 - print bad
    // - if ratings are > 5.0 && <= 6.5 - pring average
    // - if ratings are > 6.5 && <= 7.0 - pring good
    // - if ratings are > 7.0 && <= 8.0 - pring very good
    // - if ratings are > 8.0 - print amazing
    // 8. Add the function result to the movie title

    public static String getRatingSummary(Double rating) {
        String result = "";
        if (rating <= 5.0) {
            result = "bad";
        } else if (rating > 5.0 && rating <= 6.5) {
            result =  "average";
        } else if (rating > 6.5 && rating <= 7.0) {
            result =  "good";
        } else if (rating > 7.0 && rating <= 8.0) {
            result =  "very good";
        } else if (rating > 8.0) {
            result = "amazing";
        }
        return result;
    }

    public static void main(String[] args) {
        // Data
        String actorName = "Denzel Washington";
        short yearOfBorn = 1954;
        String[] movies = {"Carbon Copy", "Crimson Tide", "2 Guns", "Malcolm X", "Cry Freedom", "The Book of Eli"};
        Double[] ratings = {5.6, 7.3, 6.7, 7.7, 7.4, 6.8};
        System.out.println("Introducing you... " + actorName + "!!!");
        System.out.println("Born in " + yearOfBorn + " he is " + (2022 - yearOfBorn) + " year old now!");
        System.out.println("Just look at the movies he was into: ");
        for(byte i = 0; i < movies.length; i++) {
            System.out.println("- '" + movies[i] + "' with " + getRatingSummary(ratings[i]) + " rating");
        }
    }
}
