package miguel.ahorcado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createbuttons();

    }

    private void createbuttons() {
        // metodo dedicado a definir los botones y su comportamiento
        btnGame=(Button)findViewById(R.id.btnMain_jugar);




        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity(v, pages.GAME);
            }
        });

    }




    private void openNewActivity(View v , pages p){
        switch (p){
            case GAME:
                Intent i = new Intent(this, Game.class );
                startActivity(i);
                break;

        }







    }

    private Button btnGame;
    private enum pages {
    GAME;
    }
}
