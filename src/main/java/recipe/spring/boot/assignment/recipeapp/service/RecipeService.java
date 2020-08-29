package recipe.spring.boot.assignment.recipeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipe.spring.boot.assignment.recipeapp.entity.Recipe;
import recipe.spring.boot.assignment.recipeapp.repository.RecipeRepository;

import java.util.List;
@Service
public class RecipeService {
    @Autowired
    private RecipeRepository repository;

    public Recipe saveRecipe(Recipe recipe){
        return repository.save(Recipe);
    }

    public List<Recipe> saveRecipes(List<Recipe> recipes){
        return repository.saveAll(recipes);
    }

    public List<Recipe> getRecipes(){
        return repository.findAll();
    }

    public Recipe getRecipeById(int id){
        return repository.findById(id).orElse(null);
    }

    public Recipe getRecipeByName(String name){
        return repository.findByName(name);
    }

    public String deleteRecipe(int id){
        repository.deleteById(id);
        return "recipe removed !!" + id;
    }

    public Recipe updateRecipe(Recipe recipe){
        Recipe existingRecipe = repository.findById(recipe.getId()).orElse(null);
        existingRecipe.setName(recipe.getname());
        existingRecipe.setIngredients(recipe.getIngredients());
        existingRecipe.setTime(recipe.getTime());
        return repository.save(existingRecipe);
    }
}
