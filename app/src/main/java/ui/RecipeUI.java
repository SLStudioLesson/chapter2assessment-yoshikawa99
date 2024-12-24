package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

import data.RecipeFileHandler;

public class RecipeUI {
    private BufferedReader reader;
    private RecipeFileHandler fileHandler;

    public RecipeUI() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        fileHandler = new RecipeFileHandler();
    }

    public RecipeUI(BufferedReader reader, RecipeFileHandler fileHandler) {
        this.reader = reader;
        this.fileHandler = fileHandler;
    }

    public void displayMenu() {
        while (true) {
            try {
                System.out.println();
                System.out.println("Main Menu:");
                System.out.println("1: Display Recipes");
                System.out.println("2: Add New Recipe");
                System.out.println("3: Search Recipe");
                System.out.println("4: Exit Application");
                System.out.print("Please choose an option: ");

                String choice = reader.readLine();

                switch (choice) {
                    case "1":
                        // 設問1: 一覧表示機能
                        System.out.println("Disply the recipe");
                        this.displayRecipes();
                        break;
                    case "2":
                        // 設問2: 新規登録機能
                        System.out.println("Add new recipe");
                        break;
                    case "3":
                        // 設問3: 検索機能
                        System.out.println("Search the recipe");
                        break;
                    case "4":
                        System.out.println("Exit the application.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error reading input from user: " + e.getMessage());
            }
        }
    }

    /**
     * 設問1: 一覧表示機能
     * RecipeFileHandlerから読み込んだレシピデータを整形してコンソールに表示します。
     */
    String file = "resources/recipes";
    private void displayRecipes() {
        ArrayList<String> recipe = new ArrayList<>();
        recipe = fileHandler.readRecipes();
        //文字が空だった場合の出力
        if (recipe.isEmpty()) {
            System.out.println("No recipes available.");
        } else {
            System.out.println("Recipes");
        }
        //
        for (String pair : recipe) {
            String[] key = pair.split(",");
            System.out.print(key[0]);
            for (int i = 0; i < key.length; i++) {
                System.out.println("," + key[i + 1]);
            }
            System.out.println();
            
        }


    }

    /**
     * 設問2: 新規登録機能
     * ユーザーからレシピ名と主な材料を入力させ、RecipeFileHandlerを使用してrecipes.txtに新しいレシピを追加します。
     *
     * @throws java.io.IOException 入出力が受け付けられない
     */
    private void addNewRecipe() throws IOException {
        System.out.print("Enter recipe name:");
        String recipeName = reader.readLine();
        System.out.print("Enter main ingredients (comma separated):");
        String ingredients = reader.readLine();
        fileHandler.addRecipe(recipeName, ingredients);
    }

    /**
     * 設問3: 検索機能
     * ユーザーから検索クエリを入力させ、そのクエリに基づいてレシピを検索し、一致するレシピをコンソールに表示します。
     *
     * @throws java.io.IOException 入出力が受け付けられない
     */
    //private void searchRecipe() throws IOException {

    //}

}

