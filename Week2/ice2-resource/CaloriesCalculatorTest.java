public class CaloriesCalculatorTest {
    public static void main(String[] args) {
        // A. create new year goodie objects:

        NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts", 82.5, 20); 
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28); 
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13); 
        
        // B. 

        System.out.printf("Pineapple Tarts more sinful than Bak Kwa: %b\n", tart.isMoreSinful(bakKwa)); 
        System.out.println(); 

        // C. 
        System.out.printf("Pineapple Tarts (calories per gram): %.2f \n", tart.getCaloriesPerGram()); 
        System.out.printf("Bak Kwa (calories per gram): %.2f \n", bakKwa.getCaloriesPerGram()); 
        System.out.printf("Love Letters (calories per gram): %.2f \n", loveLetters.getCaloriesPerGram()); 
        System.out.println(); 
        
        // D.
        CaloriesCalculator calc = new CaloriesCalculator();

        // E. 
        calc.addNewYearGoodie(tart, 2);
        calc.addNewYearGoodie(bakKwa, 3);
        calc.addNewYearGoodie(loveLetters, 5); 

        System.out.printf("Total Calories: %.2f\n", calc.getTotalCalories()); 
        
        //F.
        System.out.printf("Most sinful goodie: %s\n", calc.getMostSinfulGoodie().getName());
    
    }
}
