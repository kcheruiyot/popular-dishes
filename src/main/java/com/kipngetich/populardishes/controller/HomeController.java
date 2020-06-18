package com.kipngetich.populardishes.controller;

import com.kipngetich.populardishes.model.Dish;
import com.kipngetich.populardishes.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kipngetich
 */
@Controller
public class HomeController {
 @Autowired
    private DishRepository dishRepository;
    @GetMapping
     public String index(Model model){
        Dish dish1 = new Dish();
        dish1.setName("Nyama choma, sukuma wiki and ugali");
        dish1.setBriefDescription("~According to Ethan, Ugali is a vegetable.... (He thinks) but not sure");
        dish1.setDescription("");
        List<String> ingredients1 = new ArrayList<>();
       ingredients1.add("");
        dish1.setIngredients(ingredients1);
        List<String> instructions1 = new ArrayList<>();
        instructions1.add("");
        dish1.setInstructions(instructions1);
        List<String> serve = new ArrayList<>();
        serve.add("");
        dish1.setServe(serve);
        List<String> comments1 = new ArrayList<>();
        comments1.add("By abc, 6/17/20 Looks good");
        dish1.setComments(comments1);
        dish1.setImgURL("nyama-choma-sukuma-wiki-ugali-and-kachumbari.jpg");



        Dish dish2 = new Dish();
        dish2.setName("Cambuulo iyo Maraq");
        dish2.setBriefDescription("~Rice with Adzuki Beans in a Spicy Tomato Sauce");
        dish2.setDescription("This is a famous Somali dish usually served with sesame oil and a drizzle of sugar. It can be a mix of rice and adzuki beans or any kind of beans or lentils, corn and beans or sometimes just adzuki beans. Cambuulo is usually eaten for supper.");
        List<String> ingredients2 = new ArrayList<>();
        ingredients2.add("1 cup long grain Basmati rice.");
        ingredients2.add("1 cup cooked adzuki beans or any kind of lentil (soak overnight and boil for about 20 minutes if using dried beans) 400g can of diced tomatoes or 6 fresh tomatoes, diced (keep aside a handful for garnish or use toasted nuts and fresh coriander");
        ingredients2.add("2 tablespoons tomato paste");
        ingredients2.add("2 tablespoons tomato paste");
        ingredients2.add("1 teaspoon ground coriander seeds");
        ingredients2.add("1 teaspoon ground cumin seeds.");
        ingredients2.add("1 teaspoon ground chilli powder or chilli flakes. You can two green chillies (diced) as a substitute.");
        ingredients2.add("2 cloves of garlic, minced finely");
        ingredients2.add("1 large onion, diced");
        ingredients2.add("2 tablespoons sesame oil");
        ingredients2.add("1 tablespoon white vinegar");
        ingredients2.add("Juice of one lemon");
        ingredients2.add("Salt to taste");
        ingredients2.add("1 cup water");
        dish2.setIngredients(ingredients2);
        List<String> instructions2 = new ArrayList<>();
        instructions2.add("Cover the rice with one and a half cups of water and a pinch of salt. Cover the pan and cook over low heat until the rice is done. This should take about 15 minutes.");
        instructions2.add("Mix in the cooked adzuki beans and keep aside.");
        instructions2.add("Saute the onions in the sesame oil until translucent.");
        instructions2.add("Add in the garlic and cook for about a minute");
        instructions2.add("Add in the diced tomato, tomato paste, cumin, coriander and chilli and cook for about five minutes. Add water to ensure the sauce doesn’t dry out. You want a thick, soupy consistency.");
        instructions2.add("Add the white vinegar and lemon juice. Simmer over low heat for about five minutes.");

        dish2.setInstructions(instructions2);
        List<String> serve2 = new ArrayList<>();
        serve2.add("Serve the cambuulo mixture in a bowl.");
        serve2.add("Generously spoon the tomato sauce over the cambuulo");
        serve2.add("Garnish with diced tomato. Sometimes we use fried onions as a garnish.");
        dish2.setServe(serve2);
        dish2.setImgURL("Cambuulo-iyo-Maraq.jpg");
        List<String> comments2 = new ArrayList<>();
        comments2.add("By xyz, 6/17/20 Looks good");
        dish2.setComments(comments2);
        List<Dish> dishes = new ArrayList<>();
        dishes.add(dish1);
       // dishes.add(dish2);
        model.addAttribute(new Dish());
       dishRepository.save(dish1);
        dishRepository.save(dish2);
        model.addAttribute("dishes",dishes);


        return "index";
    }
}
