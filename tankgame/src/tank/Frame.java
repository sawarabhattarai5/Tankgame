package tank;

import javax.swing.*;

public class Frame extends JFrame {

  public Frame(Game_Panel gp ) {
        setTitle( "TANK GAME" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setResizable( false );
        add( gp );
        pack();
        Thread th = new Thread( gp );
        th.start();
        setVisible( true );
    }
}
