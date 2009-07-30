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
package de.juwimm.cms.util;

import static de.juwimm.cms.common.Constants.*;

import java.awt.Cursor;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

import org.apache.log4j.Logger;

import de.juwimm.cms.Main;
import de.juwimm.cms.common.Constants;
import de.juwimm.cms.gui.PanStatusbar;
import de.juwimm.cms.gui.views.page.PanelContent;

/**
 * <p>Title: ConQuest</p>
 * <p>Description: Enterprise Content Management</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * @author <a href="sascha.kulawik@juwimm.com">Sascha-Matthias Kulawik</a>
 * @version $Id$
 */
public final class UIConstants {
	private static Logger log = Logger.getLogger(UIConstants.class);
	private static PanStatusbar panStatusbar;
	private static HashMap<String, ImageIcon> imageCache = new HashMap<String, ImageIcon>();
	private static final String IMAGE_PATH = "/images/";

	public static final int IMAGE_SIZE_16 = 16;
	public static final int IMAGE_SIZE_20 = 20;
	public static final int IMAGE_SIZE_UNDEF = -1;

	private static Main mainFrame = null;

	public static ImageIcon EMPTY;
	public static ImageIcon CMS = load("cms_16x16.gif");

	public static ImageIcon MODULE_DATABASECOMPONENT_DELETE;
	public static ImageIcon MODULE_DATABASECOMPONENT_ADD;
	public static ImageIcon MODULE_DATABASECOMPONENT_SAVE;
	public static ImageIcon DBC_SEARCH_POPUP;
	public static ImageIcon DBC_ADD_POPUP;
	public static ImageIcon DBC_ADD;
	public static ImageIcon DBC_VISIBILTY;

	public static ImageIcon ICON_NEW_TASK;
	public static ImageIcon ICON_UNIT;
	public static ImageIcon ICON_PERSON;
	public static ImageIcon ICON_PERSON_LINK;
	public static ImageIcon ICON_DEPARTMENT;
	public static ImageIcon ICON_TALKTIME;
	public static ImageIcon ICON_ADDRESS;

	public static ImageIcon ICON_USER;
	public static ImageIcon ICON_MANDANT;

	public static ImageIcon CONTENT_EDITED;
	public static ImageIcon CONTENT_EDITED_INVISIBLE;
	public static ImageIcon CONTENT_EDITED_LIVE;
	public static ImageIcon CONTENT_EDITED_INVISIBLE_LIVE;
	public static ImageIcon CONTENT_APPROVAL;
	public static ImageIcon CONTENT_APPROVAL_INVISIBLE;
	public static ImageIcon CONTENT_APPROVAL_LIVE;
	public static ImageIcon CONTENT_APPROVAL_INVISIBLE_LIVE;
	public static ImageIcon CONTENT_APPROVAL_DELETE_LIVE;
	public static ImageIcon CONTENT_APPROVAL_DELETE_INVISIBLE_LIVE;
	public static ImageIcon CONTENT_APPROVED;
	public static ImageIcon CONTENT_APPROVED_INVISIBLE;
	public static ImageIcon CONTENT_APPROVED_LIVE;
	public static ImageIcon CONTENT_APPROVED_INVISIBLE_LIVE;
	public static ImageIcon CONTENT_DELETE;
	public static ImageIcon CONTENT_DELETE_INVISIBLE;
	public static ImageIcon CONTENT_DELETE_LIVE;
	public static ImageIcon CONTENT_DELETE_INVISIBLE_LIVE;
	public static ImageIcon CONTENT_DEPLOYED_LIVE;
	public static ImageIcon CONTENT_DEPLOYED_INVISIBLE_LIVE;
	public static ImageIcon CONTENT_NO_ACCESS;
	public static ImageIcon CONTENT_OFFLINE;

	public static ImageIcon SYMLINK_EDITED;
	public static ImageIcon SYMLINK_EDITED_LIVE;
	public static ImageIcon SYMLINK_APPROVAL;
	public static ImageIcon SYMLINK_APPROVAL_LIVE;
	public static ImageIcon SYMLINK_APPROVED;
	public static ImageIcon SYMLINK_APPROVED_LIVE;
	public static ImageIcon SYMLINK_DELETE;
	public static ImageIcon SYMLINK_DELETE_LIVE;
	public static ImageIcon SYMLINK_DEPLOYED_LIVE;

