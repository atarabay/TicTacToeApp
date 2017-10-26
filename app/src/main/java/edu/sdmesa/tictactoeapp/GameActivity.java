package edu.sdmesa.tictactoeapp;

import android.media.MediaPlayer;
import android.preference.SwitchPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity
{
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int turn;
    boolean soundOn=true;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);

//        if(getPreferences(SwitchPreference).equals(false))
//        {
//            soundOn=false;
//        }

        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);

        turn = 1;

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(soundOn==true)
                {
                    mp.start();
                }
                if(b1.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn = 2;
                        b1.setText("X");
                    }
                    else if(turn ==2)
                    {
                        turn =1;
                        b1.setText("O");
                    }
                }
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp.start();
                if(b2.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn = 2;
                        b2.setText("X");
                    }
                    else if(turn ==2)
                    {
                        turn =1;
                        b2.setText("O");
                    }
                }
                endGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp.start();
                if(b3.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn = 2;
                        b3.setText("X");
                    }
                    else if(turn ==2)
                    {
                        turn =1;
                        b3.setText("O");
                    }
                }
                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp.start();
                if(b4.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn = 2;
                        b4.setText("X");
                    }
                    else if(turn ==2)
                    {
                        turn =1;
                        b4.setText("O");
                    }
                }
                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp.start();
                if(b5.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn = 2;
                        b5.setText("X");
                    }
                    else if(turn ==2)
                    {
                        turn =1;
                        b5.setText("O");
                    }
                }
                endGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp.start();
                if(b6.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn = 2;
                        b6.setText("X");
                    }
                    else if(turn ==2)
                    {
                        turn =1;
                        b6.setText("O");
                    }
                }
                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp.start();
                if(b7.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn = 2;
                        b7.setText("X");
                    }
                    else if(turn ==2)
                    {
                        turn =1;
                        b7.setText("O");
                    }
                }
                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp.start();
                if(b8.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn = 2;
                        b8.setText("X");
                    }
                    else if(turn ==2)
                    {
                        turn =1;
                        b8.setText("O");
                    }
                }
                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp.start();
                if(b9.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn = 2;
                        b9.setText("X");
                    }
                    else if(turn ==2)
                    {
                        turn =1;
                        b9.setText("O");
                    }
                }
                endGame();
            }
        });
    }

    public void endGame()
    {
        final MediaPlayer win = MediaPlayer.create(this, R.raw.win);
        boolean disable= false;
        boolean isWinner=false;
        String a, b, c, d, e, f, g, h, i;
//        String[] checks= {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
//        checks[0]=b1.getText().toString();
//        checks[1]=b2.getText().toString();
//        checks[2]=b3.getText().toString();
//
//        checks[3]=b4.getText().toString();
//        checks[4]=b5.getText().toString();
//        checks[5]=b6.getText().toString();
//
//        checks[6]=b7.getText().toString();
//        checks[7]=b8.getText().toString();
//        checks[8]=b9.getText().toString();
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();

        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();

        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        //Check fro X's
        if(a.equals(b) && a.equals(c) && a.equals("X"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 1!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(a.equals(d) && a.equals(g) && a.equals("X"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 1!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(a.equals(e) && a.equals(i) && a.equals("X"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 1!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(b.equals(e) && b.equals(h) && b.equals("X"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 1!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(c.equals(f) && c.equals(i) && c.equals("X"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 1!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(d.equals(e) && d.equals(f) && d.equals("X"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 1!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(g.equals(h) && g.equals(i) && g.equals("X"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 1!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(g.equals(e) && g.equals(c) && g.equals("X"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 1!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        //Check fro O's
        if(a.equals(b) && a.equals(c) && a.equals("O"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 2!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(a.equals(d) && a.equals(g) && a.equals("O"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 2!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(a.equals(e) && a.equals(i) && a.equals("O"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 2!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(b.equals(e) && b.equals(h) && b.equals("O"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 2!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(c.equals(f) && c.equals(i) && c.equals("O"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 2!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(d.equals(e) && d.equals(f) && d.equals("O"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 2!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(g.equals(h) && g.equals(i) && g.equals("O"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 2!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        if(g.equals(e) && g.equals(c) && g.equals("O"))
        {
            disable=true;
            win.start();
            Toast.makeText(GameActivity.this, "Winner Player 2!", Toast.LENGTH_LONG).show();
            isWinner=true;
            finish();
        }

        //Check if draw
//        if(isWinner==false&&disable==false)
//        {
//            Toast.makeText(GameActivity.this, "Draw!", Toast.LENGTH_LONG).show();
//            disable=true;
//        }

        disableButtons(disable);

//        checkForXs();
//        checkForOs();
    }

//    public void checkForXs(String[] cArray)
//    {
//        int numbOfElements= cArray.length;
//        for(int i = 0; numbOfElements<i; i++)
//        {
//            if(cArray[i].equals(cArray[1]) && cArray[i].equals(cArray[2]) && cArray[i].equals("X"))
//            {
//                Toast.makeText(MainActivity.this, "Winner Player 1!", Toast.LENGTH_LONG).show();
//            }
//        }
//        if(cArray[0].equals(cArray[1]) && cArray[0].equals(cArray[2]) && cArray[0].equals("X"))
//        {
//            Toast.makeText(MainActivity.this, "Winner Player 1!", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    public void checkForOs()
//    {
//
//    }

    public void disableButtons(boolean condition)
    {
        if(condition==true)
        {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }
}

