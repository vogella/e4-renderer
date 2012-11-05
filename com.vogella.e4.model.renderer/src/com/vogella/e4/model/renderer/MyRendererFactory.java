package com.vogella.e4.model.renderer;

import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.renderers.swt.WorkbenchRendererFactory;

import extension.MyOwnPartStack;

public class MyRendererFactory extends WorkbenchRendererFactory {

	private MyOwnStackRenderer partStackRenderer;

	@Override
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {

		if (uiElement instanceof MyOwnPartStack) {
			if (partStackRenderer == null) {
				partStackRenderer = new MyOwnStackRenderer();
				super.initRenderer(partStackRenderer);
			}
			return partStackRenderer;
		}

		return super.getRenderer(uiElement, parent);
	}

}
