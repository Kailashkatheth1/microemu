/*
 *  MicroEmulator
 *  Copyright (C) 2001 Bartek Teodorczyk <barteo@barteo.net>
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
 
package org.microemu.util;


public class JadMidletEntry
{
  
  String name;
  String icon;
  String className;
  
  
  JadMidletEntry(String name, String icon, String className)
  {
    this.name = name;
    this.icon = icon;
    this.className = className;
  }
  
  
  public String getClassName()
  {
    return className;
  }
  
  
  public String getName()
  {
    return name;
  }
  
  
  // remove it later
  public String toString()
  {
    return name +"+"+ icon +"+"+ className;
  }
  
}
