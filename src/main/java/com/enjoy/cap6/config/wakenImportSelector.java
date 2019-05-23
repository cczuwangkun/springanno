package com.enjoy.cap6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author:waken
 * @Date: Created in 2019/4/27 17:16
 * @Description:
 */
public class wakenImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //
        return new String[]{"com.enjoy.cap6.bean.Fish","com.enjoy.cap6.bean.Tigger"};
    }
}
