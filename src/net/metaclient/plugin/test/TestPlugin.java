package net.metaclient.plugin.test;

import de.metaclient.utils.plugin.MetaAPI;
import de.metaclient.utils.plugin.MetaApiInterface;
import de.metaclient.utils.plugin.MetaPluginInterface;

public class TestPlugin implements MetaPluginInterface {
	
	public MetaApiInterface metaApi = new MetaAPI();
	
	@Override
	public void start() {
		System.out.println("TestPlugin wurde geladen");
		metaApi.addCommand(new TestCommand());
		System.out.println("Willkommen " + metaApi.getName());
	}

	@Override
	public void stop() {
		System.out.println("TestPlugin wurde heruntergefahren");
	} 

}