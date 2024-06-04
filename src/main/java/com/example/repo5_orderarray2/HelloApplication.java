package com.example.repo5_orderarray2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    }

    public static void main(String[] args) {

        char[] LettersArray = {'z', 'b', 'e', 'f', 'a', 'c', 'o'}; //Array defining and initialization

        int lengthArray = LettersArray.length; //Assigns the number of the NumberArray's elements to the lengthArray variable

        /* The "lengthArray" variable will be used to establish a superior limit in the next for cycle */
        // Loop to sort array using bubble method
        for (int i = 0; i < lengthArray - 1; i++) {
            for (int j = 0; j < lengthArray - 1; j++) {
                if (LettersArray[j] > LettersArray[j + 1]) {
                    int temp = LettersArray[j];
                    LettersArray[j] = LettersArray[j + 1];
                    LettersArray[j + 1] = (char) temp;
                    /* The basic idea is the iterative positioning of new holes (so-called “bubbles”) into the present structure of the component */
                }
            }
        }

        // print ordered array
        System.out.println("Ordered array: ");
        for (int i = 0 ; i<lengthArray ; i++) {
            System.out.print(LettersArray[i] + " ");
        }
    }
}