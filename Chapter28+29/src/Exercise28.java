import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise28 {

    public static void main(String[] args){
        //Hjælp fra guden Sammy
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String fileName = input.nextLine();
        try {
            Scanner readFile = new Scanner(new File(fileName));
            String amountOfVertices = readFile.nextLine();
            System.out.println("The number of vertices is " + amountOfVertices);
            List<AbstractGraph.Edge> listE = new ArrayList<>();

            while (readFile.hasNextLine()) {
                String s = readFile.nextLine();
                List<String> vx = Arrays.asList(s.split(" "));
                for (int i = 1; i < vx.size(); i++) {
                    AbstractGraph.Edge edge = new AbstractGraph.Edge(Integer.parseInt(vx.get(0)), Integer.parseInt(vx.get(i)));
                    listE.add(edge);
                }
            }

            UnweightedGraph g = new UnweightedGraph(listE, Integer.parseInt(amountOfVertices));
            g.printEdges();
            AbstractGraph.Tree tree = g.dfs(Integer.parseInt(amountOfVertices) - 1);
            if (tree.getNumberOfVerticesFound() == Integer.parseInt(amountOfVertices)) {
                System.out.println("The graph is connected");
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
