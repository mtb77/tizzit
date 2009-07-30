/**
 * Copyright (c) 2009 Juwi MacMillan Group GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.juwimm.cms.gui.controls;

import java.awt.Dimension;

import javax.swing.JButton;

/**
 * 
 * @author <a href="sascha.kulawik@juwimm.com">Sascha-Matthias Kulawik</a>
 * @version $Id$
 */
public class ToolbarButton extends JButton {
	public ToolbarButton() {
		//this.setFocusPainted(false);
		//this.setBorder(null);
		this.setMaximumSize(new Dimension(32, 32));
		this.setPreferredSize(new Dimension(32, 32));
	}

	public void setRaisedBorder() {
		//this.setBorder(new BevelBorder(BevelBorder.RAISED));
	}

	public void setLoweredBorder() {
		//this.setBorder(null);
	}
}