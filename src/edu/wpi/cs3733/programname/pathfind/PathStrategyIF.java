package edu.wpi.cs3733.programname.pathfind;
import edu.wpi.cs3733.programname.commondata.Edge;
import edu.wpi.cs3733.programname.commondata.NodeData;

import java.util.LinkedList;
import java.util.List;
public interface PathStrategyIF {
    void PathStrategy();
    LinkedList<Edge> getEdges(LinkedList<Edge> allEdges);
}
