package edu.rowan.tictactoeproject1;
/**
 * Name:      Bruce Reece
 * Date:      10/22/2021
 * Topic:     Tic Tac Toe
 * Professor: Prof. Robinson
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

// Debug handing
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends Activity implements OnClickListener {

    // Variable for widgets
    private TextView infoView;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button newGame;

    // Variables for board
    private char mBoard[] = {'1','2','3','4','5','6','7','8','9'};
    private final int BOARD_SIZE = 9;
    private final char humanPlayer = 'X';
    private final char computerPlayer = 'O';
    private int win;
    private char turn;
    private Random mRand;
    private List<Button> bArray = new ArrayList<>();

    // Declare constant for tag
    private static final String TAG = "TicTacToe Activity";
    private static final String TAG2 = "Show Status";
    private static final String TAG3 = "Board Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        win = 0;
        turn = 'X';
        mRand = new Random();
        // References to widgets
        infoView = (TextView) findViewById(R.id.infoLabel);
        button1 = (Button) findViewById(R.id.square1);
        button2 = (Button) findViewById(R.id.square2);
        button3 = (Button) findViewById(R.id.square3);
        button4 = (Button) findViewById(R.id.square4);
        button5 = (Button) findViewById(R.id.square5);
        button6 = (Button) findViewById(R.id.square6);
        button7 = (Button) findViewById(R.id.square7);
        button8 = (Button) findViewById(R.id.square8);
        button9 = (Button) findViewById(R.id.square9);
        newGame = (Button) findViewById(R.id.NewGame);

        // Set Listener to buttons
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        newGame.setOnClickListener(this);

        // Store buttons in a list so computer can use them
        bArray.addAll(Arrays.asList(button1,button2,button3,button4,button5,button6,button7,
                button8,button9));
        Log.d(TAG, "Game lunched");
    }

    // onLick listener for button
    // Response to user interaction
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.square1:
                // Set limitations to player
                if(button1.getText() == "" && win == 0)
                {
                    // Check to see if its user turn to play
                    if(turn == humanPlayer) {
                        button1.setText("X");
                        turn = computerPlayer;
                        infoView.setText("It's my turn");
                        mBoard[0] = 'X';
                        //Logcat message
                        Log.d(TAG, "Player chooses square 1");
                        displayBoard();
                        win = checkForWinner();
                        showStatus();
                        if(win == 0){
                            getComputerMove();
                            turn = humanPlayer;
                            infoView.setText("It's your turn");
                            win = checkForWinner();
                            displayBoard();
                            showStatus();
                        }
                    }
                }
                break;

            case R.id.square2:
                // Set limitations to player
                if(button2.getText() == "" && win == 0)
                {
                    // Check to see if its user turn to play
                    if(turn == humanPlayer) {
                        button2.setText("X");
                        turn = computerPlayer;
                        infoView.setText("It's my turn");
                        mBoard[1] = 'X';
                        //Logcat message
                        Log.d(TAG, "Player chooses square 2");
                        displayBoard();
                        win = checkForWinner();
                        showStatus();
                        if(win == 0){
                            getComputerMove();
                            turn = humanPlayer;
                            infoView.setText("It's your turn");
                            win = checkForWinner();
                            displayBoard();
                            showStatus();
                        }
                    }
                }
                break;

            case R.id.square3:
                // Set limitations to player
                if(button3.getText() == "" && win == 0)
                {
                    // Check to see if its user turn to play
                    if(turn == humanPlayer) {
                        button3.setText("X");
                        turn = computerPlayer;
                        infoView.setText("It's my turn");
                        mBoard[2] = 'X';
                        //Logcat message
                        Log.d(TAG, "Player chooses square 3");
                        displayBoard();
                        win = checkForWinner();
                        showStatus();
                        if(win == 0){
                            getComputerMove();
                            turn = humanPlayer;
                            infoView.setText("It's your turn");
                            win = checkForWinner();
                            displayBoard();
                            showStatus();
                        }
                    }
                }
                break;

            case R.id.square4:
                // Set limitations to player
                if(button4.getText() == "" && win == 0)
                {
                    // Check to see if its user turn to play
                    if(turn == humanPlayer) {
                        button4.setText("X");
                        turn = computerPlayer;
                        infoView.setText("It's my turn");
                        mBoard[3] = 'X';
                        //Logcat message
                        Log.d(TAG, "Player chooses square 4");
                        displayBoard();
                        win = checkForWinner();
                        showStatus();
                        if(win == 0){
                            getComputerMove();
                            turn = humanPlayer;
                            infoView.setText("It's your turn");
                            win = checkForWinner();
                            displayBoard();
                            showStatus();
                        }
                    }
                }
                break;
            case R.id.square5:
                // Set limitations to player
                if(button5.getText() == "" && win == 0)
                {
                    // Check to see if its user turn to play
                    if(turn == humanPlayer) {
                        button5.setText("X");
                        turn = computerPlayer;
                        infoView.setText("It's my turn");
                        mBoard[4] = 'X';
                        //Logcat message
                        Log.d(TAG, "Player chooses square 5");
                        displayBoard();
                        win = checkForWinner();
                        showStatus();
                        if(win == 0){
                            getComputerMove();
                            turn = humanPlayer;
                            infoView.setText("It's your turn");
                            win = checkForWinner();
                            displayBoard();
                            showStatus();
                        }
                    }
                }
                break;

            case R.id.square6:
                // Set limitations to player
                if(button6.getText() == "" && win == 0)
                {
                    // Check to see if its user turn to play
                    if(turn == humanPlayer) {
                        button6.setText("X");
                        turn = computerPlayer;
                        infoView.setText("It's my turn");
                        mBoard[5] = 'X';
                        //Logcat message
                        Log.d(TAG, "Player chooses square 6");
                        displayBoard();
                        win = checkForWinner();
                        showStatus();
                        if(win == 0){
                            getComputerMove();
                            turn = humanPlayer;
                            infoView.setText("It's your turn");
                            win = checkForWinner();
                            displayBoard();
                            showStatus();
                        }
                    }
                }
                break;

            case R.id.square7:
                // Set limitations to player
                if(button7.getText() == "" && win == 0)
                {
                    // Check to see if its user turn to play
                    if(turn == humanPlayer) {
                        button7.setText("X");
                        turn = computerPlayer;
                        infoView.setText("It's my turn");
                        mBoard[6] = 'X';
                        //Logcat message
                        Log.d(TAG, "Player chooses square 7");
                        displayBoard();
                        win = checkForWinner();
                        showStatus();
                        if(win == 0){
                            getComputerMove();
                            turn = humanPlayer;
                            infoView.setText("It's your turn");
                            win = checkForWinner();
                            displayBoard();
                            showStatus();
                        }
                    }
                }
                break;

            case R.id.square8:
                // Set limitations to player
                if(button8.getText() == "" && win == 0)
                {
                    // Check to see if its user turn to play
                    if(turn == humanPlayer) {
                        button8.setText("X");
                        turn = computerPlayer;
                        infoView.setText("It's my turn");
                        mBoard[7] = 'X';
                        //Logcat message
                        Log.d(TAG, "Player chooses square 8");
                        displayBoard();
                        win = checkForWinner();
                        showStatus();
                        if(win == 0){
                            getComputerMove();
                            turn = humanPlayer;
                            infoView.setText("It's your turn");
                            win = checkForWinner();
                            displayBoard();
                            showStatus();
                        }
                    }
                }
                break;

            case R.id.square9:
                // Set limitations to player
                if(button9.getText() == "" && win == 0)
                {
                    // Check to see if its user turn to play
                    if(turn == humanPlayer) {
                        button9.setText("X");
                        turn = computerPlayer;
                        infoView.setText("It's my turn");
                        mBoard[8] = 'X';
                        //Logcat message
                        Log.d(TAG, "Player chooses square 9");
                        displayBoard();
                        win = checkForWinner();
                        showStatus();
                        if(win == 0){
                            getComputerMove();
                            turn = humanPlayer;
                            infoView.setText("It's your turn");
                            win = checkForWinner();
                            displayBoard();
                            showStatus();
                        }
                    }
                }
                break;
            // When player tap on new game
            // the game will reset
            case R.id.NewGame:
                for(int i = 0; i < BOARD_SIZE; i++){
                    // Prevent user from resetting the game before the game starts
                    if(bArray.get(i).getText() != ""){
                        button1.setText("");
                        button2.setText("");
                        button3.setText("");
                        button4.setText("");
                        button5.setText("");
                        button6.setText("");
                        button7.setText("");
                        button8.setText("");
                        button9.setText("");
                        infoView.setText("You go first!");
                        turn = humanPlayer;
                        win = 0;
                        String resetBoard="123456789";
                        for(int k = 0; k < BOARD_SIZE; k++)
                        {
                            mBoard[k] = resetBoard.charAt(k);
                        }
                        displayBoard();
                        Log.d(TAG,"Player reset game");
                        break;
                    }
                }
                break;
        }
    }


    // Display end results of the game to the user
    private void showStatus()	{
        // Report the winner
        System.out.println();
        if (win == 1){
            Log.d(TAG2,"It's a tie.");
            infoView.setText("It's a tie");
        }
        else if (win == 2){
            Log.d(TAG2,humanPlayer + " wins!");
            infoView.setText("You WON!");
        }
        else if (win == 3){
            Log.d(TAG2,computerPlayer + " wins!");
            infoView.setText("I WON!");
        }
        else
            Log.d(TAG2,"There is a logic problem! or no one win yet");
    }

    // Show what is going on, on the user interface for debugging purposes
    private void displayBoard()	{
        Log.d(TAG3,"");
        Log.d(TAG3,mBoard[0] + " | " + mBoard[1] + " | " + mBoard[2]);
        Log.d(TAG3,"-----------");
        Log.d(TAG3,mBoard[3] + " | " + mBoard[4] + " | " + mBoard[5]);
        Log.d(TAG3,"-----------");
        Log.d(TAG3,mBoard[6] + " | " + mBoard[7] + " | " + mBoard[8]);
        Log.d(TAG3,"");
    }

    // Check for a winner.  Return
    //  0 if no winner or tie yet
    //  1 if it's a tie
    //  2 if X won
    //  3 if O won
    private int checkForWinner() {
        // Check horizontal wins
        for (int i = 0; i <= 6; i += 3)	{
            if (mBoard[i] == humanPlayer &&
                    mBoard[i+1] == humanPlayer &&
                    mBoard[i+2]== humanPlayer)
                return 2;
            if (mBoard[i] == computerPlayer &&
                    mBoard[i+1]== computerPlayer &&
                    mBoard[i+2] == computerPlayer)
                return 3;
        }

        // Check vertical wins
        for (int i = 0; i <= 2; i++) {
            if (mBoard[i] == humanPlayer &&
                    mBoard[i+3] == humanPlayer &&
                    mBoard[i+6]== humanPlayer)
                return 2;
            if (mBoard[i] == computerPlayer &&
                    mBoard[i+3] == computerPlayer &&
                    mBoard[i+6]== computerPlayer)
                return 3;
        }

        // Check for diagonal wins
        if ((mBoard[0] == humanPlayer &&
                mBoard[4] == humanPlayer &&
                mBoard[8] == humanPlayer) ||
                (mBoard[2] == humanPlayer &&
                        mBoard[4] == humanPlayer &&
                        mBoard[6] == humanPlayer))
            return 2;
        if ((mBoard[0] == computerPlayer &&
                mBoard[4] == computerPlayer &&
                mBoard[8] == computerPlayer) ||
                (mBoard[2] == computerPlayer &&
                        mBoard[4] == computerPlayer &&
                        mBoard[6] == computerPlayer))
            return 3;

        // Check for tie
        for (int i = 0; i < BOARD_SIZE; i++) {
            // If we find a number, then no one has won yet
            if (mBoard[i] != humanPlayer && mBoard[i] != computerPlayer)
                return 0;
        }
        // If we make it through the previous loop, all places are taken, so it's a tie
        return 1;
    }


    // Pick logical move for the computer after user select
    // his/her spot
    private void getComputerMove()
    {
        int move;
        // First see if there's a move O can make to win
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (mBoard[i] != humanPlayer && mBoard[i] != computerPlayer) {
                char curr = mBoard[i];
                mBoard[i] = computerPlayer;
                if (checkForWinner() == 3) {
                    // catch null exception to prevent interface from crashing
                    try{
                        bArray.get(i).setText("O");
                    }catch (Exception e){}
                    Log.d(TAG,"Computer is moving to " + (i + 1));
                    return;
                }
                else
                    mBoard[i] = curr;
            }
        }
        // See if there's a move O can make to block X from winning
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (mBoard[i] != humanPlayer && mBoard[i] != computerPlayer) {
                char curr = mBoard[i];   // Save the current number
                mBoard[i] = humanPlayer;
                if (checkForWinner() == 2) {
                    // catch null exception to prevent interface from crashing
                    try{
                        bArray.get(i).setText("O");
                    }catch (Exception e){}
                    mBoard[i] = computerPlayer;
                    Log.d(TAG,"Computer is moving to " + (i + 1));
                    return;
                }
                else
                    mBoard[i] = curr;
            }
        }
        // Generate random move
        do
        {
            move = mRand.nextInt(BOARD_SIZE);
        } while (mBoard[move] == humanPlayer || mBoard[move] == computerPlayer);
        try{
        bArray.get(move).setText("O");
        }catch (Exception e){}// catch null exception to prevent interface from crashing
        mBoard[move] = computerPlayer;
        Log.d(TAG,"Computer is moving to " + (move + 1));
    }
}