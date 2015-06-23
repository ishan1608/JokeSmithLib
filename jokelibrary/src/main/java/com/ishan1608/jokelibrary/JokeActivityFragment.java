package com.ishan1608.jokelibrary;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A placeholder fragment containing a simple view.
 */
public class JokeActivityFragment extends Fragment {

    public JokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Toast.makeText(getActivity(), "joke fragment", Toast.LENGTH_SHORT).show();
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(JokeActivity.JOKE_KEY);
        TextView jokeTextView = (TextView) rootView.findViewById(R.id.joke_text_view);
        jokeTextView.setText(joke);

        return rootView;
    }
}
