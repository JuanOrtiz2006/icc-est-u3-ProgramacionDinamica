public class Maze {
    private boolean[][] maze;
    public Maze(boolean[][] maze){
        this.maze=maze;
    }

    public void printMaze(){
        for(int i = 0; i<=maze.length;  i++){
            for(int j =0 ; j<+maze[i].length;j++){
                if(maze[i][j] ==true){
                    System.out.print('-');
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