	public static ImageIcon INTERNALLINK_EDITED;
	public static ImageIcon INTERNALLINK_EDITED_LIVE;
	public static ImageIcon INTERNALLINK_APPROVAL;
	public static ImageIcon INTERNALLINK_APPROVAL_LIVE;
	public static ImageIcon INTERNALLINK_APPROVED;
	public static ImageIcon INTERNALLINK_APPROVED_LIVE;
	public static ImageIcon INTERNALLINK_DELETE;
	public static ImageIcon INTERNALLINK_DELETE_LIVE;
	public static ImageIcon INTERNALLINK_DEPLOYED_LIVE;

	public static ImageIcon EXTERNALLINK_EDITED;
	public static ImageIcon EXTERNALLINK_EDITED_LIVE;
	public static ImageIcon EXTERNALLINK_APPROVAL;
	public static ImageIcon EXTERNALLINK_APPROVAL_LIVE;
	public static ImageIcon EXTERNALLINK_APPROVED;
	public static ImageIcon EXTERNALLINK_APPROVED_LIVE;
	public static ImageIcon EXTERNALLINK_DELETE;
	public static ImageIcon EXTERNALLINK_DELETE_LIVE;
	public static ImageIcon EXTERNALLINK_DEPLOYED_LIVE;

	public static ImageIcon SEPARATOR_EDITED;
	public static ImageIcon SEPARATOR_EDITED_LIVE;
	public static ImageIcon SEPARATOR_APPROVAL;
	public static ImageIcon SEPARATOR_APPROVAL_LIVE;
	public static ImageIcon SEPARATOR_APPROVED;
	public static ImageIcon SEPARATOR_APPROVED_LIVE;
	public static ImageIcon SEPARATOR_DELETE;
	public static ImageIcon SEPARATOR_DELETE_LIVE;
	public static ImageIcon SEPARATOR_DEPLOYED_LIVE;

	public static ImageIcon DEPLOYSTATUS_EDITED;
	public static ImageIcon DEPLOYSTATUS_APPROVAL;
	public static ImageIcon DEPLOYSTATUS_APPROVED;

	public static ImageIcon MODULE_ITERATION_CONTENT_DELETE;
	public static ImageIcon MODULE_ITERATION_CONTENT_ADD;
	public static ImageIcon MODULE_ITERATION_CONTENT_UP;
	public static ImageIcon MODULE_ITERATION_CONTENT_DOWN;

	public static ImageIcon TOOLBAR_LINK;
	public static ImageIcon TOOLBAR_JUMP;
	public static ImageIcon TOOLBAR_CONTENT;
	public static ImageIcon TOOLBAR_SYMLINK;
	public static ImageIcon TOOLBAR_SEPARATOR;

	public static ImageIcon ACTION_TREE_NODE_APPEND;
	public static ImageIcon ACTION_TREE_NODE_BEFORE;
	public static ImageIcon ACTION_TREE_NODE_AFTER;

	public static ImageIcon MOVE_UP;
	public static ImageIcon MOVE_DOWN;
	public static ImageIcon MOVE_LEFT;
	public static ImageIcon MOVE_RIGHT;

	public static ImageIcon ACTION_TREE_LINK_BEFORE;
	public static ImageIcon ACTION_TREE_LINK_AFTER;
	public static ImageIcon ACTION_TREE_LINK_ADD;

	public static ImageIcon ACTION_TREE_JUMP_BEFORE;
	public static ImageIcon ACTION_TREE_JUMP_AFTER;
	public static ImageIcon ACTION_TREE_JUMP_ADD;

	public static ImageIcon ACTION_TREE_SYMLINK_BEFORE;
	public static ImageIcon ACTION_TREE_SYMLINK_AFTER;
	public static ImageIcon ACTION_TREE_SYMLINK_ADD;

	public static ImageIcon ACTION_TREE_SEPARATOR_BEFORE;
	public static ImageIcon ACTION_TREE_SEPARATOR_AFTER;
	public static ImageIcon ACTION_TREE_SEPARATOR_ADD;

