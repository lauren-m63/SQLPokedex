package com.example.pokedex;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class PokedexMain extends AppCompatActivity {

    EditText nationalNumberInput;
    EditText nameInput;
    EditText speciesInput;
   int genderInput;
    EditText heightInput;
    EditText weightInput;
    EditText HPInput;
    EditText attackInput;
    EditText defenseInput;
    Button submitButton;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.table); // Make sure res/layout/layout.xml exists

        nationalNumberInput = findViewById(R.id.nationalNumberInput);
        nameInput = findViewById(R.id.nameInput);
        speciesInput = findViewById(R.id.speciesInput);
        heightInput = findViewById(R.id.heightInput);
        weightInput = findViewById(R.id.weightInput);
        HPInput = findViewById(R.id.HPInput);
        attackInput = findViewById(R.id.attackInput);
        defenseInput = findViewById(R.id.defenseInput);
        //levelInput hi
       //genderInput = findViewById(genderInput);
        submitButton  = findViewById(R.id.submitButton);
        resetButton = findViewById(R.id.resetButton);

        String nationalNumberInputString = nationalNumberInput.getText().toString();
        String nameInputString = nameInput.getText().toString();
        String speciesInputString = speciesInput.getText().toString();
        String heightInputString = heightInput.getText().toString();
        String weightInputString = weightInput.getText().toString();
        String hpInputString = HPInput.getText().toString();
        String attackInputString = attackInput.getText().toString();
        String defenseInputString = defenseInput.getText().toString();


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(nationalNumberInput.getText().toString());
                String name = nameInput.getText().toString();
                String species = speciesInput.getText().toString();
                double height = Double.parseDouble(heightInput.getText().toString());
                double weight = Double.parseDouble(weightInput.getText().toString());
                //int level = Integer.parseInt(levelSpinner.getSelectedItem().toString());
                int hp = Integer.parseInt(HPInput.getText().toString());
                int attack = Integer.parseInt(attackInput.getText().toString());
                int defense = Integer.parseInt(defenseInput.getText().toString());

                // rn the submit button is crashing my app

                Toast.makeText(v.getContext(), number, Toast.LENGTH_SHORT);
                // when you put a toast inside onClick your context has to be the views context.. not this
            }
        }); // end submit on Click listener




          // Retrieve its text (e.g., "Male", "Female", "Unknown")
          //String gender = selectedRadio.getText().toString();

         // Pokedex entry = new Pokedex(
                  //number, name, species, gender,
                 // height, weight, 1, hp, attack, defense
        //  );


        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nationalNumberInput.setText("896");
                nameInput.setText("Glastrier");
                speciesInput.setText("Wild Horse Pokemon");
                // gender input
                heightInput.setText("2.2");
                weightInput.setText("800.0");
                //level input
                HPInput.setText("0");
                attackInput.setText("0");
                defenseInput.setText("0");

            }
        });  // end on click listener





    } // end on create



} // end class
