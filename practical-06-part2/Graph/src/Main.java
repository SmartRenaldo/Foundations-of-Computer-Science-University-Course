public class Main {
    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph(5);
        myGraph.printMatrix();
        System.out.println();

        //test valid input
        myGraph.addEdge(1,3);
        myGraph.addEdge(1,4);
        myGraph.addEdge(2,4);
        myGraph.addEdge(3,1);
        myGraph.addEdge(3,2);
        myGraph.addEdge(4,3);
        myGraph.printMatrix();
        System.out.println();

        //test invalid input
        myGraph.addEdge(-5,9);
        myGraph.addEdge(5,5);
        myGraph.addEdge(1,1);
        System.out.println();

        myGraph.matrixToList(myGraph.getMatrix());
        myGraph.displayAdjListArray();
    }
}
