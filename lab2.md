# 用例文档

# 变更日志

| 变更人           | 变更时间 | 变更内容                  | 版本号 |
| ---------------- | -------- | ------------------------- | ------ |
| 201250080 刘子扬 | 3.30     | 创建用例图                | V1.0   |
| 201250031 吴禹廷 | 3.29     | 创建用例列表、创建3号用例 | V1.0   |
| 201250150 郑寒超 | 3.28     | 创建了6-8号用例           | V1.0   |
| 201250082 李俊彤 | 3.30     | 创建了4-5号用例           | V1.0   |
| 201250031 吴禹廷 | 4.14     | 创建了1号用例             | V1.1   |
| 201250082 李俊彤 | 4.14     | 创建了2号用例             | V1.1   |
| 201250080 刘子扬 | 4.14     | 修改1-8号用例             | V1.1   |

[用例文档](#用例文档)

​	[1.引言](#1. 引言)

​		[1.1目的](#1.1 目的)

​		[1.2参考文献](#1.2 参考文献)

​	[2.用例列表](#2. 用例列表)

​	[3.用例图](#3.用例图)

​	[4.详细用例描述](#4. 详细用例描述)

​		[4.1 库存管理人员管理商品信息](#4.1 库存管理人员管理商品信息)

​		[4.2 库存管理人员管理商品分类](#4.2 库存管理人员管理商品分类)

​		[4.3库存管理人员创建出库单与入库单](#4.3 库存管理人员创建出库单与入库单)

​		[4.4库存管理人员创建库存报溢单与报损单](#4.4库存管理人员创建库存报溢单与报损)

​		[4.5库存管理人员创建库存报警单](#4.5库存管理人员创建库存报警单)

​		[4.6库存管理人员查看库存](#4.6库存管理人员查看库存)

​		[4.7库存管理人员盘点库存](#4.7库存管理人员盘点库存)

​		[4.8库存管理人员创建赠送单](#4.8库存管理人员创建库存赠送单)




# 1. 引言

## 1.1 目的
本文档描述了ERP系统的部分用户需求

## 1.2 参考文献
- 《软件工程与计算（卷二）软件开发的技术基础》骆斌，刘钦，丁二玉编著；

- IEEE标准；
- 《软件⼯程——实践者的研究⽅法》Roger S. Pressman 与 Bruce R. Maxim 著；

# 2. 用例列表
| 参与者       | 用例       |
| ------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 库存管理人员         | 1. 库存管理人员管理商品分类<br>2. 库存管理人员管理商品信息<br>3. 库存管理人员查看库存<br>4. 库存管理人员盘点库存<br>5. 库存管理人员创建库存赠送单<br>6. 库存管理人员创建库存报溢单与报损单<br>7. 库存管理人员创建库存报警单<br>8. 库存管理人员创建出库单与入库单 |
| 进货销售人员 | 1. 进货销售人员管理客户信息<br>2. 进货销售人员制定进货单与进货退货单<br>3. 进货销售人员制定销售单与销售退货单<br> |
| 财务人员 | 1. 财务人员管理公司账户信息<br>2.财务人员管理员工账户信息<br>3. 财务人员制定收款单与付款单<br>4. 财务人员制定工资单<br>5. 财务人员查看销售明细表<br>6. 财务人员查看经营历程表<br>7. 财务人员查看经营情况表<br>8. 财务人员进行期初建账 |
| 人力资源人员       | 1. 人力资源人员进行员工入职登记<br>2. 人力资源人员设置员工岗位制度信息<br>3. 人力资源人员管理员工薪资制度  |
| 总经理 | 1. 总经理审批单据<br>2. 总经理制定员工年终奖<br>3. 总经理查看销售明细表<br>4. 总经理查看经营历程表<br>5. 总经理查看经营情况表<br>6. 总经理制定促销策略 |

# 3.用例图

![seec-logo](https://seec-homework.oss-cn-shanghai.aliyuncs.com/201250080-seec-logo.png)



# 4. 详细用例描述

## 4.1 库存管理人员管理商品信息
- 用例编号：ERP-UseCase-1
- 名称：库存管理人员管理商品信息
- 创建者：吴禹廷
- 创建日期：2022.4.14
- 最后一次更新者：刘子扬
- 更新日期：2022.4.14
- 参与者：
  - 库存管理人员：方便精准地管理商品信息
- 触发条件：
  - 库存管理人员选择进入商品管理界面
- 前置条件：
  - 库存管理人员已经完成登录与身份认证等操作
- 后置条件：
  - 系统记录并更新已修改的库存商品信息
- 优先级：中
- 正常流程：
  1. 操作员选择管理库存商品信息
  2. 系统显示所有商品分类
  3. 操作员逐一展开商品类别找到目标商品进行修改或删除操作，或在分类栏上方的输入框中输入商品信息模糊查找商品，或点击页面左上角“＋”号增加新商品信息，系统逐一记录每次修改。
  4. 操作员点击提交修改
  5. 系统向操作员确认是否修改商品信息
  6. 操作员点击确认
  7. 系统修改对应商品信息
- 扩展流程：
  - `3a-1`：操作员点击商品分类名称旁的“+”号
      - 系统显示该分类下面的第一层子分类，并将该分类旁的“+”号改为“-”号
  - `3a-2`：操作员点击已展开商品分类名称旁的“-”号
      - 系统收起该分类下的所有子分类，并将该分类旁的“-”号改为“+”号
  - `3b-1`：操作员点选具体商品进行修改
      - 系统显示该商品的详细信息，包括编号、名称、型号、库存数量、进价、零售价、最近进价、最近零售价、生产日期等。
  - `3c`：操作员点选具体商品旁的“删除”选项
      - 系统删除该商品
  - `3d-1`：操作员点选页面左上角“+”号添加商品
      - 系统生成商品表单以供操作员填写
  - `3d-2`：操作员点选提交表单
      - `3d-1-1`：必填项尚未全部填写
        - 系统提示“有必填项未填写”信息，并返回表单界面要求操作员继续填写
      - `3d-1-2`：操作员已正确填写
        - 系统提示“添加完成”信息，并添加对应商品
  - `3e-1`：操作员点击查询商品
      - 系统弹出输入框供操作员输入待查询商品信息
  - `3e-2`：操作员点击“查询”
      - `3e-2-1`：系统中无与之相关的商品
        - 系统提示“未查询到相关商品信息”
      - `3e-2-2`：系统查询到相关商品信息
        - 系统将对应商品显示在界面上供操作员选择
- 特殊需求：
  - 无



## 4.2 库存管理人员管理商品分类
  - 用例编号：ERP-UseCase-2
  - 名称：库存管理人员管理商品分类
  - 创建者：李俊彤
  - 创建日期：2022.4.14
  - 最后一次更新者：刘子扬
  - 更新日期：2022.4.14
  - 参与者：
  
    - 库存管理人员：方便快捷地进行商品分类管理
  - 触发条件：
  
    - 库存管理人员增加、删除或者修改商品分类
  - 前置条件：
    - 库存管理人员已经完成登录与身份认证的操作
  - 后置条件：
    - 如果商品分类增加，系统给该分类添加编号（并且只有叶子节点可以添加分类）；如果删除了商品分类，则系统删除相关叶节点；
  - 优先级：中
  - 正常流程：
    1. 库存管理人员进行商品分类管理
    2. 库存管理员选择增加、删除或者修改分类
    3. 系统根据操作信息为增加的分类自动生成编号或者删除相关叶子节点或者修改分类
    4. 库存管理人员选择退出，系统退出商品分类管理界面
  - 扩展流程：
  
    - `2a`：库存管理人员选择增加或者删除或者修改分类
      1. 系统要求操作员选择商品分类，以及进行的操作
        1. 商品分类具体信息填写无误，系统不作提示
        2. 商品分类节点不是叶子节点，系统提示分类选择错误，要求操作员重新选择
    
    - `3a`：库存管理人员确认操作
    
      1. 如果商品分类管理未按要求进行，系统不予修改，并提示操作员重新进行分类，并将界面回到错误处
      2. 商品分类管理无误，系统根据操作修改商品分类（生成或者修改或者删除相关商品编号）
  - 特殊需求：
    - 无



## 4.3 库存管理人员创建出库单与入库单
- 用例编号：ERP-UseCase-3
- 名称：库存管理人员创建出库单与入库单
- 创建者：吴禹廷
- 创建日期：2022.3.29
- 最后一次更新者：刘子扬
- 更新日期：2022.3.30
- 参与者：
  - 库存管理人员：方便快捷地创建出入库单
- 触发条件：
  - 库存管理人员选择进入库存管理系统的单据创建界面
- 前置条件：
  - 库存管理人员已经完成登录与身份认证的操作

- 后置条件：
  - 库存管理人员创建出入库单后，单据交由总经理审批，审批通过后系统变更库存商品数量，并发送信息至仓库管理人员

- 优先级：中
- 正常流程：
  1. 操作员选择创建出入库单
  2. 系统创建相关表单供操作员填写，包括时间、操作员、操作类型（出/入库）、原因（选择操作类型后可选，若为入库，则可选项为"进货/买家退货"，若为出库，则可选项为"减库存/销售"）、这批商品的具体信息
  3. 操作员填写完成表单后提交表单
  4. 系统发送表单至总经理处审批，并显示审批状态
- 扩展流程：
  - `2a`：操作员选择时间：
    1. 系统提供日历表供操作员选择时间
  - `2b`：操作员选择操作员:
    1. 系统提供当前登录的操作员姓名及工号供操作员核对，并显示"确认"与"不是本人"两个选项
        1. 操作员点选确认，系统将该操作员信息填入表格中
        2. 操作员点选不是本人，系统弹出重新登录提示框，操作员点击确认后，可回到登录界面重新选择账号登入系统
  - `2c`: 操作员填写商品具体信息
    1. 系统要求操作员选择商品名称，商品编号，填写数量、金额、备注（选填）等信息
        1. 商品具体信息填写无误，系统不作提示
        2. 出库商品数量超过库存数量，小于0或非数字，系统提示商品数量填写错误，要求操作员重新填写
        3. 商品金额小于0或非数字，系统提示金额填写错误，要求操作员重新填写
  - `3a`: 操作员提交表单
    1. 表单中有必填项尚未填写或填写错误，系统不予提交，并提示操作员重新填写，并将界面回到错误或未填选项处
    2. 表单填写无误，系统提交表单至总经理处审批
- 特殊需求：
  - 无



## 4.4库存管理人员创建库存报溢单与报损单

- 用例编号：ERP-UseCase-4
- 名称：库存管理人员创建库存报溢单与报损单
- 创建者：李俊彤
- 创建日期：2022.3.30
- 最后一次更新者：刘子扬
- 更新日期：2022.3.30
- 参与者：

  - 库存管理人员：方便快捷地创建库存报溢单与报损单
- 触发条件：

  - 实际库房中的商品数量多于或者少于系统中的商品数量
- 前置条件：
  - 库存管理人员已经完成登录与身份认证的操作
  
- 后置条件：
  - 库存管理人员创建库存报溢单或报损单，单据交由总经理审批，审批通过后系统变更库存商品数，向系统库存添加或减少商品，使商品与系统保持一致

- 优先级：中
- 正常流程：
  1. 库存管理人员发现实际库房中的商品数量多于或者少于系统中的商品数量
  2. 库存管理员填写库存报溢单或报损单，包括时间、操作员、操作类型（报溢单/报损单）、商品信息
  3. 库存管理员填写完成表单后提交表单
  4. 系统发送表单至总经理处审批，显示审批状态

- 扩展流程：

  - `2a`：库存管理人员选择时间
    1. 系统提供日历表供操作员选择时间

  - `2b`：库存管理人员选择操作员
    1. 系统提供当前登录的操作员姓名及工号供操作员核对，并显示"确认"与"不是本人"两个选项
      1. 操作员点选确认，系统将该操作员信息填入表格中
      2. 操作员点选不是本人，系统弹出重新登录提示框，操作员点击确认后，可回到登录界面重新选择账号登入系统

  - `2c`：库存管理人员填写商品具体信息

    1. 系统要求操作员选择商品名称，商品编号，填写数量、金额、备注（选填）等信息
      1. 商品具体信息填写无误，系统不作提示
      2. 商品金额小于0或非数字，系统提示金额填写错误，要求操作员重新填写

  - `3a`：库存管理人员提交表单

    1. 表单中有必填项尚未填写或填写错误，系统不予提交，并提示操作员重新填写，并将界面回到错误或未填选项处
    2. 表单填写无误，系统提交表单至总经理处审批

- 特殊需求：

  - 无



## 4.5库存管理人员创建库存报警单

- 用例编号：ERP-UseCase-5

- 名称：库存管理人员创建库存报警单

- 创建者：李俊彤

- 创建日期：2022.3.30

- 最后一次更新者：刘子扬

- 更新日期：2022.3.30

- 参与者：

  - 库存管理人员：方便快捷地创建库存报警单

- 触发条件：

  - 库存数量低于设置的警戒数量

- 前置条件：

  - 库存管理人员已经完成登录与身份认证的操作

- 后置条件：

  - 库存管理人员创建库存报警单后，单据交由总经理审批，审批通过后提醒进货销售人员制定进货单

- 优先级：中

- 正常流程：
  1. 系统监测库存数量，低于警戒数值向库存管理员发出警告
  2. 库存管理员创建库存报警单
  3. 库存管理员填写时间、操作员、商品信息
  4. 库存管理员填写完成表单后提交表单
  5. 系统发送至总经理处审批，审批通过后提醒进货销售人员

- 扩展流程：

  - `3a`：库存管理人员选择时间：
    1. 系统提供日历表供操作员选择时间
  - `3b`：库存管理人员选择操作员:
    1. 系统提供当前登录的操作员姓名及工号供操作员核对，并显示"确认"与"不是本人"两个选项
       1. 操作员点选确认，系统将该操作员信息填入表格中
       2. 操作员点选不是本人，系统弹出重新登录提示框，操作员点击确认后，可回到登录界面重新选择账号登入系统
  - `3c`: 库存管理人员填写商品具体信息
    1. 系统要求操作员选择商品名称、商品编号等信息
       1. 商品具体信息填写无误，系统不作提示
  - `4a`: 操作员提交表单
    1. 表单中有必填项尚未填写或填写错误，系统不予提交，并提示操作员重新填写，并将界面回到错误或未填选项处
    2. 表单填写无误，系统提交表单至总经理处审批

- 特殊需求：
  - 无



## 4.6库存管理人员查看库存

- 用例编号：ERP-UseCase-6

- 名称：库存管理人员查看库存

- 创建者：郑寒超

- 创建日期：2022.3.28

- 最后一次更新者：刘子扬

- 更新日期：2022.3.30

- 参与者：

  - 库存管理人员：方便快捷地查看某个时间段内地出库/入库数量、金额、商品信息和分类信息

- 触发条件：

  - 库存管理人员请求查看库存

- 前置条件：

  - 库存管理人员已经完成登录与身份认证的操作

- 后置条件：

  - 无

- 优先级：中

- 正常流程：

  1. 库存管理员点击设定时间段，系统显示可选时间段
  2. 库存管理员确定所设的时间段，系统回显用户所选时间段，并且展示该时间段内库存中各类商品的数量、金额、信息，以及所有商品的总计数量和总计金额
  3. 库存管理员点击出库信息(入库信息)，系统展示所选时间段内出库(入库)的各类商品的数量、金额、信息，以及所有商品的总计数量户和总计金额
  4. 库存管理员点击退出，系统退出库存查看

- 拓展流程：

  - `2a`：库存管理员选择查看的库存商品类别
    1. 系统提供细分的商品类别供库存管理员选择

- 特殊需求：

  - 无




## 4.7库存管理人员盘点库存

- 用例编号：ERP-UseCase-7
- 名称：库存管理人员盘点库存
- 创建者：郑寒超
- 创建日期：2022.3.28
- 最后一次更新者：刘子扬
- 更新日期：2022.3.30
- 参与者：
  - 库存管理人员：方便快捷地盘点当天库存各种商品的名称，型号，库存数量，库存均价，批次批号，生产日期
- 触发条件：
  - 库存管理人员请求盘点库存
- 前置条件：
  - 库存管理人员已经完成登录与身份认证的操作
- 后置条件：
  - 无
- 优先级：中
- 正常流程：
  1. 库存管理员点击库存盘点，系统显示当天商品信息，商品信息包括名称、型号、库存数量、库存均价、批次批号、生产日期，并且在每行最开始显示行号。
  2. 库存管理员点击导出excel，系统能将显示的信息以execl表的形式导出，并提示库存管理员导出成功。
  3. 库存管理员点击退出，系统退出库存盘点
- 扩展流程：
  - 无
- 特殊需求：
  - 无

## 4.8库存管理人员创建库存赠送单

- 用例编号：ERP-UseCase-8

- 名称：库存管理人员创建库存赠送单

- 创建者：郑寒超

- 创建日期：2022.3.28

- 最后一次更新者：刘子扬

- 更新日期：2022.3.30

- 参与者：

  - 库存管理人员：方便快捷地选择一些库存中的商品进行赠送

- 触发条件：

  - 库存管理人员请求进行库存赠送

- 前置条件：

  - 库存管理人员已经完成登录与身份认证的操作

- 后置条件：

  - 总经理审批通过后，系统对商品库存数量进行及时更新

- 优先级：中

- 正常流程：
  1. 库存管理员选择库存中商品，系统显示所选商品的信息，商品信息包括商品名称、数量、描述、价格和本项商品总价
  2. 库存管理员结束选择商品，系统生成赠送单据，单据上的信息包括，商品名称、数量、描述、价格、单项商品总价和所有商品总价
  3. 库存管理员提交单据，系统提示用户提交成功，单据交由总经理审批
  4. 库存管理员点击退出，系统退出库存赠送

- 扩展流程：

  - `1a`：当用户选择商品的数量大于库存中该商品数量时，系统提示商品数量为0
  - `2a`：库存管理人员填写商品具体信息
    1. 系统要求操作员选择商品名称、商品编号等信息
       1. 商品具体信息填写无误，系统不作提示
  - `3a`：库存管理员提交表单
    1. 表单中有必填项尚未填写或填写错误，系统不予提交，并提示管理员重新填写，并将界面回到错误或未填选项处
    2. 表单填写无误，系统提交表单至总经理处审批

- 特殊需求：

  - 无
  

