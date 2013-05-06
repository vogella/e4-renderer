package com.vogella.e4.model.app.parts;

import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class Part1 {
	@Inject
	public Part1(Composite parent, final MDirtyable dirty) {
		Text text = new Text(parent, SWT.MULTI | SWT.LEAD | SWT.BORDER);
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				dirty.setDirty(true);
			}
		});
	}

	@Focus
	public void onFocus() {
	}

	@Persist
	public void persists(MDirtyable dirty) {
		dirty.setDirty(false);
	}

}