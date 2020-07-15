package com.study.MainTest;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

public class MainTest {
	private static String CONNTECT_PATH = "172.16.48.98:2181";
	private static int TIME_OUT = 20 * 1000;
	private static String PATH = "/admin111";
	private static String DATA = "javaaaa";

	public ZooKeeper statZK() throws Exception {
		return new ZooKeeper(CONNTECT_PATH, TIME_OUT, new Watcher() {

			@Override
			public void process(WatchedEvent event) {
			}
		});
	}

	public void stopZK(ZooKeeper zooKeeper) throws Exception {
		if (zooKeeper != null) {
			zooKeeper.close();
		}

	}

	public void createNode(ZooKeeper zooKeeper, String path, String data) throws Exception {
		if (zooKeeper.exists(path, false) == null) {

			zooKeeper.create(path, data.getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		} else {
			zooKeeper.setData(path, data.getBytes(), 0);
		}
	}

	public String getNode(ZooKeeper zooKeeper, String path) throws Exception {
		String str = "";
		if (zooKeeper.exists(path, false) != null) {
			byte[] data = zooKeeper.getData(path, false, new Stat());
			str = new String(data);
		}
		return str;
	}

	public static void main(String[] args) throws Exception {
		MainTest test = new MainTest();

		ZooKeeper zk = test.statZK();
		// test.createNode(zk, PATH, DATA);

		String node = test.getNode(zk, PATH);
		System.out.println(node + "***********************");

		test.stopZK(zk);

	}

}
