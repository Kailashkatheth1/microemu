/*
 *  MicroEmulator
 *  Copyright (C) 2001-2006 Bartek Teodorczyk <barteo@barteo.net>
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
 */

package org.microemu.app.util;

import java.net.URL;

/**
 * 
 * @deprecated use MIDletClassLoader 
 */
public class SystemClassLoader /*extends ClassLoader*/ {
	
//	private static MIDletClassLoader childClassLoader = null; 
//	
//	public SystemClassLoader(ClassLoader parent) {
//		super(parent);
//		
//		if (this instanceof MIDletClassLoader) {
//			childClassLoader = (MIDletClassLoader) this;
//		}
//	}
//
//	protected URL findResource(String name) {
//		URL result = null;
//		
//		if (childClassLoader != null) {
//			result = childClassLoader.findResource(name);
//		}
//		
//		return result;
//	}
//	
}
