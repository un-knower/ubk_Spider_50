package com.unbank.robotspider.filter.url;

import java.util.BitSet;
import java.util.List;

import com.unbank.robotspider.entity.ArticleInfo;
import com.unbank.robotspider.store.ArticleInfoReader;

public class SimpleBloomFilter {
	private static final int DEFAULT_SIZE = 2 << 24;
	private static final int[] seeds = new int[] { 5, 7, 11, 13, 31, 37, 61 };
	private BitSet bits = new BitSet(DEFAULT_SIZE);
	private SimpleHash[] func = new SimpleHash[seeds.length];
	static SimpleBloomFilter filter;

	public SimpleBloomFilter() {
		for (int i = 0; i < seeds.length; i++) {
			func[i] = new SimpleHash(DEFAULT_SIZE, seeds[i]);
		}
	}

	public void add(String value) {
		for (SimpleHash f : func) {
			bits.set(f.hash(value), true);
		}
	}

	public boolean contains(String value) {
		if (value == null) {
			return false;
		}
		boolean ret = true;
		for (SimpleHash f : func) {
			ret = ret && bits.get(f.hash(value));
		}
		return ret;
	}

	// 内部类，simpleHash
	public static class SimpleHash {
		private int cap;
		private int seed;

		public SimpleHash(int cap, int seed) {
			this.cap = cap;
			this.seed = seed;
		}

		public int hash(String value) {
			int result = 0;
			int len = value.length();
			for (int i = 0; i < len; i++) {
				result = seed * result + value.charAt(i);
			}
			return (cap - 1) & result;
		}
	}

	public synchronized static SimpleBloomFilter getInstance() {
		if (filter == null) {
			filter = new SimpleBloomFilter();
			List<ArticleInfo> websiteinfos = new ArticleInfoReader()
					.readArticleInfoByTask(2);
			for (ArticleInfo articleInfo : websiteinfos) {
				filter.add(articleInfo.getUrl());
			}
			websiteinfos.clear();
		}
		return filter;
	}

}