package dk.cngroup.training.java8.lambdas;

public class Chef {
	public void cookMeal(Recipe recipe, String[] ingredients, int[] quantities) {
		System.out.println(recipe.cook(ingredients, quantities));
	}
}
