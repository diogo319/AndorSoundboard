package com.example.diogo.andorsoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity{
    MediaPlayer mp;
    boolean hasPlayed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void victorySound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.victory);
        mp.start();
        //Log.d("ONCLICK", "onClick successful");
    }

    public void combat1PSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combate_1p);
        mp.setLooping(true);
        mp.start();
    }

    public void combatCoopSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combate_coop);
        mp.setLooping(true);
        mp.start();
    }

    public void combatThoraldSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combat_start);
        mp.setLooping(true);
        mp.start();
    }

    public void mercadorSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.mercador);
        mp.setLooping(true);
        mp.start();
    }

    public void derrotaSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combat_start);
        mp.start();
    }

    public void bossSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combat_start);
        mp.setLooping(true);
        mp.start();
    }

    public void dragonSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.dragon);
        mp.setLooping(true);
        mp.start();
    }

    public void pocoSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combat_start);
        mp.start();
    }

    public void nevoaSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combat_start);
        mp.start();
    }

    public void bruxaSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combat_start);
        mp.start();
    }

    public void amanhecerSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combat_start);
        mp.start();
    }

    public void falcaoSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combat_start);
        mp.start();
    }

    public void linguaSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combat_start);
        mp.start();
    }

    public void thoraldSound(View view){
        if(hasPlayed){
            mp.stop();
        }
        hasPlayed = true;
        mp = MediaPlayer.create(getBaseContext(),R.raw.combat_start);
        mp.start();
    }

    public void stopSound(View view){
        if(hasPlayed){
            mp.stop();
        }
    }

    //TODO
}
