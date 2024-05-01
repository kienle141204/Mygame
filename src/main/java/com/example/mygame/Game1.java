package com.example.mygame;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;


public class Game1 extends Application
{
    @Override
    public void start(Stage primaryStage) {
        try {
            int RECT_SIZE = 44;
            int[][] mazeData = {
                    {9,9,9,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,9,9,9},
                    {9,9,9,0,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,9,9,9},
                    {9,9,9,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,1,0,9,9,9},
                    {9,9,9,0,1,0,1,1,1,0,1,0,1,0,1,1,1,0,1,0,9,9,9},
                    {9,9,9,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,9,9,9},
                    {9,9,9,0,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,0,9,9,9},
                    {9,9,9,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,9,9,9},
                    {9,9,9,0,1,1,1,0,1,0,1,1,1,0,1,0,1,0,1,0,9,9,9},
                    {9,9,9,0,0,0,1,0,1,0,1,-1,1,0,1,0,1,0,1,0,9,9,9},
                    {9,9,9,0,1,0,1,0,1,0,1,1,1,0,1,1,1,0,1,0,9,9,9},
                    {9,9,9,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,9,9,9},
                    {9,9,9,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,9,9,9},
                    {9,9,9,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,0,0,9,9,9},
                    {9,9,9,0,1,1,1,1,1,0,1,0,1,1,1,0,1,1,1,0,9,9,9},
                    {9,9,9,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,9,9,9},
                    {9,9,9,0,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,0,9,9,9},
                    {9,9,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,9,9}
            };
            int characterX = RECT_SIZE* (mazeData[0].length/2);

            Pane root = new Pane() ;
            MazeDisplayer maze1 = new MazeDisplayer(root, mazeData,RECT_SIZE,characterX);
            Scene scene = maze1.getSceneMaze1(1000, 750) ;
            primaryStage.setTitle("Maze");
            primaryStage.setScene(scene);
            primaryStage.show();


        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}