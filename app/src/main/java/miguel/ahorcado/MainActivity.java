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
        btnOpciones=(Button)findViewById(R.id.btnMain_opciones);
        btnScores=(Button)findViewById(R.id.btnMain_scores);





        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity(v, pages.GAME);
            }
        });

        btnOpciones.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNewActivity(v, pages.OPTIONS);
            }
        });

        btnScores.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNewActivity(v, pages.SCORES);
            }
        });

    }




    private void openNewActivity(View v , pages p){
        Intent i;
        switch (p){
            case GAME:
                i = new Intent(this, Game.class );
                startActivity(i);
                break;
            case OPTIONS:
                i = new Intent(this, Options.class );
                startActivity(i);
                break;

            case SCORES:
                i = new Intent(this, Scores.class );
                startActivity(i);
                break;

        }







    }

    private Button btnGame, btnOpciones, btnScores;
    private enum pages {
    GAME, OPTIONS,SCORES;
    }
}
