package com.provectus.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class WordCounter {
    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis semper, massa vitae tempus malesuada, lorem lacus tempus dui, ut lobortis nibh arcu eget leo. Sed quis sem eget sem pretium viverra sit amet at mauris. Sed fringilla felis dui, nec aliquet ante ullamcorper ut. Nullam pulvinar eros a molestie fringilla. Maecenas lobortis pretium libero, in porta risus vestibulum volutpat. Morbi fermentum massa a metus tristique, a cursus nibh vestibulum. In hac habitasse platea dictumst. Quisque in metus urna. Proin lacinia orci non lorem lacinia, sed ultrices tortor pharetra. Mauris aliquet, libero id accumsan porttitor, turpis sem rutrum urna, a lacinia felis ipsum sit amet nisl. Integer euismod fringilla maximus. Sed tristique placerat mi nec auctor. Phasellus sagittis nibh quis felis pellentesque, ut sollicitudin nibh auctor. Duis urna eros, iaculis id augue ac, feugiat lacinia orci.Mauris volutpat tincidunt consequat. Fusce aliquam, risus vel viverra interdum, est purus semper dolor, vel viverra nisl magna in orci. Nunc quis fermentum risus, non auctor est. Nunc cursus vehicula mauris, ut sagittis arcu cursus eget. Mauris sem leo, congue nec felis quis, pulvinar imperdiet est. Donec sit amet lorem sagittis, fringilla lectus a, faucibus tellus. Nullam metus eros, sodales vel risus posuere, feugiat suscipit.";
        String[] words = input.split(" ");

        Map<String, Integer> wordCounterMap = new HashMap<>();
        for (String word : words) {
            word = word.replace(".", "").replace(",", "").toLowerCase();

            if (wordCounterMap.containsKey(word)) {
                int count = wordCounterMap.get(word);
                wordCounterMap.put(word, ++count);
            } else {
                wordCounterMap.put(word, 1);
            }
        }
        System.out.println(wordCounterMap);
    }
}
