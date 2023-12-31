package com.nju.edu.erp.model.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("warehouse")
public class WarehousePO {
    /**
     * 库存id
     */
    @TableId
    private Integer id;

    /**
     * 商品编号
     */
    private String pid;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 进价
     */
    private BigDecimal purchasePrice;

    /**
     * 批次
     */
    private Integer batchId;

    /**
     * 出厂日期
     */
    private Date productionDate;
}