	public static ImageIcon ACTION_TREE_NODE_DELETE;

	public static ImageIcon ACTION_TREE_REFRESH;

	public static ImageIcon ACTION_CUT;
	public static ImageIcon ACTION_COPY;
	public static ImageIcon ACTION_PASTE;
	public static ImageIcon ACTION_HELP;

	public static ImageIcon ACTION_CHECKIN;
	public static ImageIcon ACTION_CHECKOUT;
	public static ImageIcon ACTION_DEPLOY;

	public static ImageIcon WIZARD_ICON_INSTALL;

	public static ImageIcon MODULE_POSTIT_TITLE;
	public static ImageIcon MODULE_POSTIT_CLOSE;

	public static ImageIcon MNU_EMPTY;
	public static ImageIcon MNU_FILE_NEW;
	public static ImageIcon MNU_FILE_SAVE;
	public static ImageIcon MNU_FILE_CHECKIN;
	public static ImageIcon MNU_FILE_CHECKOUT;
	public static ImageIcon MNU_FILE_EDIT_UNDO;
	public static ImageIcon MNU_FILE_EDIT_REDO;
	public static ImageIcon MNU_FILE_EDIT_CUT;
	public static ImageIcon MNU_FILE_EDIT_COPY;
	public static ImageIcon MNU_FILE_EDIT_PASTE;
	public static ImageIcon MNU_MOVE_LEFT;
	public static ImageIcon MNU_MOVE_RIGHT;
	public static ImageIcon MNU_MOVE_UP;
	public static ImageIcon MNU_MOVE_DOWN;

	public static ImageIcon BTN_LOGIN;
	public static ImageIcon BTN_PREVIEW;
	public static ImageIcon BTN_OK;
	public static ImageIcon BTN_CLOSE;
	public static ImageIcon BTN_SAVE;
	public static ImageIcon BTN_STOP;
	public static ImageIcon BTN_CONFIGURE;
	public static ImageIcon BTN_SYMBOL_VIEW;
	public static ImageIcon BTN_LIST_VIEW;

	public static ImageIcon MODULE_WYSIWYG_EXPLODE_WINDOW;

	public static ImageIcon ICON_DECRYPTED;
	public static ImageIcon ICON_ENCRYPTED;
	public static ImageIcon ICON_PROXY;

	private UIConstants() {
	}

	private static ImageIcon load(String path) {
		String image = IMAGE_PATH + path;

		if (imageCache.containsKey(image)) {
			return (ImageIcon) imageCache.get(image);
		}
		ImageIcon iimage = new ImageIcon(UIConstants.class.getResource(image));
		imageCache.put(image, iimage);
		return iimage;
	}

