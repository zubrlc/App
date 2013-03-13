package com.zubrlc.ui.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericAutowireComposer;
import org.zkoss.zul.*;


public class IndexComposer extends GenericAutowireComposer<Component>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2338020871869270202L;

	public Label l1;
	
	public void doAfterCompose(Component comp) throws Exception{
		super.doAfterCompose(comp);
		System.out.println("IndexComposer");
		init();
		
	}
	
	public void init(){
		System.out.println("l1="+l1);
		l1.setValue("Текст");
	}

	
}
