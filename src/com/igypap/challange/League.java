package com.igypap.challange;

import com.igypap.Player;
import com.igypap.Team;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by igypap on 02.01.17.
 */
public class League<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (league.contains((team))) {
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}

