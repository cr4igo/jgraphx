package com.mxgraph.swing.handler;

import com.mxgraph.swing.mxGraphComponent;

public class mxGraphHeadlessHandler extends mxGraphHandler {
    public mxGraphHeadlessHandler(mxGraphComponent graphComponent) {
        super(graphComponent);
    }

    protected void installDragGestureHandler() {
        //dont do anything
    }
}
