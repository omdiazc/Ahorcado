package miguel.ahorcado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

    }

    private void openNewActivity(View v , pages p){
        switch (p){
            case GAME:
                Intent i = new Intent(this, Game.class );
                startActivity(i);
                break;

        }







    }


    private enum pages {
    GAME;
    }
}
