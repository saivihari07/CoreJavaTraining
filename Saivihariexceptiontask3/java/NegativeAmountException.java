package Saivihariexceptiontask3.java;

public class NegativeAmountException extends Exception {
	String msg;
	public NegativeAmountException(String msg) 
	{
		this.msg = msg;
	}
	public String toString()
	{
		return msg;
	}

}
