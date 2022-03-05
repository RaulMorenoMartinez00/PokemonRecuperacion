package com.gba.pokedexgrupo1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Pokemon {
        private String name;
        private String url;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDescription() {
            return "It's " + getName() + "!";
        }
    }
