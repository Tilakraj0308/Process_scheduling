
public class Process implements Comparable<Process>{
	private String pid;
	private int ar;
	private int burst;
	private int tat;
	private int wt;
	private int rt;
	private int ct;
	private int remaining;
	private boolean isDone;
	private boolean hasHit;
	
	public boolean hasHit() {
		return hasHit;
	}
	public void setHasHit(boolean hasHit) {
		this.hasHit = hasHit;
	}
	public Process(String pid, int ar, int burst) {
		this.pid = pid;
		this.ar = ar;
		this.burst = burst;
		this.remaining = burst;
	}
	public Process(String pid, int ar, int burst, int ct) {
		this.pid = pid;
		this.ar = ar;
		this.burst = burst;
		this.remaining = burst;
		this.ct = ct;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public int getTat() {
		return tat;
	}

	public void setTat(int tat) {
		this.tat = tat;
	}

	public int getWt() {
		return wt;
	}

	public void setWt(int wt) {
		this.wt = wt;
	}

	public int getRt() {
		return rt;
	}

	public void setRt(int rt) {
		this.rt = rt;
	}

	public int getCt() {
		return ct;
	}

	public void setCt(int ct) {
		this.ct = ct;
	}

	public String getPid() {
		return pid;
	}

	public int getAr() {
		return ar;
	}

	public int getBurst() {
		return burst;
	}

	@Override
	public int compareTo(Process o) {
		if(this.ar == o.ar)
			return this.pid.compareTo(o.pid);
		return this.ar-o.ar; 
	}

	public void setBurst(int burst) {
		this.burst = burst;
	}
	
	public String toString() {
		return ("Pid="+pid+"\nArrival="+ar+"\nBurst="+burst);
		
	}
}
