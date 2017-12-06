
import java.util.*;

/**
 * 
 */
public class Computer {
	private String cpu;
	private String disk;
	private String memory;
	private String host;

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getDisk() {
		return disk;
	}

	public void setDisk(String disk) {
		this.disk = disk;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", disk=" + disk + ", memory=" + memory + ", host=" + host + "]";
	}

	
	
}