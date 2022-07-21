package allen;

import redis.clients.jedis.Jedis;

// Must use java 1.8 jdk
public class Test1 {

	public static void main(String[] args) {
		Jedis jedis = new Jedis();

		jedis.set("hello", "world");
		// jedis.set("k1", "v1");
		// jedis.set("k2", "v2");
		// jedis.set("k3", "v3");

		String v = jedis.get("hello");
		System.out.println("hello=" + v);
		v = jedis.get("k2");
		System.out.println("k2=" + v);

		jedis.close();
	}

}
