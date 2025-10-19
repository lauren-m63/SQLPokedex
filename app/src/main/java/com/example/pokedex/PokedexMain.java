package com.example.pokedex;

import android.os.Bundle;
import android.util.Log;
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
    Pokedex pokedex;

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




        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nationalNumberInputString = nationalNumberInput.getText().toString();

                int nationalNumberInputInt= Integer.parseInt(nationalNumberInputString);

                String nameInputString = nameInput.getText().toString();
                String speciesInputString = speciesInput.getText().toString();
                String heightInputString = heightInput.getText().toString();
                if (!heightInputString.isEmpty()) {
                    double heightInputDouble = Double.parseDouble(heightInputString);
                }

                String weightInputString = weightInput.getText().toString();
                if (!weightInputString.isEmpty()) {
                    double weightInputDouble = Double.parseDouble(weightInputString);
                }

                String hpInputString = HPInput.getText().toString();
                int hpInputInt= Integer.parseInt(hpInputString);
                String attackInputString = attackInput.getText().toString();
                int attackInputInt= Integer.parseInt(attackInputString);
                String defenseInputString = defenseInput.getText().toString();
                int defenseInputInt= Integer.parseInt(defenseInputString);


                Log.i("LAUREN", nationalNumberInputString);

                boolean isNum= pokedex.isNumber(nationalNumberInputInt);
                if (isNum ){
                    Toast.makeText(v.getContext(),"hi", Toast.LENGTH_LONG).show();
                }




                // check if empty
                //CURRENTLY DOING
//                if (nationalNumberInputString nameInputString, speciesInputString, heightInputString, weightInputString,
//                hpInputString, attackInputString, defenseInputString != ""){
//
//                }

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


//
//old
//int number = Integer.parseInt(nationalNumberInput.getText().toString());
//                String name = nameInput.getText().toString();
//                String species = speciesInput.getText().toString();
//                double height = Double.parseDouble(heightInput.getText().toString());
//                double weight = Double.parseDouble(weightInput.getText().toString());
//                //int level = Integer.parseInt(levelSpinner.getSelectedItem().toString());
//                int hp = Integer.parseInt(HPInput.getText().toString());
//                int attack = Integer.parseInt(attackInput.getText().toString());
//                int defense = Integer.parseInt(defenseInput.getText().toString());