package com.boucetta.insertsort;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,
            button12,button13,button14,button15,button16,button17,button18,button19,button20,
            button21,button22,button23,button24,choose,sort,bubble;
    ArrayList<Button> listButtons = new ArrayList<>();
    int countInsert,countBubble;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Insert and bubble sort algorithms");
        progressBar = findViewById(R.id.progressBar);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        choose = findViewById(R.id.choose);
        sort = findViewById(R.id.sort);
        bubble = findViewById(R.id.bubble);
        fillListButton();

        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random myRandom = new Random();
                progressBar.setProgress(0);
                for (Button button:listButtons) {
                    button.setTextSize(25);
                    button.setTextColor(getResources().getColor(R.color.black));
                    button.setText(Integer.toString(myRandom.nextInt(100)));
                    countInsert = 1;
                    countBubble = 0;
                }

            }
        });

        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listButtons.get(0).setTextColor(getResources().getColor(R.color.green));
                if (countInsert<=24) {
                    progressBar.setProgress(countInsert);
                    listButtons.get(countInsert).setTextColor(getResources().getColor(R.color.green));
                    int key = Integer.parseInt(listButtons.get(countInsert).getText().toString());
                    int j = countInsert - 1;

                    while (j >= 0 && Integer.parseInt(listButtons.get(j).getText().toString()) > key) {
                        listButtons.get(j + 1).setText(listButtons.get(j).getText().toString());
                        listButtons.get(j).setText(Integer.toString(key));
                        j--;

                    }
                    countInsert++;
                }

            }
        });

        bubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countBubble<=24) {
                    progressBar.setProgress(countBubble);
                    listButtons.get(countBubble).setTextColor(getResources().getColor(R.color.green));
                    for (int j=24;j>=countBubble + 1;j--) {
                        String temp;
                        if (Integer.parseInt(listButtons.get(j).getText().toString())<
                                Integer.parseInt(listButtons.get(j-1).getText().toString())){
                          temp = listButtons.get(j).getText().toString();
                          listButtons.get(j).setText(listButtons.get(j-1).getText().toString());
                            listButtons.get(j-1).setText(temp);

                        }
                    }
                    countBubble++;
                }
            }
        });

    }

    public void fillListButton() {
        listButtons.add(button0);
        listButtons.add(button1);
        listButtons.add(button2);
        listButtons.add(button3);
        listButtons.add(button4);
        listButtons.add(button5);
        listButtons.add(button6);
        listButtons.add(button7);
        listButtons.add(button8);
        listButtons.add(button9);
        listButtons.add(button10);
        listButtons.add(button11);
        listButtons.add(button12);
        listButtons.add(button13);
        listButtons.add(button14);
        listButtons.add(button15);
        listButtons.add(button16);
        listButtons.add(button17);
        listButtons.add(button18);
        listButtons.add(button19);
        listButtons.add(button20);
        listButtons.add(button21);
        listButtons.add(button22);
        listButtons.add(button23);
        listButtons.add(button24);

    }
}