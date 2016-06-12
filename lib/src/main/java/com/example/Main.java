package com.example;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


/**
 * Created by tim22_000 on 2016/6/12.
 */
public class Main {



    public static void main(String[] args) {

    SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Server server = new Server();
                server.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                server.setSize(1000,700);
                server.setVisible(true);
                server.setPreferredSize(new Dimension(500,300));
                server.pack();
            }
        });


    }

}
