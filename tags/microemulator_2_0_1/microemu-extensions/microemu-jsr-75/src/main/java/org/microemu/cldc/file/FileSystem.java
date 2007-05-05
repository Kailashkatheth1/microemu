/**
 *  MicroEmulator
 *  Copyright (C) 2006-2007 Bartek Teodorczyk <barteo@barteo.net>
 *  Copyright (C) 2006-2007 Vlad Skarzhevskyy
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *  @version $Id$
 */
package org.microemu.cldc.file;

import org.microemu.app.util.MIDletSystemProperties;
import org.microemu.microedition.ImplFactory;
import org.microemu.microedition.ImplementationInitialization;

/**
 * @author vlads
 *
 */
public class FileSystem implements ImplementationInitialization {

	public static final String detectionProperty = "microedition.io.file.FileConnection.version";
	
	/* (non-Javadoc)
	 * @see org.microemu.microedition.ImplementationInitialization#registerImplementation()
	 */
	public void registerImplementation() {
		ImplFactory.registerGCF("file", new FileSystemConnectorImpl());
		ImplFactory.register(FileSystemRegistryDelegate.class, FileSystemRegistryImpl.class);
		MIDletSystemProperties.setProperty(detectionProperty, "1.0");
	}

	protected static void unregisterImplementation(FileSystemConnectorImpl impl) {
		MIDletSystemProperties.clearProperty(detectionProperty);
		ImplFactory.unregistedGCF("file", impl);
		ImplFactory.unregister(FileSystemRegistryDelegate.class, FileSystemRegistryImpl.class);
	}

}
