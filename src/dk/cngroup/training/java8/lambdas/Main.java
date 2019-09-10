package dk.cngroup.training.java8.lambdas;

public class Main {

	public static void main(String[] args) {
		// Create our chefs
		Chef ondrej = new Chef();

		// Create list of ingredients and their quantities
		String[] ingredients = {"beef", "onions", "pepper"};
		int[] quantities = {3, 1, 2};

		Recipe steak = (ing, qua) -> "You get " + qua[0] + " kg of barbecued" + ing[0]
				+ " and I add " + qua[1] + " fresh" + ing[1]
				+ " and " + qua[2] + " table spoons of" + ing[2];

		Recipe goulash = (ing, qua) -> "You get " + qua[0] + " kg of " + ing[0]
				+ " and " + qua[1] + " kg of " + ing[1]
				+ " and " + qua[2] + " table spoons of " + ing[2] + " cooked all together, plus bread dumplings";


		ondrej.cookMeal(steak, ingredients, quantities);
		ondrej.cookMeal(goulash, ingredients, quantities);
		ondrej.cookMeal((a, b) -> "You get " + b[0] + " kg of raw " + a[0] + ". #NoVegans!!!", ingredients, quantities);
	}
}
