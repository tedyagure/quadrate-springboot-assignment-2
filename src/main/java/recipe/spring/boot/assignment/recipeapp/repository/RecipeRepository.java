package recipe.spring.boot.assignment.recipeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recipe.spring.boot.assignment.recipeapp.entity.Recipe;
public interface RecipeRepository extends JpaRepository<Recipe,Integer> {
    Recipe findByName(String name);
}
