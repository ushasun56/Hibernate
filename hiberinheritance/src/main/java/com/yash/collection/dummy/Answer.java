package com.yash.collection.dummy;

import java.util.List;

public class Answer {
	private int id;
	private String answer;
	private String posterName;

	public Answer() {
		super();
	}

	public Answer(int id, String answer, String posterName) {
		super();
		this.id = id;
		this.answer = answer;
		this.posterName = posterName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getPosterName() {
		return posterName;
	}

	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", posterName=" + posterName + "]";
	}

}