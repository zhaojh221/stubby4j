/*
HTTP stub server written in Java with embedded Jetty

Copyright (C) 2012 Alexander Zagniotov, Isa Goksu and Eric Mrak

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.stubby.server;

/**
 * @author Alexander Zagniotov
 * @since 10/26/12, 8:54 AM
 */
public final class JettyContext {

   private final String host;
   private final boolean sslEnabled;
   private final int stubsPort;
   private final int adminPort;

   public JettyContext(final String host, final boolean sslEnabled, final int stubsPort, final int adminPort) {
      this.host = host;
      this.sslEnabled = sslEnabled;
      this.stubsPort = stubsPort;
      this.adminPort = adminPort;
   }

   public boolean isSslEnabled() throws Exception {
      return sslEnabled;
   }

   public int getStubsPort() {
      return stubsPort;
   }

   public int getAdminPort() {
      return adminPort;
   }

   public String getHost() {
      return host;
   }
}