package com.ishan1608.jslib;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.ishan1608.JokeSmith;
import com.ishan1608.jokelibrary.JokeActivity;


public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button tellJokeButton = (Button) rootView.findViewById(R.id.tell_a_joke_button);
        tellJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show();
                String jokeSmithJoke = JokeSmith.getJoke();
                // Not working
                // Intent jokeDisplayIntent = new Intent(getActivity(), JokeActivity.class);
                 Intent jokeDisplayIntent = new Intent(getActivity(), TestActivity.class);
                jokeDisplayIntent.putExtra(JokeActivity.JOKE_KEY, jokeSmithJoke);
                startActivity(jokeDisplayIntent);
            }
        });

        return rootView;
    }
}
