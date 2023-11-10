package com.ruoyi.zeamap.service;

import java.util.List;

import com.ruoyi.zeamap.domain.ImportDb;

/**
 * importdbService接口
 * 
 * @author ruoyi
 * @date 2023-05-26
 */
public interface IImportDbService 
{
    //导入
    public String importDbData(List<ImportDb> importList, Boolean isUpdateSupport, String operName);



    /**
     * 查询importdb
     * 
     * @param dbId importdb主键
     * @return importdb
     */
    public ImportDb selectImportDbByDbId(Long dbId);

    /**
     * 查询importdb列表
     * 
     * @param importDb importdb
     * @return importdb集合
     */
    public List<ImportDb> selectImportDbList(ImportDb importDb);

    /**
     * 新增importdb
     * 
     * @param importDb importdb
     * @return 结果
     */
    public int insertImportDb(ImportDb importDb);

    /**
     * 修改importdb
     * 
     * @param importDb importdb
     * @return 结果
     */
    public int updateImportDb(ImportDb importDb);

    /**
     * 批量删除importdb
     * 
     * @param dbIds 需要删除的importdb主键集合
     * @return 结果
     */
    public int deleteImportDbByDbIds(Long[] dbIds);

    /**
     * 删除importdb信息
     * 
     * @param dbId importdb主键
     * @return 结果
     */
    public int deleteImportDbByDbId(Long dbId);
}
