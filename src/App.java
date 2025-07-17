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

    private static void runMaze(){
        boolean[][] predefinedMaze= {
                        {true,true,true,true},
                        {false,true,true,true}, 
                        {true,true,false,true}, 
                        {true,true,true,true}}
                        ;

        Maze maze = new Maze(predefinedMaze);
        System.out.println("Laberinto Cargado");
        maze.printMaze();

        Cell star = new Cell(0, 0);
        Cell end = new Cell(3, 3);
        
        List<MazeSolver> solvers = Arrays.asList(new MazeSolverRecursive(),new MazeSolverRecursivoFour());
        MazeSolver solver1 = solvers.get(0);
        List<Cell> path1;
        path1 = solver1.getPath(maze.maze, star, end);

        System.out.println("\nCamino encontrado con MazeSolverRecurivo:");
        System.out.println(path1.reversed());
        
        MazeSolver solver2 = solvers.get(1);
        List<Cell> path2;
        path2 = solver2.getPath(maze.maze, star, end);
        System.out.println("\nCamino encontrado con MazeSolverRecursivoFour:");
        System.out.println(path2.reversed());
    }
}