	public static void loadImages() {
		EMPTY = load("empty1.gif");

		BTN_LOGIN = load("button/login.png");
		BTN_PREVIEW = load("button/preview.png");
		BTN_OK = load("button/ok.png");
		BTN_SAVE = load("button/save.png");
		BTN_STOP = load("button/stop.png");
		BTN_CLOSE = load("button/close.png");
		BTN_CONFIGURE = load("button/configure.png");
		BTN_SYMBOL_VIEW = load("button/btn_symbol_view_16.png");
		BTN_LIST_VIEW = load("button/btn_list_view_16.png");

		ICON_NEW_TASK = load("16x16/newtask.png");

		DBC_SEARCH_POPUP = load("modules/databaseComponents/search_popup.gif");
		DBC_ADD_POPUP = load("modules/databaseComponents/add_popup.gif");
		DBC_ADD = load("modules/databaseComponents/add.gif");
		DBC_VISIBILTY = load("modules/databaseComponents/visible.gif");

		ICON_USER = load("16x16/user.png");
		ICON_MANDANT = load("16x16/mandant.png");
		ICON_DECRYPTED = load("16x16/decrypted.png");
		ICON_ENCRYPTED = load("16x16/encrypted.png");
		ICON_PROXY = load("16x16/proxy.png");
		
		ICON_UNIT = load("16x16/einrichtung.gif");
		ICON_DEPARTMENT = load("16x16/bereich.gif");
		ICON_ADDRESS = load("16x16/adresse.gif");
		ICON_TALKTIME = load("16x16/sprechzeit.gif");
		ICON_PERSON = load("16x16/person.gif");
		ICON_PERSON_LINK = load("modules/databaseComponents/person_link.png");

		CONTENT_OFFLINE = load("16x16/content_offline.gif");
		CONTENT_EDITED = load("tree/content/c_edited.png");
		CONTENT_EDITED_INVISIBLE = load("tree/content/c_edited_i.png");
		CONTENT_EDITED_LIVE = load("tree/content/c_edited_live.png");
		CONTENT_EDITED_INVISIBLE_LIVE = load("tree/content/c_edited_live_i.png");
		CONTENT_APPROVAL = load("tree/content/c_approval.png");
		CONTENT_APPROVAL_INVISIBLE = load("tree/content/c_approval_i.png");
		CONTENT_APPROVAL_LIVE = load("tree/content/c_approval_live.png");
		CONTENT_APPROVAL_INVISIBLE_LIVE = load("tree/content/c_approval_live_i.png");
		CONTENT_APPROVAL_DELETE_LIVE = load("tree/content/c_approval_delete_live.png");
		CONTENT_APPROVAL_DELETE_INVISIBLE_LIVE = load("tree/content/c_approval_delete_live_i.png");
		CONTENT_APPROVED = load("tree/content/c_approved.png");
		CONTENT_APPROVED_INVISIBLE = load("tree/content/c_approved_i.png");
		CONTENT_APPROVED_LIVE = load("tree/content/c_approved_live.png");
		CONTENT_APPROVED_INVISIBLE_LIVE = load("tree/content/c_approved_live_i.png");
		CONTENT_DELETE = load("tree/content/c_delete.png");
		CONTENT_DELETE_INVISIBLE = load("tree/content/c_delete_i.png");
		CONTENT_DELETE_LIVE = load("tree/content/c_delete_live.png");
		CONTENT_DELETE_INVISIBLE_LIVE = load("tree/content/c_delete_live_i.png");
		CONTENT_DEPLOYED_LIVE = load("tree/content/c_deployed_live.png");
		CONTENT_DEPLOYED_INVISIBLE_LIVE = load("tree/content/c_deployed_live_i.png");
		CONTENT_NO_ACCESS = load("tree/content/c_no_access.png");

		SYMLINK_EDITED = load("tree/symlink/s_edited.png");
		SYMLINK_EDITED_LIVE = load("tree/symlink/s_edited_live.png");
		SYMLINK_APPROVAL = load("tree/symlink/s_approval.png");
		SYMLINK_APPROVAL_LIVE = load("tree/symlink/s_approval_live.png");
		SYMLINK_APPROVED = load("tree/symlink/s_approved.png");
		SYMLINK_APPROVED_LIVE = load("tree/symlink/s_approved_live.png");
		SYMLINK_DELETE = load("tree/symlink/s_delete.png");
		SYMLINK_DELETE_LIVE = load("tree/symlink/s_delete_live.png");
		SYMLINK_DEPLOYED_LIVE = load("tree/symlink/s_deployed_live.png");

		INTERNALLINK_EDITED = load("tree/internallink/i_edited.png");
		INTERNALLINK_EDITED_LIVE = load("tree/internallink/i_edited_live.png");
		INTERNALLINK_APPROVAL = load("tree/internallink/i_approval.png");
		INTERNALLINK_APPROVAL_LIVE = load("tree/internallink/i_approval_live.png");
		INTERNALLINK_APPROVED = load("tree/internallink/i_approved.png");
		INTERNALLINK_APPROVED_LIVE = load("tree/internallink/i_approved_live.png");
		INTERNALLINK_DELETE = load("tree/internallink/i_delete.png");
		INTERNALLINK_DELETE_LIVE = load("tree/internallink/i_delete_live.png");
		INTERNALLINK_DEPLOYED_LIVE = load("tree/internallink/i_deployed_live.png");

		EXTERNALLINK_EDITED = load("tree/externallink/e_edited.png");
		EXTERNALLINK_EDITED_LIVE = load("tree/externallink/e_edited_live.png");
		EXTERNALLINK_APPROVAL = load("tree/externallink/e_approval.png");
		EXTERNALLINK_APPROVAL_LIVE = load("tree/externallink/e_approval_live.png");
		EXTERNALLINK_APPROVED = load("tree/externallink/e_approved.png");
		EXTERNALLINK_APPROVED_LIVE = load("tree/externallink/e_approved_live.png");
		EXTERNALLINK_DELETE = load("tree/externallink/e_delete.png");
		EXTERNALLINK_DELETE_LIVE = load("tree/externallink/e_delete_live.png");
		EXTERNALLINK_DEPLOYED_LIVE = load("tree/externallink/e_deployed_live.png");

		SEPARATOR_EDITED = load("tree/separator/s_edited.png");
		SEPARATOR_EDITED_LIVE = load("tree/separator/s_edited_live.png");
		SEPARATOR_APPROVAL = load("tree/separator/s_approval.png");
		SEPARATOR_APPROVAL_LIVE = load("tree/separator/s_approval_live.png");
		SEPARATOR_APPROVED = load("tree/separator/s_approved.png");
		SEPARATOR_APPROVED_LIVE = load("tree/separator/s_approved_live.png");
		SEPARATOR_DELETE = load("tree/separator/s_delete.png");
		SEPARATOR_DELETE_LIVE = load("tree/separator/s_delete_live.png");
		SEPARATOR_DEPLOYED_LIVE = load("tree/separator/s_deployed_live.png");

		TOOLBAR_CONTENT = load("16x16/tra_content.png");
		TOOLBAR_JUMP = load("16x16/tra_jump.png");
		TOOLBAR_LINK = load("16x16/tra_link.png");
		TOOLBAR_SYMLINK = load("16x16/tra_symlink.png");
		TOOLBAR_SEPARATOR = load("16x16/tra_separator.png");

		ACTION_TREE_NODE_DELETE = load("16x16/tra_loesche_node.png");
		ACTION_TREE_REFRESH = load("16x16/refresh.png");
		ACTION_CUT = load("20x20/cut.gif");
		ACTION_COPY = load("20x20/copy.gif");
		ACTION_PASTE = load("20x20/paste.gif");
		ACTION_HELP = load("20x20/tra_hilfe.gif");

		ACTION_CHECKIN = load("20x20/tra_check_in.gif");
		ACTION_CHECKOUT = load("20x20/tra_check_out.gif");

		MOVE_UP = load("16x16/Up.png");
		MOVE_DOWN = load("16x16/Down.png");
		MOVE_LEFT = load("16x16/Left.png");
		MOVE_RIGHT = load("16x16/Right.png");

		ACTION_TREE_NODE_APPEND = load("16x16/tra_c_darunter_einfuegen.png");
		ACTION_TREE_NODE_BEFORE = load("16x16/tra_c_davor_einfuegen.png");
		ACTION_TREE_NODE_AFTER = load("16x16/tra_c_danach_einfuegen.png");

		ACTION_TREE_LINK_BEFORE = load("16x16/tra_l_davor_einfuegen.png");
		ACTION_TREE_LINK_AFTER = load("16x16/tra_l_danach_einfuegen.png");
		ACTION_TREE_LINK_ADD = load("16x16/tra_l_darunter_einfuegen.png");

		ACTION_TREE_SEPARATOR_BEFORE = load("16x16/tra_sep_davor_einfuegen.png");
		ACTION_TREE_SEPARATOR_AFTER = load("16x16/tra_sep_danach_einfuegen.png");
		ACTION_TREE_SEPARATOR_ADD = load("16x16/tra_sep_darunter_einfuegen.png");

		ACTION_TREE_JUMP_BEFORE = load("16x16/tra_j_davor_einfuegen.png");
		ACTION_TREE_JUMP_AFTER = load("16x16/tra_j_danach_einfuegen.png");
		ACTION_TREE_JUMP_ADD = load("16x16/tra_j_darunter_einfuegen.png");

		ACTION_TREE_SYMLINK_BEFORE = load("16x16/tra_s_davor_einfuegen.png");
		ACTION_TREE_SYMLINK_AFTER = load("16x16/tra_s_danach_einfuegen.png");
		ACTION_TREE_SYMLINK_ADD = load("16x16/tra_s_darunter_einfuegen.png");

		ACTION_DEPLOY = load("wizard/wizard_icon_20.gif");

		WIZARD_ICON_INSTALL = load("wizard/wizard_icon_install.gif");

		MNU_EMPTY = load("menu/EMPTY.gif");
		MNU_FILE_EDIT_UNDO = load("menu/edit_undo.gif");
		MNU_FILE_EDIT_REDO = load("menu/edit_redo.gif");
		MNU_FILE_EDIT_CUT = load("menu/edit_cut.gif");
		MNU_FILE_EDIT_COPY = load("menu/edit_copy.gif");
		MNU_FILE_EDIT_PASTE = load("menu/edit_paste.gif");
		MNU_FILE_NEW = load("menu/file_new.png");
		MNU_FILE_SAVE = load("menu/file_save.png");
		MNU_FILE_CHECKIN = load("menu/checkin.gif");
		MNU_FILE_CHECKOUT = load("menu/checkout.gif");
		MNU_MOVE_LEFT = load("menu/move_left.png");
		MNU_MOVE_RIGHT = load("menu/move_right.png");
		MNU_MOVE_UP = load("menu/move_up.png");
		MNU_MOVE_DOWN = load("menu/move_down.png");

		DEPLOYSTATUS_EDITED = load("16x16/content_edited.png");
		DEPLOYSTATUS_APPROVAL = load("16x16/content_approval.png");
		DEPLOYSTATUS_APPROVED = load("16x16/content_approved.png");

		MODULE_ITERATION_CONTENT_DELETE = load("16x16/content_delete.png");
		MODULE_ITERATION_CONTENT_ADD = load("16x16/content_add.png");
		MODULE_ITERATION_CONTENT_UP = load("16x16/content_up.png");
		MODULE_ITERATION_CONTENT_DOWN = load("16x16/content_down.png");
		MODULE_POSTIT_TITLE = load("modules/postit_title.gif");
		MODULE_POSTIT_CLOSE = load("modules/postit_close.gif");
		MODULE_WYSIWYG_EXPLODE_WINDOW = load("modules/wysiwyg/explodeWindow.png");
		MODULE_DATABASECOMPONENT_DELETE = load("modules/databaseComponents/Delete.gif");
		MODULE_DATABASECOMPONENT_ADD = load("modules/databaseComponents/Plus.gif");
		MODULE_DATABASECOMPONENT_SAVE = load("modules/databaseComponents/Save.png");
	}

