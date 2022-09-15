package com.serein.myblog.service.impl;

import com.serein.myblog.entity.IResources;
import com.serein.myblog.mapper.ResourceMapper;
import com.serein.myblog.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public int savePicture(IResources resources) {
        return resourceMapper.saveResource(resources);
    }

    @Override
    public List<IResources> listResources() {
        return resourceMapper.listResources();
    }

    @Override
    public IResources getResource(Long id) {
        return resourceMapper.getResource(id);
    }

    @Override
    public int updateResource(IResources resources) {
        return resourceMapper.updateResource(resources);
    }

    @Override
    public void deleteResource(Long id) {
        resourceMapper.deleteResource(id);
    }

    @Override
    public void is_published(Long id) {
        resourceMapper.is_published(id);
    }

    @Override
    public int changePublished(boolean flag, Long id) {
        return resourceMapper.changePublished(flag,id);
    }

    @Override
    public List<IResources> getStudyResource(String studyResource) {
        return resourceMapper.getStudyResource(studyResource);
    }

    @Override
    public List<IResources> getPictureResource(String pictureResource) {
        return resourceMapper.getPictureResource(pictureResource);
    }

    @Override
    public List<IResources> getOfficeResource(String officeResource) {
        return resourceMapper.getOfficeResource(officeResource);
    }

    @Override
    public List<IResources> getRecreationResource(String recreationResource) {
        return resourceMapper.getRecreationResource(recreationResource);
    }

    @Override
    public List<IResources> getDesignResource(String designResource) {
        return resourceMapper.getDesignResource(designResource);
    }

    @Override
    public List<IResources> getSearchResource(String searchResource) {
        return resourceMapper.getSearchResource(searchResource);
    }

    @Override
    public List<IResources> getToolResource(String toolResource) {
        return resourceMapper.getToolResource(toolResource);
    }

    @Override
    public Integer getStudyResourceTotle(String studyResource) {
        return resourceMapper.getStudyResourceTotle(studyResource);
    }

    @Override
    public Integer getPictureResourceTotle(String pictureResource) {
        return resourceMapper.getPictureResourceTotle(pictureResource);
    }

    @Override
    public Integer getOfficeResourceTotle(String officeResource) {
        return resourceMapper.getOfficeResourceTotle(officeResource);
    }

    @Override
    public Integer getRecreationResourceTotle(String recreationResource) {
        return resourceMapper.getRecreationResourceTotle(recreationResource);
    }

    @Override
    public Integer getDesignResourceTotle(String designResource) {
        return resourceMapper.getDesignResourceTotle(designResource);
    }

    @Override
    public Integer getSearchResourceTotle(String searchResource) {
        return resourceMapper.getSearchResourceTotle(searchResource);
    }

    @Override
    public Integer getToolResourceTotle(String toolResource) {
        return resourceMapper.getToolResourceTotle(toolResource);
    }
}
