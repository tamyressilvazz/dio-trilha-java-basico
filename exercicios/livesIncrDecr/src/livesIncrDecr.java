public class livesIncrDecr {
    public static void main(String[] args) throws Exception {
            // Initial values
            int points = 5;
            int bonus = 10;
            int lives = 3;
            
            // Predict the values
            int result1 = points;  // Store original points value
            int result2 = ++bonus;   // Store increased bonus value
            int result3 = --lives;   // Store decreased lives value
            int result4 = lives--;   // Store current lives value before decrease
            
            // Fill in your predictions
            int finalPoints = ++points;    // Final value of points
            int finalBonus = bonus;     // Final value of bonus
            int finalLives = lives;     // Final value of lives
            
            // Don't modify the code below
            System.out.println("Results of Operations:");
            System.out.println("---------------------");
            System.out.println("result1 = " + result1);
            System.out.println("result2 = " + result2);
            System.out.println("result3 = " + result3);
            System.out.println("result4 = " + result4);
            System.out.println("\nFinal Values:");
            System.out.println("-------------");
            System.out.println("points = " + finalPoints);
            System.out.println("bonus = " + finalBonus);
            System.out.println("lives = " + finalLives);
    }
}
