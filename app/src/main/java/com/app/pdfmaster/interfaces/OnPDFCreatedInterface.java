package com.app.pdfmaster.interfaces;

public interface OnPDFCreatedInterface {
    void onPDFCreationStarted();
    void onPDFCreated(boolean success, String path);
}
