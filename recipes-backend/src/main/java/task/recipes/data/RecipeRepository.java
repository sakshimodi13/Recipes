package task.recipes.data;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import task.recipes.model.Recipe;

public interface RecipeRepository extends ReactiveMongoRepository<Recipe, String> {
}
