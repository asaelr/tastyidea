package com.example.asaelr.tastyidea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IngCategory.initialize(this);
    }

    public void handleSearchPressed(View view)
    {
        startActivity(new Intent(this, SearchActivity.class));
    }

    public void handleSettingsPressed(View view)
    {
        startActivity(new Intent(this, SettingsActivity.class));
    }

    public void handleAddRecepiePressed(View view)
    {
        startActivity(new Intent(this, AddRecepieActivity.class));
    }
    public void showRecipesList(View view)
    {
        startActivity(new Intent(this, RecipesListActivity.class));
    }
    public void showRecipe(View view)
    {
        startActivity(new Intent(this, RecipeViewActivity.class));
    }
}
