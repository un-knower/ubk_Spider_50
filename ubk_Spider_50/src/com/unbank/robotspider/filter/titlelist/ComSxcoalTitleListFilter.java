package com.unbank.robotspider.filter.titlelist;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class ComSxcoalTitleListFilter extends BaseTitleListFilter {
	private String domain = "www.sxcoal.com";

	public ComSxcoalTitleListFilter() {
		TitleListFilterLocator.getInstance().register(domain, this);
	}

	@Override
	public Elements getPossibleListElement(Document document) {
		return document.select("li.li2> a");
	}

}
