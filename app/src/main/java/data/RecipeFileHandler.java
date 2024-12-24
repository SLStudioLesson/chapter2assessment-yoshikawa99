/*package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RecipeFileHandler {
    private String filePath;

    public RecipeFileHandler() {
        filePath = "app/src/main/resources/recipes.txt";
    }

    public RecipeFileHandler(String filePath) {
        this.filePath = filePath;
    }
}

    /**
     * 設問1: 一覧表示機能
     * recipes.txtからレシピデータを読み込み、それをリスト形式で返します。 <br> 
     * IOExceptionが発生したときは<i>Error reading file: 例外のメッセージ</i>とコンソールに表示します。
     *
     * @return レシピデータ
     */
/*    public ArrayList<String> readRecipes() {
        ArrayList<String> a = new ArrayList<>();
        String filename = "resources/recipes.txt";
        File dataFile = new File(filename);
        if (dataFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    a.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file:" + e.getMessage());
        }
        return null;
    }
}
 */

    /**
     * 設問2: 新規登録機能
     * 新しいレシピをrecipes.txtに追加します。<br>
     * レシピ名と材料はカンマ区切りで1行としてファイルに書き込まれます。
     *
     * @param recipeName  レシピ名
     * @param ingredients 材料名
     */
    //
/*     public void addRecipe(String recipeName, String ingredients) {
        String file = "resources.recipes";
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        Writer.write(line);
        try {
            System.out.println("Main :Menu");
            System.out.println("1: Display Recipes");
            System.out.println("2: Add New Recipe");
            System.out.println("3: Search Recipe");
            System.out.println("4: Exit Application");
            System.out.println("Please choose an option: 1");
            System.out.println("Recipes:");
        } catch (IOException e) {

        }
    }
}
*/