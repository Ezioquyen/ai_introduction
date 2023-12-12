package org.example;

import org.example.model.Input;
import org.example.model.Vertical;
import org.example.process.Algorithm;
import org.example.process.DataProcess;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataProcess dataProcess = new DataProcess();
        //Example input
        Vertical start = new Vertical(21.021710, 105.828918);
        Vertical end = new Vertical(21.022475066870633,105.8281084508101);
        Algorithm algorithm = new Algorithm(dataProcess, new Input(start,end));
        for(Vertical vertical : algorithm.solve()){
            System.out.println(vertical.getX()+ ","+vertical.getY());

        }
    }
}