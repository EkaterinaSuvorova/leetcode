public class FoodRatingsMain {
//    public static void main(String[] args) {
//        FoodRatings foodRatings = new FoodRatings(
//                new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
//                new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
//                new int[]{9, 12, 8, 15, 14, 7});
//        System.out.println(foodRatings.highestRated("korean")); // return "kimchi"
//        // "kimchi" is the highest rated korean food with a rating of 9.
//        System.out.println(foodRatings.highestRated("japanese")); // return "ramen"
//        // "ramen" is the highest rated japanese food with a rating of 14.
//        foodRatings.changeRating("sushi", 16); // "sushi" now has a rating of 16.
//        System.out.println(foodRatings.highestRated("japanese")); // return "sushi"
//        // "sushi" is the highest rated japanese food with a rating of 16.
//        foodRatings.changeRating("ramen", 16); // "ramen" now has a rating of 16.
//        System.out.println(foodRatings.highestRated("japanese"));
//    }

    public static void main(String[] args) {
        FoodRatings2 foodRatings = new FoodRatings2(
                new String[]{"hggdqqy","cngdddrb","mvssdifulc","uqwx","dpacfh","yoloibq","pvrzaec","wjj","vtnefrlens"},
                new String[]{"fpjqlpqf","fpjqlpqf","fpjqlpqf","fpjqlpqf","fpjqlpqf","fpjqlpqf","fpjqlpqf","fpjqlpqf","fpjqlpqf"},
                new int[] {4,14,12,6,18,8,12,18,10});
        System.out.println(foodRatings.highestRated("fpjqlpqf")); // return "kimchi"
        // "kimchi" is the highest rated korean food with a rating of 9.
        //System.out.println(foodRatings.highestRated("japanese")); // return "ramen"
        // "ramen" is the highest rated japanese food with a rating of 14.
        foodRatings.changeRating("wjj",3); // "sushi" now has a rating of 16.
        System.out.println(foodRatings.highestRated("fpjqlpqf")); // return "sushi"
        System.out.println(foodRatings.highestRated("fpjqlpqf")); // return "sushi"
        // "sushi" is the highest rated japanese food with a rating of 16.
        foodRatings.changeRating("mvssdifulc",2); // "ramen" now has a rating of 16.
        foodRatings.changeRating("uqwx",10); // "ramen" now has a rating of 16.
        foodRatings.changeRating("wjj",4); // "ramen" now has a rating of 16.
        foodRatings.changeRating("dpacfh",15); // "ramen" now has a rating of 16.
    }
}
