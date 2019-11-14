package com.example.starwarsmovies.characters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.starwarsmovies.R;
import com.example.starwarsmovies.models.Films;

import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;

public class CharacterListAdapter extends RecyclerView.Adapter<CharacterListAdapter.CharacterViewHolder> {
    private ArrayList<String> characters = new ArrayList<>();
    private Context mContext;

    public CharacterListAdapter(Context context, ArrayList<String> characters) {
        this.mContext = context;
        this.characters = characters;
    }

    @Override
    public CharacterListAdapter.CharacterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.character_list, parent, false);
        CharacterViewHolder viewHolder = new CharacterViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CharacterListAdapter.CharacterViewHolder holder, int position) {
        holder.characterName.setText("Character Name: " + characters.get(position));
    }

    @Override
    public int getItemCount() {
        if (characters==null)
        {
            return 0;
        }
        else
            return characters.size();
    }

    public class CharacterViewHolder extends RecyclerView.ViewHolder {

        TextView characterName;

        public CharacterViewHolder(View itemView) {
            super(itemView);
            characterName = (TextView) itemView.findViewById(R.id.txtCharacterName);
        }
    }
}
