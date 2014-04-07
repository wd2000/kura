/**
 * Copyright (c) 2011, 2014 Eurotech and/or its affiliates
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Eurotech
 */
package org.eclipse.kura.net.admin.modem;

import org.eclipse.kura.KuraException;
import org.eclipse.kura.net.modem.ModemCdmaServiceProvider;

public interface EvdoCellularModem extends CellularModem {

	public String getMobileDirectoryNumber() throws KuraException;
	
	public String getMobileIdentificationNumber() throws KuraException;
	
	public boolean isProvisioned() throws KuraException;
	
	public void provision() throws KuraException; 
	
	public ModemCdmaServiceProvider getServiceProvider() throws KuraException;
}
