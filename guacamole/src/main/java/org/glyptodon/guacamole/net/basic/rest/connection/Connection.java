package org.glyptodon.guacamole.net.basic.rest.connection;

/*
 *  Guacamole - Clientless Remote Desktop
 *  Copyright (C) 2010  Michael Jumper
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.List;
import org.glyptodon.guacamole.GuacamoleException;
import org.glyptodon.guacamole.net.auth.ConnectionRecord;
import org.glyptodon.guacamole.protocol.GuacamoleConfiguration;

/**
 * A simple connection to expose through the REST endpoints.
 * 
 * @author James Muehlner
 */
public class Connection {

    /**
     * The name of this connection.
     */
    private String name;
    
    /**
     * The identifier of this connection.
     */
    private String identifier;
    
    /**
     * The configuration associated with this connection.
     */
    private GuacamoleConfiguration configuration;
    
    /**
     * The history records associated with this connection.
     */
    private List<? extends ConnectionRecord> history;
    
    /**
     * Create an empty Connection.
     */
    public Connection() {}
    
    /**
     * Create a Connection from a org.glyptodon.guacamole.net.auth.Connection.
     * @param connection The connection to create this Connection from.
     * @throws GuacamoleException If a problem is encountered while
     *                            instantiating this new Connection.
     */
    public Connection(org.glyptodon.guacamole.net.auth.Connection connection) 
            throws GuacamoleException {
        this.name = connection.getName();
        this.identifier = connection.getIdentifier();
        this.configuration = connection.getConfiguration();
        this.history = connection.getHistory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public GuacamoleConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(GuacamoleConfiguration configuration) {
        this.configuration = configuration;
    }

    public List<? extends ConnectionRecord> getHistory() {
        return history;
    }

    public void setHistory(List<? extends ConnectionRecord> history) {
        this.history = history;
    }
    
}
