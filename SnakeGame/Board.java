package SnakeGame;

public class Board {
    final int ROW_COUNT, COLUMN_COUNT;
    private Cell[][] cells;

    public Board(int rowcount, int columncount) {
        ROW_COUNT = rowcount;
        COLUMN_COUNT = columncount;

        cells = new Cell[ROW_COUNT][COLUMN_COUNT];
        for (int row = 0; row < ROW_COUNT; row++) {
            for (int column = 0; column < COLUMN_COUNT; column++) {
                cells[row][column] = new Cell(row, column);
            }
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public void generateFood() {
        System.out.println("Going to generate food");
        int row = 0, column = 0;
        while (true) {
            row = (int) (Math.random() * ROW_COUNT);
            column = (int) (Math.random() * COLUMN_COUNT);
            if (cells[row][column].getCellType() != CellType.SNAKE_NODE)
                break;
        }
        cells[row][column].setCellType(CellType.FOOD);
        System.out.println("Food is generate at : " + row + " " + column);
    }
}
