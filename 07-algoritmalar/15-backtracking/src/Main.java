public class Main {
    public static void main(String[] args) {
        System.out.println("4 vezir icin cozum sayisi: " + countNQueensSolutions(4));
    }

    static int countNQueensSolutions(int boardSize) {
        if (boardSize <= 0 || boardSize > 14) {
            throw new IllegalArgumentException("Tahta boyutu 1 ile 14 arasinda olmalidir.");
        }
        boolean[] columns = new boolean[boardSize];
        boolean[] descendingDiagonals = new boolean[2 * boardSize - 1];
        boolean[] ascendingDiagonals = new boolean[2 * boardSize - 1];
        return placeQueen(0, boardSize, columns, descendingDiagonals, ascendingDiagonals);
    }

    private static int placeQueen(int row, int boardSize, boolean[] columns,
                                  boolean[] descendingDiagonals, boolean[] ascendingDiagonals) {
        if (row == boardSize) {
            return 1;
        }

        int solutionCount = 0;
        for (int column = 0; column < boardSize; column++) {
            int descending = row - column + boardSize - 1;
            int ascending = row + column;
            if (columns[column] || descendingDiagonals[descending] || ascendingDiagonals[ascending]) {
                continue;
            }

            columns[column] = true;
            descendingDiagonals[descending] = true;
            ascendingDiagonals[ascending] = true;
            solutionCount += placeQueen(row + 1, boardSize, columns,
                    descendingDiagonals, ascendingDiagonals);
            columns[column] = false;
            descendingDiagonals[descending] = false;
            ascendingDiagonals[ascending] = false;
        }
        return solutionCount;
    }
}

