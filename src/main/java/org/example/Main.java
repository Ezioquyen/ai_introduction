package org.example;


import org.example.model.Input;
import org.example.model.Vertical;
import org.example.process.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataProcess dataProcess = new DataProcess();
        //Example input
      /*  Vertical start = new Vertical(21.031916, 105.830775);
        Vertical end = new Vertical(21.031523, 105.832145);
        Algorithm algorithm = new AStarAlgorithm();
        algorithm.setDataProcess(dataProcess);
        algorithm.setInput(new Input(start,end));
        StringBuilder outPut = new StringBuilder();
        for(Vertical vertical: algorithm.solve()){
            outPut.append(vertical.getX()).append(",").append(vertical.getY()).append("|");
        }
        outPut = new StringBuilder(outPut.substring(0, outPut.length() - 1));
        System.out.println(outPut);*/
        Integer fromLabel = 1;
        Integer toLabel = 96;
        Input input = new Input(dataProcess.getLabelMapper().get(fromLabel),dataProcess.getLabelMapper().get(toLabel));
        Comparison comparison = new Comparison(input,dataProcess,AlgorithmName.DIJKSTRA);
        comparison.getResult();
    }
}