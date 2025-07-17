public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Juan Pablo Ortiz");
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
    }
}