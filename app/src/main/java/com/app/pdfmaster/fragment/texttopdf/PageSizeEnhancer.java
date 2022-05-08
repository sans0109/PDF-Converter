package com.app.pdfmaster.fragment.texttopdf;

import android.content.Context;
import androidx.annotation.NonNull;

import com.app.pdfmaster.R;
import com.app.pdfmaster.interfaces.Enhancer;
import com.app.pdfmaster.pdfModel.EnhancementOptionsEntity;
import com.app.pdfmaster.pdfPreferences.TextToPdfPreferences;
import com.app.pdfmaster.util.PageSizeUtils;

/**
 * An {@link Enhancer} that lets you select page size.
 */
public class PageSizeEnhancer implements Enhancer {

    private final PageSizeUtils mPageSizeUtils;
    private final EnhancementOptionsEntity mEnhancementOptionsEntity;

    PageSizeEnhancer(@NonNull final Context context) {
        mPageSizeUtils = new PageSizeUtils(context);
        mEnhancementOptionsEntity = new EnhancementOptionsEntity(
                context, R.drawable.ic_page_size_24dp, R.string.set_page_size_text);

        PageSizeUtils.mPageSize = new TextToPdfPreferences(context).getPageSize();
    }

    @Override
    public void enhance() {
        mPageSizeUtils.showPageSizeDialog(false);
    }

    @Override
    public EnhancementOptionsEntity getEnhancementOptionsEntity() {
        return mEnhancementOptionsEntity;
    }

}
