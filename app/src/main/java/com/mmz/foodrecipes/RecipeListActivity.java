package com.mmz.foodrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecipeListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        findViewById(R.id.btTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mProgressbar.getVisibility() == View.VISIBLE){
                    showProgreeBar(false);
                }
                else{
                    showProgreeBar(true);
                }
            }
        });
    }
}
