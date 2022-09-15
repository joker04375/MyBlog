package com.serein.myblog.service;

import com.serein.myblog.entity.IResources;

import java.util.List;

public interface ResourceService {
    int savePicture(IResources resources);

    List<IResources> listResources();

    IResources getResource(Long id);

    int updateResource(IResources resources);

    void deleteResource(Long id);

    void is_published(Long id);

    int changePublished(boolean flag,Long id);

    List<IResources> getStudyResource(String studyResource);

    List<IResources> getPictureResource(String pictureResource);

    List<IResources> getOfficeResource(String officeResource);

    List<IResources> getRecreationResource(String recreationResource);

    List<IResources> getDesignResource(String designResource);

    List<IResources> getSearchResource(String searchResource);

    List<IResources> getToolResource(String toolResource);

    Integer getStudyResourceTotle(String studyResource);

    Integer getPictureResourceTotle(String pictureResource);

    Integer getOfficeResourceTotle(String officeResource);

    Integer getRecreationResourceTotle(String recreationResource);

    Integer getDesignResourceTotle(String designResource);

    Integer getSearchResourceTotle(String searchResource);

    Integer getToolResourceTotle(String toolResource);
}
