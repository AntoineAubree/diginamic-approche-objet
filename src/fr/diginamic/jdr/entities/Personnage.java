package fr.diginamic.jdr.entities;

import fr.diginamic.jdr.JdrUtil;

public class Personnage {

	private int force;
	private int pv;
	private int score;

	public Personnage() {
		this.force = JdrUtil.getRandomInt(12, 18);
		this.pv = JdrUtil.getRandomInt(20, 50);
		this.score = 0;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personnage [force=");
		builder.append(force);
		builder.append(", pv=");
		builder.append(pv);
		builder.append(", score=");
		builder.append(score);
		builder.append("]");
		return builder.toString();
	}

}
