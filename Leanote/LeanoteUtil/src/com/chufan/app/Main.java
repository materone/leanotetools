package com.chufan.app;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.chufan.bean.Note;
import com.chufan.tools.ParseJSON;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Menu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.events.SelectionListener;
import java.util.function.Consumer;

public class Main {

	final class refreshContent extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			FileDialog chooser = new FileDialog(shlLeannotetools);
			String filepath = chooser.open();
			if(filepath != null) {
				System.out.println(filepath);
				Table t = getTable();
				if(t!=null && !t.isDisposed()) {
					t.dispose();
				}
//				for (int i = 0; i < t.getColumnCount(); i++) {
//					t.getColumn(i).dispose();
//				}
//				t.removeAll();
				File f = new File(filepath);
				try {
					InputStreamReader isr = new InputStreamReader(new FileInputStream(f), "UTF-8");
					BufferedReader br = new BufferedReader(isr);
					String s = null;
					JSONObject obj;
					int idx = 0;
					String[] heads = {};
					String[] conts = {};
					ArrayList<String> al = new ArrayList<String>();
					while((s=br.readLine())!=null) {
//							System.out.println(s);
						Note n = JSON.parseObject(s, Note.class);
						obj = JSON.parseObject(s);
						System.out.println(JSON.toJSONString(n, true));
//						System.out.println(n);
						if (idx==0) {
							al.add("No");
							for (Iterator<String> iterator = obj.keySet().iterator(); iterator.hasNext();) {
								String type = (String) iterator.next();
								al.add(type);
								System.out.print(type + " ");
							}
							System.out.println();
							heads = al.toArray(heads);
							CreateTableInComposite(heads);
							t = getTable();
						}
						
						al.clear();
						al.add(String.valueOf(idx));
						for (int i = 1; i < heads.length; i++) {
							if(heads[i].equals("Content")) {
								al.add("...");
							}else {
//								System.out.println(i+":"+heads[i]+"="+obj.getString(heads[i]));
								al.add(obj.getString(heads[i]));
							}
						}
						
						TableItem ti = new TableItem(table,SWT.None);
						ti.setText(al.toArray(conts));
						String title = (String)obj.get("Title");
						
						System.out.println(new String(title));
						idx++;
					}
					br.close();
					isr.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				for (int i = 0; i < table.getColumnCount(); i++)  
		        {  
		            table.getColumn(i).pack();  
		        }
//				table.pack();
//				getScrolledComposite().pack();
			}
		}
	}
	protected Shell shlLeannotetools;
	private Table table;
	private ScrolledComposite scrolledComposite;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main window = new Main();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlLeannotetools.open();
		shlLeannotetools.layout();
		while (!shlLeannotetools.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlLeannotetools = new Shell();
		shlLeannotetools.setImage(SWTResourceManager.getImage(Main.class, "/com/chufan/app/leanote.png"));
		shlLeannotetools.setMinimumSize(new Point(800, 600));
		shlLeannotetools.setSize(853, 634);
		shlLeannotetools.setText("LeanNoteTools");
		shlLeannotetools.setLayout(new GridLayout(1, false));

		Menu menu = new Menu(shlLeannotetools, SWT.BAR);
		shlLeannotetools.setMenuBar(menu);

		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");

		Menu menu_2 = new Menu(mntmFile);
		mntmFile.setMenu(menu_2);

		MenuItem mntmNew = new MenuItem(menu_2, SWT.NONE);
		mntmNew.addSelectionListener(new refreshContent());
		mntmNew.setToolTipText("Open the file with json format");
		mntmNew.setText("Open");

		MenuItem mntmExit = new MenuItem(menu_2, SWT.NONE);
		mntmExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageBox mb = new MessageBox(shlLeannotetools, SWT.OK | SWT.CANCEL | SWT.ICON_WARNING);
				mb.setText("Confirm");
				mb.setMessage("Are you want Exit?");
				if (SWT.OK == mb.open()) {
					System.out.println("Exit button press!");
					shlLeannotetools.dispose();
					System.exit(0);
				}
			}
		});
		mntmExit.setText("Exit");

		MenuItem mntmNewItem = new MenuItem(menu, SWT.NONE);
		mntmNewItem.setText("Edit");

		MenuItem mntmHelp = new MenuItem(menu, SWT.CASCADE);
		mntmHelp.setText("Help");

		Menu menu_3 = new Menu(mntmHelp);
		mntmHelp.setMenu(menu_3);

		MenuItem mntmAbout = new MenuItem(menu_3, SWT.NONE);
		mntmAbout.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("About selected: " + new Date());
			}
		});
		mntmAbout.setText("About");

		Menu menu_1 = new Menu(shlLeannotetools);
		shlLeannotetools.setMenu(menu_1);
		this.CentreWnd(shlLeannotetools);
		
		ToolBar toolBar = new ToolBar(shlLeannotetools, SWT.FLAT | SWT.RIGHT);
		toolBar.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		
		ToolItem tltmOpen = new ToolItem(toolBar, SWT.NONE);
		tltmOpen.setText("Open");
		tltmOpen.setImage(SWTResourceManager.getImage(Main.class, "/javax/swing/plaf/metal/icons/ocean/floppy.gif"));
		tltmOpen.addSelectionListener(new refreshContent());
		
		ToolItem tltmClear = new ToolItem(toolBar, SWT.NONE);
		tltmClear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog chooser = new FileDialog(shlLeannotetools);
				String filepath = chooser.open();
				if(filepath != null) {
					System.out.println(filepath);
				}
				Table t = getTable();
				TableColumn[] tc = t.getColumns();
				TableItem ti = t.getItem(0);
				JSONObject obj = new JSONObject();
				for (int i = 0; i < t.getColumnCount(); i++) {
					//System.out.print(ti.getText(i));
					obj.put(tc[i].getText(), ti.getText(i));
				}
				System.out.println(obj.toJSONString());
			}
		});
		tltmClear.setText("Save");
		tltmClear.setImage(SWTResourceManager.getImage(Main.class, "/com/chufan/app/leanote.png"));
		
		scrolledComposite = new ScrolledComposite(shlLeannotetools, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
//		CreateTableInComposite();
		
//		scrolledComposite.dispose();

	}

	/**
	 * 
	 */
	public void CreateTableInComposite(String[] heads) {
		table = new Table(scrolledComposite, SWT.BORDER | SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		for (int i = 0; i < heads.length; i++) {
			String type = heads[i];
			TableColumn tc = new TableColumn(table,SWT.None);
			tc.setText(type);
			tc.setMoveable(true);
			tc.setResizable(true);
		}
		scrolledComposite.setContent(table);
		scrolledComposite.setMinSize(table.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	public static void CentreWnd(Shell shell) {
		int width = shell.getMonitor().getClientArea().width;
		int height = shell.getMonitor().getClientArea().height;
		int x = shell.getSize().x;
		int y = shell.getSize().y;
		if (x > width) {
			shell.getSize().x = width;
		}
		if (y > height) {
			shell.getSize().y = height;
		}
		shell.setLocation((width - x) / 2, (height - y) / 2);
	}
	protected Table getTable() {
		return table;
	}
	protected void setTable(Table t) {
		table = t;
	}
	public ScrolledComposite getScrolledComposite() {
		return scrolledComposite;
	}
}
