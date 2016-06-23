package com.example.prashant.curtcounterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView teamAScore;
  TextView teamBScore;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    teamAScore = (TextView) findViewById(R.id.team_a_score_textview);
    teamBScore = (TextView) findViewById(R.id.team_b_score_textview);
  }

  public void resetScores(View view) {
    String initScore = getResources().getString(R.string.team_init_score);
    teamAScore.setText(initScore);
    teamBScore.setText(initScore);
  }

  public void addScoreToTeamB(View view) {
    int buttonId = view.getId();
    int currentScoreOfTeamB = Integer.parseInt(teamBScore.getText().toString());
    int newScoreOfTeamB = currentScoreOfTeamB;
    switch (buttonId) {
      case R.id.point_one_team_b:
        newScoreOfTeamB += 1;
        break;
      case R.id.point_two_team_b:
        newScoreOfTeamB += 2;
        break;
      case R.id.point_three_team_b:
        newScoreOfTeamB += 3;
        break;
    }
    teamBScore.setText(String.valueOf(newScoreOfTeamB));
  }

  public void addScoreToTeamA(View view) {
    int buttonId = view.getId();
    int currentScoreOfTeamA = Integer.parseInt(teamAScore.getText().toString());
    int newScoreOfTeamA = currentScoreOfTeamA;
    switch (buttonId) {
      case R.id.point_one_team_a:
        newScoreOfTeamA += 1;
        break;
      case R.id.point_two_team_a:
        newScoreOfTeamA += 2;
        break;
      case R.id.point_three_team_a:
        newScoreOfTeamA += 3;
        break;
    }
    teamAScore.setText(String.valueOf(newScoreOfTeamA));
  }
}
