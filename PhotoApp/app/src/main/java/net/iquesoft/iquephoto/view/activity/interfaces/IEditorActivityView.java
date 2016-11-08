package net.iquesoft.iquephoto.view.activity.interfaces;

import android.support.v4.app.Fragment;

import net.iquesoft.iquephoto.core.ImageEditorView;

public interface IEditorActivityView {

    void showAlertDialog();

    void setupFragment(Fragment fragment);

    void showToastMessage(int stringResource);

    void navigateBack(boolean isFragment);

    ImageEditorView getImageEditorView();
}