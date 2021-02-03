package Projects.TicTacToe;

import JavaCT.Assignment.A;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameLogic extends LayoutManager {
    private int turn = 0 ;
    private int flag = 0, count = 0 ;

    public void play() {
        button[0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++ ;
                if (flag == 0) {
                    button[0][0].setEnabled(false);
                    if (turn == 0 ) {
                        label.setText("X's turn");
                        button[0][0].setText("O");
                        turn = 1;
                        checkResult(count);
                    } else if (turn == 1) {
                        label.setText("O's turn");
                        button[0][0].setText("X");
                        turn = 0;
                        checkResult(count);
                    }
                }
            }
        });

        button[0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++ ;
                if (flag == 0) {
                    button[0][1].setEnabled(false);
                    if (turn == 0) {
                        label.setText("X's turn");
                        button[0][1].setText("O");
                        turn = 1;
                        checkResult(count);
                    } else if (turn == 1) {
                        label.setText("O's turn");
                        button[0][1].setText("X");
                        turn = 0;
                        checkResult(count);
                    }
                }

            }
        });

        button[0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++ ;
                if (flag == 0) {
                    button[0][2].setEnabled(false);
                    if (turn == 0 ) {
                        label.setText("X's turn");
                        button[0][2].setText("O");
                        turn = 1;
                        checkResult(count);
                    } else if (turn == 1) {
                        label.setText("O's turn");
                        button[0][2].setText("X");
                        turn = 0;
                        checkResult(count);
                    }
                }
            }
        });

        button[1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++ ;
                if (flag == 0) {
                    button[1][0].setEnabled(false);
                    if (turn == 0 ) {
                        label.setText("X's turn");
                        button[1][0].setText("O");
                        turn = 1;
                        checkResult(count);
                    } else if (turn == 1 ) {
                        label.setText("O's turn");
                        button[1][0].setText("X");
                        turn = 0;
                        checkResult(count);
                    }
                }
            }
        });

        button[1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++ ;
                if (flag == 0) {
                    button[1][1].setEnabled(false);
                    if (turn == 0 ) {
                        label.setText("X's turn");
                        button[1][1].setText("O");
                        turn = 1;
                        checkResult(count);
                    } else if (turn == 1 ) {
                        label.setText("O's turn");
                        button[1][1].setText("X");
                        turn = 0;
                        checkResult(count);
                    }
                }
            }
        });

        button[1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++ ;
                if (flag == 0) {
                    button[1][2].setEnabled(false);
                    if (turn == 0 ) {
                        label.setText("X's turn");
                        button[1][2].setText("O");
                        turn = 1;
                        checkResult(count);
                    } else if (turn == 1 ) {
                        label.setText("O's turn");
                        button[1][2].setText("X");
                        turn = 0;
                        checkResult(count);
                    }
                }
            }
        });

        button[2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++ ;
                if (flag == 0) {
                    button[2][0].setEnabled(false);
                    if (turn == 0 ) {
                        label.setText("X's turn");
                        button[2][0].setText("O");
                        turn = 1;
                        checkResult(count);
                    } else if (turn == 1) {
                        label.setText("O's turn");
                        button[2][0].setText("X");
                        turn = 0;
                        checkResult(count);
                    }
                }
            }
        });

        button[2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++ ;
                if (flag == 0) {
                    button[2][1].setEnabled(false);
                    if (turn == 0) {
                        label.setText("X's turn");
                        button[2][1].setText("O");
                        turn = 1;
                        checkResult(count);
                    } else if (turn == 1 ) {
                        label.setText("O's turn");
                        button[2][1].setText("X");
                        turn = 0;
                        checkResult(count);
                    }
                }

            }
        });

        button[2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++ ;
                if (flag == 0) {
                    button[2][2].setEnabled(false);
                    if (turn == 0) {
                        label.setText("X's turn");
                        button[2][2].setText("O");
                        turn = 1;
                        checkResult(count);
                    } else if (turn == 1) {
                        label.setText("O's turn");
                        button[2][2].setText("X");
                        turn = 0;
                        checkResult(count);
                    }

                }
            }
        });


        resetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0; i<3; i++) {
                    for (int j=0; j<3; j++) {
                        button[i][j].setEnabled(true);
                        button[i][j].setText("");
                    }
                }
                flag = 0 ;
                count = 0 ;
                //play();
            }
        });

    }

    private void checkResult(int count) {
        if ((button[0][0].getText() == "O" && button[0][1].getText() == "O" && button[0][2].getText() == "O" ) ||
                (button[1][0].getText() == "O" && button[1][1].getText() == "O" && button[1][2].getText() == "O") ||
                (button[2][0].getText() == "O" && button[2][1].getText() == "O" && button[2][2].getText() == "O") ||
                (button[0][0].getText() == "O" && button[1][0].getText() == "O" && button[2][0].getText() == "O") ||
                (button[0][1].getText() == "O" && button[1][1].getText() == "O" && button[2][1].getText() == "O") ||
                (button[0][2].getText() == "O" && button[1][2].getText() == "O" && button[2][2].getText() == "O") ||
                (button[0][0].getText() == "O" && button[1][1].getText() == "O" && button[2][2].getText() == "O") ||
                (button[0][2].getText() == "O" && button[1][1].getText() == "O" && button[2][0].getText() == "O")

        ) {
            label.setText("O Wins");
            flag = 1 ;
        }
        else if ((button[0][0].getText() == "X" && button[0][1].getText() == "X" && button[0][2].getText() == "X" ) ||
                (button[1][0].getText() == "X" && button[1][1].getText() == "X" && button[1][2].getText() == "X") ||
                (button[2][0].getText() == "X" && button[2][1].getText() == "X" && button[2][2].getText() == "X") ||
                (button[0][0].getText() == "X" && button[1][0].getText() == "X" && button[1][2].getText() == "X") ||
                (button[0][1].getText() == "X" && button[1][1].getText() == "X" && button[2][1].getText() == "X") ||
                (button[0][2].getText() == "X" && button[1][2].getText() == "X" && button[2][2].getText() == "X") ||
                (button[0][0].getText() == "X" && button[1][1].getText() == "X" && button[2][2].getText() == "X") ||
                (button[0][2].getText() == "X" && button[1][1].getText() == "X" && button[2][0].getText() == "X")
        ) {
            label.setText("X Wins");
            flag = 1 ;
        }
        else if (count == 9) {
            label.setText("Draw");
            flag = 1 ;
        }
    }

}
