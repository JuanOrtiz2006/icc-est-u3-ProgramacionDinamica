public class Cell {
    int row,col;
    
    public Cell(int row,int col){
        this.row=row;
        this.col=col;
    }

    public int getCol() {
        return col;
    }
    public int getRow() {
        return row;
    }
    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "[row=" + row + ", col=" + col + "]";
    }
}
