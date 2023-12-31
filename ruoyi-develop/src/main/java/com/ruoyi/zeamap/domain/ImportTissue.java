package com.ruoyi.zeamap.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import javax.persistence.Table;

/**
 * 组织对象 tissue
 * 
 * @author ruoyi
 * @date 2023-03-22
 */
@Table(name = "tissue")
public class ImportTissue extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    @Excel(name = "主键")
    private Long tissueId;

    /** $column.columnComment */
    @Excel(name = "组织分类")
    private String tissueClass;

    /** $column.columnComment */
    @Excel(name = "组织的生长时期")
    private String tissueStage;

    /** $column.columnComment */
    @Excel(name = "组织取的位置")
    private String tissuePosition;

    /** $column.columnComment */
    @Excel(name = "组织的描述信息")
    private String tissueDesc;

    /** zmap_tissue_expression 上显示的具体名称 */
    @Excel(name = "zmap_tissue_expression 上显示的具体名称")
    private String tissueSvgclass;

    /** $column.columnComment */
    @Excel(name = "组织编码名称")
    private String tissueName;

    /** 状态（0正常 1停用） */
    private String status;

    public void setTissueId(Long tissueId) 
    {
        this.tissueId = tissueId;
    }

    public Long getTissueId() 
    {
        return tissueId;
    }
    public void setTissueClass(String tissueClass) 
    {
        this.tissueClass = tissueClass;
    }

    public String getTissueClass() 
    {
        return tissueClass;
    }
    public void setTissueStage(String tissueStage) 
    {
        this.tissueStage = tissueStage;
    }

    public String getTissueStage() 
    {
        return tissueStage;
    }
    public void setTissuePosition(String tissuePosition) 
    {
        this.tissuePosition = tissuePosition;
    }

    public String getTissuePosition() 
    {
        return tissuePosition;
    }
    public void setTissueDesc(String tissueDesc) 
    {
        this.tissueDesc = tissueDesc;
    }

    public String getTissueDesc() 
    {
        return tissueDesc;
    }
    public void setTissueSvgclass(String tissueSvgclass) 
    {
        this.tissueSvgclass = tissueSvgclass;
    }

    public String getTissueSvgclass() 
    {
        return tissueSvgclass;
    }
    public void setTissueName(String tissueName) 
    {
        this.tissueName = tissueName;
    }

    public String getTissueName() 
    {
        return tissueName;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("tissueId", getTissueId())
            .append("tissueClass", getTissueClass())
            .append("tissueStage", getTissueStage())
            .append("tissuePosition", getTissuePosition())
            .append("tissueDesc", getTissueDesc())
            .append("tissueSvgclass", getTissueSvgclass())
            .append("tissueName", getTissueName())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
