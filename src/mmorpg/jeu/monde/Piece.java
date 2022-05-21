package mmorpg.jeu.monde;

import java.awt.Graphics;
import java.util.ArrayList;

import mmorpg.cadre.resources.Resources;
import mmorpg.jeu.entities.Ennemi;
import mmorpg.jeu.entities.Joueur;
import mmorpg.jeu.monde.generateur.RoomData;

public class Piece {

	private RoomData info;
	private ArrayList<Fonctionalite> fonctionalites;
	private ArrayList<Ennemi> enemies;
	
	public Piece(RoomData info) {
		this.info = info;
		this.fonctionalites = new ArrayList<>();
		this.enemies = new ArrayList<>();
	}
	
	public RoomData getInfo() {
		return info;
	}
	
	public void placefonctionalite(Fonctionalite fonctionalite) {
		if(info.getTuileAt(fonctionalite.x / Tuile.taille, fonctionalite.y / Tuile.taille).getID() == Resources.PIERRE ||
			info.getTuileAt(fonctionalite.x / Tuile.taille, fonctionalite.y / Tuile.taille).getID() == Resources.HERBE ||
			info.getTuileAt(fonctionalite.x / Tuile.taille, fonctionalite.y / Tuile.taille).getID() == Resources.TUILE)
			this.fonctionalites.add(fonctionalite);
		else
			this.placefonctionalite(new Fonctionalite(fonctionalite));
	}
	
	public void InteractionFonctionalite(Joueur joueur) {
		for(int i=0;i<this.fonctionalites.size();i++) {
			if(this.fonctionalites.get(i).intersects(joueur))
				this.fonctionalites.remove(i);
		}
	}
	
	public ArrayList<Ennemi> getEnemies() {
		return enemies;
	}
	
	public void creeEnnemi(Ennemi ennemi) {
		if(info.getTuileAt(ennemi.x / Tuile.taille, ennemi.y / Tuile.taille).getID() == Resources.PIERRE)
			this.enemies.add(ennemi);
		else
			this.creeEnnemi(new Ennemi(ennemi));
	}
	
	public void rendre(Graphics graphics) {
		this.info.render(graphics);
		for(Fonctionalite fonctionalite : fonctionalites) {
			fonctionalite.rendre(graphics);
		}
		for(Ennemi ennemi : enemies) {
			ennemi.render(graphics);
		}
	}
}