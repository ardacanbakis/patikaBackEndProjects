import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    // Minimum board size set
    public static final int MIN_SIZE = 2;

    // Variables
    public int rows;
    public int columns;
    public int mines;
    public char[][] board;
    public char[][] solution;
    public boolean[][] revealed;

    // New board created, mine amount set, calculating mines = preparations complete
    public Minesweeper(int rows, int columns) {
        this.rows = Math.max(MIN_SIZE, rows);
        this.columns = Math.max(MIN_SIZE, columns);
        // Mine size set to be 1/4 of board size
        this.mines = rows * columns / 4;
        board = new char[this.rows][this.columns];
        solution = new char[this.rows][this.columns];
        revealed = new boolean[this.rows][this.columns];
        newBoard();
        placeMines();
        calculateMines();
    }

    // Main game mechanics
    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printBoard();

            System.out.print("Satır ve sütun numarası giriniz (örn: 0 1): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row >= rows || col < 0 || col >= columns) {
                System.out.println("Hatalı giriş. Satır için 0 ile " + (rows - 1) + " ve sütun için 0 ile " + (columns - 1) + " arasında değer giriniz.");
                continue;
            }

            if (solution[row][col] == '*') {
                System.out.println(":( Bir mayına bastınız ve kaybettiniz. Tekrar denemek için programı yeniden çalıştırabilirsiniz. Zorluk seviyesini azaltmak için satır ve sütun sayısını düşürebilirsiniz.");
                break;
            }

            reveal(row, col);

            boolean allNonMinesRevealed = true;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (solution[i][j] != '*' && !revealed[i][j]) {
                        allNonMinesRevealed = false;
                        break;
                    }
                }
            }

            if (allNonMinesRevealed) {
                System.out.println("Tebrikler kazandınız! Tekrar oynamak için programı yeniden çalıştırabilirsiniz. (Daha zor bir oyun deneyimi için satır ve sütun sayısını arttırabilirsiniz. Mayın sayısı oluşturulan alana göre ayarlanıcaktır.");
                break;
            }
        }

        // Update board for unrevealed mines
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (solution[i][j] == '*' && !revealed[i][j]) {
                    board[i][j] = '*';
                }
            }
        }

        // Print the final board, after updating unrevealed mines
        printBoard();

        scanner.close();
    }

    // Create board
    private void newBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = '-';
                solution[i][j] = ' ';
                revealed[i][j] = false;
            }
        }
    }

    // Random mine placement
    private void placeMines() {
        Random rand = new Random();
        int minesPlaced = 0;

        while (minesPlaced < mines) {
            int row = rand.nextInt(rows);
            int col = rand.nextInt(columns);

            if (solution[row][col] != '*') {
                solution[row][col] = '*';
                minesPlaced++;
            }
        }
    }

    // Calculate mines
    private void calculateMines() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (solution[i][j] == '*') {
                    continue;
                }

                int count = 0;

                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {
                        if (r >= 0 && r < rows && c >= 0 && c < columns && solution[r][c] == '*') {
                            count++;
                        }
                    }
                }

                solution[i][j] = (char) ('0' + count);
            }
        }
    }

    // Print updated board
    private void printBoard() {
        System.out.print("  ");
        for (int i = 0; i < columns; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < columns; j++) {
                if (revealed[i][j]) {
                    System.out.print(solution[i][j] + " ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Reveal a cell and update the board
    private void reveal(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= columns || revealed[row][col]) {
            return;
        }

        revealed[row][col] = true;

        if (solution[row][col] == '0') {
            for (int r = row - 1; r <= row + 1; r++) {
                for (int c = col - 1; c <= col + 1; c++) {
                    reveal(r, c);
                }
            }
        }
        // When a mine is hit show user the mine in question as requested in cohort.
        else if (solution[row][col] == '*') {
            board[row][col] = '*';
        }
    }

    // User greeting, asking for input | error prompt in case of bad entry
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Merhaba, mayın tarlasi oyununa hoşgeldiniz. Oyun alanını oluşturmak için satır sayısını giriniz: ");
        int rows = scanner.nextInt();

        System.out.print("Oyun alanını oluşturmak için sütun sayısını giriniz: ");
        int columns = scanner.nextInt();

        if (rows < MIN_SIZE || columns < MIN_SIZE) {
            System.out.println("Hatalı giriş, satır ve sütün sayısı en az " + MIN_SIZE + " olmalıdır. Lütfen oyunu tekrar çalıştırın.");
            return;
        }

        Minesweeper minesweeper = new Minesweeper(rows, columns);
        minesweeper.play();

        scanner.close();
    }
}
