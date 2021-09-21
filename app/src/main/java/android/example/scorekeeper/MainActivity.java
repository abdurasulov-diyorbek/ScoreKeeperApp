package android.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int teamAGoalsQuantity = 0;
    int team_A_YellowCardsQuantity = 0;
    int team_A_redCardsQuantity = 0;

    int teamBGoalsQuantity = 0;
    int team_B_YellowCardsQuantity = 0;
    int team_B_redCardsQuantity = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayTeam_A_goals(0);
        displayTeam_A_yellows(0);
        displayTeam_A_reds(0);

        displayTeam_B_goals(0);
        displayTeam_B_yellows(0);
        displayTeam_B_reds(0);

    }


    /**
     * Bellow Team "A" buttons. First one is displaying quantity of team "A" goals
     **/
    public void displayTeam_A_goals(int score) {
        TextView teamGoals = (TextView) findViewById(R.id.team_a_goals);
        teamGoals.setText(String.valueOf(score));
    }

    public void goalForTeamA(View v) {
        teamAGoalsQuantity += 1;
        displayTeam_A_goals(teamAGoalsQuantity);
        Toast.makeText(this, "Team A scored!" + ("⚽"), Toast.LENGTH_SHORT).show();
        //there I put toast message, so
        //if any team scores a goal, toast shows up
    }


    /**
     * second one is displaying quantity of team "A" yellow cards and update button`s text
     **/
    public void displayTeam_A_yellows(int score) {
        Button yellowCards = (Button) findViewById(R.id.team_a_yellow_cards);
        yellowCards.setText(String.valueOf(score) + " x " + "\uD83D\uDFE8" + " cards");    //in there I used unicode of emojies
        // for making my app more interesting
    }

    public void yellowCardForTeam_A(View v) {
        team_A_YellowCardsQuantity += 1;
        displayTeam_A_yellows(team_A_YellowCardsQuantity);
    }


    /**
     * next one is displaying quantity of team "A" red cards and update button`s text
     **/
    public void displayTeam_A_reds(int score) {
        Button redCard = (Button) findViewById(R.id.redCardForTeam_A_Button);
        redCard.setText(String.valueOf(score) + " x " + "\uD83D\uDFE5" + " cards");
    }

    public void redCardForTeam_A(View v) {
        team_A_redCardsQuantity += 1;
        displayTeam_A_reds(team_A_redCardsQuantity);
    }


    /**
     * Bellow Team "B" buttons. First one is displaying quantity of team "B" goals
     * same with team A
     **/
    public void displayTeam_B_goals(int score) {
        TextView teamGoals = (TextView) findViewById(R.id.team_b_goals);
        teamGoals.setText(String.valueOf(score));

    }

    public void goalForTeamB(View v) {
        teamBGoalsQuantity += 1;
        displayTeam_B_goals(teamBGoalsQuantity);
        Toast.makeText(this, "Team B scored!" + ("⚽"), Toast.LENGTH_SHORT).show();

    }


    /**
     * second one is displaying quantity of team "B" yellow cards and update button`s text
     **/
    public void displayTeam_B_yellows(int score) {
        Button yellowCards = (Button) findViewById(R.id.team_b_yellow_cards);
        yellowCards.setText(String.valueOf(score) + " x " + "\uD83D\uDFE8" + " cards");
    }

    public void yellowCardForTeam_B(View v) {
        team_B_YellowCardsQuantity += 1;
        displayTeam_B_yellows(team_B_YellowCardsQuantity);
    }


    /**
     * next one is displaying quantity of team "B" red cards and update button`s text
     **/
    public void displayTeam_B_reds(int score) {
        Button redCards = (Button) findViewById(R.id.redCardForTeam_B_Button);
        redCards.setText(String.valueOf(score) + " x " + "\uD83D\uDFE5" + " cards");
    }

    public void redCardForTeam_B(View v) {
        team_B_redCardsQuantity += 1;
        displayTeam_B_reds(team_B_redCardsQuantity);
    }


    /**
     * and there is a function for reset button.
     **/

    public void resetButtonClicked(View v) {

        teamAGoalsQuantity = 0;
        team_A_YellowCardsQuantity = 0;
        team_A_redCardsQuantity = 0;

        teamBGoalsQuantity = 0;
        team_B_YellowCardsQuantity = 0;
        team_B_redCardsQuantity = 0;
        displayTeam_A_goals(0);
        displayTeam_A_yellows(0);
        displayTeam_A_reds(0);

        displayTeam_B_goals(0);
        displayTeam_B_yellows(0);
        displayTeam_B_reds(0);
    }


}