package com.serein.myblog.mapper;

import com.serein.myblog.entity.IResources;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResourceMapper {
    //    新增资源
    int saveResource(IResources resources);

    //    查询资源列表
    List<IResources> listResources();

    //    根据ID查询资源
    IResources getResource(Long id);

    //    编辑资源
    int updateResource(IResources resources);

    //    根据ID删除资源
    void deleteResource(Long id);

    //    是否发布
    void is_published(Long id);

    //    改变发布状态
    int changePublished(@Param("published") boolean published,@Param("id") Long id);

    // 查询学习资源
    List<IResources> getStudyResource(String studyResource);

    // 查询图片资源
    List<IResources> getPictureResource(String pictureResource);

    // 查询办公资源
    List<IResources> getOfficeResource(String officeResource);

    // 查询娱乐资源
    List<IResources> getRecreationResource(String recrearionResource);

    // 查询设计资源
    List<IResources> getDesignResource(String desognResource);

    // 查询搜索资源
    List<IResources> getSearchResource(String searchResource);

    // 查询工具资源
    List<IResources> getToolResource(String toolResource);

    Integer getStudyResourceTotle(String studyResource);

    Integer getPictureResourceTotle(String pictureResource);

    Integer getOfficeResourceTotle(String officeResource);

    Integer getRecreationResourceTotle(String recreationResource);

    Integer getDesignResourceTotle(String designResource);

    Integer getSearchResourceTotle(String searchResource);

    Integer getToolResourceTotle(String toolResource);
}
