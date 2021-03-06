package dev.sgp.filtre;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.VisiteWebService;



@WebFilter(urlPatterns = { "/*" },
description = "Request timer filter")
public class FrequentationFilter implements Filter {
	
	@Inject private VisiteWebService listeVisite; 
	
	private FilterConfig config = null;

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
		config.getServletContext().log("FrequentationFilter initialized");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
		throws IOException, ServletException {
		long before = System.currentTimeMillis();

		String path = ((HttpServletRequest) req).getRequestURI();
		chain.doFilter(req, resp);
		long after = System.currentTimeMillis();
		config.getServletContext().log(path + " : " + (after - before));
		
		listeVisite.sauvegarderVisite(new VisiteWeb(path,(int)(after - before)));
	}

	@Override
	public void destroy() { }
}