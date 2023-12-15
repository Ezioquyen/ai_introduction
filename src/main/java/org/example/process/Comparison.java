package org.example.process;

import lombok.Data;
import org.example.model.Input;

@Data
public class Comparison {
   private Integer fromLabel;
   private Integer toLabel;
   private DataProcess dataProcess;
   private Long startTime;
   private Long endTime;
   public void getResult(){
      Algorithm aStarAlgorithm = new AStarAlgorithm();
      aStarAlgorithm.setDataProcess(dataProcess);
      aStarAlgorithm.setInput(new Input(dataProcess.getLabelMapper().get(fromLabel),dataProcess.getLabelMapper().get(toLabel)));
      Algorithm dijkstraAlgorithm = new AStarAlgorithm();
      dijkstraAlgorithm.setDataProcess(dataProcess);
      dijkstraAlgorithm.setInput(new Input(dataProcess.getLabelMapper().get(fromLabel),dataProcess.getLabelMapper().get(toLabel)));
      startTime = System.currentTimeMillis();
      aStarAlgorithm.solve();
      endTime = System.currentTimeMillis();
      System.out.println("A*: "+(endTime-startTime));

      startTime = System.currentTimeMillis();
      dijkstraAlgorithm.solve();
      endTime = System.currentTimeMillis();
      System.out.println("Dijkstra: "+(endTime-startTime));
   }
}
