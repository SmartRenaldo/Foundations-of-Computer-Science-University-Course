public class MyGraph {
    //Attributes:
    private LinkedList[] adjListArray;
    // number of vertices
    private int v;
    private int[][] matrix;

    public MyGraph() {
    }

    public MyGraph(int v) {
        this.v = v;
        this.adjListArray = new LinkedList[v];
        for (int i = 0; i < this.adjListArray.length; i++) {
            this.adjListArray[i] = new LinkedList();
        }
        this.matrix = new int[v][v];
    }

    public LinkedList[] getAdjListArray() {
        return adjListArray;
    }

    public void setAdjListArray(LinkedList[] adjListArray) {
        this.adjListArray = adjListArray;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // transform an adjacency matrix to an adjacency list
    public void matrixToList(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    this.adjListArray[i].add(j);
                }
            }
        }
    }

    // Print graph as a matrix
    public void printMatrix() {
        //row index
        System.out.print("     ");
        for (int i = 0; i < this.matrix.length; i++) {
            System.out.printf("%-5d", i);
        }
        System.out.println();

        //show matrix with column index
        for (int i = 0; i < this.matrix.length; i++) {
            System.out.printf("%-5d", i);
            for (int j = 0; j < this.matrix[i].length; j++) {
                System.out.printf("%-5d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Add edge in graph
    public void addEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0 || v1 > this.v - 1 || v2 > this.v - 1 || v1 == v2) {
            System.out.println("Add failed!");
        } else {
            this.matrix[v1][v2] = 1;
        }
    }

    // Print out the adjacency list array
    public void displayAdjListArray() {
        for (int i = 0; i < this.adjListArray.length; i++) {
            String string = i + ":";
            System.out.printf("%-5s", string);
            this.adjListArray[i].print();
        }
    }

}
