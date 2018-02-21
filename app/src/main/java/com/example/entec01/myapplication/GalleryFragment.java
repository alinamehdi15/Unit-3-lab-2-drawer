package com.example.entec01.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class GalleryFragment extends Fragment {
    private static final String TAG = "GalleryFragment";

    private List<ArtPiece> artPieces;
    private ArtPieceAdapter adapter;
    private RecyclerView recyclerView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        //Create and populate data list
        artPieces = new ArrayList<>();
        populateListOfArtPieces();

        //Lookup the recyclerview
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_art_pieces);
        // Create adapter passing in the data
        adapter = new ArtPieceAdapter(artPieces);
        // Attach the adapter to the recyclerview to populate items
        recyclerView.setAdapter(adapter);
        // Set layout manager to position the items
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        // Add dividers between each row
        //RecyclerView.ItemDecoration itemDecoration = new
        //        DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        //recyclerView.addItemDecoration(itemDecoration);

        //recyclerView.setItemAnimator(new DefaultItemAnimator())
        return view;

    }

    private void populateListOfArtPieces() {
        ArtPiece ap1 = new ArtPiece("Mona Lisa", "Leonardo da Vinci", 1503);
        artPieces.add(ap1);
        ArtPiece ap2 = new ArtPiece("Guernica", "Pablo Picasso", 1937);
        artPieces.add(ap2);
        ArtPiece ap3 = new ArtPiece("The Creation of Adam", "Michelangelo", 1508);
        artPieces.add(ap3);
        ArtPiece ap4 = new ArtPiece("The Birth of Venice", "Sandro Botticelli", 1486);
        artPieces.add(ap4);
        ArtPiece ap5 = new ArtPiece("Girl with a Pearl Earring", "Johannes Vermeer", 1665);
        artPieces.add(ap5);
        ArtPiece ap6 = new ArtPiece("Campbell's Soup Cans", "Andy Warhol", 1962);
        artPieces.add(ap6);
        ArtPiece ap7 = new ArtPiece("The Thinker", "Auguste Rodin", 1902);
        artPieces.add(ap7);
        ArtPiece ap8 = new ArtPiece("No 1", "Jackson Pollock", 1950);
        artPieces.add(ap8);
        ArtPiece ap9 = new ArtPiece("Starry Night", "Vincent Van Gogh", 1889);
        artPieces.add(ap9);
        ArtPiece ap10 = new ArtPiece("American Gothic", "Grant Wood", 1930);
        artPieces.add(ap10);
        ArtPiece ap11 = new ArtPiece("Water Lily Pond", "Claude Monet", 1899);
        artPieces.add(ap11);
        ArtPiece ap12 = new ArtPiece("The Scream", "Edvard Munch", 1893);
        artPieces.add(ap12);
        ArtPiece ap13 = new ArtPiece("The Persistence of Memory", "Salvador Dali", 1931);
        artPieces.add(ap13);
        ArtPiece ap14 = new ArtPiece("Dance at Le Moulin de la Galette", "Edward Renoir", 1876);
        artPieces.add(ap14);
    }



}