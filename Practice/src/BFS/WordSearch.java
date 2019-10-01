package BFS;

public class WordSearch {
    public boolean wordSearch(char[][] board, String word){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0))
                    if(bfs(board, word, i, j, 0))
                        return true;
            }
        }
        return false;
    }
    private boolean bfs(char[][] board, String word, int i, int j, int len){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length)
            return false;
        char originalChar = '\0';
        if(board[i][j] == word.charAt(len)){
            originalChar = board[i][j];
            board[i][j] = '\0';
            len++;
        }
        else
            return false;
        boolean result;
        if(len == word.length())
            return true;
        else
            result = bfs(board, word, i + 1, j, len)
                    ||bfs(board, word, i - 1, j, len)
                    ||bfs(board, word, i, j + 1, len)
                    ||bfs(board, word, i, j - 1, len);
        board[i][j] = originalChar;
        return result;
    }

    public static void main(String[] args) {
        WordSearch search = new WordSearch();
        char[][] board = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        System.out.println(search.wordSearch(board, "ABCCEDASB"));
    }
}
