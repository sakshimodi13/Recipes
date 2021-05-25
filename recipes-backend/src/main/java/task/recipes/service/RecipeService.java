package task.recipes.service;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import task.recipes.data.RecipeRepository;
import task.recipes.model.Recipe;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private  RecipeRepository repository;

    public Flux<Recipe> getAll() {
        return repository.findAll();
    }

    public Mono<Recipe> get(String id) {
        return repository.findById(id);
    }

    public Mono<Recipe> create(Mono<Recipe> recipe) {
        return recipe.flatMap(repository::save);
    }

    public Mono<Recipe> update(Mono<Recipe> recipe) {
        return recipe.flatMap(repository::save);
    }

    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

}
