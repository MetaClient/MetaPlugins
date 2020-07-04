package net.metaclient.plugin.test;

import de.metaclient.command.Command;
import de.metaclient.utils.plugin.MetaAPI;
import de.metaclient.utils.plugin.MetaApiInterface;

public class TestCommand extends Command {

	public MetaApiInterface metaApi = new MetaAPI();
	
	public TestCommand() {
		super("test");
	}

	@Override
	public void execute(String[] args) {
		metaApi.sendMessage("§eSag mashallah einfach die hübsche");
	}

}
