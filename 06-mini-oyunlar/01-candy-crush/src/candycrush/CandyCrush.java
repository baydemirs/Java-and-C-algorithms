
package candycrush;

public class CandyCrush {

    public static void main(String[] args) {
        
        char [][]board={
            {'1', '1', '4', '5', '2', '6', '5', '5', '6', '7'},
            {'1', '2', '2', '2', '2', '6', '9', '6', '2', '8'},
            {'8', '5', '2', '1', '8', '8', '8', '7', '3', '4'},
            {'4', '2', '1', '6', '7', '7', '7', '3', '5', '1'},
            {'4', '2', '4', '6', '7', '1', '1', '5', '6', '2'},
            {'4', '2', '1', '6', '9', '4', '6', '1', '9', '9'},
            {'4', '2', '7', '4', '9', '9', '9', '9', '1', '2'},
            {'1', '2', '2', '2', '2', '6', '9', '6', '2', '8'},
            {'8', '5', '2', '1', '8', '8', '8', '7', '3', '4'},
            {'4', '2', '1', '6', '9', '4', '6', '1', '9', '9'},
        };
        
        int col=4;
        int row=2;
        printBoard(board);
        System.out.println();
        gameBoard(col-1,row-1,board);
        printBoard(board);
        
    }
    
// Girdiğimiz indeksteki değiskeni alma.
    
    private static void gameBoard(int col, int row, char[][] board) {
        if (board == null || col < 0 || col >= board.length
                || board[col] == null || row < 0 || row >= board[col].length) {
            System.out.println("Gecersiz tahta koordinati.");
            return;
        }
        char temp=board[col][row];//girilen tahtanın indeksi.
        if (temp == 'x') {
            return;
        }
        drawBoard(col,row,board,temp);  
    }
    
// Recursive halinde oyun tahtasını gezen method.

    private static void drawBoard(int col, int row, char[][] board, char temp) {
        if(col<0 || col>=board.length || board[col] == null
                || row<0 || row>=board[col].length || board[col][row] != temp ){
            return;
        }
        
        board[col][row]='x';
        // Sağa
        drawBoard(col,row+1,board,temp);
        // Sola
        drawBoard(col,row-1,board,temp);
        // Aşşağı
        drawBoard(col+1,row,board,temp);
        // Yukarı
        drawBoard(col-1,row,board,temp);
    }
    public static void printBoard(char[][] board){
        for (char[] x: board){
            for (char y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    
}
