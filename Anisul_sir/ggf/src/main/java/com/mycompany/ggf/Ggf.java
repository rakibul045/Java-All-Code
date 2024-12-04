/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ggf;

    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author USER
 */



public class Ggf {

public class SnakeGame extends JPanel implements ActionListener, KeyListener {
    private Timer timer;
    private int[] snakeX = new int[300];
    private int[] snakeY = new int[300];
    private int snakeLength = 3;
    private int foodX, foodY;
    private boolean left = false, right = true, up = false, down = false;
    private boolean inGame = true;

    public SnakeGame() {
        setFocusable(true);
        addKeyListener(this);
        setPreferredSize(new Dimension(800, 600));
        initGame();
    }

    public void initGame() {
        snakeX[0] = 50; snakeY[0] = 50;
        foodX = 200; foodY = 200;
        timer = new Timer(100, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (inGame) {
            g.setColor(Color.RED);
            g.fillRect(foodX, foodY, 10, 10);

            for (int i = 0; i < snakeLength; i++) {
                g.setColor(i == 0 ? Color.GREEN : Color.BLACK);
                g.fillRect(snakeX[i], snakeY[i], 10, 10);
            }
        } else {
            g.setColor(Color.BLACK);
            g.drawString("Game Over!", 350, 300);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            move();
            checkCollision();
            checkFood();
        }
        repaint();
    }

    public void move() {
        for (int i = snakeLength; i > 0; i--) {
            snakeX[i] = snakeX[i - 1];
            snakeY[i] = snakeY[i - 1];
        }

        if (left) snakeX[0] -= 10;
        if (right) snakeX[0] += 10;
        if (up) snakeY[0] -= 10;
        if (down) snakeY[0] += 10;
    }

    public void checkCollision() {
        for (int i = snakeLength; i > 0; i--) {
            if (i > 3 && snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                inGame = false;
            }
        }
        if (snakeX[0] < 0 || snakeX[0] >= 800 || snakeY[0] < 0 || snakeY[0] >= 600) {
            inGame = false;
        }
    }

    public void checkFood() {
        if (snakeX[0] == foodX && snakeY[0] == foodY) {
            snakeLength++;
            foodX = (int) (Math.random() * 79) * 10;
            foodY = (int) (Math.random() * 59) * 10;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT && !right) left = true; up = down = right = false;
        if (key == KeyEvent.VK_RIGHT && !left) right = true; up = down = left = false;
        if (key == KeyEvent.VK_UP && !down) up = true; left = right = down = false;
        if (key == KeyEvent.VK_DOWN && !up) down = true; left = right = up = false;
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

    }