	public static ImageIcon getWYSIWYGicon(String imgname) {
		String strUrl = "16x16/";
		ImageIcon imgi = null;
		try {
			imgi = load(strUrl + imgname);
			if (log.isDebugEnabled()) log.debug("Loading WYSIWYG Icon " + imgname + " from JAR-ressource");
		} catch (Exception ex) {
			// can't find this Image
			if (imgi == null || imgi.getIconHeight() < 0) {
				imgi = EMPTY;
				log.warn("WYSIWYG Icon " + imgname + " not found!");
			}
		}
		return imgi;
	}

	public static ImageIcon getDocumentsIcon(String imgname) {
		String strUrl = "documents/";
		ImageIcon imgi = null;
		try {
			imgi = load(strUrl + imgname);
		} catch (Exception ex) {
			// can't find this Image
			imgi = EMPTY;
		}
		return imgi;
	}

	/**
	 * Returns an ImageIcon based on a Property Name.<br>
	 * The value of the property name will be extended with ".png", if nothing has been found
	 * it will search at the CMS_PATH_WEBSTART_IMAGES path.
	 * @param propUniqueId The UniqueId of the Property
	 * @param imageSizeExpected The size
	 * @return ImageIcon, if the Image wasn't found anyway, it will return a dummy image in that
	 * expected size.
	 */
	public static ImageIcon getPropImage(String propUniqueId, int imageSizeExpected) {
		ImageIcon imgi = null;

		// TODO INTERIM!!!
		if (propUniqueId.equalsIgnoreCase(PanelContent.PROP_CHECKIN)) {
			if (imageSizeExpected == IMAGE_SIZE_16) {
				return MNU_FILE_CHECKIN;
			}
			return ACTION_CHECKIN;
		} else if (propUniqueId.equalsIgnoreCase(PanelContent.PROP_CHECKOUT)) {
			if (imageSizeExpected == IMAGE_SIZE_16) {
				return MNU_FILE_CHECKOUT;
			}
			return ACTION_CHECKOUT;
		}
		// --- INTERIM END

		try {
			String loadUrl = "propertybased/" + propUniqueId.toLowerCase() + ".png";
			if (imageSizeExpected != IMAGE_SIZE_UNDEF) {
				loadUrl = "propertybased/" + propUniqueId.toLowerCase() + "_" + imageSizeExpected + ".png";
			}
			imgi = load(loadUrl);
		} catch (Exception ex) {
			imgi = null;
		}
		if (imgi == null || imgi.getIconHeight() < 0) {
			imgi = EMPTY;
		}
		return imgi;
	}

