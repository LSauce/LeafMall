package cn.kiroe.mall.ware.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import cn.kiroe.mall.common.model.BaseEntity;
import lombok.Data;

/**
 * 仓库
 */
@Data
public class WareInfo extends BaseEntity {

    @TableField
    private String name;

    @TableField
    private String address;

    @TableField
    private String areacode;

}
