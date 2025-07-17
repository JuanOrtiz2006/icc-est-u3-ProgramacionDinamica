import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Juan Pablo Ortiz");
        //runEjerciciosPD();
        runMaze();
    }

    private static void runEjericiciosPD(){
        
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        System.out.println("Fibonacci recursivo");
        long start=0;
        int resultado = ejerciciosPD.getFibonacci(50);
        long end=0;
        long duration = end - start;
        System.out.println("Resultado = " + resultado + ", en " +duration + " s");


        System.out.println("Fibonacci recursivo Caching");
        start=0;
        resultado = ejerciciosPD.getFibonacciPD(50);
        end=0;
        duration = end - start;
        System.out.println("Resultado = " + resultado + ", en " +duration + " s");
         
    }

    private static void runMaze() {
        boolean[][] predefinedMaze = {
            {true,true,true,true},
            {false,true,false,true},
            {true,true,false,false},
            {true,true,true,true}
        };
        Maze maze = new Maze(predefinedMaze);
        System.out.println("Laberiton Cargado");
        maze.printMaze();
        
        Cell star = new Cell(0, 0);
        Cell end = new Cell(3, 3);
        
        List<MazeSolver> solvers = Arrays.asList(new MazeSolverRecursive(),new MazeSolverRecursivoFour(), new MazeSolverRecursivoCompletoBT());
        MazeSolver solver1 = solvers.get(0);
        MazeResult path1;
        path1 = solver1.getPath(maze.maze, star, end);

        System.out.println("\nCamino encontrado con MazeSolverRecurivo:");
        System.out.println(path1);
        
        MazeSolver solver2 = solvers.get(1);
        MazeResult path2;
        path2 = solver2.getPath(maze.maze, star, end);
        System.out.println("\nCamino encontrado con MazeSolverRecursivoFour:");
        System.out.println(path2);

        System.out.println("\nCamino encontrado con MazeSolverRecursivoCompletoBT:");
        MazeSolver solver3 = solvers.get(2);
        MazeResult path3;

        path3 = solver3.getPath(maze.maze, star, end);
        System.out.println(path3);

        System.out.println("\nCamino visitado");
        maze.printMazeVisited(path3);

        System.out.println("\nCamino completo y optimo");
        maze.printMazePath(path3);
        
    }
}