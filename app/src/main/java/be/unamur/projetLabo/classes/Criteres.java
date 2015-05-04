package be.unamur.projetLabo.classes;

import org.json.JSONException;
import org.json.JSONObject;

import be.unamur.projetLabo.ProjetLabo;

public class Criteres {
    private int id;
    private String name;
    private String type;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public Criteres(JSONObject criObj){
        try{
            this.setId(criObj.getInt("Id"));
            this.setName(criObj.getString("Name"));
            this.setType(criObj.getString("Type"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