	public static void repaintApp() {
		try {
			getMainFrame().getContentPane().validate();
			getMainFrame().getContentPane().repaint();
			getMainFrame().validate();
			getMainFrame().repaint();
		} catch (Exception exe) {
		}
	}

	public static void repaintApp(boolean hardened) {
		repaintApp();
		if (hardened) {
			javax.swing.SwingUtilities.updateComponentTreeUI(getMainFrame());
		}
	}

	private static boolean iAmWorking = false;

	public static void setWorker(boolean enable) {
		try {
			panStatusbar.showWorker(enable);
			iAmWorking = enable;
			if (enable) {
				UIConstants.getMainFrame().getContentPane().setCursor(new Cursor(Cursor.WAIT_CURSOR));
				//repaintApp();
			} else {
				UIConstants.getMainFrame().getContentPane().setCursor(Cursor.getDefaultCursor());
				//repaintApp();
			}
		} catch (Exception exe) {
		}
	}

	public static boolean isWorking() {
		return iAmWorking;
	}

	public static void setActionStatus(String aeMessage) {
		try {
			String retStr = aeMessage;
			if (!aeMessage.equals("")) {
				//	m_Statusline.showWorker(true);
				if (aeMessage.equals(Constants.ACTION_TREE_SELECT)) {
					retStr = rb.getString("statusinfo.ACTION_TREE_SELECT");
				} else if (aeMessage.equals(Constants.ACTION_VIEW_ADMIN)) {
					retStr = rb.getString("statusinfo.ACTION_VIEW_ADMIN");
				} else if (aeMessage.equals(Constants.ACTION_VIEW_ROOT)) {
					retStr = rb.getString("statusinfo.ACTION_VIEW_ROOT");
				} else if (aeMessage.equals(Constants.ACTION_VIEW_EDITOR)) {
					retStr = rb.getString("statusinfo.ACTION_VIEW_EDITOR");
				}
			}
			setStatusInfo(retStr);
		} catch (NullPointerException npe) { //can occure during login... forget it
		}
	}

	public static void setStatusInfo(String message) {
		SwingUtilities.invokeLater(new StatuslineMessageRunnable(message));
	}

	/**
	 * <p>Title: ConQuest</p>
	 * <p>Description: Enterprise Content Management</p>
	 * <p>Copyright: Copyright (c) 2004</p>
	 * @author <a href="sascha.kulawik@juwimm.com">Sascha-Matthias Kulawik</a>
	 * @version $Revision: 3168 $
	 */
	private static class StatuslineMessageRunnable implements Runnable {
		private String message = "";

		public StatuslineMessageRunnable(String message) {
			this.message = message;
		}

		public void run() {
			try {
				panStatusbar.setMessage(message);
			} catch (Exception exe) {
			}
		}
	}

	public static void setStatusLine(PanStatusbar statusline) {
		panStatusbar = statusline;
	}

	public static boolean isNewTask() {
		return panStatusbar.isTaskShown();
	}

	/**
	 * @param mainFrame The mainFrame to set.
	 */
	public static void setMainFrame(Main mainFrame) {
		UIConstants.mainFrame = mainFrame;
	}

	/**
	 * @return Returns the mainFrame.
	 */
	public static Main getMainFrame() {
		return mainFrame;
	}
}