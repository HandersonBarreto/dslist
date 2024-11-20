package com.devsuperior.DSList.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongigPK {

	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;

	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList list;

	public BelongigPK() {

	}

	public BelongigPK(Game game, GameList gameList) {
		this.game = game;
		this.list = gameList;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getList() {
		return list;
	}

	public void setList(GameList gameList) {
		this.list = gameList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongigPK other = (BelongigPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	}

}
