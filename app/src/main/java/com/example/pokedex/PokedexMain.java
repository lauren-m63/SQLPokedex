package com.example.pokedex;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.LinkedList;

public class PokedexMain extends AppCompatActivity {

    EditText nationalNumberInput;
    EditText nameInput;
    EditText speciesInput;
   int genderInput;
    EditText heightInput;
    EditText weightInput;
    Spinner levelInput;
    EditText HPInput;
    EditText attackInput;
    EditText defenseInput;
    Button submitButton;
    Button resetButton;
    Pokedex pokedex;

    public boolean emptyString(String string){
        if (!string.isEmpty()){
            return true;
        }
        return false;
    }

    boolean allFieldsFilled(EditText... fields) {
        for (EditText field : fields) {
            if (field.getText().toString().trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.table); // Make sure res/layout/layout.xml exists

        LinkedList<String> levels = new LinkedList<>();
        for (int i = 1; i <= 50; i++) {
            levels.add(String.valueOf(i));
        }
        ArrayAdapter<String> levelsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, levels);
        levelSpinner.setAdapter(levelsAdapter);

        nationalNumberInput = findViewById(R.id.nationalNumberInput);
        nameInput = findViewById(R.id.nameInput);
        speciesInput = findViewById(R.id.speciesInput);
        heightInput = findViewById(R.id.heightInput);
        weightInput = findViewById(R.id.weightInput);
        HPInput = findViewById(R.id.HPInput);
        attackInput = findViewById(R.id.attackInput);
        defenseInput = findViewById(R.id.defenseInput);
        levelInput = findViewById(R.id.levelSpinner);
       //genderInput = findViewById(genderInput);
        submitButton  = findViewById(R.id.submitButton);
        resetButton = findViewById(R.id.resetButton);



        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //checking if fields are empty
                if (!allFieldsFilled(
                        nationalNumberInput,
                        nameInput,
                        speciesInput,
                        heightInput,
                        weightInput,
                        HPInput,
                        attackInput,
                        defenseInput
                )) {
                    Toast.makeText(v.getContext(), "Please fill out all fields.", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (allFieldsFilled()){
                    String nationalNumberInputString = nationalNumberInput.getText().toString();
                        int nationalNumberInputInt= Integer.parseInt(nationalNumberInputString);
                    String nameInputString = nameInput.getText().toString();
                    String speciesInputString = speciesInput.getText().toString();
                    String heightInputString = heightInput.getText().toString();
                        double heightInputDouble = Double.parseDouble(heightInputString);
                    String weightInputString = weightInput.getText().toString();
                        double weightInputDouble = Double.parseDouble(weightInputString);

                    String selectedLevelString = levelSpinner.getSelectedItem().toString();
                        int selectedLevel = Integer.parseInt(selectedLevelString);
                    String hpStringInput = HPInput.getText().toString();
                        int hpInputInt= Integer.parseInt(hpStringInput);
                    String attackInputString = attackInput.getText().toString();
                        int attackInputInt= Integer.parseInt(attackInputString);
                    String defenseInputString = defenseInput.getText().toString();
                        int defenseInputInt= Integer.parseInt(defenseInputString);

                    Log.i("Lauren", hpStringInput + hpInputInt);

                    String fixIt = "";
                    Toast.makeText(v.getContext(), "The following fields are not within bounds: " + fixIt, Toast.LENGTH_LONG ).show();


                }// end if statement



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
